package com.awesomeapp.gallerylogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerylogin.Viewmodel144_1
import com.awesomeapp.gallerylogin.Activity144_2
import com.awesomeapp.gallerylogin.Activity144_3
import com.awesomeapp.gallerylogin.Fragment144_4
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.gallerylogin.Usecase144_7
import com.awesomeapp.gallerylogin.Model144_9
import com.awesomeapp.gallerylogin.Model144_10
import com.awesomeapp.gallerylogin.Activity144_11
import com.awesomeapp.gallerylogin.Model144_13
import com.awesomeapp.gallerylogin.Activity144_14
import com.awesomeapp.gallerylogin.Model144_16
import com.awesomeapp.gallerylogin.Activity144_17
import com.awesomeapp.gallerylogin.Model144_19
import com.awesomeapp.gallerylogin.Activity144_20
import com.awesomeapp.gallerylogin.Model144_22
import com.awesomeapp.gallerylogin.Activity144_23
import com.awesomeapp.gallerylogin.Model144_25
import com.awesomeapp.gallerylogin.Activity144_26
import com.awesomeapp.gallerylogin.Model144_28
import com.awesomeapp.gallerylogin.Activity144_29

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api76_6 = Api76_6(),
        api1: Api108_6 = Api108_6(),
        api2: Api136_6 = Api136_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}