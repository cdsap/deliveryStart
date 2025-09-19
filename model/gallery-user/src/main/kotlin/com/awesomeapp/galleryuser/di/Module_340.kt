package com.awesomeapp.galleryuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.galleryuser.Viewmodel340_1
import com.awesomeapp.galleryuser.Activity340_2
import com.awesomeapp.galleryuser.Activity340_3
import com.awesomeapp.galleryuser.Fragment340_4
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.galleryuser.Service340_7
import com.awesomeapp.galleryuser.Worker340_8
import com.awesomeapp.galleryuser.Model340_10
import com.awesomeapp.galleryuser.Model340_11
import com.awesomeapp.galleryuser.Activity340_12
import com.awesomeapp.galleryuser.Model340_14
import com.awesomeapp.galleryuser.Activity340_15
import com.awesomeapp.galleryuser.Model340_17
import com.awesomeapp.galleryuser.Activity340_18
import com.awesomeapp.galleryuser.Model340_20
import com.awesomeapp.galleryuser.Activity340_21
import com.awesomeapp.galleryuser.Model340_23
import com.awesomeapp.galleryuser.Activity340_24
import com.awesomeapp.galleryuser.Model340_26
import com.awesomeapp.galleryuser.Activity340_27
import com.awesomeapp.galleryuser.Model340_29
import com.awesomeapp.galleryuser.Activity340_30
import com.awesomeapp.galleryuser.Model340_32

@Module
@InstallIn(SingletonComponent::class)
object Module_340 {
    @Provides
    @Singleton
    fun provideRepository340_5(): Repository340_5 {
        return Repository340_5()
    }

    @Provides
    @Singleton
    fun provideApi340_6(): Api340_6 {
        return Api340_6()
    }
}