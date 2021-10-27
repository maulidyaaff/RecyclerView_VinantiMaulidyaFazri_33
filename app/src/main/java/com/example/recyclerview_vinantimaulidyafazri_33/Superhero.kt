package com.example.recyclerview_vinantimaulidyafazri_33

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val namaSuperhero: String,
    val descSuperhero: String,
) : Parcelable
