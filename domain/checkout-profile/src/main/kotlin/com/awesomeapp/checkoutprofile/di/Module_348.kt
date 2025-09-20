package com.awesomeapp.checkoutprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Viewmodel348_1
import com.awesomeapp.checkoutprofile.Activity348_2
import com.awesomeapp.checkoutprofile.Activity348_3
import com.awesomeapp.checkoutprofile.Fragment348_4
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.checkoutprofile.Usecase348_7
import com.awesomeapp.checkoutprofile.Model348_9
import com.awesomeapp.checkoutprofile.Model348_10
import com.awesomeapp.checkoutprofile.Activity348_11
import com.awesomeapp.checkoutprofile.Model348_13
import com.awesomeapp.checkoutprofile.Activity348_14
import com.awesomeapp.checkoutprofile.Model348_16
import com.awesomeapp.checkoutprofile.Activity348_17
import com.awesomeapp.checkoutprofile.Model348_19
import com.awesomeapp.checkoutprofile.Activity348_20
import com.awesomeapp.checkoutprofile.Model348_22
import com.awesomeapp.checkoutprofile.Activity348_23
import com.awesomeapp.checkoutprofile.Model348_25
import com.awesomeapp.checkoutprofile.Activity348_26
import com.awesomeapp.checkoutprofile.Model348_28
import com.awesomeapp.checkoutprofile.Activity348_29
import com.awesomeapp.checkoutprofile.Model348_31
import com.awesomeapp.checkoutprofile.Activity348_32
import com.awesomeapp.checkoutprofile.Model348_34
import com.awesomeapp.checkoutprofile.Activity348_35
import com.awesomeapp.checkoutprofile.Model348_37
import com.awesomeapp.checkoutprofile.Activity348_38
import com.awesomeapp.checkoutprofile.Model348_40
import com.awesomeapp.checkoutprofile.Activity348_41
import com.awesomeapp.checkoutprofile.Model348_43
import com.awesomeapp.checkoutprofile.Activity348_44
import com.awesomeapp.checkoutprofile.Model348_46
import com.awesomeapp.checkoutprofile.Activity348_47
import com.awesomeapp.checkoutprofile.Model348_49
import com.awesomeapp.checkoutprofile.Activity348_50
import com.awesomeapp.checkoutprofile.Model348_52
import com.awesomeapp.checkoutprofile.Activity348_53
import com.awesomeapp.checkoutprofile.Model348_55
import com.awesomeapp.checkoutprofile.Activity348_56
import com.awesomeapp.checkoutprofile.Model348_58
import com.awesomeapp.checkoutprofile.Activity348_59
import com.awesomeapp.checkoutprofile.Model348_61
import com.awesomeapp.checkoutprofile.Activity348_62
import com.awesomeapp.checkoutprofile.Model348_64
import com.awesomeapp.checkoutprofile.Activity348_65
import com.awesomeapp.checkoutprofile.Model348_67
import com.awesomeapp.checkoutprofile.Activity348_68
import com.awesomeapp.checkoutprofile.Model348_70
import com.awesomeapp.checkoutprofile.Activity348_71
import com.awesomeapp.checkoutprofile.Model348_73
import com.awesomeapp.checkoutprofile.Activity348_74
import com.awesomeapp.checkoutprofile.Model348_76
import com.awesomeapp.checkoutprofile.Activity348_77
import com.awesomeapp.checkoutprofile.Model348_79
import com.awesomeapp.checkoutprofile.Activity348_80
import com.awesomeapp.checkoutprofile.Model348_82
import com.awesomeapp.checkoutprofile.Activity348_83
import com.awesomeapp.checkoutprofile.Model348_85
import com.awesomeapp.checkoutprofile.Activity348_86
import com.awesomeapp.checkoutprofile.Model348_88
import com.awesomeapp.checkoutprofile.Activity348_89
import com.awesomeapp.checkoutprofile.Model348_91
import com.awesomeapp.checkoutprofile.Activity348_92
import com.awesomeapp.checkoutprofile.Model348_94
import com.awesomeapp.checkoutprofile.Activity348_95
import com.awesomeapp.checkoutprofile.Model348_97
import com.awesomeapp.checkoutprofile.Activity348_98
import com.awesomeapp.checkoutprofile.Model348_100
import com.awesomeapp.checkoutprofile.Activity348_101
import com.awesomeapp.checkoutprofile.Model348_103
import com.awesomeapp.checkoutprofile.Activity348_104
import com.awesomeapp.checkoutprofile.Model348_106
import com.awesomeapp.checkoutprofile.Activity348_107
import com.awesomeapp.checkoutprofile.Model348_109
import com.awesomeapp.checkoutprofile.Activity348_110
import com.awesomeapp.checkoutprofile.Model348_112
import com.awesomeapp.checkoutprofile.Activity348_113
import com.awesomeapp.checkoutprofile.Model348_115
import com.awesomeapp.checkoutprofile.Activity348_116

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api240_6 = Api240_6(),
        api1: Api164_6 = Api164_6(),
        api2: Api160_6 = Api160_6(),
        api3: Api264_6 = Api264_6(),
        api4: Api192_6 = Api192_6(),
        api5: Api200_6 = Api200_6(),
        api6: Api220_6 = Api220_6(),
        api7: Api236_6 = Api236_6(),
        api8: Api180_6 = Api180_6(),
        api9: Api168_6 = Api168_6(),
        api10: Api212_6 = Api212_6(),
        api11: Api224_6 = Api224_6(),
        api12: Api256_6 = Api256_6(),
        api13: Api252_6 = Api252_6(),
        api14: Api184_6 = Api184_6(),
        api15: Api232_6 = Api232_6(),
        api16: Api276_6 = Api276_6(),
        api17: Api188_6 = Api188_6(),
        api18: Api272_6 = Api272_6(),
        api19: Api204_6 = Api204_6(),
        api20: Api172_6 = Api172_6(),
        api21: Api260_6 = Api260_6(),
        api22: Api244_6 = Api244_6(),
        api23: Api284_6 = Api284_6(),
        api24: Api280_6 = Api280_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
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
        api22, 
        api23, 
        api24)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}