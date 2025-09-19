package com.awesomeapp.locationidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationidentity.Viewmodel160_1
import com.awesomeapp.locationidentity.Activity160_2
import com.awesomeapp.locationidentity.Activity160_3
import com.awesomeapp.locationidentity.Fragment160_4
import com.awesomeapp.locationidentity.Repository160_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.locationidentity.Service160_7
import com.awesomeapp.locationidentity.Worker160_8
import com.awesomeapp.locationidentity.Model160_10
import com.awesomeapp.locationidentity.Model160_11
import com.awesomeapp.locationidentity.Activity160_12
import com.awesomeapp.locationidentity.Model160_14
import com.awesomeapp.locationidentity.Activity160_15
import com.awesomeapp.locationidentity.Model160_17

@Module
@InstallIn(SingletonComponent::class)
object Module_160 {
    @Provides
    @Singleton
    fun provideRepository160_5(
        api0: Api108_6 = Api108_6(),
        api1: Api96_6 = Api96_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api84_6 = Api84_6(),
        api4: Api136_6 = Api136_6(),
        api5: Api88_6 = Api88_6(),
        api6: Api116_6 = Api116_6(),
        api7: Api80_6 = Api80_6(),
        api8: Api72_6 = Api72_6(),
        api9: Api120_6 = Api120_6(),
        api10: Api124_6 = Api124_6(),
        api11: Api92_6 = Api92_6(),
        api12: Api112_6 = Api112_6(),
        api13: Api128_6 = Api128_6(),
        api14: Api76_6 = Api76_6()
    ): Repository160_5 {
        return Repository160_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14)
    }

    @Provides
    @Singleton
    fun provideApi160_6(): Api160_6 {
        return Api160_6()
    }
}