package com.awesomeapp.fileprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.fileprofile.Viewmodel376_1
import com.awesomeapp.fileprofile.Activity376_2
import com.awesomeapp.fileprofile.Activity376_3
import com.awesomeapp.fileprofile.Fragment376_4
import com.awesomeapp.fileprofile.Repository376_5
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.sessionuser.Api316_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.fileprofile.Api376_6
import com.awesomeapp.fileprofile.Model376_8
import com.awesomeapp.fileprofile.Model376_9
import com.awesomeapp.fileprofile.Activity376_10
import com.awesomeapp.fileprofile.Model376_12
import com.awesomeapp.fileprofile.Activity376_13
import com.awesomeapp.fileprofile.Model376_15
import com.awesomeapp.fileprofile.Activity376_16
import com.awesomeapp.fileprofile.Model376_18
import com.awesomeapp.fileprofile.Activity376_19
import com.awesomeapp.fileprofile.Model376_21
import com.awesomeapp.fileprofile.Activity376_22
import com.awesomeapp.fileprofile.Model376_24
import com.awesomeapp.fileprofile.Activity376_25
import com.awesomeapp.fileprofile.Model376_27
import com.awesomeapp.fileprofile.Activity376_28
import com.awesomeapp.fileprofile.Model376_30
import com.awesomeapp.fileprofile.Activity376_31
import com.awesomeapp.fileprofile.Model376_33
import com.awesomeapp.fileprofile.Activity376_34
import com.awesomeapp.fileprofile.Model376_36
import com.awesomeapp.fileprofile.Activity376_37
import com.awesomeapp.fileprofile.Model376_39
import com.awesomeapp.fileprofile.Activity376_40
import com.awesomeapp.fileprofile.Model376_42
import com.awesomeapp.fileprofile.Activity376_43
import com.awesomeapp.fileprofile.Model376_45
import com.awesomeapp.fileprofile.Activity376_46
import com.awesomeapp.fileprofile.Model376_48
import com.awesomeapp.fileprofile.Activity376_49
import com.awesomeapp.fileprofile.Model376_51
import com.awesomeapp.fileprofile.Activity376_52
import com.awesomeapp.fileprofile.Model376_54
import com.awesomeapp.fileprofile.Activity376_55
import com.awesomeapp.fileprofile.Model376_57
import com.awesomeapp.fileprofile.Activity376_58
import com.awesomeapp.fileprofile.Model376_60
import com.awesomeapp.fileprofile.Activity376_61
import com.awesomeapp.fileprofile.Model376_63
import com.awesomeapp.fileprofile.Activity376_64
import com.awesomeapp.fileprofile.Model376_66
import com.awesomeapp.fileprofile.Activity376_67
import com.awesomeapp.fileprofile.Model376_69
import com.awesomeapp.fileprofile.Activity376_70
import com.awesomeapp.fileprofile.Model376_72
import com.awesomeapp.fileprofile.Activity376_73
import com.awesomeapp.fileprofile.Model376_75
import com.awesomeapp.fileprofile.Activity376_76
import com.awesomeapp.fileprofile.Model376_78
import com.awesomeapp.fileprofile.Activity376_79
import com.awesomeapp.fileprofile.Model376_81
import com.awesomeapp.fileprofile.Activity376_82
import com.awesomeapp.fileprofile.Model376_84
import com.awesomeapp.fileprofile.Activity376_85
import com.awesomeapp.fileprofile.Model376_87
import com.awesomeapp.fileprofile.Activity376_88
import com.awesomeapp.fileprofile.Model376_90
import com.awesomeapp.fileprofile.Activity376_91
import com.awesomeapp.fileprofile.Model376_93

@Module
@InstallIn(SingletonComponent::class)
object Module_376 {
    @Provides
    @Singleton
    fun provideRepository376_5(
        api0: Api284_6 = Api284_6(),
        api1: Api224_6 = Api224_6(),
        api2: Api324_6 = Api324_6(),
        api3: Api256_6 = Api256_6(),
        api4: Api252_6 = Api252_6(),
        api5: Api240_6 = Api240_6(),
        api6: Api328_6 = Api328_6(),
        api7: Api232_6 = Api232_6(),
        api8: Api304_6 = Api304_6(),
        api9: Api300_6 = Api300_6(),
        api10: Api312_6 = Api312_6(),
        api11: Api296_6 = Api296_6(),
        api12: Api316_6 = Api316_6(),
        api13: Api308_6 = Api308_6(),
        api14: Api292_6 = Api292_6(),
        api15: Api288_6 = Api288_6(),
        api16: Api272_6 = Api272_6(),
        api17: Api264_6 = Api264_6(),
        api18: Api320_6 = Api320_6(),
        api19: Api268_6 = Api268_6(),
        api20: Api260_6 = Api260_6(),
        api21: Api236_6 = Api236_6()
    ): Repository376_5 {
        return Repository376_5(api0, 
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
        api21)
    }

    @Provides
    @Singleton
    fun provideApi376_6(): Api376_6 {
        return Api376_6()
    }
}