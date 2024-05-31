package com.vk.directop.plvnoteapp.featurenote.presentation.notes

import com.vk.directop.plvnoteapp.featurenote.domain.model.Note
import com.vk.directop.plvnoteapp.featurenote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}