package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.synccart.Service260_7
import com.awesomeapp.synccart.Worker260_8
import com.awesomeapp.synccart.Model260_10
import com.awesomeapp.synccart.Model260_11
import com.awesomeapp.synccart.Activity260_12
import com.awesomeapp.synccart.Model260_14
import com.awesomeapp.synccart.Activity260_15
import com.awesomeapp.synccart.Model260_17
import com.awesomeapp.synccart.Activity260_18
import com.awesomeapp.synccart.Model260_20
import com.awesomeapp.synccart.Activity260_21
import com.awesomeapp.synccart.Model260_23
import com.awesomeapp.synccart.Activity260_24
import com.awesomeapp.synccart.Model260_26
import com.awesomeapp.synccart.Activity260_27
import com.awesomeapp.synccart.Model260_29
import com.awesomeapp.synccart.Activity260_30
import com.awesomeapp.synccart.Model260_32
import com.awesomeapp.synccart.Activity260_33
import com.awesomeapp.synccart.Model260_35
import com.awesomeapp.synccart.Activity260_36
import com.awesomeapp.synccart.Model260_38
import com.awesomeapp.synccart.Activity260_39
import com.awesomeapp.synccart.Model260_41
import com.awesomeapp.synccart.Activity260_42
import com.awesomeapp.synccart.Model260_44
import com.awesomeapp.synccart.Activity260_45
import com.awesomeapp.synccart.Model260_47
import com.awesomeapp.synccart.Activity260_48
import com.awesomeapp.synccart.Model260_50
import com.awesomeapp.synccart.Activity260_51
import com.awesomeapp.synccart.Model260_53
import com.awesomeapp.synccart.Activity260_54
import com.awesomeapp.synccart.Model260_56
import com.awesomeapp.synccart.Activity260_57
import com.awesomeapp.synccart.Model260_59
import com.awesomeapp.synccart.Activity260_60
import com.awesomeapp.synccart.Model260_62
import com.awesomeapp.synccart.Activity260_63
import com.awesomeapp.synccart.Model260_65
import com.awesomeapp.synccart.Activity260_66
import com.awesomeapp.synccart.Model260_68
import com.awesomeapp.synccart.Activity260_69
import com.awesomeapp.synccart.Model260_71
import com.awesomeapp.synccart.Activity260_72
import com.awesomeapp.synccart.Model260_74
import com.awesomeapp.synccart.Activity260_75
import com.awesomeapp.synccart.Model260_77
import com.awesomeapp.synccart.Activity260_78
import com.awesomeapp.synccart.Model260_80
import com.awesomeapp.synccart.Activity260_81
import com.awesomeapp.synccart.Model260_83
import com.awesomeapp.synccart.Activity260_84
import com.awesomeapp.synccart.Model260_86
import com.awesomeapp.synccart.Activity260_87
import com.awesomeapp.synccart.Model260_89
import com.awesomeapp.synccart.Activity260_90
import com.awesomeapp.synccart.Model260_92
import com.awesomeapp.synccart.Activity260_93
import com.awesomeapp.synccart.Model260_95
import com.awesomeapp.synccart.Activity260_96

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api132_6 = Api132_6(),
        api1: Api56_6 = Api56_6(),
        api2: Api20_6 = Api20_6(),
        api3: Api68_6 = Api68_6(),
        api4: Api108_6 = Api108_6(),
        api5: Api24_6 = Api24_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}