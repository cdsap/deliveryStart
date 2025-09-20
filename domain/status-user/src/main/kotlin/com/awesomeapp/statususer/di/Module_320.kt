package com.awesomeapp.statususer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statususer.Viewmodel320_1
import com.awesomeapp.statususer.Activity320_2
import com.awesomeapp.statususer.Activity320_3
import com.awesomeapp.statususer.Fragment320_4
import com.awesomeapp.statususer.Repository320_5
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.statususer.Service320_7
import com.awesomeapp.statususer.Worker320_8
import com.awesomeapp.statususer.Model320_10
import com.awesomeapp.statususer.Model320_11
import com.awesomeapp.statususer.Activity320_12
import com.awesomeapp.statususer.Model320_14
import com.awesomeapp.statususer.Activity320_15
import com.awesomeapp.statususer.Model320_17
import com.awesomeapp.statususer.Activity320_18
import com.awesomeapp.statususer.Model320_20
import com.awesomeapp.statususer.Activity320_21
import com.awesomeapp.statususer.Model320_23
import com.awesomeapp.statususer.Activity320_24
import com.awesomeapp.statususer.Model320_26
import com.awesomeapp.statususer.Activity320_27
import com.awesomeapp.statususer.Model320_29
import com.awesomeapp.statususer.Activity320_30
import com.awesomeapp.statususer.Model320_32
import com.awesomeapp.statususer.Activity320_33
import com.awesomeapp.statususer.Model320_35
import com.awesomeapp.statususer.Activity320_36
import com.awesomeapp.statususer.Model320_38
import com.awesomeapp.statususer.Activity320_39
import com.awesomeapp.statususer.Model320_41
import com.awesomeapp.statususer.Activity320_42
import com.awesomeapp.statususer.Model320_44
import com.awesomeapp.statususer.Activity320_45
import com.awesomeapp.statususer.Model320_47
import com.awesomeapp.statususer.Activity320_48

@Module
@InstallIn(SingletonComponent::class)
object Module_320 {
    @Provides
    @Singleton
    fun provideRepository320_5(
        api0: Api264_6 = Api264_6(),
        api1: Api280_6 = Api280_6(),
        api2: Api180_6 = Api180_6(),
        api3: Api208_6 = Api208_6()
    ): Repository320_5 {
        return Repository320_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi320_6(): Api320_6 {
        return Api320_6()
    }
}