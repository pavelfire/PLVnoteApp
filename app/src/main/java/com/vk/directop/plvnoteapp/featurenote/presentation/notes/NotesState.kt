package com.vk.directop.plvnoteapp.featurenote.presentation.notes

import com.vk.directop.plvnoteapp.featurenote.domain.model.Note
import com.vk.directop.plvnoteapp.featurenote.domain.util.NoteOrder
import com.vk.directop.plvnoteapp.featurenote.domain.util.OrderType


data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)
