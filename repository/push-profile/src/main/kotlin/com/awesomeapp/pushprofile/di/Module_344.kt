package com.awesomeapp.pushprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushprofile.Viewmodel344_1
import com.awesomeapp.pushprofile.Activity344_2
import com.awesomeapp.pushprofile.Activity344_3
import com.awesomeapp.pushprofile.Fragment344_4
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.pushprofile.Model344_8
import com.awesomeapp.pushprofile.Model344_9
import com.awesomeapp.pushprofile.Activity344_10
import com.awesomeapp.pushprofile.Model344_12
import com.awesomeapp.pushprofile.Activity344_13
import com.awesomeapp.pushprofile.Model344_15
import com.awesomeapp.pushprofile.Activity344_16
import com.awesomeapp.pushprofile.Model344_18
import com.awesomeapp.pushprofile.Activity344_19
import com.awesomeapp.pushprofile.Model344_21
import com.awesomeapp.pushprofile.Activity344_22
import com.awesomeapp.pushprofile.Model344_24
import com.awesomeapp.pushprofile.Activity344_25
import com.awesomeapp.pushprofile.Model344_27
import com.awesomeapp.pushprofile.Activity344_28

@Module
@InstallIn(SingletonComponent::class)
object Module_344 {
    @Provides
    @Singleton
    fun provideRepository344_5(
        api0: Api276_6 = Api276_6(),
        api1: Api324_6 = Api324_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api292_6 = Api292_6(),
        api6: Api272_6 = Api272_6(),
        api7: Api312_6 = Api312_6(),
        api8: Api328_6 = Api328_6()
    ): Repository344_5 {
        return Repository344_5(api0, 
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
    fun provideApi344_6(): Api344_6 {
        return Api344_6()
    }
}