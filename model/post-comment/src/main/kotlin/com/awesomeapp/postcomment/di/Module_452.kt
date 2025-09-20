package com.awesomeapp.postcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcomment.Viewmodel452_1
import com.awesomeapp.postcomment.Activity452_2
import com.awesomeapp.postcomment.Activity452_3
import com.awesomeapp.postcomment.Fragment452_4
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.postcomment.Model452_8
import com.awesomeapp.postcomment.Model452_9
import com.awesomeapp.postcomment.Activity452_10
import com.awesomeapp.postcomment.Model452_12
import com.awesomeapp.postcomment.Activity452_13
import com.awesomeapp.postcomment.Model452_15
import com.awesomeapp.postcomment.Activity452_16
import com.awesomeapp.postcomment.Model452_18
import com.awesomeapp.postcomment.Activity452_19
import com.awesomeapp.postcomment.Model452_21
import com.awesomeapp.postcomment.Activity452_22
import com.awesomeapp.postcomment.Model452_24
import com.awesomeapp.postcomment.Activity452_25
import com.awesomeapp.postcomment.Model452_27
import com.awesomeapp.postcomment.Activity452_28
import com.awesomeapp.postcomment.Model452_30
import com.awesomeapp.postcomment.Activity452_31
import com.awesomeapp.postcomment.Model452_33
import com.awesomeapp.postcomment.Activity452_34
import com.awesomeapp.postcomment.Model452_36
import com.awesomeapp.postcomment.Activity452_37
import com.awesomeapp.postcomment.Model452_39
import com.awesomeapp.postcomment.Activity452_40
import com.awesomeapp.postcomment.Model452_42
import com.awesomeapp.postcomment.Activity452_43
import com.awesomeapp.postcomment.Model452_45

@Module
@InstallIn(SingletonComponent::class)
object Module_452 {
    @Provides
    @Singleton
    fun provideRepository452_5(
        api0: Api432_6 = Api432_6()
    ): Repository452_5 {
        return Repository452_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi452_6(): Api452_6 {
        return Api452_6()
    }
}