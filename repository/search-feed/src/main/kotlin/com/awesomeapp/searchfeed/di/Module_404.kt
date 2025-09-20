package com.awesomeapp.searchfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.searchfeed.Viewmodel404_1
import com.awesomeapp.searchfeed.Activity404_2
import com.awesomeapp.searchfeed.Activity404_3
import com.awesomeapp.searchfeed.Fragment404_4
import com.awesomeapp.searchfeed.Repository404_5
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.searchfeed.Model404_8
import com.awesomeapp.searchfeed.Model404_9
import com.awesomeapp.searchfeed.Activity404_10
import com.awesomeapp.searchfeed.Model404_12
import com.awesomeapp.searchfeed.Activity404_13
import com.awesomeapp.searchfeed.Model404_15
import com.awesomeapp.searchfeed.Activity404_16
import com.awesomeapp.searchfeed.Model404_18
import com.awesomeapp.searchfeed.Activity404_19
import com.awesomeapp.searchfeed.Model404_21
import com.awesomeapp.searchfeed.Activity404_22
import com.awesomeapp.searchfeed.Model404_24
import com.awesomeapp.searchfeed.Activity404_25
import com.awesomeapp.searchfeed.Model404_27
import com.awesomeapp.searchfeed.Activity404_28
import com.awesomeapp.searchfeed.Model404_30
import com.awesomeapp.searchfeed.Activity404_31
import com.awesomeapp.searchfeed.Model404_33
import com.awesomeapp.searchfeed.Activity404_34
import com.awesomeapp.searchfeed.Model404_36
import com.awesomeapp.searchfeed.Activity404_37
import com.awesomeapp.searchfeed.Model404_39
import com.awesomeapp.searchfeed.Activity404_40
import com.awesomeapp.searchfeed.Model404_42
import com.awesomeapp.searchfeed.Activity404_43

@Module
@InstallIn(SingletonComponent::class)
object Module_404 {
    @Provides
    @Singleton
    fun provideRepository404_5(
        api0: Api328_6 = Api328_6()
    ): Repository404_5 {
        return Repository404_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi404_6(): Api404_6 {
        return Api404_6()
    }
}