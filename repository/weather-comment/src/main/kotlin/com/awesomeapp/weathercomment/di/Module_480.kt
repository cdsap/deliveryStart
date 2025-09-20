package com.awesomeapp.weathercomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercomment.Viewmodel480_1
import com.awesomeapp.weathercomment.Activity480_2
import com.awesomeapp.weathercomment.Activity480_3
import com.awesomeapp.weathercomment.Fragment480_4
import com.awesomeapp.weathercomment.Repository480_5
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.usercomment.Api448_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.weathercomment.Api480_6
import com.awesomeapp.weathercomment.Service480_7
import com.awesomeapp.weathercomment.Worker480_8
import com.awesomeapp.weathercomment.Usecase480_9
import com.awesomeapp.weathercomment.Model480_11
import com.awesomeapp.weathercomment.Model480_12
import com.awesomeapp.weathercomment.Activity480_13
import com.awesomeapp.weathercomment.Model480_15
import com.awesomeapp.weathercomment.Activity480_16
import com.awesomeapp.weathercomment.Model480_18
import com.awesomeapp.weathercomment.Activity480_19
import com.awesomeapp.weathercomment.Model480_21
import com.awesomeapp.weathercomment.Activity480_22
import com.awesomeapp.weathercomment.Model480_24
import com.awesomeapp.weathercomment.Activity480_25
import com.awesomeapp.weathercomment.Model480_27
import com.awesomeapp.weathercomment.Activity480_28
import com.awesomeapp.weathercomment.Model480_30
import com.awesomeapp.weathercomment.Activity480_31
import com.awesomeapp.weathercomment.Model480_33
import com.awesomeapp.weathercomment.Activity480_34
import com.awesomeapp.weathercomment.Model480_36
import com.awesomeapp.weathercomment.Activity480_37
import com.awesomeapp.weathercomment.Model480_39
import com.awesomeapp.weathercomment.Activity480_40
import com.awesomeapp.weathercomment.Model480_42
import com.awesomeapp.weathercomment.Activity480_43
import com.awesomeapp.weathercomment.Model480_45
import com.awesomeapp.weathercomment.Activity480_46
import com.awesomeapp.weathercomment.Model480_48
import com.awesomeapp.weathercomment.Activity480_49
import com.awesomeapp.weathercomment.Model480_51
import com.awesomeapp.weathercomment.Activity480_52
import com.awesomeapp.weathercomment.Model480_54
import com.awesomeapp.weathercomment.Activity480_55
import com.awesomeapp.weathercomment.Model480_57
import com.awesomeapp.weathercomment.Activity480_58
import com.awesomeapp.weathercomment.Model480_60
import com.awesomeapp.weathercomment.Activity480_61
import com.awesomeapp.weathercomment.Model480_63
import com.awesomeapp.weathercomment.Activity480_64
import com.awesomeapp.weathercomment.Model480_66
import com.awesomeapp.weathercomment.Activity480_67
import com.awesomeapp.weathercomment.Model480_69
import com.awesomeapp.weathercomment.Activity480_70
import com.awesomeapp.weathercomment.Model480_72
import com.awesomeapp.weathercomment.Activity480_73
import com.awesomeapp.weathercomment.Model480_75
import com.awesomeapp.weathercomment.Activity480_76
import com.awesomeapp.weathercomment.Model480_78
import com.awesomeapp.weathercomment.Activity480_79
import com.awesomeapp.weathercomment.Model480_81
import com.awesomeapp.weathercomment.Activity480_82
import com.awesomeapp.weathercomment.Model480_84
import com.awesomeapp.weathercomment.Activity480_85
import com.awesomeapp.weathercomment.Model480_87
import com.awesomeapp.weathercomment.Activity480_88
import com.awesomeapp.weathercomment.Model480_90
import com.awesomeapp.weathercomment.Activity480_91
import com.awesomeapp.weathercomment.Model480_93
import com.awesomeapp.weathercomment.Activity480_94
import com.awesomeapp.weathercomment.Model480_96
import com.awesomeapp.weathercomment.Activity480_97
import com.awesomeapp.weathercomment.Model480_99
import com.awesomeapp.weathercomment.Activity480_100
import com.awesomeapp.weathercomment.Model480_102
import com.awesomeapp.weathercomment.Activity480_103
import com.awesomeapp.weathercomment.Model480_105
import com.awesomeapp.weathercomment.Activity480_106
import com.awesomeapp.weathercomment.Model480_108
import com.awesomeapp.weathercomment.Activity480_109
import com.awesomeapp.weathercomment.Model480_111
import com.awesomeapp.weathercomment.Activity480_112
import com.awesomeapp.weathercomment.Model480_114
import com.awesomeapp.weathercomment.Activity480_115
import com.awesomeapp.weathercomment.Model480_117
import com.awesomeapp.weathercomment.Activity480_118
import com.awesomeapp.weathercomment.Model480_120
import com.awesomeapp.weathercomment.Activity480_121
import com.awesomeapp.weathercomment.Model480_123
import com.awesomeapp.weathercomment.Activity480_124
import com.awesomeapp.weathercomment.Model480_126
import com.awesomeapp.weathercomment.Activity480_127
import com.awesomeapp.weathercomment.Model480_129
import com.awesomeapp.weathercomment.Activity480_130
import com.awesomeapp.weathercomment.Model480_132
import com.awesomeapp.weathercomment.Activity480_133
import com.awesomeapp.weathercomment.Model480_135
import com.awesomeapp.weathercomment.Activity480_136
import com.awesomeapp.weathercomment.Model480_138
import com.awesomeapp.weathercomment.Activity480_139
import com.awesomeapp.weathercomment.Model480_141
import com.awesomeapp.weathercomment.Activity480_142
import com.awesomeapp.weathercomment.Model480_144
import com.awesomeapp.weathercomment.Activity480_145

@Module
@InstallIn(SingletonComponent::class)
object Module_480 {
    @Provides
    @Singleton
    fun provideRepository480_5(
        api0: Api344_6 = Api344_6(),
        api1: Api428_6 = Api428_6(),
        api2: Api316_6 = Api316_6(),
        api3: Api368_6 = Api368_6(),
        api4: Api376_6 = Api376_6(),
        api5: Api320_6 = Api320_6(),
        api6: Api372_6 = Api372_6(),
        api7: Api436_6 = Api436_6(),
        api8: Api448_6 = Api448_6(),
        api9: Api340_6 = Api340_6(),
        api10: Api424_6 = Api424_6(),
        api11: Api380_6 = Api380_6(),
        api12: Api360_6 = Api360_6(),
        api13: Api304_6 = Api304_6(),
        api14: Api432_6 = Api432_6(),
        api15: Api392_6 = Api392_6(),
        api16: Api404_6 = Api404_6(),
        api17: Api348_6 = Api348_6(),
        api18: Api336_6 = Api336_6(),
        api19: Api328_6 = Api328_6(),
        api20: Api312_6 = Api312_6(),
        api21: Api420_6 = Api420_6(),
        api22: Api396_6 = Api396_6(),
        api23: Api408_6 = Api408_6(),
        api24: Api444_6 = Api444_6(),
        api25: Api412_6 = Api412_6(),
        api26: Api356_6 = Api356_6()
    ): Repository480_5 {
        return Repository480_5(api0, 
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
        api26)
    }

    @Provides
    @Singleton
    fun provideApi480_6(): Api480_6 {
        return Api480_6()
    }
}