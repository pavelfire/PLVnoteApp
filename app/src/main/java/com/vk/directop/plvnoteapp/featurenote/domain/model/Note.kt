package com.vk.directop.plvnoteapp.featurenote.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.vk.directop.plvnoteapp.ui.theme.BabyBlue
import com.vk.directop.plvnoteapp.ui.theme.LightGreen
import com.vk.directop.plvnoteapp.ui.theme.RedOrange
import com.vk.directop.plvnoteapp.ui.theme.RedPink
import com.vk.directop.plvnoteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
