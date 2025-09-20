package com.awesomeapp.listprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listprofile.Viewmodel380_1
import com.awesomeapp.listprofile.Activity380_2
import com.awesomeapp.listprofile.Activity380_3
import com.awesomeapp.listprofile.Fragment380_4
import com.awesomeapp.listprofile.Repository380_5
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.groupidentity.Api164_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.listprofile.Service380_7
import com.awesomeapp.listprofile.Worker380_8
import com.awesomeapp.listprofile.Model380_10
import com.awesomeapp.listprofile.Model380_11
import com.awesomeapp.listprofile.Activity380_12
import com.awesomeapp.listprofile.Model380_14
import com.awesomeapp.listprofile.Activity380_15
import com.awesomeapp.listprofile.Model380_17
import com.awesomeapp.listprofile.Activity380_18
import com.awesomeapp.listprofile.Model380_20
import com.awesomeapp.listprofile.Activity380_21
import com.awesomeapp.listprofile.Model380_23
import com.awesomeapp.listprofile.Activity380_24
import com.awesomeapp.listprofile.Model380_26
import com.awesomeapp.listprofile.Activity380_27
import com.awesomeapp.listprofile.Model380_29
import com.awesomeapp.listprofile.Activity380_30
import com.awesomeapp.listprofile.Model380_32
import com.awesomeapp.listprofile.Activity380_33
import com.awesomeapp.listprofile.Model380_35
import com.awesomeapp.listprofile.Activity380_36
import com.awesomeapp.listprofile.Model380_38
import com.awesomeapp.listprofile.Activity380_39
import com.awesomeapp.listprofile.Model380_41
import com.awesomeapp.listprofile.Activity380_42
import com.awesomeapp.listprofile.Model380_44
import com.awesomeapp.listprofile.Activity380_45
import com.awesomeapp.listprofile.Model380_47
import com.awesomeapp.listprofile.Activity380_48
import com.awesomeapp.listprofile.Model380_50
import com.awesomeapp.listprofile.Activity380_51
import com.awesomeapp.listprofile.Model380_53
import com.awesomeapp.listprofile.Activity380_54
import com.awesomeapp.listprofile.Model380_56
import com.awesomeapp.listprofile.Activity380_57
import com.awesomeapp.listprofile.Model380_59
import com.awesomeapp.listprofile.Activity380_60
import com.awesomeapp.listprofile.Model380_62
import com.awesomeapp.listprofile.Activity380_63
import com.awesomeapp.listprofile.Model380_65
import com.awesomeapp.listprofile.Activity380_66
import com.awesomeapp.listprofile.Model380_68
import com.awesomeapp.listprofile.Activity380_69
import com.awesomeapp.listprofile.Model380_71
import com.awesomeapp.listprofile.Activity380_72
import com.awesomeapp.listprofile.Model380_74
import com.awesomeapp.listprofile.Activity380_75
import com.awesomeapp.listprofile.Model380_77
import com.awesomeapp.listprofile.Activity380_78
import com.awesomeapp.listprofile.Model380_80
import com.awesomeapp.listprofile.Activity380_81
import com.awesomeapp.listprofile.Model380_83
import com.awesomeapp.listprofile.Activity380_84
import com.awesomeapp.listprofile.Model380_86
import com.awesomeapp.listprofile.Activity380_87
import com.awesomeapp.listprofile.Model380_89
import com.awesomeapp.listprofile.Activity380_90
import com.awesomeapp.listprofile.Model380_92
import com.awesomeapp.listprofile.Activity380_93
import com.awesomeapp.listprofile.Model380_95
import com.awesomeapp.listprofile.Activity380_96
import com.awesomeapp.listprofile.Model380_98
import com.awesomeapp.listprofile.Activity380_99
import com.awesomeapp.listprofile.Model380_101
import com.awesomeapp.listprofile.Activity380_102
import com.awesomeapp.listprofile.Model380_104
import com.awesomeapp.listprofile.Activity380_105
import com.awesomeapp.listprofile.Model380_107
import com.awesomeapp.listprofile.Activity380_108
import com.awesomeapp.listprofile.Model380_110
import com.awesomeapp.listprofile.Activity380_111
import com.awesomeapp.listprofile.Model380_113
import com.awesomeapp.listprofile.Activity380_114
import com.awesomeapp.listprofile.Model380_116
import com.awesomeapp.listprofile.Activity380_117
import com.awesomeapp.listprofile.Model380_119
import com.awesomeapp.listprofile.Activity380_120
import com.awesomeapp.listprofile.Model380_122
import com.awesomeapp.listprofile.Activity380_123
import com.awesomeapp.listprofile.Model380_125
import com.awesomeapp.listprofile.Activity380_126
import com.awesomeapp.listprofile.Model380_128
import com.awesomeapp.listprofile.Activity380_129
import com.awesomeapp.listprofile.Model380_131
import com.awesomeapp.listprofile.Activity380_132
import com.awesomeapp.listprofile.Model380_134
import com.awesomeapp.listprofile.Activity380_135
import com.awesomeapp.listprofile.Model380_137
import com.awesomeapp.listprofile.Activity380_138
import com.awesomeapp.listprofile.Model380_140
import com.awesomeapp.listprofile.Activity380_141
import com.awesomeapp.listprofile.Model380_143
import com.awesomeapp.listprofile.Activity380_144
import com.awesomeapp.listprofile.Model380_146
import com.awesomeapp.listprofile.Activity380_147
import com.awesomeapp.listprofile.Model380_149

@Module
@InstallIn(SingletonComponent::class)
object Module_380 {
    @Provides
    @Singleton
    fun provideRepository380_5(
        api0: Api292_6 = Api292_6(),
        api1: Api228_6 = Api228_6(),
        api2: Api220_6 = Api220_6(),
        api3: Api172_6 = Api172_6(),
        api4: Api192_6 = Api192_6(),
        api5: Api248_6 = Api248_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api156_6 = Api156_6(),
        api8: Api196_6 = Api196_6(),
        api9: Api200_6 = Api200_6(),
        api10: Api236_6 = Api236_6(),
        api11: Api152_6 = Api152_6(),
        api12: Api180_6 = Api180_6(),
        api13: Api232_6 = Api232_6(),
        api14: Api244_6 = Api244_6(),
        api15: Api204_6 = Api204_6(),
        api16: Api300_6 = Api300_6(),
        api17: Api216_6 = Api216_6(),
        api18: Api260_6 = Api260_6(),
        api19: Api240_6 = Api240_6(),
        api20: Api188_6 = Api188_6(),
        api21: Api164_6 = Api164_6(),
        api22: Api276_6 = Api276_6(),
        api23: Api160_6 = Api160_6(),
        api24: Api184_6 = Api184_6(),
        api25: Api212_6 = Api212_6(),
        api26: Api208_6 = Api208_6(),
        api27: Api176_6 = Api176_6(),
        api28: Api268_6 = Api268_6(),
        api29: Api252_6 = Api252_6(),
        api30: Api256_6 = Api256_6(),
        api31: Api264_6 = Api264_6()
    ): Repository380_5 {
        return Repository380_5(api0, 
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
        api24, 
        api25, 
        api26, 
        api27, 
        api28, 
        api29, 
        api30, 
        api31)
    }

    @Provides
    @Singleton
    fun provideApi380_6(): Api380_6 {
        return Api380_6()
    }
}