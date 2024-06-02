package com.vk.directop.plvnoteapp.featurenote.domain.usecase

import com.vk.directop.plvnoteapp.featurenote.data.repository.FakeNoteRepository
import org.junit.Before

class AddNoteTest {

    private lateinit var addNote: AddNote
    private lateinit var fakeNoteRepository: FakeNoteRepository

    @Before
    fun setUp() {
        fakeNoteRepository = FakeNoteRepository()
        addNote = AddNote(fakeNoteRepository)


    }

}