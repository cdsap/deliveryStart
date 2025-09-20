package com.awesomeapp.galleryuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.galleryuser.Viewmodel340_1
import com.awesomeapp.galleryuser.Activity340_2
import com.awesomeapp.galleryuser.Activity340_3
import com.awesomeapp.galleryuser.Fragment340_4
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.galleryuser.Api340_6
import com.awesomeapp.galleryuser.Service340_7
import com.awesomeapp.galleryuser.Worker340_8
import com.awesomeapp.galleryuser.Model340_10
import com.awesomeapp.galleryuser.Model340_11
import com.awesomeapp.galleryuser.Activity340_12
import com.awesomeapp.galleryuser.Model340_14
import com.awesomeapp.galleryuser.Activity340_15
import com.awesomeapp.galleryuser.Model340_17
import com.awesomeapp.galleryuser.Activity340_18
import com.awesomeapp.galleryuser.Model340_20
import com.awesomeapp.galleryuser.Activity340_21
import com.awesomeapp.galleryuser.Model340_23
import com.awesomeapp.galleryuser.Activity340_24
import com.awesomeapp.galleryuser.Model340_26
import com.awesomeapp.galleryuser.Activity340_27
import com.awesomeapp.galleryuser.Model340_29
import com.awesomeapp.galleryuser.Activity340_30
import com.awesomeapp.galleryuser.Model340_32
import com.awesomeapp.galleryuser.Activity340_33
import com.awesomeapp.galleryuser.Model340_35
import com.awesomeapp.galleryuser.Activity340_36
import com.awesomeapp.galleryuser.Model340_38
import com.awesomeapp.galleryuser.Activity340_39
import com.awesomeapp.galleryuser.Model340_41
import com.awesomeapp.galleryuser.Activity340_42
import com.awesomeapp.galleryuser.Model340_44
import com.awesomeapp.galleryuser.Activity340_45
import com.awesomeapp.galleryuser.Model340_47
import com.awesomeapp.galleryuser.Activity340_48
import com.awesomeapp.galleryuser.Model340_50
import com.awesomeapp.galleryuser.Activity340_51
import com.awesomeapp.galleryuser.Model340_53
import com.awesomeapp.galleryuser.Activity340_54
import com.awesomeapp.galleryuser.Model340_56
import com.awesomeapp.galleryuser.Activity340_57
import com.awesomeapp.galleryuser.Model340_59
import com.awesomeapp.galleryuser.Activity340_60
import com.awesomeapp.galleryuser.Model340_62
import com.awesomeapp.galleryuser.Activity340_63
import com.awesomeapp.galleryuser.Model340_65
import com.awesomeapp.galleryuser.Activity340_66
import com.awesomeapp.galleryuser.Model340_68
import com.awesomeapp.galleryuser.Activity340_69
import com.awesomeapp.galleryuser.Model340_71
import com.awesomeapp.galleryuser.Activity340_72
import com.awesomeapp.galleryuser.Model340_74
import com.awesomeapp.galleryuser.Activity340_75
import com.awesomeapp.galleryuser.Model340_77
import com.awesomeapp.galleryuser.Activity340_78
import com.awesomeapp.galleryuser.Model340_80
import com.awesomeapp.galleryuser.Activity340_81
import com.awesomeapp.galleryuser.Model340_83
import com.awesomeapp.galleryuser.Activity340_84
import com.awesomeapp.galleryuser.Model340_86
import com.awesomeapp.galleryuser.Activity340_87
import com.awesomeapp.galleryuser.Model340_89
import com.awesomeapp.galleryuser.Activity340_90
import com.awesomeapp.galleryuser.Model340_92
import com.awesomeapp.galleryuser.Activity340_93
import com.awesomeapp.galleryuser.Model340_95
import com.awesomeapp.galleryuser.Activity340_96
import com.awesomeapp.galleryuser.Model340_98
import com.awesomeapp.galleryuser.Activity340_99
import com.awesomeapp.galleryuser.Model340_101
import com.awesomeapp.galleryuser.Activity340_102
import com.awesomeapp.galleryuser.Model340_104
import com.awesomeapp.galleryuser.Activity340_105
import com.awesomeapp.galleryuser.Model340_107
import com.awesomeapp.galleryuser.Activity340_108
import com.awesomeapp.galleryuser.Model340_110
import com.awesomeapp.galleryuser.Activity340_111
import com.awesomeapp.galleryuser.Model340_113
import com.awesomeapp.galleryuser.Activity340_114
import com.awesomeapp.galleryuser.Model340_116
import com.awesomeapp.galleryuser.Activity340_117
import com.awesomeapp.galleryuser.Model340_119
import com.awesomeapp.galleryuser.Activity340_120
import com.awesomeapp.galleryuser.Model340_122

@Module
@InstallIn(SingletonComponent::class)
object Module_340 {
    @Provides
    @Singleton
    fun provideRepository340_5(
        api0: Api200_6 = Api200_6(),
        api1: Api232_6 = Api232_6()
    ): Repository340_5 {
        return Repository340_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi340_6(): Api340_6 {
        return Api340_6()
    }
}