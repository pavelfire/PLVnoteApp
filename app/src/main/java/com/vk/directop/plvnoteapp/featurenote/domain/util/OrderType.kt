package com.vk.directop.plvnoteapp.featurenote.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}