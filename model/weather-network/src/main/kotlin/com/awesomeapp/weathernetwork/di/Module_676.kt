package com.awesomeapp.weathernetwork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathernetwork.Viewmodel676_1
import com.awesomeapp.weathernetwork.Activity676_2
import com.awesomeapp.weathernetwork.Activity676_3
import com.awesomeapp.weathernetwork.Fragment676_4
import com.awesomeapp.weathernetwork.Repository676_5
import com.awesomeapp.newssearch.Api580_6
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.notificationcomment.Api460_6
import com.awesomeapp.weathernetwork.Api676_6
import com.awesomeapp.weathernetwork.Model676_8
import com.awesomeapp.weathernetwork.Model676_9
import com.awesomeapp.weathernetwork.Activity676_10
import com.awesomeapp.weathernetwork.Model676_12
import com.awesomeapp.weathernetwork.Activity676_13
import com.awesomeapp.weathernetwork.Model676_15
import com.awesomeapp.weathernetwork.Activity676_16
import com.awesomeapp.weathernetwork.Model676_18
import com.awesomeapp.weathernetwork.Activity676_19
import com.awesomeapp.weathernetwork.Model676_21
import com.awesomeapp.weathernetwork.Activity676_22
import com.awesomeapp.weathernetwork.Model676_24
import com.awesomeapp.weathernetwork.Activity676_25
import com.awesomeapp.weathernetwork.Model676_27
import com.awesomeapp.weathernetwork.Activity676_28
import com.awesomeapp.weathernetwork.Model676_30
import com.awesomeapp.weathernetwork.Activity676_31
import com.awesomeapp.weathernetwork.Model676_33
import com.awesomeapp.weathernetwork.Activity676_34
import com.awesomeapp.weathernetwork.Model676_36
import com.awesomeapp.weathernetwork.Activity676_37
import com.awesomeapp.weathernetwork.Model676_39
import com.awesomeapp.weathernetwork.Activity676_40
import com.awesomeapp.weathernetwork.Model676_42
import com.awesomeapp.weathernetwork.Activity676_43
import com.awesomeapp.weathernetwork.Model676_45
import com.awesomeapp.weathernetwork.Activity676_46
import com.awesomeapp.weathernetwork.Model676_48
import com.awesomeapp.weathernetwork.Activity676_49
import com.awesomeapp.weathernetwork.Model676_51
import com.awesomeapp.weathernetwork.Activity676_52
import com.awesomeapp.weathernetwork.Model676_54
import com.awesomeapp.weathernetwork.Activity676_55
import com.awesomeapp.weathernetwork.Model676_57
import com.awesomeapp.weathernetwork.Activity676_58
import com.awesomeapp.weathernetwork.Model676_60
import com.awesomeapp.weathernetwork.Activity676_61
import com.awesomeapp.weathernetwork.Model676_63
import com.awesomeapp.weathernetwork.Activity676_64
import com.awesomeapp.weathernetwork.Model676_66
import com.awesomeapp.weathernetwork.Activity676_67
import com.awesomeapp.weathernetwork.Model676_69
import com.awesomeapp.weathernetwork.Activity676_70
import com.awesomeapp.weathernetwork.Model676_72
import com.awesomeapp.weathernetwork.Activity676_73
import com.awesomeapp.weathernetwork.Model676_75
import com.awesomeapp.weathernetwork.Activity676_76
import com.awesomeapp.weathernetwork.Model676_78
import com.awesomeapp.weathernetwork.Activity676_79
import com.awesomeapp.weathernetwork.Model676_81
import com.awesomeapp.weathernetwork.Activity676_82
import com.awesomeapp.weathernetwork.Model676_84
import com.awesomeapp.weathernetwork.Activity676_85
import com.awesomeapp.weathernetwork.Model676_87
import com.awesomeapp.weathernetwork.Activity676_88
import com.awesomeapp.weathernetwork.Model676_90
import com.awesomeapp.weathernetwork.Activity676_91
import com.awesomeapp.weathernetwork.Model676_93
import com.awesomeapp.weathernetwork.Activity676_94

@Module
@InstallIn(SingletonComponent::class)
object Module_676 {
    @Provides
    @Singleton
    fun provideRepository676_5(
        api0: Api580_6 = Api580_6(),
        api1: Api500_6 = Api500_6(),
        api2: Api460_6 = Api460_6()
    ): Repository676_5 {
        return Repository676_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi676_6(): Api676_6 {
        return Api676_6()
    }
}