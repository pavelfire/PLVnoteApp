package com.vk.directop.plvnoteapp.featurenote.data.datasource

import androidx.room.Database
import com.vk.directop.plvnoteapp.featurenote.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase {

    abstract val noteDao: NoteDao
}