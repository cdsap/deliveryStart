package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.notificationcontact.Api68_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.podcastcart.Usecase288_7
import com.awesomeapp.podcastcart.Model288_9
import com.awesomeapp.podcastcart.Model288_10
import com.awesomeapp.podcastcart.Activity288_11
import com.awesomeapp.podcastcart.Model288_13
import com.awesomeapp.podcastcart.Activity288_14
import com.awesomeapp.podcastcart.Model288_16
import com.awesomeapp.podcastcart.Activity288_17
import com.awesomeapp.podcastcart.Model288_19
import com.awesomeapp.podcastcart.Activity288_20
import com.awesomeapp.podcastcart.Model288_22
import com.awesomeapp.podcastcart.Activity288_23
import com.awesomeapp.podcastcart.Model288_25
import com.awesomeapp.podcastcart.Activity288_26
import com.awesomeapp.podcastcart.Model288_28
import com.awesomeapp.podcastcart.Activity288_29
import com.awesomeapp.podcastcart.Model288_31
import com.awesomeapp.podcastcart.Activity288_32
import com.awesomeapp.podcastcart.Model288_34
import com.awesomeapp.podcastcart.Activity288_35
import com.awesomeapp.podcastcart.Model288_37
import com.awesomeapp.podcastcart.Activity288_38
import com.awesomeapp.podcastcart.Model288_40
import com.awesomeapp.podcastcart.Activity288_41
import com.awesomeapp.podcastcart.Model288_43
import com.awesomeapp.podcastcart.Activity288_44
import com.awesomeapp.podcastcart.Model288_46
import com.awesomeapp.podcastcart.Activity288_47
import com.awesomeapp.podcastcart.Model288_49
import com.awesomeapp.podcastcart.Activity288_50
import com.awesomeapp.podcastcart.Model288_52
import com.awesomeapp.podcastcart.Activity288_53
import com.awesomeapp.podcastcart.Model288_55
import com.awesomeapp.podcastcart.Activity288_56
import com.awesomeapp.podcastcart.Model288_58
import com.awesomeapp.podcastcart.Activity288_59
import com.awesomeapp.podcastcart.Model288_61
import com.awesomeapp.podcastcart.Activity288_62
import com.awesomeapp.podcastcart.Model288_64
import com.awesomeapp.podcastcart.Activity288_65
import com.awesomeapp.podcastcart.Model288_67
import com.awesomeapp.podcastcart.Activity288_68
import com.awesomeapp.podcastcart.Model288_70
import com.awesomeapp.podcastcart.Activity288_71
import com.awesomeapp.podcastcart.Model288_73
import com.awesomeapp.podcastcart.Activity288_74
import com.awesomeapp.podcastcart.Model288_76
import com.awesomeapp.podcastcart.Activity288_77
import com.awesomeapp.podcastcart.Model288_79
import com.awesomeapp.podcastcart.Activity288_80
import com.awesomeapp.podcastcart.Model288_82
import com.awesomeapp.podcastcart.Activity288_83
import com.awesomeapp.podcastcart.Model288_85
import com.awesomeapp.podcastcart.Activity288_86
import com.awesomeapp.podcastcart.Model288_88
import com.awesomeapp.podcastcart.Activity288_89
import com.awesomeapp.podcastcart.Model288_91
import com.awesomeapp.podcastcart.Activity288_92
import com.awesomeapp.podcastcart.Model288_94
import com.awesomeapp.podcastcart.Activity288_95
import com.awesomeapp.podcastcart.Model288_97
import com.awesomeapp.podcastcart.Activity288_98
import com.awesomeapp.podcastcart.Model288_100
import com.awesomeapp.podcastcart.Activity288_101
import com.awesomeapp.podcastcart.Model288_103
import com.awesomeapp.podcastcart.Activity288_104
import com.awesomeapp.podcastcart.Model288_106
import com.awesomeapp.podcastcart.Activity288_107
import com.awesomeapp.podcastcart.Model288_109
import com.awesomeapp.podcastcart.Activity288_110
import com.awesomeapp.podcastcart.Model288_112
import com.awesomeapp.podcastcart.Activity288_113
import com.awesomeapp.podcastcart.Model288_115
import com.awesomeapp.podcastcart.Activity288_116
import com.awesomeapp.podcastcart.Model288_118
import com.awesomeapp.podcastcart.Activity288_119
import com.awesomeapp.podcastcart.Model288_121
import com.awesomeapp.podcastcart.Activity288_122
import com.awesomeapp.podcastcart.Model288_124
import com.awesomeapp.podcastcart.Activity288_125

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api80_6 = Api80_6(),
        api1: Api20_6 = Api20_6(),
        api2: Api12_6 = Api12_6(),
        api3: Api48_6 = Api48_6(),
        api4: Api44_6 = Api44_6(),
        api5: Api116_6 = Api116_6(),
        api6: Api52_6 = Api52_6(),
        api7: Api148_6 = Api148_6(),
        api8: Api140_6 = Api140_6(),
        api9: Api64_6 = Api64_6(),
        api10: Api120_6 = Api120_6(),
        api11: Api84_6 = Api84_6(),
        api12: Api72_6 = Api72_6(),
        api13: Api100_6 = Api100_6(),
        api14: Api76_6 = Api76_6(),
        api15: Api96_6 = Api96_6(),
        api16: Api24_6 = Api24_6(),
        api17: Api16_6 = Api16_6(),
        api18: Api68_6 = Api68_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9, 
        api10, 
        api11, 
        api12, 
        api13, 
        api14, 
        api15, 
        api16, 
        api17, 
        api18)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}