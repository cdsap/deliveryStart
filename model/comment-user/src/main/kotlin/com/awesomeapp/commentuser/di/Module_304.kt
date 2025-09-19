package com.awesomeapp.commentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentuser.Viewmodel304_1
import com.awesomeapp.commentuser.Activity304_2
import com.awesomeapp.commentuser.Activity304_3
import com.awesomeapp.commentuser.Fragment304_4
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.commentuser.Model304_8
import com.awesomeapp.commentuser.Model304_9
import com.awesomeapp.commentuser.Activity304_10
import com.awesomeapp.commentuser.Model304_12
import com.awesomeapp.commentuser.Activity304_13
import com.awesomeapp.commentuser.Model304_15
import com.awesomeapp.commentuser.Activity304_16
import com.awesomeapp.commentuser.Model304_18
import com.awesomeapp.commentuser.Activity304_19

@Module
@InstallIn(SingletonComponent::class)
object Module_304 {
    @Provides
    @Singleton
    fun provideRepository304_5(
        api0: Api240_6 = Api240_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api236_6 = Api236_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api232_6 = Api232_6(),
        api5: Api280_6 = Api280_6()
    ): Repository304_5 {
        return Repository304_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi304_6(): Api304_6 {
        return Api304_6()
    }
}