package com.awesomeapp.documentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentlogin.Viewmodel132_1
import com.awesomeapp.documentlogin.Activity132_2
import com.awesomeapp.documentlogin.Activity132_3
import com.awesomeapp.documentlogin.Fragment132_4
import com.awesomeapp.documentlogin.Repository132_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.documentlogin.Usecase132_7
import com.awesomeapp.documentlogin.Model132_9
import com.awesomeapp.documentlogin.Model132_10
import com.awesomeapp.documentlogin.Activity132_11
import com.awesomeapp.documentlogin.Model132_13
import com.awesomeapp.documentlogin.Activity132_14
import com.awesomeapp.documentlogin.Model132_16
import com.awesomeapp.documentlogin.Activity132_17
import com.awesomeapp.documentlogin.Model132_19
import com.awesomeapp.documentlogin.Activity132_20
import com.awesomeapp.documentlogin.Model132_22
import com.awesomeapp.documentlogin.Activity132_23
import com.awesomeapp.documentlogin.Model132_25
import com.awesomeapp.documentlogin.Activity132_26
import com.awesomeapp.documentlogin.Model132_28
import com.awesomeapp.documentlogin.Activity132_29
import com.awesomeapp.documentlogin.Model132_31
import com.awesomeapp.documentlogin.Activity132_32

@Module
@InstallIn(SingletonComponent::class)
object Module_132 {
    @Provides
    @Singleton
    fun provideRepository132_5(): Repository132_5 {
        return Repository132_5()
    }

    @Provides
    @Singleton
    fun provideApi132_6(): Api132_6 {
        return Api132_6()
    }
}