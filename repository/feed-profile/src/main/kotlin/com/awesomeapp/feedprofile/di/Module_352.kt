package com.awesomeapp.feedprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.feedprofile.Viewmodel352_1
import com.awesomeapp.feedprofile.Activity352_2
import com.awesomeapp.feedprofile.Activity352_3
import com.awesomeapp.feedprofile.Fragment352_4
import com.awesomeapp.feedprofile.Repository352_5
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.feedprofile.Model352_8
import com.awesomeapp.feedprofile.Model352_9
import com.awesomeapp.feedprofile.Activity352_10
import com.awesomeapp.feedprofile.Model352_12
import com.awesomeapp.feedprofile.Activity352_13
import com.awesomeapp.feedprofile.Model352_15
import com.awesomeapp.feedprofile.Activity352_16
import com.awesomeapp.feedprofile.Model352_18
import com.awesomeapp.feedprofile.Activity352_19
import com.awesomeapp.feedprofile.Model352_21
import com.awesomeapp.feedprofile.Activity352_22
import com.awesomeapp.feedprofile.Model352_24
import com.awesomeapp.feedprofile.Activity352_25
import com.awesomeapp.feedprofile.Model352_27
import com.awesomeapp.feedprofile.Activity352_28
import com.awesomeapp.feedprofile.Model352_30
import com.awesomeapp.feedprofile.Activity352_31
import com.awesomeapp.feedprofile.Model352_33
import com.awesomeapp.feedprofile.Activity352_34
import com.awesomeapp.feedprofile.Model352_36
import com.awesomeapp.feedprofile.Activity352_37
import com.awesomeapp.feedprofile.Model352_39
import com.awesomeapp.feedprofile.Activity352_40
import com.awesomeapp.feedprofile.Model352_42
import com.awesomeapp.feedprofile.Activity352_43
import com.awesomeapp.feedprofile.Model352_45
import com.awesomeapp.feedprofile.Activity352_46
import com.awesomeapp.feedprofile.Model352_48
import com.awesomeapp.feedprofile.Activity352_49
import com.awesomeapp.feedprofile.Model352_51
import com.awesomeapp.feedprofile.Activity352_52
import com.awesomeapp.feedprofile.Model352_54
import com.awesomeapp.feedprofile.Activity352_55
import com.awesomeapp.feedprofile.Model352_57

@Module
@InstallIn(SingletonComponent::class)
object Module_352 {
    @Provides
    @Singleton
    fun provideRepository352_5(
        api0: Api280_6 = Api280_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api232_6 = Api232_6(),
        api3: Api276_6 = Api276_6(),
        api4: Api224_6 = Api224_6(),
        api5: Api256_6 = Api256_6()
    ): Repository352_5 {
        return Repository352_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi352_6(): Api352_6 {
        return Api352_6()
    }
}