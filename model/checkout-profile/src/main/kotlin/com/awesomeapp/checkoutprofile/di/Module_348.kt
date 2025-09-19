package com.awesomeapp.checkoutprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Viewmodel348_1
import com.awesomeapp.checkoutprofile.Activity348_2
import com.awesomeapp.checkoutprofile.Activity348_3
import com.awesomeapp.checkoutprofile.Fragment348_4
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.checkoutprofile.Usecase348_7
import com.awesomeapp.checkoutprofile.Model348_8
import com.awesomeapp.checkoutprofile.Activity348_9

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api216_6 = Api216_6(),
        api1: Api240_6 = Api240_6(),
        api2: Api232_6 = Api232_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api220_6 = Api220_6(),
        api5: Api264_6 = Api264_6(),
        api6: Api244_6 = Api244_6(),
        api7: Api276_6 = Api276_6(),
        api8: Api280_6 = Api280_6(),
        api9: Api248_6 = Api248_6(),
        api10: Api272_6 = Api272_6(),
        api11: Api252_6 = Api252_6(),
        api12: Api260_6 = Api260_6(),
        api13: Api268_6 = Api268_6(),
        api14: Api212_6 = Api212_6(),
        api15: Api224_6 = Api224_6(),
        api16: Api256_6 = Api256_6(),
        api17: Api236_6 = Api236_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
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
        api14, 
        api15, 
        api16, 
        api17)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}