package com.awesomeapp.newsprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsprofile.Viewmodel384_1
import com.awesomeapp.newsprofile.Activity384_2
import com.awesomeapp.newsprofile.Activity384_3
import com.awesomeapp.newsprofile.Fragment384_4
import com.awesomeapp.newsprofile.Repository384_5
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.newsprofile.Usecase384_7
import com.awesomeapp.newsprofile.Model384_9
import com.awesomeapp.newsprofile.Model384_10
import com.awesomeapp.newsprofile.Activity384_11
import com.awesomeapp.newsprofile.Model384_13
import com.awesomeapp.newsprofile.Activity384_14
import com.awesomeapp.newsprofile.Model384_16
import com.awesomeapp.newsprofile.Activity384_17
import com.awesomeapp.newsprofile.Model384_19
import com.awesomeapp.newsprofile.Activity384_20
import com.awesomeapp.newsprofile.Model384_22
import com.awesomeapp.newsprofile.Activity384_23
import com.awesomeapp.newsprofile.Model384_25
import com.awesomeapp.newsprofile.Activity384_26
import com.awesomeapp.newsprofile.Model384_28
import com.awesomeapp.newsprofile.Activity384_29
import com.awesomeapp.newsprofile.Model384_31
import com.awesomeapp.newsprofile.Activity384_32
import com.awesomeapp.newsprofile.Model384_34
import com.awesomeapp.newsprofile.Activity384_35
import com.awesomeapp.newsprofile.Model384_37
import com.awesomeapp.newsprofile.Activity384_38
import com.awesomeapp.newsprofile.Model384_40
import com.awesomeapp.newsprofile.Activity384_41
import com.awesomeapp.newsprofile.Model384_43
import com.awesomeapp.newsprofile.Activity384_44
import com.awesomeapp.newsprofile.Model384_46
import com.awesomeapp.newsprofile.Activity384_47
import com.awesomeapp.newsprofile.Model384_49
import com.awesomeapp.newsprofile.Activity384_50
import com.awesomeapp.newsprofile.Model384_52
import com.awesomeapp.newsprofile.Activity384_53
import com.awesomeapp.newsprofile.Model384_55
import com.awesomeapp.newsprofile.Activity384_56
import com.awesomeapp.newsprofile.Model384_58
import com.awesomeapp.newsprofile.Activity384_59
import com.awesomeapp.newsprofile.Model384_61
import com.awesomeapp.newsprofile.Activity384_62
import com.awesomeapp.newsprofile.Model384_64
import com.awesomeapp.newsprofile.Activity384_65
import com.awesomeapp.newsprofile.Model384_67
import com.awesomeapp.newsprofile.Activity384_68
import com.awesomeapp.newsprofile.Model384_70
import com.awesomeapp.newsprofile.Activity384_71
import com.awesomeapp.newsprofile.Model384_73
import com.awesomeapp.newsprofile.Activity384_74
import com.awesomeapp.newsprofile.Model384_76
import com.awesomeapp.newsprofile.Activity384_77
import com.awesomeapp.newsprofile.Model384_79
import com.awesomeapp.newsprofile.Activity384_80
import com.awesomeapp.newsprofile.Model384_82

@Module
@InstallIn(SingletonComponent::class)
object Module_384 {
    @Provides
    @Singleton
    fun provideRepository384_5(
        api0: Api300_6 = Api300_6(),
        api1: Api240_6 = Api240_6(),
        api2: Api152_6 = Api152_6(),
        api3: Api192_6 = Api192_6(),
        api4: Api180_6 = Api180_6(),
        api5: Api244_6 = Api244_6(),
        api6: Api176_6 = Api176_6(),
        api7: Api216_6 = Api216_6(),
        api8: Api168_6 = Api168_6(),
        api9: Api156_6 = Api156_6(),
        api10: Api232_6 = Api232_6(),
        api11: Api200_6 = Api200_6(),
        api12: Api288_6 = Api288_6(),
        api13: Api268_6 = Api268_6(),
        api14: Api280_6 = Api280_6(),
        api15: Api292_6 = Api292_6(),
        api16: Api256_6 = Api256_6(),
        api17: Api264_6 = Api264_6()
    ): Repository384_5 {
        return Repository384_5(api0, 
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
        api17)
    }

    @Provides
    @Singleton
    fun provideApi384_6(): Api384_6 {
        return Api384_6()
    }
}