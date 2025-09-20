package com.awesomeapp.calendarprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.calendarprofile.Viewmodel372_1
import com.awesomeapp.calendarprofile.Activity372_2
import com.awesomeapp.calendarprofile.Activity372_3
import com.awesomeapp.calendarprofile.Fragment372_4
import com.awesomeapp.calendarprofile.Repository372_5
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.calendarprofile.Usecase372_7
import com.awesomeapp.calendarprofile.Model372_9
import com.awesomeapp.calendarprofile.Model372_10
import com.awesomeapp.calendarprofile.Activity372_11
import com.awesomeapp.calendarprofile.Model372_13
import com.awesomeapp.calendarprofile.Activity372_14
import com.awesomeapp.calendarprofile.Model372_16
import com.awesomeapp.calendarprofile.Activity372_17
import com.awesomeapp.calendarprofile.Model372_19
import com.awesomeapp.calendarprofile.Activity372_20
import com.awesomeapp.calendarprofile.Model372_22
import com.awesomeapp.calendarprofile.Activity372_23
import com.awesomeapp.calendarprofile.Model372_25
import com.awesomeapp.calendarprofile.Activity372_26
import com.awesomeapp.calendarprofile.Model372_28
import com.awesomeapp.calendarprofile.Activity372_29
import com.awesomeapp.calendarprofile.Model372_31
import com.awesomeapp.calendarprofile.Activity372_32
import com.awesomeapp.calendarprofile.Model372_34
import com.awesomeapp.calendarprofile.Activity372_35
import com.awesomeapp.calendarprofile.Model372_37
import com.awesomeapp.calendarprofile.Activity372_38
import com.awesomeapp.calendarprofile.Model372_40
import com.awesomeapp.calendarprofile.Activity372_41
import com.awesomeapp.calendarprofile.Model372_43
import com.awesomeapp.calendarprofile.Activity372_44
import com.awesomeapp.calendarprofile.Model372_46
import com.awesomeapp.calendarprofile.Activity372_47
import com.awesomeapp.calendarprofile.Model372_49
import com.awesomeapp.calendarprofile.Activity372_50
import com.awesomeapp.calendarprofile.Model372_52
import com.awesomeapp.calendarprofile.Activity372_53
import com.awesomeapp.calendarprofile.Model372_55
import com.awesomeapp.calendarprofile.Activity372_56
import com.awesomeapp.calendarprofile.Model372_58
import com.awesomeapp.calendarprofile.Activity372_59
import com.awesomeapp.calendarprofile.Model372_61
import com.awesomeapp.calendarprofile.Activity372_62
import com.awesomeapp.calendarprofile.Model372_64
import com.awesomeapp.calendarprofile.Activity372_65
import com.awesomeapp.calendarprofile.Model372_67
import com.awesomeapp.calendarprofile.Activity372_68
import com.awesomeapp.calendarprofile.Model372_70
import com.awesomeapp.calendarprofile.Activity372_71
import com.awesomeapp.calendarprofile.Model372_73
import com.awesomeapp.calendarprofile.Activity372_74
import com.awesomeapp.calendarprofile.Model372_76
import com.awesomeapp.calendarprofile.Activity372_77
import com.awesomeapp.calendarprofile.Model372_79
import com.awesomeapp.calendarprofile.Activity372_80
import com.awesomeapp.calendarprofile.Model372_82
import com.awesomeapp.calendarprofile.Activity372_83
import com.awesomeapp.calendarprofile.Model372_85
import com.awesomeapp.calendarprofile.Activity372_86
import com.awesomeapp.calendarprofile.Model372_88
import com.awesomeapp.calendarprofile.Activity372_89
import com.awesomeapp.calendarprofile.Model372_91
import com.awesomeapp.calendarprofile.Activity372_92
import com.awesomeapp.calendarprofile.Model372_94
import com.awesomeapp.calendarprofile.Activity372_95
import com.awesomeapp.calendarprofile.Model372_97
import com.awesomeapp.calendarprofile.Activity372_98
import com.awesomeapp.calendarprofile.Model372_100
import com.awesomeapp.calendarprofile.Activity372_101

@Module
@InstallIn(SingletonComponent::class)
object Module_372 {
    @Provides
    @Singleton
    fun provideRepository372_5(
        api0: Api208_6 = Api208_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api172_6 = Api172_6(),
        api3: Api200_6 = Api200_6(),
        api4: Api300_6 = Api300_6(),
        api5: Api276_6 = Api276_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api180_6 = Api180_6(),
        api8: Api216_6 = Api216_6(),
        api9: Api156_6 = Api156_6(),
        api10: Api224_6 = Api224_6(),
        api11: Api196_6 = Api196_6(),
        api12: Api260_6 = Api260_6(),
        api13: Api256_6 = Api256_6(),
        api14: Api296_6 = Api296_6(),
        api15: Api176_6 = Api176_6(),
        api16: Api188_6 = Api188_6(),
        api17: Api184_6 = Api184_6(),
        api18: Api268_6 = Api268_6(),
        api19: Api272_6 = Api272_6(),
        api20: Api292_6 = Api292_6(),
        api21: Api168_6 = Api168_6(),
        api22: Api220_6 = Api220_6()
    ): Repository372_5 {
        return Repository372_5(api0, 
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
        api18, 
        api19, 
        api20, 
        api21, 
        api22)
    }

    @Provides
    @Singleton
    fun provideApi372_6(): Api372_6 {
        return Api372_6()
    }
}