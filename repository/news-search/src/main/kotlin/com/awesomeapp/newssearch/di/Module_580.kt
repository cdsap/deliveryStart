package com.awesomeapp.newssearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newssearch.Viewmodel580_1
import com.awesomeapp.newssearch.Activity580_2
import com.awesomeapp.newssearch.Activity580_3
import com.awesomeapp.newssearch.Fragment580_4
import com.awesomeapp.newssearch.Repository580_5
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.reportfeed.Api416_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.usercomment.Api448_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.newssearch.Api580_6
import com.awesomeapp.newssearch.Service580_7
import com.awesomeapp.newssearch.Worker580_8
import com.awesomeapp.newssearch.Model580_10
import com.awesomeapp.newssearch.Model580_11
import com.awesomeapp.newssearch.Activity580_12
import com.awesomeapp.newssearch.Model580_14
import com.awesomeapp.newssearch.Activity580_15
import com.awesomeapp.newssearch.Model580_17
import com.awesomeapp.newssearch.Activity580_18
import com.awesomeapp.newssearch.Model580_20
import com.awesomeapp.newssearch.Activity580_21
import com.awesomeapp.newssearch.Model580_23
import com.awesomeapp.newssearch.Activity580_24
import com.awesomeapp.newssearch.Model580_26
import com.awesomeapp.newssearch.Activity580_27
import com.awesomeapp.newssearch.Model580_29
import com.awesomeapp.newssearch.Activity580_30
import com.awesomeapp.newssearch.Model580_32
import com.awesomeapp.newssearch.Activity580_33
import com.awesomeapp.newssearch.Model580_35
import com.awesomeapp.newssearch.Activity580_36
import com.awesomeapp.newssearch.Model580_38
import com.awesomeapp.newssearch.Activity580_39
import com.awesomeapp.newssearch.Model580_41
import com.awesomeapp.newssearch.Activity580_42
import com.awesomeapp.newssearch.Model580_44
import com.awesomeapp.newssearch.Activity580_45
import com.awesomeapp.newssearch.Model580_47
import com.awesomeapp.newssearch.Activity580_48
import com.awesomeapp.newssearch.Model580_50
import com.awesomeapp.newssearch.Activity580_51
import com.awesomeapp.newssearch.Model580_53
import com.awesomeapp.newssearch.Activity580_54
import com.awesomeapp.newssearch.Model580_56
import com.awesomeapp.newssearch.Activity580_57
import com.awesomeapp.newssearch.Model580_59
import com.awesomeapp.newssearch.Activity580_60
import com.awesomeapp.newssearch.Model580_62
import com.awesomeapp.newssearch.Activity580_63
import com.awesomeapp.newssearch.Model580_65
import com.awesomeapp.newssearch.Activity580_66
import com.awesomeapp.newssearch.Model580_68
import com.awesomeapp.newssearch.Activity580_69
import com.awesomeapp.newssearch.Model580_71
import com.awesomeapp.newssearch.Activity580_72
import com.awesomeapp.newssearch.Model580_74
import com.awesomeapp.newssearch.Activity580_75
import com.awesomeapp.newssearch.Model580_77
import com.awesomeapp.newssearch.Activity580_78
import com.awesomeapp.newssearch.Model580_80
import com.awesomeapp.newssearch.Activity580_81
import com.awesomeapp.newssearch.Model580_83
import com.awesomeapp.newssearch.Activity580_84
import com.awesomeapp.newssearch.Model580_86
import com.awesomeapp.newssearch.Activity580_87
import com.awesomeapp.newssearch.Model580_89
import com.awesomeapp.newssearch.Activity580_90
import com.awesomeapp.newssearch.Model580_92
import com.awesomeapp.newssearch.Activity580_93
import com.awesomeapp.newssearch.Model580_95
import com.awesomeapp.newssearch.Activity580_96
import com.awesomeapp.newssearch.Model580_98
import com.awesomeapp.newssearch.Activity580_99
import com.awesomeapp.newssearch.Model580_101
import com.awesomeapp.newssearch.Activity580_102
import com.awesomeapp.newssearch.Model580_104
import com.awesomeapp.newssearch.Activity580_105
import com.awesomeapp.newssearch.Model580_107
import com.awesomeapp.newssearch.Activity580_108
import com.awesomeapp.newssearch.Model580_110
import com.awesomeapp.newssearch.Activity580_111
import com.awesomeapp.newssearch.Model580_113
import com.awesomeapp.newssearch.Activity580_114
import com.awesomeapp.newssearch.Model580_116
import com.awesomeapp.newssearch.Activity580_117
import com.awesomeapp.newssearch.Model580_119
import com.awesomeapp.newssearch.Activity580_120
import com.awesomeapp.newssearch.Model580_122
import com.awesomeapp.newssearch.Activity580_123
import com.awesomeapp.newssearch.Model580_125
import com.awesomeapp.newssearch.Activity580_126
import com.awesomeapp.newssearch.Model580_128
import com.awesomeapp.newssearch.Activity580_129
import com.awesomeapp.newssearch.Model580_131
import com.awesomeapp.newssearch.Activity580_132
import com.awesomeapp.newssearch.Model580_134
import com.awesomeapp.newssearch.Activity580_135
import com.awesomeapp.newssearch.Model580_137
import com.awesomeapp.newssearch.Activity580_138
import com.awesomeapp.newssearch.Model580_140
import com.awesomeapp.newssearch.Activity580_141
import com.awesomeapp.newssearch.Model580_143
import com.awesomeapp.newssearch.Activity580_144
import com.awesomeapp.newssearch.Model580_146
import com.awesomeapp.newssearch.Activity580_147
import com.awesomeapp.newssearch.Model580_149

@Module
@InstallIn(SingletonComponent::class)
object Module_580 {
    @Provides
    @Singleton
    fun provideRepository580_5(
        api0: Api340_6 = Api340_6(),
        api1: Api392_6 = Api392_6(),
        api2: Api304_6 = Api304_6(),
        api3: Api400_6 = Api400_6(),
        api4: Api380_6 = Api380_6(),
        api5: Api408_6 = Api408_6(),
        api6: Api328_6 = Api328_6(),
        api7: Api344_6 = Api344_6(),
        api8: Api396_6 = Api396_6(),
        api9: Api320_6 = Api320_6(),
        api10: Api368_6 = Api368_6(),
        api11: Api308_6 = Api308_6(),
        api12: Api416_6 = Api416_6(),
        api13: Api432_6 = Api432_6(),
        api14: Api412_6 = Api412_6(),
        api15: Api448_6 = Api448_6(),
        api16: Api312_6 = Api312_6(),
        api17: Api444_6 = Api444_6(),
        api18: Api348_6 = Api348_6(),
        api19: Api424_6 = Api424_6(),
        api20: Api388_6 = Api388_6(),
        api21: Api436_6 = Api436_6(),
        api22: Api440_6 = Api440_6(),
        api23: Api420_6 = Api420_6(),
        api24: Api360_6 = Api360_6(),
        api25: Api404_6 = Api404_6()
    ): Repository580_5 {
        return Repository580_5(api0, 
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
        api25)
    }

    @Provides
    @Singleton
    fun provideApi580_6(): Api580_6 {
        return Api580_6()
    }
}