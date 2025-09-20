package com.awesomeapp.video.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.video.Viewmodel44_1
import com.awesomeapp.video.Activity44_2
import com.awesomeapp.video.Activity44_3
import com.awesomeapp.video.Fragment44_4
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.video.Api44_6
import com.awesomeapp.video.Model44_8
import com.awesomeapp.video.Model44_9
import com.awesomeapp.video.Activity44_10
import com.awesomeapp.video.Model44_12
import com.awesomeapp.video.Activity44_13
import com.awesomeapp.video.Model44_15
import com.awesomeapp.video.Activity44_16
import com.awesomeapp.video.Model44_18
import com.awesomeapp.video.Activity44_19
import com.awesomeapp.video.Model44_21
import com.awesomeapp.video.Activity44_22
import com.awesomeapp.video.Model44_24
import com.awesomeapp.video.Activity44_25
import com.awesomeapp.video.Model44_27
import com.awesomeapp.video.Activity44_28
import com.awesomeapp.video.Model44_30
import com.awesomeapp.video.Activity44_31
import com.awesomeapp.video.Model44_33
import com.awesomeapp.video.Activity44_34
import com.awesomeapp.video.Model44_36
import com.awesomeapp.video.Activity44_37
import com.awesomeapp.video.Model44_39
import com.awesomeapp.video.Activity44_40
import com.awesomeapp.video.Model44_42
import com.awesomeapp.video.Activity44_43

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(): Repository44_5 {
        return Repository44_5()
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}