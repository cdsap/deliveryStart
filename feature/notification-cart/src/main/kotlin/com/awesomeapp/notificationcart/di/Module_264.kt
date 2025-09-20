package com.awesomeapp.notificationcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcart.Viewmodel264_1
import com.awesomeapp.notificationcart.Activity264_2
import com.awesomeapp.notificationcart.Activity264_3
import com.awesomeapp.notificationcart.Fragment264_4
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.notificationcart.Usecase264_7
import com.awesomeapp.notificationcart.Model264_9
import com.awesomeapp.notificationcart.Model264_10
import com.awesomeapp.notificationcart.Activity264_11
import com.awesomeapp.notificationcart.Model264_13
import com.awesomeapp.notificationcart.Activity264_14
import com.awesomeapp.notificationcart.Model264_16
import com.awesomeapp.notificationcart.Activity264_17
import com.awesomeapp.notificationcart.Model264_19
import com.awesomeapp.notificationcart.Activity264_20
import com.awesomeapp.notificationcart.Model264_22
import com.awesomeapp.notificationcart.Activity264_23
import com.awesomeapp.notificationcart.Model264_25
import com.awesomeapp.notificationcart.Activity264_26
import com.awesomeapp.notificationcart.Model264_28
import com.awesomeapp.notificationcart.Activity264_29
import com.awesomeapp.notificationcart.Model264_31
import com.awesomeapp.notificationcart.Activity264_32
import com.awesomeapp.notificationcart.Model264_34
import com.awesomeapp.notificationcart.Activity264_35
import com.awesomeapp.notificationcart.Model264_37
import com.awesomeapp.notificationcart.Activity264_38
import com.awesomeapp.notificationcart.Model264_40
import com.awesomeapp.notificationcart.Activity264_41
import com.awesomeapp.notificationcart.Model264_43
import com.awesomeapp.notificationcart.Activity264_44
import com.awesomeapp.notificationcart.Model264_46
import com.awesomeapp.notificationcart.Activity264_47
import com.awesomeapp.notificationcart.Model264_49
import com.awesomeapp.notificationcart.Activity264_50
import com.awesomeapp.notificationcart.Model264_52
import com.awesomeapp.notificationcart.Activity264_53
import com.awesomeapp.notificationcart.Model264_55
import com.awesomeapp.notificationcart.Activity264_56
import com.awesomeapp.notificationcart.Model264_58
import com.awesomeapp.notificationcart.Activity264_59
import com.awesomeapp.notificationcart.Model264_61
import com.awesomeapp.notificationcart.Activity264_62
import com.awesomeapp.notificationcart.Model264_64
import com.awesomeapp.notificationcart.Activity264_65
import com.awesomeapp.notificationcart.Model264_67
import com.awesomeapp.notificationcart.Activity264_68
import com.awesomeapp.notificationcart.Model264_70
import com.awesomeapp.notificationcart.Activity264_71
import com.awesomeapp.notificationcart.Model264_73
import com.awesomeapp.notificationcart.Activity264_74
import com.awesomeapp.notificationcart.Model264_76
import com.awesomeapp.notificationcart.Activity264_77
import com.awesomeapp.notificationcart.Model264_79
import com.awesomeapp.notificationcart.Activity264_80
import com.awesomeapp.notificationcart.Model264_82
import com.awesomeapp.notificationcart.Activity264_83
import com.awesomeapp.notificationcart.Model264_85
import com.awesomeapp.notificationcart.Activity264_86
import com.awesomeapp.notificationcart.Model264_88
import com.awesomeapp.notificationcart.Activity264_89
import com.awesomeapp.notificationcart.Model264_91
import com.awesomeapp.notificationcart.Activity264_92
import com.awesomeapp.notificationcart.Model264_94
import com.awesomeapp.notificationcart.Activity264_95
import com.awesomeapp.notificationcart.Model264_97
import com.awesomeapp.notificationcart.Activity264_98
import com.awesomeapp.notificationcart.Model264_100
import com.awesomeapp.notificationcart.Activity264_101
import com.awesomeapp.notificationcart.Model264_103
import com.awesomeapp.notificationcart.Activity264_104
import com.awesomeapp.notificationcart.Model264_106
import com.awesomeapp.notificationcart.Activity264_107
import com.awesomeapp.notificationcart.Model264_109
import com.awesomeapp.notificationcart.Activity264_110
import com.awesomeapp.notificationcart.Model264_112
import com.awesomeapp.notificationcart.Activity264_113
import com.awesomeapp.notificationcart.Model264_115
import com.awesomeapp.notificationcart.Activity264_116

@Module
@InstallIn(SingletonComponent::class)
object Module_264 {
    @Provides
    @Singleton
    fun provideRepository264_5(
        api0: Api76_6 = Api76_6(),
        api1: Api104_6 = Api104_6(),
        api2: Api56_6 = Api56_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api24_6 = Api24_6(),
        api5: Api68_6 = Api68_6(),
        api6: Api120_6 = Api120_6()
    ): Repository264_5 {
        return Repository264_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi264_6(): Api264_6 {
        return Api264_6()
    }
}