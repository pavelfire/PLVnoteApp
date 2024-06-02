package com.vk.directop.plvnoteapp.featurenote.di

import android.app.Application
import androidx.room.Room
import com.vk.directop.plvnoteapp.featurenote.data.datasource.NoteDatabase
import com.vk.directop.plvnoteapp.featurenote.data.repository.NoteRepositoryImpl
import com.vk.directop.plvnoteapp.featurenote.domain.repository.NoteRepository
import com.vk.directop.plvnoteapp.featurenote.domain.usecase.AddNote
import com.vk.directop.plvnoteapp.featurenote.domain.usecase.DeleteNote
import com.vk.directop.plvnoteapp.featurenote.domain.usecase.GetNote
import com.vk.directop.plvnoteapp.featurenote.domain.usecase.GetNotes
import com.vk.directop.plvnoteapp.featurenote.domain.usecase.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TestAppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.inMemoryDatabaseBuilder(
            app,
            NoteDatabase::class.java,
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }

}