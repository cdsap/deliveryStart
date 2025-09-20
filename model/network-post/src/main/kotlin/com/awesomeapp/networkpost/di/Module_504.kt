package com.awesomeapp.networkpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networkpost.Viewmodel504_1
import com.awesomeapp.networkpost.Activity504_2
import com.awesomeapp.networkpost.Activity504_3
import com.awesomeapp.networkpost.Fragment504_4
import com.awesomeapp.networkpost.Repository504_5
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.networkpost.Api504_6
import com.awesomeapp.networkpost.Usecase504_7
import com.awesomeapp.networkpost.Model504_9
import com.awesomeapp.networkpost.Model504_10
import com.awesomeapp.networkpost.Activity504_11
import com.awesomeapp.networkpost.Model504_13
import com.awesomeapp.networkpost.Activity504_14
import com.awesomeapp.networkpost.Model504_16
import com.awesomeapp.networkpost.Activity504_17
import com.awesomeapp.networkpost.Model504_19
import com.awesomeapp.networkpost.Activity504_20
import com.awesomeapp.networkpost.Model504_22
import com.awesomeapp.networkpost.Activity504_23
import com.awesomeapp.networkpost.Model504_25
import com.awesomeapp.networkpost.Activity504_26
import com.awesomeapp.networkpost.Model504_28
import com.awesomeapp.networkpost.Activity504_29
import com.awesomeapp.networkpost.Model504_31
import com.awesomeapp.networkpost.Activity504_32
import com.awesomeapp.networkpost.Model504_34

@Module
@InstallIn(SingletonComponent::class)
object Module_504 {
    @Provides
    @Singleton
    fun provideRepository504_5(
        api0: Api380_6 = Api380_6()
    ): Repository504_5 {
        return Repository504_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi504_6(): Api504_6 {
        return Api504_6()
    }
}