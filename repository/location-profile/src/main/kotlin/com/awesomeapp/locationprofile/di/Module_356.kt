package com.awesomeapp.locationprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.locationprofile.Viewmodel356_1
import com.awesomeapp.locationprofile.Activity356_2
import com.awesomeapp.locationprofile.Activity356_3
import com.awesomeapp.locationprofile.Fragment356_4
import com.awesomeapp.locationprofile.Repository356_5
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.locationprofile.Model356_8
import com.awesomeapp.locationprofile.Model356_9
import com.awesomeapp.locationprofile.Activity356_10
import com.awesomeapp.locationprofile.Model356_12
import com.awesomeapp.locationprofile.Activity356_13
import com.awesomeapp.locationprofile.Model356_15
import com.awesomeapp.locationprofile.Activity356_16
import com.awesomeapp.locationprofile.Model356_18
import com.awesomeapp.locationprofile.Activity356_19
import com.awesomeapp.locationprofile.Model356_21
import com.awesomeapp.locationprofile.Activity356_22
import com.awesomeapp.locationprofile.Model356_24
import com.awesomeapp.locationprofile.Activity356_25
import com.awesomeapp.locationprofile.Model356_27
import com.awesomeapp.locationprofile.Activity356_28
import com.awesomeapp.locationprofile.Model356_30
import com.awesomeapp.locationprofile.Activity356_31
import com.awesomeapp.locationprofile.Model356_33
import com.awesomeapp.locationprofile.Activity356_34
import com.awesomeapp.locationprofile.Model356_36
import com.awesomeapp.locationprofile.Activity356_37
import com.awesomeapp.locationprofile.Model356_39
import com.awesomeapp.locationprofile.Activity356_40
import com.awesomeapp.locationprofile.Model356_42
import com.awesomeapp.locationprofile.Activity356_43
import com.awesomeapp.locationprofile.Model356_45
import com.awesomeapp.locationprofile.Activity356_46
import com.awesomeapp.locationprofile.Model356_48
import com.awesomeapp.locationprofile.Activity356_49
import com.awesomeapp.locationprofile.Model356_51
import com.awesomeapp.locationprofile.Activity356_52
import com.awesomeapp.locationprofile.Model356_54
import com.awesomeapp.locationprofile.Activity356_55
import com.awesomeapp.locationprofile.Model356_57
import com.awesomeapp.locationprofile.Activity356_58
import com.awesomeapp.locationprofile.Model356_60
import com.awesomeapp.locationprofile.Activity356_61
import com.awesomeapp.locationprofile.Model356_63
import com.awesomeapp.locationprofile.Activity356_64
import com.awesomeapp.locationprofile.Model356_66
import com.awesomeapp.locationprofile.Activity356_67

@Module
@InstallIn(SingletonComponent::class)
object Module_356 {
    @Provides
    @Singleton
    fun provideRepository356_5(
        api0: Api300_6 = Api300_6(),
        api1: Api280_6 = Api280_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api292_6 = Api292_6()
    ): Repository356_5 {
        return Repository356_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi356_6(): Api356_6 {
        return Api356_6()
    }
}