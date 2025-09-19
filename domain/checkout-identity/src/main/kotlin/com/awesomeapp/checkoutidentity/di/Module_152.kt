package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.checkoutidentity.Model152_8
import com.awesomeapp.checkoutidentity.Model152_9
import com.awesomeapp.checkoutidentity.Activity152_10
import com.awesomeapp.checkoutidentity.Model152_12
import com.awesomeapp.checkoutidentity.Activity152_13

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api112_6 = Api112_6(),
        api1: Api84_6 = Api84_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api108_6 = Api108_6(),
        api5: Api116_6 = Api116_6(),
        api6: Api104_6 = Api104_6(),
        api7: Api128_6 = Api128_6(),
        api8: Api80_6 = Api80_6(),
        api9: Api124_6 = Api124_6(),
        api10: Api120_6 = Api120_6(),
        api11: Api72_6 = Api72_6(),
        api12: Api76_6 = Api76_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
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
        api12)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}