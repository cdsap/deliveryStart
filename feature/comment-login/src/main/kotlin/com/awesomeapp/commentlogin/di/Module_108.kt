package com.awesomeapp.commentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Viewmodel108_1
import com.awesomeapp.commentlogin.Activity108_2
import com.awesomeapp.commentlogin.Activity108_3
import com.awesomeapp.commentlogin.Fragment108_4
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.commentlogin.Usecase108_7
import com.awesomeapp.commentlogin.Model108_9
import com.awesomeapp.commentlogin.Model108_10
import com.awesomeapp.commentlogin.Activity108_11
import com.awesomeapp.commentlogin.Model108_13
import com.awesomeapp.commentlogin.Activity108_14
import com.awesomeapp.commentlogin.Model108_16
import com.awesomeapp.commentlogin.Activity108_17

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(
        api0: Api20_6 = Api20_6(),
        api1: Api60_6 = Api60_6(),
        api2: Api52_6 = Api52_6(),
        api3: Api24_6 = Api24_6(),
        api4: Api56_6 = Api56_6(),
        api5: Api4_6 = Api4_6(),
        api6: Api44_6 = Api44_6()
    ): Repository108_5 {
        return Repository108_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}