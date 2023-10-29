package com.example.randomnamegenerator.utils

import android.app.Application

class AndroidApplication : Application(){

    companion object{
        lateinit var application: Application
    }

    override fun onCreate() {
        super.onCreate()

        application = this

    }

}