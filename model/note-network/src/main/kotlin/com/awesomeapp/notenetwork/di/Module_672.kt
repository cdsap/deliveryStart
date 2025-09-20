package com.awesomeapp.notenetwork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notenetwork.Viewmodel672_1
import com.awesomeapp.notenetwork.Activity672_2
import com.awesomeapp.notenetwork.Activity672_3
import com.awesomeapp.notenetwork.Fragment672_4
import com.awesomeapp.notenetwork.Repository672_5
import com.awesomeapp.messagepost.Api508_6
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.searchlocation.Api600_6
import com.awesomeapp.documentpost.Api524_6
import com.awesomeapp.notenetwork.Api672_6
import com.awesomeapp.notenetwork.Usecase672_7
import com.awesomeapp.notenetwork.Model672_9
import com.awesomeapp.notenetwork.Model672_10
import com.awesomeapp.notenetwork.Activity672_11

@Module
@InstallIn(SingletonComponent::class)
object Module_672 {
    @Provides
    @Singleton
    fun provideRepository672_5(
        api0: Api508_6 = Api508_6(),
        api1: Api468_6 = Api468_6(),
        api2: Api500_6 = Api500_6(),
        api3: Api600_6 = Api600_6(),
        api4: Api524_6 = Api524_6()
    ): Repository672_5 {
        return Repository672_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi672_6(): Api672_6 {
        return Api672_6()
    }
}