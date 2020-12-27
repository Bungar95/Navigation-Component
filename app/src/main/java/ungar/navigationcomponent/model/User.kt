package ungar.navigationcomponent.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var firstname: String,
    var username: String,
    var password: String
): Parcelable