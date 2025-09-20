package com.awesomeapp.listprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listprofile.Viewmodel380_1
import com.awesomeapp.listprofile.Activity380_2
import com.awesomeapp.listprofile.Activity380_3
import com.awesomeapp.listprofile.Fragment380_4
import com.awesomeapp.listprofile.Repository380_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.listprofile.Service380_7
import com.awesomeapp.listprofile.Worker380_8
import com.awesomeapp.listprofile.Model380_10
import com.awesomeapp.listprofile.Model380_11
import com.awesomeapp.listprofile.Activity380_12
import com.awesomeapp.listprofile.Model380_14
import com.awesomeapp.listprofile.Activity380_15
import com.awesomeapp.listprofile.Model380_17
import com.awesomeapp.listprofile.Activity380_18
import com.awesomeapp.listprofile.Model380_20
import com.awesomeapp.listprofile.Activity380_21
import com.awesomeapp.listprofile.Model380_23
import com.awesomeapp.listprofile.Activity380_24
import com.awesomeapp.listprofile.Model380_26
import com.awesomeapp.listprofile.Activity380_27
import com.awesomeapp.listprofile.Model380_29
import com.awesomeapp.listprofile.Activity380_30
import com.awesomeapp.listprofile.Model380_32
import com.awesomeapp.listprofile.Activity380_33
import com.awesomeapp.listprofile.Model380_35
import com.awesomeapp.listprofile.Activity380_36
import com.awesomeapp.listprofile.Model380_38
import com.awesomeapp.listprofile.Activity380_39
import com.awesomeapp.listprofile.Model380_41
import com.awesomeapp.listprofile.Activity380_42
import com.awesomeapp.listprofile.Model380_44
import com.awesomeapp.listprofile.Activity380_45
import com.awesomeapp.listprofile.Model380_47
import com.awesomeapp.listprofile.Activity380_48
import com.awesomeapp.listprofile.Model380_50

@Module
@InstallIn(SingletonComponent::class)
object Module_380 {
    @Provides
    @Singleton
    fun provideRepository380_5(
        api0: Api312_6 = Api312_6(),
        api1: Api268_6 = Api268_6(),
        api2: Api284_6 = Api284_6(),
        api3: Api300_6 = Api300_6(),
        api4: Api224_6 = Api224_6(),
        api5: Api228_6 = Api228_6(),
        api6: Api256_6 = Api256_6(),
        api7: Api260_6 = Api260_6(),
        api8: Api308_6 = Api308_6(),
        api9: Api252_6 = Api252_6(),
        api10: Api272_6 = Api272_6(),
        api11: Api316_6 = Api316_6(),
        api12: Api324_6 = Api324_6(),
        api13: Api296_6 = Api296_6(),
        api14: Api288_6 = Api288_6(),
        api15: Api304_6 = Api304_6(),
        api16: Api280_6 = Api280_6(),
        api17: Api232_6 = Api232_6(),
        api18: Api276_6 = Api276_6(),
        api19: Api328_6 = Api328_6()
    ): Repository380_5 {
        return Repository380_5(api0, 
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
        api17, 
        api18, 
        api19)
    }

    @Provides
    @Singleton
    fun provideApi380_6(): Api380_6 {
        return Api380_6()
    }
}