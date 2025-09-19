package com.awesomeapp.calendaridentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendaridentity.Viewmodel176_1
import com.awesomeapp.calendaridentity.Activity176_2
import com.awesomeapp.calendaridentity.Activity176_3
import com.awesomeapp.calendaridentity.Fragment176_4
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.calendaridentity.Model176_7
import com.awesomeapp.calendaridentity.Activity176_8

@Module
@InstallIn(SingletonComponent::class)
object Module_176 {
    @Provides
    @Singleton
    fun provideRepository176_5(
        api0: Api128_6 = Api128_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api76_6 = Api76_6(),
        api3: Api140_6 = Api140_6(),
        api4: Api124_6 = Api124_6(),
        api5: Api112_6 = Api112_6(),
        api6: Api136_6 = Api136_6(),
        api7: Api104_6 = Api104_6(),
        api8: Api80_6 = Api80_6()
    ): Repository176_5 {
        return Repository176_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi176_6(): Api176_6 {
        return Api176_6()
    }
}