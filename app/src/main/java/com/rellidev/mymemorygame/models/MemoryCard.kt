package com.rellidev.mymemorygame.models

import android.service.carrier.CarrierIdentifier

data class MemoryCard(
    val identifier: Int,
    val imageUrl: String? = null,
    var isFaceUp: Boolean = false,
    var isMatched: Boolean = false
)