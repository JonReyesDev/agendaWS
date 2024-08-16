package com.example.agendawebservice.Objetos

import android.content.Context
import android.provider.Settings

object Device {
    fun getSecureId(context: Context): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }
}
