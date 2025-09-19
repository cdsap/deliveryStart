package com.awesomeapp.audiocheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.audiocheckout.Viewmodel244_1
import com.awesomeapp.audiocheckout.Activity244_2
import com.awesomeapp.audiocheckout.Activity244_3
import com.awesomeapp.audiocheckout.Fragment244_4
import com.awesomeapp.audiocheckout.Repository244_5
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.audiocheckout.Model244_8
import com.awesomeapp.audiocheckout.Model244_9
import com.awesomeapp.audiocheckout.Activity244_10
import com.awesomeapp.audiocheckout.Model244_12
import com.awesomeapp.audiocheckout.Activity244_13
import com.awesomeapp.audiocheckout.Model244_15
import com.awesomeapp.audiocheckout.Activity244_16
import com.awesomeapp.audiocheckout.Model244_18
import com.awesomeapp.audiocheckout.Activity244_19

@Module
@InstallIn(SingletonComponent::class)
object Module_244 {
    @Provides
    @Singleton
    fun provideRepository244_5(
        api0: Api184_6 = Api184_6(),
        api1: Api160_6 = Api160_6()
    ): Repository244_5 {
        return Repository244_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi244_6(): Api244_6 {
        return Api244_6()
    }
}