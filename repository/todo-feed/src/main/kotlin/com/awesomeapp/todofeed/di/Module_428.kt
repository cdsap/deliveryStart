package com.awesomeapp.todofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todofeed.Viewmodel428_1
import com.awesomeapp.todofeed.Activity428_2
import com.awesomeapp.todofeed.Activity428_3
import com.awesomeapp.todofeed.Fragment428_4
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.todofeed.Model428_8
import com.awesomeapp.todofeed.Model428_9
import com.awesomeapp.todofeed.Activity428_10
import com.awesomeapp.todofeed.Model428_12
import com.awesomeapp.todofeed.Activity428_13
import com.awesomeapp.todofeed.Model428_15
import com.awesomeapp.todofeed.Activity428_16
import com.awesomeapp.todofeed.Model428_18
import com.awesomeapp.todofeed.Activity428_19
import com.awesomeapp.todofeed.Model428_21
import com.awesomeapp.todofeed.Activity428_22
import com.awesomeapp.todofeed.Model428_24
import com.awesomeapp.todofeed.Activity428_25
import com.awesomeapp.todofeed.Model428_27
import com.awesomeapp.todofeed.Activity428_28
import com.awesomeapp.todofeed.Model428_30
import com.awesomeapp.todofeed.Activity428_31
import com.awesomeapp.todofeed.Model428_33
import com.awesomeapp.todofeed.Activity428_34
import com.awesomeapp.todofeed.Model428_36
import com.awesomeapp.todofeed.Activity428_37
import com.awesomeapp.todofeed.Model428_39
import com.awesomeapp.todofeed.Activity428_40
import com.awesomeapp.todofeed.Model428_42
import com.awesomeapp.todofeed.Activity428_43
import com.awesomeapp.todofeed.Model428_45
import com.awesomeapp.todofeed.Activity428_46
import com.awesomeapp.todofeed.Model428_48
import com.awesomeapp.todofeed.Activity428_49
import com.awesomeapp.todofeed.Model428_51
import com.awesomeapp.todofeed.Activity428_52
import com.awesomeapp.todofeed.Model428_54
import com.awesomeapp.todofeed.Activity428_55

@Module
@InstallIn(SingletonComponent::class)
object Module_428 {
    @Provides
    @Singleton
    fun provideRepository428_5(
        api0: Api320_6 = Api320_6(),
        api1: Api308_6 = Api308_6(),
        api2: Api288_6 = Api288_6(),
        api3: Api276_6 = Api276_6()
    ): Repository428_5 {
        return Repository428_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi428_6(): Api428_6 {
        return Api428_6()
    }
}