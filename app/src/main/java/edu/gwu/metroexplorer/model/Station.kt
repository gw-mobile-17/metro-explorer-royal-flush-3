package edu.gwu.metroexplorer.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by cmahajan on 9/23/17.
 */
@Parcelize
data class Station(val Name: String, val Lat: String, val Lon: String): Parcelable