package com.awesomeapp.postcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcart.Viewmodel256_1
import com.awesomeapp.postcart.Activity256_2
import com.awesomeapp.postcart.Activity256_3
import com.awesomeapp.postcart.Fragment256_4
import com.awesomeapp.postcart.Repository256_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.postcart.Model256_8
import com.awesomeapp.postcart.Model256_9
import com.awesomeapp.postcart.Activity256_10
import com.awesomeapp.postcart.Model256_12
import com.awesomeapp.postcart.Activity256_13
import com.awesomeapp.postcart.Model256_15
import com.awesomeapp.postcart.Activity256_16
import com.awesomeapp.postcart.Model256_18
import com.awesomeapp.postcart.Activity256_19
import com.awesomeapp.postcart.Model256_21
import com.awesomeapp.postcart.Activity256_22
import com.awesomeapp.postcart.Model256_24
import com.awesomeapp.postcart.Activity256_25
import com.awesomeapp.postcart.Model256_27
import com.awesomeapp.postcart.Activity256_28
import com.awesomeapp.postcart.Model256_30
import com.awesomeapp.postcart.Activity256_31
import com.awesomeapp.postcart.Model256_33
import com.awesomeapp.postcart.Activity256_34
import com.awesomeapp.postcart.Model256_36
import com.awesomeapp.postcart.Activity256_37
import com.awesomeapp.postcart.Model256_39
import com.awesomeapp.postcart.Activity256_40
import com.awesomeapp.postcart.Model256_42
import com.awesomeapp.postcart.Activity256_43

@Module
@InstallIn(SingletonComponent::class)
object Module_256 {
    @Provides
    @Singleton
    fun provideRepository256_5(
        api0: Api132_6 = Api132_6(),
        api1: Api208_6 = Api208_6()
    ): Repository256_5 {
        return Repository256_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi256_6(): Api256_6 {
        return Api256_6()
    }
}