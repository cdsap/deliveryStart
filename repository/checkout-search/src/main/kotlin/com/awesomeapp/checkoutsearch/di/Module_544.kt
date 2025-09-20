package com.awesomeapp.checkoutsearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutsearch.Viewmodel544_1
import com.awesomeapp.checkoutsearch.Activity544_2
import com.awesomeapp.checkoutsearch.Activity544_3
import com.awesomeapp.checkoutsearch.Fragment544_4
import com.awesomeapp.checkoutsearch.Repository544_5
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.checkoutsearch.Api544_6
import com.awesomeapp.checkoutsearch.Model544_8
import com.awesomeapp.checkoutsearch.Model544_9
import com.awesomeapp.checkoutsearch.Activity544_10
import com.awesomeapp.checkoutsearch.Model544_12
import com.awesomeapp.checkoutsearch.Activity544_13
import com.awesomeapp.checkoutsearch.Model544_15
import com.awesomeapp.checkoutsearch.Activity544_16
import com.awesomeapp.checkoutsearch.Model544_18
import com.awesomeapp.checkoutsearch.Activity544_19
import com.awesomeapp.checkoutsearch.Model544_21

@Module
@InstallIn(SingletonComponent::class)
object Module_544 {
    @Provides
    @Singleton
    fun provideRepository544_5(
        api0: Api428_6 = Api428_6(),
        api1: Api368_6 = Api368_6()
    ): Repository544_5 {
        return Repository544_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi544_6(): Api544_6 {
        return Api544_6()
    }
}