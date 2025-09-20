package com.awesomeapp.mediacontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacontact.Viewmodel96_1
import com.awesomeapp.mediacontact.Activity96_2
import com.awesomeapp.mediacontact.Activity96_3
import com.awesomeapp.mediacontact.Fragment96_4
import com.awesomeapp.mediacontact.Repository96_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.mediacontact.Model96_7

@Module
@InstallIn(SingletonComponent::class)
object Module_96 {
    @Provides
    @Singleton
    fun provideRepository96_5(): Repository96_5 {
        return Repository96_5()
    }

    @Provides
    @Singleton
    fun provideApi96_6(): Api96_6 {
        return Api96_6()
    }
}