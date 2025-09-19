package com.awesomeapp.feedidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedidentity.Viewmodel156_1
import com.awesomeapp.feedidentity.Activity156_2
import com.awesomeapp.feedidentity.Activity156_3
import com.awesomeapp.feedidentity.Fragment156_4
import com.awesomeapp.feedidentity.Repository156_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.feedidentity.Usecase156_7
import com.awesomeapp.feedidentity.Model156_9
import com.awesomeapp.feedidentity.Model156_10
import com.awesomeapp.feedidentity.Activity156_11
import com.awesomeapp.feedidentity.Model156_13
import com.awesomeapp.feedidentity.Activity156_14
import com.awesomeapp.feedidentity.Model156_16
import com.awesomeapp.feedidentity.Activity156_17
import com.awesomeapp.feedidentity.Model156_19
import com.awesomeapp.feedidentity.Activity156_20
import com.awesomeapp.feedidentity.Model156_22
import com.awesomeapp.feedidentity.Activity156_23
import com.awesomeapp.feedidentity.Model156_25
import com.awesomeapp.feedidentity.Activity156_26
import com.awesomeapp.feedidentity.Model156_28
import com.awesomeapp.feedidentity.Activity156_29

@Module
@InstallIn(SingletonComponent::class)
object Module_156 {
    @Provides
    @Singleton
    fun provideRepository156_5(
        api0: Api128_6 = Api128_6(),
        api1: Api72_6 = Api72_6()
    ): Repository156_5 {
        return Repository156_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi156_6(): Api156_6 {
        return Api156_6()
    }
}