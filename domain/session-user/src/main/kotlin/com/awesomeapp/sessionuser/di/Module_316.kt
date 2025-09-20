package com.awesomeapp.sessionuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionuser.Viewmodel316_1
import com.awesomeapp.sessionuser.Activity316_2
import com.awesomeapp.sessionuser.Activity316_3
import com.awesomeapp.sessionuser.Fragment316_4
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.sessionuser.Model316_7

@Module
@InstallIn(SingletonComponent::class)
object Module_316 {
    @Provides
    @Singleton
    fun provideRepository316_5(
        api0: Api152_6 = Api152_6(),
        api1: Api220_6 = Api220_6(),
        api2: Api208_6 = Api208_6(),
        api3: Api148_6 = Api148_6(),
        api4: Api188_6 = Api188_6()
    ): Repository316_5 {
        return Repository316_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi316_6(): Api316_6 {
        return Api316_6()
    }
}