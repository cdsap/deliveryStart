package com.awesomeapp.contactuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactuser.Viewmodel296_1
import com.awesomeapp.contactuser.Activity296_2
import com.awesomeapp.contactuser.Activity296_3
import com.awesomeapp.contactuser.Fragment296_4
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.contactuser.Model296_8
import com.awesomeapp.contactuser.Model296_9
import com.awesomeapp.contactuser.Activity296_10
import com.awesomeapp.contactuser.Model296_12
import com.awesomeapp.contactuser.Activity296_13
import com.awesomeapp.contactuser.Model296_15

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api260_6 = Api260_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api256_6 = Api256_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}