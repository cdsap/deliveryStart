package com.awesomeapp.cartpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartpost.Viewmodel496_1
import com.awesomeapp.cartpost.Activity496_2
import com.awesomeapp.cartpost.Activity496_3
import com.awesomeapp.cartpost.Fragment496_4
import com.awesomeapp.cartpost.Repository496_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.reportfeed.Api416_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.usercomment.Api448_6
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.calendarprofile.Api372_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.cartpost.Api496_6
import com.awesomeapp.cartpost.Model496_8
import com.awesomeapp.cartpost.Model496_9
import com.awesomeapp.cartpost.Activity496_10
import com.awesomeapp.cartpost.Model496_12
import com.awesomeapp.cartpost.Activity496_13
import com.awesomeapp.cartpost.Model496_15
import com.awesomeapp.cartpost.Activity496_16
import com.awesomeapp.cartpost.Model496_18
import com.awesomeapp.cartpost.Activity496_19
import com.awesomeapp.cartpost.Model496_21
import com.awesomeapp.cartpost.Activity496_22
import com.awesomeapp.cartpost.Model496_24
import com.awesomeapp.cartpost.Activity496_25
import com.awesomeapp.cartpost.Model496_27
import com.awesomeapp.cartpost.Activity496_28
import com.awesomeapp.cartpost.Model496_30
import com.awesomeapp.cartpost.Activity496_31
import com.awesomeapp.cartpost.Model496_33
import com.awesomeapp.cartpost.Activity496_34
import com.awesomeapp.cartpost.Model496_36
import com.awesomeapp.cartpost.Activity496_37
import com.awesomeapp.cartpost.Model496_39
import com.awesomeapp.cartpost.Activity496_40
import com.awesomeapp.cartpost.Model496_42
import com.awesomeapp.cartpost.Activity496_43
import com.awesomeapp.cartpost.Model496_45
import com.awesomeapp.cartpost.Activity496_46
import com.awesomeapp.cartpost.Model496_48
import com.awesomeapp.cartpost.Activity496_49
import com.awesomeapp.cartpost.Model496_51
import com.awesomeapp.cartpost.Activity496_52
import com.awesomeapp.cartpost.Model496_54
import com.awesomeapp.cartpost.Activity496_55
import com.awesomeapp.cartpost.Model496_57
import com.awesomeapp.cartpost.Activity496_58
import com.awesomeapp.cartpost.Model496_60
import com.awesomeapp.cartpost.Activity496_61
import com.awesomeapp.cartpost.Model496_63
import com.awesomeapp.cartpost.Activity496_64
import com.awesomeapp.cartpost.Model496_66
import com.awesomeapp.cartpost.Activity496_67
import com.awesomeapp.cartpost.Model496_69
import com.awesomeapp.cartpost.Activity496_70
import com.awesomeapp.cartpost.Model496_72
import com.awesomeapp.cartpost.Activity496_73
import com.awesomeapp.cartpost.Model496_75
import com.awesomeapp.cartpost.Activity496_76
import com.awesomeapp.cartpost.Model496_78
import com.awesomeapp.cartpost.Activity496_79
import com.awesomeapp.cartpost.Model496_81
import com.awesomeapp.cartpost.Activity496_82
import com.awesomeapp.cartpost.Model496_84
import com.awesomeapp.cartpost.Activity496_85
import com.awesomeapp.cartpost.Model496_87
import com.awesomeapp.cartpost.Activity496_88
import com.awesomeapp.cartpost.Model496_90
import com.awesomeapp.cartpost.Activity496_91
import com.awesomeapp.cartpost.Model496_93
import com.awesomeapp.cartpost.Activity496_94
import com.awesomeapp.cartpost.Model496_96
import com.awesomeapp.cartpost.Activity496_97
import com.awesomeapp.cartpost.Model496_99
import com.awesomeapp.cartpost.Activity496_100
import com.awesomeapp.cartpost.Model496_102
import com.awesomeapp.cartpost.Activity496_103
import com.awesomeapp.cartpost.Model496_105
import com.awesomeapp.cartpost.Activity496_106
import com.awesomeapp.cartpost.Model496_108
import com.awesomeapp.cartpost.Activity496_109
import com.awesomeapp.cartpost.Model496_111
import com.awesomeapp.cartpost.Activity496_112
import com.awesomeapp.cartpost.Model496_114
import com.awesomeapp.cartpost.Activity496_115
import com.awesomeapp.cartpost.Model496_117
import com.awesomeapp.cartpost.Activity496_118
import com.awesomeapp.cartpost.Model496_120
import com.awesomeapp.cartpost.Activity496_121
import com.awesomeapp.cartpost.Model496_123
import com.awesomeapp.cartpost.Activity496_124
import com.awesomeapp.cartpost.Model496_126
import com.awesomeapp.cartpost.Activity496_127
import com.awesomeapp.cartpost.Model496_129
import com.awesomeapp.cartpost.Activity496_130
import com.awesomeapp.cartpost.Model496_132
import com.awesomeapp.cartpost.Activity496_133
import com.awesomeapp.cartpost.Model496_135
import com.awesomeapp.cartpost.Activity496_136
import com.awesomeapp.cartpost.Model496_138
import com.awesomeapp.cartpost.Activity496_139
import com.awesomeapp.cartpost.Model496_141
import com.awesomeapp.cartpost.Activity496_142
import com.awesomeapp.cartpost.Model496_144
import com.awesomeapp.cartpost.Activity496_145

@Module
@InstallIn(SingletonComponent::class)
object Module_496 {
    @Provides
    @Singleton
    fun provideRepository496_5(
        api0: Api312_6 = Api312_6(),
        api1: Api404_6 = Api404_6(),
        api2: Api444_6 = Api444_6(),
        api3: Api340_6 = Api340_6(),
        api4: Api316_6 = Api316_6(),
        api5: Api416_6 = Api416_6(),
        api6: Api392_6 = Api392_6(),
        api7: Api432_6 = Api432_6(),
        api8: Api376_6 = Api376_6(),
        api9: Api352_6 = Api352_6(),
        api10: Api328_6 = Api328_6(),
        api11: Api420_6 = Api420_6(),
        api12: Api360_6 = Api360_6(),
        api13: Api440_6 = Api440_6(),
        api14: Api348_6 = Api348_6(),
        api15: Api332_6 = Api332_6(),
        api16: Api368_6 = Api368_6(),
        api17: Api396_6 = Api396_6(),
        api18: Api412_6 = Api412_6(),
        api19: Api448_6 = Api448_6(),
        api20: Api400_6 = Api400_6(),
        api21: Api372_6 = Api372_6(),
        api22: Api408_6 = Api408_6(),
        api23: Api356_6 = Api356_6(),
        api24: Api388_6 = Api388_6(),
        api25: Api424_6 = Api424_6(),
        api26: Api304_6 = Api304_6(),
        api27: Api428_6 = Api428_6(),
        api28: Api320_6 = Api320_6(),
        api29: Api380_6 = Api380_6(),
        api30: Api324_6 = Api324_6(),
        api31: Api436_6 = Api436_6(),
        api32: Api308_6 = Api308_6(),
        api33: Api344_6 = Api344_6(),
        api34: Api364_6 = Api364_6(),
        api35: Api384_6 = Api384_6()
    ): Repository496_5 {
        return Repository496_5(api0, 
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
        api31, 
        api32, 
        api33, 
        api34, 
        api35)
    }

    @Provides
    @Singleton
    fun provideApi496_6(): Api496_6 {
        return Api496_6()
    }
}