package com.ionexa.nextgsi.DataClass

import kotlinx.serialization.Serializable
import java.util.Date



data class FaveList(
    val id: Int,
    val customerId: Int,
    val productId: Int,
    val createdAt: String
)
