package com.awesomeapp.messageuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messageuser.Viewmodel312_1
import com.awesomeapp.messageuser.Activity312_2
import com.awesomeapp.messageuser.Activity312_3
import com.awesomeapp.messageuser.Fragment312_4
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.messageuser.Usecase312_7
import com.awesomeapp.messageuser.Model312_9
import com.awesomeapp.messageuser.Model312_10
import com.awesomeapp.messageuser.Activity312_11
import com.awesomeapp.messageuser.Model312_13
import com.awesomeapp.messageuser.Activity312_14
import com.awesomeapp.messageuser.Model312_16
import com.awesomeapp.messageuser.Activity312_17
import com.awesomeapp.messageuser.Model312_19
import com.awesomeapp.messageuser.Activity312_20
import com.awesomeapp.messageuser.Model312_22
import com.awesomeapp.messageuser.Activity312_23
import com.awesomeapp.messageuser.Model312_25
import com.awesomeapp.messageuser.Activity312_26
import com.awesomeapp.messageuser.Model312_28
import com.awesomeapp.messageuser.Activity312_29

@Module
@InstallIn(SingletonComponent::class)
object Module_312 {
    @Provides
    @Singleton
    fun provideRepository312_5(): Repository312_5 {
        return Repository312_5()
    }

    @Provides
    @Singleton
    fun provideApi312_6(): Api312_6 {
        return Api312_6()
    }
}