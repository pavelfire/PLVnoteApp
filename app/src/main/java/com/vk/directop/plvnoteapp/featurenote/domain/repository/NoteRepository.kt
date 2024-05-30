package com.vk.directop.plvnoteapp.featurenote.domain.repository

import com.vk.directop.plvnoteapp.featurenote.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNotes(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}