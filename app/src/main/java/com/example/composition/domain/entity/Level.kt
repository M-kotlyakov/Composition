package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
enum class Level: Parcelable {

    TEST, EASY, NORMAL, HARD
}
