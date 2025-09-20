package com.awesomeapp.notecomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecomment.Viewmodel476_1
import com.awesomeapp.notecomment.Activity476_2
import com.awesomeapp.notecomment.Activity476_3
import com.awesomeapp.notecomment.Fragment476_4
import com.awesomeapp.notecomment.Repository476_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.groupprofile.Api360_6
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.locationprofile.Api356_6
import com.awesomeapp.reportfeed.Api416_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.forecastfeed.Api432_6
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.identityfeed.Api396_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.audiofeed.Api440_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.pushprofile.Api344_6
import com.awesomeapp.notecomment.Api476_6
import com.awesomeapp.notecomment.Model476_8
import com.awesomeapp.notecomment.Model476_9
import com.awesomeapp.notecomment.Activity476_10
import com.awesomeapp.notecomment.Model476_12
import com.awesomeapp.notecomment.Activity476_13
import com.awesomeapp.notecomment.Model476_15
import com.awesomeapp.notecomment.Activity476_16
import com.awesomeapp.notecomment.Model476_18
import com.awesomeapp.notecomment.Activity476_19
import com.awesomeapp.notecomment.Model476_21
import com.awesomeapp.notecomment.Activity476_22
import com.awesomeapp.notecomment.Model476_24
import com.awesomeapp.notecomment.Activity476_25
import com.awesomeapp.notecomment.Model476_27
import com.awesomeapp.notecomment.Activity476_28
import com.awesomeapp.notecomment.Model476_30
import com.awesomeapp.notecomment.Activity476_31
import com.awesomeapp.notecomment.Model476_33
import com.awesomeapp.notecomment.Activity476_34
import com.awesomeapp.notecomment.Model476_36
import com.awesomeapp.notecomment.Activity476_37
import com.awesomeapp.notecomment.Model476_39
import com.awesomeapp.notecomment.Activity476_40
import com.awesomeapp.notecomment.Model476_42
import com.awesomeapp.notecomment.Activity476_43
import com.awesomeapp.notecomment.Model476_45
import com.awesomeapp.notecomment.Activity476_46
import com.awesomeapp.notecomment.Model476_48
import com.awesomeapp.notecomment.Activity476_49
import com.awesomeapp.notecomment.Model476_51
import com.awesomeapp.notecomment.Activity476_52
import com.awesomeapp.notecomment.Model476_54
import com.awesomeapp.notecomment.Activity476_55
import com.awesomeapp.notecomment.Model476_57
import com.awesomeapp.notecomment.Activity476_58
import com.awesomeapp.notecomment.Model476_60
import com.awesomeapp.notecomment.Activity476_61
import com.awesomeapp.notecomment.Model476_63
import com.awesomeapp.notecomment.Activity476_64
import com.awesomeapp.notecomment.Model476_66
import com.awesomeapp.notecomment.Activity476_67
import com.awesomeapp.notecomment.Model476_69
import com.awesomeapp.notecomment.Activity476_70
import com.awesomeapp.notecomment.Model476_72
import com.awesomeapp.notecomment.Activity476_73
import com.awesomeapp.notecomment.Model476_75
import com.awesomeapp.notecomment.Activity476_76
import com.awesomeapp.notecomment.Model476_78
import com.awesomeapp.notecomment.Activity476_79
import com.awesomeapp.notecomment.Model476_81
import com.awesomeapp.notecomment.Activity476_82

@Module
@InstallIn(SingletonComponent::class)
object Module_476 {
    @Provides
    @Singleton
    fun provideRepository476_5(
        api0: Api348_6 = Api348_6(),
        api1: Api392_6 = Api392_6(),
        api2: Api360_6 = Api360_6(),
        api3: Api380_6 = Api380_6(),
        api4: Api356_6 = Api356_6(),
        api5: Api416_6 = Api416_6(),
        api6: Api436_6 = Api436_6(),
        api7: Api384_6 = Api384_6(),
        api8: Api336_6 = Api336_6(),
        api9: Api332_6 = Api332_6(),
        api10: Api432_6 = Api432_6(),
        api11: Api400_6 = Api400_6(),
        api12: Api352_6 = Api352_6(),
        api13: Api412_6 = Api412_6(),
        api14: Api376_6 = Api376_6(),
        api15: Api396_6 = Api396_6(),
        api16: Api368_6 = Api368_6(),
        api17: Api440_6 = Api440_6(),
        api18: Api364_6 = Api364_6(),
        api19: Api428_6 = Api428_6(),
        api20: Api424_6 = Api424_6(),
        api21: Api388_6 = Api388_6(),
        api22: Api340_6 = Api340_6(),
        api23: Api404_6 = Api404_6(),
        api24: Api408_6 = Api408_6(),
        api25: Api344_6 = Api344_6()
    ): Repository476_5 {
        return Repository476_5(api0, 
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
    fun provideApi476_6(): Api476_6 {
        return Api476_6()
    }
}