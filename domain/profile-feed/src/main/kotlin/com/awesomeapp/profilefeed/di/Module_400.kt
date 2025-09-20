package com.awesomeapp.profilefeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.profilefeed.Viewmodel400_1
import com.awesomeapp.profilefeed.Activity400_2
import com.awesomeapp.profilefeed.Activity400_3
import com.awesomeapp.profilefeed.Fragment400_4
import com.awesomeapp.profilefeed.Repository400_5
import com.awesomeapp.profilefeed.Api400_6
import com.awesomeapp.profilefeed.Service400_7
import com.awesomeapp.profilefeed.Worker400_8
import com.awesomeapp.profilefeed.Model400_10
import com.awesomeapp.profilefeed.Model400_11
import com.awesomeapp.profilefeed.Activity400_12
import com.awesomeapp.profilefeed.Model400_14
import com.awesomeapp.profilefeed.Activity400_15
import com.awesomeapp.profilefeed.Model400_17
import com.awesomeapp.profilefeed.Activity400_18
import com.awesomeapp.profilefeed.Model400_20
import com.awesomeapp.profilefeed.Activity400_21
import com.awesomeapp.profilefeed.Model400_23
import com.awesomeapp.profilefeed.Activity400_24
import com.awesomeapp.profilefeed.Model400_26
import com.awesomeapp.profilefeed.Activity400_27
import com.awesomeapp.profilefeed.Model400_29
import com.awesomeapp.profilefeed.Activity400_30
import com.awesomeapp.profilefeed.Model400_32
import com.awesomeapp.profilefeed.Activity400_33
import com.awesomeapp.profilefeed.Model400_35
import com.awesomeapp.profilefeed.Activity400_36
import com.awesomeapp.profilefeed.Model400_38
import com.awesomeapp.profilefeed.Activity400_39
import com.awesomeapp.profilefeed.Model400_41
import com.awesomeapp.profilefeed.Activity400_42
import com.awesomeapp.profilefeed.Model400_44
import com.awesomeapp.profilefeed.Activity400_45
import com.awesomeapp.profilefeed.Model400_47
import com.awesomeapp.profilefeed.Activity400_48
import com.awesomeapp.profilefeed.Model400_50
import com.awesomeapp.profilefeed.Activity400_51
import com.awesomeapp.profilefeed.Model400_53
import com.awesomeapp.profilefeed.Activity400_54
import com.awesomeapp.profilefeed.Model400_56
import com.awesomeapp.profilefeed.Activity400_57
import com.awesomeapp.profilefeed.Model400_59
import com.awesomeapp.profilefeed.Activity400_60
import com.awesomeapp.profilefeed.Model400_62
import com.awesomeapp.profilefeed.Activity400_63
import com.awesomeapp.profilefeed.Model400_65
import com.awesomeapp.profilefeed.Activity400_66
import com.awesomeapp.profilefeed.Model400_68
import com.awesomeapp.profilefeed.Activity400_69
import com.awesomeapp.profilefeed.Model400_71
import com.awesomeapp.profilefeed.Activity400_72
import com.awesomeapp.profilefeed.Model400_74
import com.awesomeapp.profilefeed.Activity400_75
import com.awesomeapp.profilefeed.Model400_77
import com.awesomeapp.profilefeed.Activity400_78
import com.awesomeapp.profilefeed.Model400_80
import com.awesomeapp.profilefeed.Activity400_81
import com.awesomeapp.profilefeed.Model400_83
import com.awesomeapp.profilefeed.Activity400_84
import com.awesomeapp.profilefeed.Model400_86
import com.awesomeapp.profilefeed.Activity400_87
import com.awesomeapp.profilefeed.Model400_89
import com.awesomeapp.profilefeed.Activity400_90
import com.awesomeapp.profilefeed.Model400_92
import com.awesomeapp.profilefeed.Activity400_93
import com.awesomeapp.profilefeed.Model400_95
import com.awesomeapp.profilefeed.Activity400_96
import com.awesomeapp.profilefeed.Model400_98
import com.awesomeapp.profilefeed.Activity400_99
import com.awesomeapp.profilefeed.Model400_101
import com.awesomeapp.profilefeed.Activity400_102
import com.awesomeapp.profilefeed.Model400_104
import com.awesomeapp.profilefeed.Activity400_105
import com.awesomeapp.profilefeed.Model400_107
import com.awesomeapp.profilefeed.Activity400_108
import com.awesomeapp.profilefeed.Model400_110
import com.awesomeapp.profilefeed.Activity400_111
import com.awesomeapp.profilefeed.Model400_113
import com.awesomeapp.profilefeed.Activity400_114
import com.awesomeapp.profilefeed.Model400_116
import com.awesomeapp.profilefeed.Activity400_117
import com.awesomeapp.profilefeed.Model400_119

@Module
@InstallIn(SingletonComponent::class)
object Module_400 {
    @Provides
    @Singleton
    fun provideRepository400_5(): Repository400_5 {
        return Repository400_5()
    }

    @Provides
    @Singleton
    fun provideApi400_6(): Api400_6 {
        return Api400_6()
    }
}