package com.example.android.codelabs.navigation

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.navigation.NavArgs
import kotlinx.parcelize.Parcelize
import kotlin.Int
import kotlin.jvm.JvmStatic


data class FlowStepFragmentArgs(val flowStepNumber: Int = 2) : NavArgs, Parcelable {

    constructor(parcel: Parcel) : this(parcel.readInt()) {
    }

    fun toBundle(): Bundle {
        val result = Bundle()
        result.putInt("flowStepNumber", this.flowStepNumber)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): FlowStepFragmentArgs {
            bundle.setClassLoader(FlowStepFragmentArgs::class.java.classLoader)
            val __flowStepNumber : Int
            if (bundle.containsKey("flowStepNumber")) {
                __flowStepNumber = bundle.getInt("flowStepNumber")
            } else {
                __flowStepNumber = 2
            }
            return FlowStepFragmentArgs(__flowStepNumber)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(flowStepNumber)
    }

    override fun describeContents(): Int {
        return 0
    }

     object CREATOR : Parcelable.Creator<FlowStepFragmentArgs> {
        override fun createFromParcel(parcel: Parcel): FlowStepFragmentArgs {
            return FlowStepFragmentArgs(parcel)
        }

        override fun newArray(size: Int): Array<FlowStepFragmentArgs?> {
            return arrayOfNulls(size)
        }
    }


}
