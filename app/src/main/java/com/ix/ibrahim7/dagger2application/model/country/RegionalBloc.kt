package com.ix.ibrahim7.dagger2application.model.country


import com.google.gson.annotations.SerializedName

data class RegionalBloc(
    @SerializedName("acronym")
    val acronym: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("otherAcronyms")
    val otherAcronyms: List<Any>?,
    @SerializedName("otherNames")
    val otherNames: List<String>?
)