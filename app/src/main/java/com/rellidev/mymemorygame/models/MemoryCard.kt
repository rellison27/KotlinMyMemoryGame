package com.rellidev.mymemorygame.models

import android.service.carrier.CarrierIdentifier

data class MemoryCard(
    val identifier: Int,
    var isFaceUp: Boolean = false,
    var isMAtched: Boolean = false
)