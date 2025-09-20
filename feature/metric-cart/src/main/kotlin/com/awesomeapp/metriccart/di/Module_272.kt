package com.awesomeapp.metriccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.metriccart.Viewmodel272_1
import com.awesomeapp.metriccart.Activity272_2
import com.awesomeapp.metriccart.Activity272_3
import com.awesomeapp.metriccart.Fragment272_4
import com.awesomeapp.metriccart.Repository272_5
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.metriccart.Model272_7

@Module
@InstallIn(SingletonComponent::class)
object Module_272 {
    @Provides
    @Singleton
    fun provideRepository272_5(
        api0: Api68_6 = Api68_6(),
        api1: Api148_6 = Api148_6(),
        api2: Api100_6 = Api100_6(),
        api3: Api20_6 = Api20_6(),
        api4: Api108_6 = Api108_6(),
        api5: Api104_6 = Api104_6(),
        api6: Api60_6 = Api60_6(),
        api7: Api16_6 = Api16_6(),
        api8: Api36_6 = Api36_6(),
        api9: Api40_6 = Api40_6(),
        api10: Api96_6 = Api96_6()
    ): Repository272_5 {
        return Repository272_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10)
    }

    @Provides
    @Singleton
    fun provideApi272_6(): Api272_6 {
        return Api272_6()
    }
}