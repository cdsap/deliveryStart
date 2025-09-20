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
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.checkoutprofile.Usecase348_7
import com.awesomeapp.checkoutprofile.Model348_9
import com.awesomeapp.checkoutprofile.Model348_10
import com.awesomeapp.checkoutprofile.Activity348_11
import com.awesomeapp.checkoutprofile.Model348_13
import com.awesomeapp.checkoutprofile.Activity348_14
import com.awesomeapp.checkoutprofile.Model348_16
import com.awesomeapp.checkoutprofile.Activity348_17
import com.awesomeapp.checkoutprofile.Model348_19
import com.awesomeapp.checkoutprofile.Activity348_20
import com.awesomeapp.checkoutprofile.Model348_22
import com.awesomeapp.checkoutprofile.Activity348_23
import com.awesomeapp.checkoutprofile.Model348_25
import com.awesomeapp.checkoutprofile.Activity348_26
import com.awesomeapp.checkoutprofile.Model348_28
import com.awesomeapp.checkoutprofile.Activity348_29
import com.awesomeapp.checkoutprofile.Model348_31
import com.awesomeapp.checkoutprofile.Activity348_32
import com.awesomeapp.checkoutprofile.Model348_34
import com.awesomeapp.checkoutprofile.Activity348_35
import com.awesomeapp.checkoutprofile.Model348_37
import com.awesomeapp.checkoutprofile.Activity348_38

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api288_6 = Api288_6(),
        api1: Api296_6 = Api296_6(),
        api2: Api284_6 = Api284_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}