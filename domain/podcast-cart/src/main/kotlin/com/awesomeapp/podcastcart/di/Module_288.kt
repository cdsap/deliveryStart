package com.awesomeapp.podcastcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcart.Viewmodel288_1
import com.awesomeapp.podcastcart.Activity288_2
import com.awesomeapp.podcastcart.Activity288_3
import com.awesomeapp.podcastcart.Fragment288_4
import com.awesomeapp.podcastcart.Repository288_5
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.profilecheckout.Api204_6
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.podcastcart.Usecase288_7
import com.awesomeapp.podcastcart.Model288_9
import com.awesomeapp.podcastcart.Model288_10
import com.awesomeapp.podcastcart.Activity288_11
import com.awesomeapp.podcastcart.Model288_13
import com.awesomeapp.podcastcart.Activity288_14
import com.awesomeapp.podcastcart.Model288_16
import com.awesomeapp.podcastcart.Activity288_17
import com.awesomeapp.podcastcart.Model288_19
import com.awesomeapp.podcastcart.Activity288_20
import com.awesomeapp.podcastcart.Model288_22
import com.awesomeapp.podcastcart.Activity288_23
import com.awesomeapp.podcastcart.Model288_25
import com.awesomeapp.podcastcart.Activity288_26
import com.awesomeapp.podcastcart.Model288_28
import com.awesomeapp.podcastcart.Activity288_29
import com.awesomeapp.podcastcart.Model288_31
import com.awesomeapp.podcastcart.Activity288_32
import com.awesomeapp.podcastcart.Model288_34
import com.awesomeapp.podcastcart.Activity288_35
import com.awesomeapp.podcastcart.Model288_37
import com.awesomeapp.podcastcart.Activity288_38
import com.awesomeapp.podcastcart.Model288_40
import com.awesomeapp.podcastcart.Activity288_41
import com.awesomeapp.podcastcart.Model288_43
import com.awesomeapp.podcastcart.Activity288_44
import com.awesomeapp.podcastcart.Model288_46
import com.awesomeapp.podcastcart.Activity288_47
import com.awesomeapp.podcastcart.Model288_49
import com.awesomeapp.podcastcart.Activity288_50
import com.awesomeapp.podcastcart.Model288_52
import com.awesomeapp.podcastcart.Activity288_53
import com.awesomeapp.podcastcart.Model288_55
import com.awesomeapp.podcastcart.Activity288_56
import com.awesomeapp.podcastcart.Model288_58
import com.awesomeapp.podcastcart.Activity288_59
import com.awesomeapp.podcastcart.Model288_61
import com.awesomeapp.podcastcart.Activity288_62
import com.awesomeapp.podcastcart.Model288_64
import com.awesomeapp.podcastcart.Activity288_65
import com.awesomeapp.podcastcart.Model288_67
import com.awesomeapp.podcastcart.Activity288_68
import com.awesomeapp.podcastcart.Model288_70
import com.awesomeapp.podcastcart.Activity288_71
import com.awesomeapp.podcastcart.Model288_73
import com.awesomeapp.podcastcart.Activity288_74
import com.awesomeapp.podcastcart.Model288_76
import com.awesomeapp.podcastcart.Activity288_77
import com.awesomeapp.podcastcart.Model288_79

@Module
@InstallIn(SingletonComponent::class)
object Module_288 {
    @Provides
    @Singleton
    fun provideRepository288_5(
        api0: Api140_6 = Api140_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api168_6 = Api168_6(),
        api3: Api196_6 = Api196_6(),
        api4: Api176_6 = Api176_6(),
        api5: Api116_6 = Api116_6(),
        api6: Api204_6 = Api204_6(),
        api7: Api208_6 = Api208_6(),
        api8: Api212_6 = Api212_6(),
        api9: Api156_6 = Api156_6(),
        api10: Api136_6 = Api136_6(),
        api11: Api112_6 = Api112_6(),
        api12: Api172_6 = Api172_6(),
        api13: Api160_6 = Api160_6(),
        api14: Api188_6 = Api188_6(),
        api15: Api192_6 = Api192_6()
    ): Repository288_5 {
        return Repository288_5(api0, 
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
        api15)
    }

    @Provides
    @Singleton
    fun provideApi288_6(): Api288_6 {
        return Api288_6()
    }
}