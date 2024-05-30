package com.vk.directop.plvnoteapp.featurenote.domain.usecase

import com.vk.directop.plvnoteapp.featurenote.domain.model.Note
import com.vk.directop.plvnoteapp.featurenote.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}