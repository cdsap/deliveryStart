package com.awesomeapp.cartlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Viewmodel104_1
import com.awesomeapp.cartlogin.Activity104_2
import com.awesomeapp.cartlogin.Activity104_3
import com.awesomeapp.cartlogin.Fragment104_4
import com.awesomeapp.cartlogin.Repository104_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.cartlogin.Api104_6

@Module
@InstallIn(SingletonComponent::class)
object Module_104 {
    @Provides
    @Singleton
    fun provideRepository104_5(
        api0: Api28_6 = Api28_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api52_6 = Api52_6(),
        api4: Api44_6 = Api44_6(),
        api5: Api16_6 = Api16_6(),
        api6: Api68_6 = Api68_6()
    ): Repository104_5 {
        return Repository104_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi104_6(): Api104_6 {
        return Api104_6()
    }
}