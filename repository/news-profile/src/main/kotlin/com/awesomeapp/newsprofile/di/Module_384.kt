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
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.taskcheckout.Api224_6
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
import com.awesomeapp.newsprofile.Activity384_83
import com.awesomeapp.newsprofile.Model384_85
import com.awesomeapp.newsprofile.Activity384_86
import com.awesomeapp.newsprofile.Model384_88
import com.awesomeapp.newsprofile.Activity384_89
import com.awesomeapp.newsprofile.Model384_91
import com.awesomeapp.newsprofile.Activity384_92
import com.awesomeapp.newsprofile.Model384_94
import com.awesomeapp.newsprofile.Activity384_95
import com.awesomeapp.newsprofile.Model384_97
import com.awesomeapp.newsprofile.Activity384_98

@Module
@InstallIn(SingletonComponent::class)
object Module_384 {
    @Provides
    @Singleton
    fun provideRepository384_5(
        api0: Api236_6 = Api236_6(),
        api1: Api320_6 = Api320_6(),
        api2: Api296_6 = Api296_6(),
        api3: Api244_6 = Api244_6(),
        api4: Api324_6 = Api324_6(),
        api5: Api328_6 = Api328_6(),
        api6: Api284_6 = Api284_6(),
        api7: Api280_6 = Api280_6(),
        api8: Api308_6 = Api308_6(),
        api9: Api276_6 = Api276_6(),
        api10: Api228_6 = Api228_6(),
        api11: Api252_6 = Api252_6(),
        api12: Api256_6 = Api256_6(),
        api13: Api260_6 = Api260_6(),
        api14: Api248_6 = Api248_6(),
        api15: Api288_6 = Api288_6(),
        api16: Api312_6 = Api312_6(),
        api17: Api264_6 = Api264_6(),
        api18: Api272_6 = Api272_6(),
        api19: Api292_6 = Api292_6(),
        api20: Api232_6 = Api232_6(),
        api21: Api304_6 = Api304_6(),
        api22: Api268_6 = Api268_6(),
        api23: Api300_6 = Api300_6(),
        api24: Api316_6 = Api316_6(),
        api25: Api224_6 = Api224_6()
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
    fun provideApi384_6(): Api384_6 {
        return Api384_6()
    }
}