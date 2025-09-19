package com.awesomeapp.documentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentuser.Viewmodel328_1
import com.awesomeapp.documentuser.Activity328_2
import com.awesomeapp.documentuser.Activity328_3
import com.awesomeapp.documentuser.Fragment328_4
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.documentuser.Model328_8
import com.awesomeapp.documentuser.Model328_9
import com.awesomeapp.documentuser.Activity328_10
import com.awesomeapp.documentuser.Model328_12
import com.awesomeapp.documentuser.Activity328_13
import com.awesomeapp.documentuser.Model328_15
import com.awesomeapp.documentuser.Activity328_16
import com.awesomeapp.documentuser.Model328_18
import com.awesomeapp.documentuser.Activity328_19
import com.awesomeapp.documentuser.Model328_21
import com.awesomeapp.documentuser.Activity328_22
import com.awesomeapp.documentuser.Model328_24
import com.awesomeapp.documentuser.Activity328_25

@Module
@InstallIn(SingletonComponent::class)
object Module_328 {
    @Provides
    @Singleton
    fun provideRepository328_5(
        api0: Api272_6 = Api272_6(),
        api1: Api244_6 = Api244_6(),
        api2: Api276_6 = Api276_6(),
        api3: Api248_6 = Api248_6(),
        api4: Api216_6 = Api216_6(),
        api5: Api224_6 = Api224_6(),
        api6: Api256_6 = Api256_6(),
        api7: Api228_6 = Api228_6(),
        api8: Api220_6 = Api220_6(),
        api9: Api280_6 = Api280_6(),
        api10: Api264_6 = Api264_6(),
        api11: Api252_6 = Api252_6(),
        api12: Api268_6 = Api268_6(),
        api13: Api240_6 = Api240_6(),
        api14: Api232_6 = Api232_6(),
        api15: Api260_6 = Api260_6()
    ): Repository328_5 {
        return Repository328_5(api0, 
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
        api15)
    }

    @Provides
    @Singleton
    fun provideApi328_6(): Api328_6 {
        return Api328_6()
    }
}