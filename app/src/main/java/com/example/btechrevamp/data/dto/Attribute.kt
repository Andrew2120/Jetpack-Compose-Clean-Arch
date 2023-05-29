package com.example.btechrevamp.data.dto


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attribute(
    @SerialName("attribute_code")
    val attributeCode: String,
    @SerialName("label")
    val label: @Contextual Any?,
    @SerialName("tool_tip")
    val toolTip: @Contextual Any?,
    @SerialName("value")
    val value: String
)