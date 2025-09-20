package com.awesomeapp.gallerysync.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerysync.Viewmodel732_1
import com.awesomeapp.gallerysync.Activity732_2
import com.awesomeapp.gallerysync.Activity732_3
import com.awesomeapp.gallerysync.Fragment732_4
import com.awesomeapp.gallerysync.Repository732_5
import com.awesomeapp.documentpost.Api524_6
import com.awesomeapp.locationsearch.Api552_6
import com.awesomeapp.weathercomment.Api480_6
import com.awesomeapp.identitylocation.Api592_6
import com.awesomeapp.profilelocation.Api596_6
import com.awesomeapp.gallerysync.Api732_6
import com.awesomeapp.gallerysync.Usecase732_7
import com.awesomeapp.gallerysync.Model732_9
import com.awesomeapp.gallerysync.Model732_10
import com.awesomeapp.gallerysync.Activity732_11
import com.awesomeapp.gallerysync.Model732_13
import com.awesomeapp.gallerysync.Activity732_14
import com.awesomeapp.gallerysync.Model732_16
import com.awesomeapp.gallerysync.Activity732_17
import com.awesomeapp.gallerysync.Model732_19
import com.awesomeapp.gallerysync.Activity732_20
import com.awesomeapp.gallerysync.Model732_22
import com.awesomeapp.gallerysync.Activity732_23
import com.awesomeapp.gallerysync.Model732_25
import com.awesomeapp.gallerysync.Activity732_26
import com.awesomeapp.gallerysync.Model732_28
import com.awesomeapp.gallerysync.Activity732_29
import com.awesomeapp.gallerysync.Model732_31
import com.awesomeapp.gallerysync.Activity732_32
import com.awesomeapp.gallerysync.Model732_34
import com.awesomeapp.gallerysync.Activity732_35
import com.awesomeapp.gallerysync.Model732_37
import com.awesomeapp.gallerysync.Activity732_38
import com.awesomeapp.gallerysync.Model732_40
import com.awesomeapp.gallerysync.Activity732_41
import com.awesomeapp.gallerysync.Model732_43
import com.awesomeapp.gallerysync.Activity732_44
import com.awesomeapp.gallerysync.Model732_46
import com.awesomeapp.gallerysync.Activity732_47
import com.awesomeapp.gallerysync.Model732_49
import com.awesomeapp.gallerysync.Activity732_50
import com.awesomeapp.gallerysync.Model732_52
import com.awesomeapp.gallerysync.Activity732_53
import com.awesomeapp.gallerysync.Model732_55
import com.awesomeapp.gallerysync.Activity732_56
import com.awesomeapp.gallerysync.Model732_58
import com.awesomeapp.gallerysync.Activity732_59
import com.awesomeapp.gallerysync.Model732_61
import com.awesomeapp.gallerysync.Activity732_62
import com.awesomeapp.gallerysync.Model732_64
import com.awesomeapp.gallerysync.Activity732_65
import com.awesomeapp.gallerysync.Model732_67
import com.awesomeapp.gallerysync.Activity732_68
import com.awesomeapp.gallerysync.Model732_70
import com.awesomeapp.gallerysync.Activity732_71
import com.awesomeapp.gallerysync.Model732_73
import com.awesomeapp.gallerysync.Activity732_74
import com.awesomeapp.gallerysync.Model732_76
import com.awesomeapp.gallerysync.Activity732_77
import com.awesomeapp.gallerysync.Model732_79
import com.awesomeapp.gallerysync.Activity732_80
import com.awesomeapp.gallerysync.Model732_82
import com.awesomeapp.gallerysync.Activity732_83
import com.awesomeapp.gallerysync.Model732_85
import com.awesomeapp.gallerysync.Activity732_86
import com.awesomeapp.gallerysync.Model732_88
import com.awesomeapp.gallerysync.Activity732_89
import com.awesomeapp.gallerysync.Model732_91
import com.awesomeapp.gallerysync.Activity732_92
import com.awesomeapp.gallerysync.Model732_94
import com.awesomeapp.gallerysync.Activity732_95
import com.awesomeapp.gallerysync.Model732_97
import com.awesomeapp.gallerysync.Activity732_98
import com.awesomeapp.gallerysync.Model732_100
import com.awesomeapp.gallerysync.Activity732_101
import com.awesomeapp.gallerysync.Model732_103
import com.awesomeapp.gallerysync.Activity732_104
import com.awesomeapp.gallerysync.Model732_106

@Module
@InstallIn(SingletonComponent::class)
object Module_732 {
    @Provides
    @Singleton
    fun provideRepository732_5(
        api0: Api524_6 = Api524_6(),
        api1: Api552_6 = Api552_6(),
        api2: Api480_6 = Api480_6(),
        api3: Api592_6 = Api592_6(),
        api4: Api596_6 = Api596_6()
    ): Repository732_5 {
        return Repository732_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi732_6(): Api732_6 {
        return Api732_6()
    }
}