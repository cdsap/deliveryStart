package com.awesomeapp.sharecheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sharecheckout.Viewmodel212_1
import com.awesomeapp.sharecheckout.Activity212_2
import com.awesomeapp.sharecheckout.Activity212_3
import com.awesomeapp.sharecheckout.Fragment212_4
import com.awesomeapp.sharecheckout.Repository212_5
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.sharecheckout.Model212_8
import com.awesomeapp.sharecheckout.Model212_9
import com.awesomeapp.sharecheckout.Activity212_10
import com.awesomeapp.sharecheckout.Model212_12
import com.awesomeapp.sharecheckout.Activity212_13
import com.awesomeapp.sharecheckout.Model212_15
import com.awesomeapp.sharecheckout.Activity212_16
import com.awesomeapp.sharecheckout.Model212_18
import com.awesomeapp.sharecheckout.Activity212_19
import com.awesomeapp.sharecheckout.Model212_21
import com.awesomeapp.sharecheckout.Activity212_22
import com.awesomeapp.sharecheckout.Model212_24
import com.awesomeapp.sharecheckout.Activity212_25

@Module
@InstallIn(SingletonComponent::class)
object Module_212 {
    @Provides
    @Singleton
    fun provideRepository212_5(): Repository212_5 {
        return Repository212_5()
    }

    @Provides
    @Singleton
    fun provideApi212_6(): Api212_6 {
        return Api212_6()
    }
}