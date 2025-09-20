package com.awesomeapp.search.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.search.Viewmodel12_1
import com.awesomeapp.search.Activity12_2
import com.awesomeapp.search.Activity12_3
import com.awesomeapp.search.Fragment12_4
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.search.Api12_6
import com.awesomeapp.search.Usecase12_7
import com.awesomeapp.search.Model12_9
import com.awesomeapp.search.Model12_10
import com.awesomeapp.search.Activity12_11
import com.awesomeapp.search.Model12_13
import com.awesomeapp.search.Activity12_14
import com.awesomeapp.search.Model12_16
import com.awesomeapp.search.Activity12_17
import com.awesomeapp.search.Model12_19
import com.awesomeapp.search.Activity12_20
import com.awesomeapp.search.Model12_22
import com.awesomeapp.search.Activity12_23
import com.awesomeapp.search.Model12_25
import com.awesomeapp.search.Activity12_26
import com.awesomeapp.search.Model12_28
import com.awesomeapp.search.Activity12_29
import com.awesomeapp.search.Model12_31
import com.awesomeapp.search.Activity12_32
import com.awesomeapp.search.Model12_34
import com.awesomeapp.search.Activity12_35
import com.awesomeapp.search.Model12_37
import com.awesomeapp.search.Activity12_38
import com.awesomeapp.search.Model12_40
import com.awesomeapp.search.Activity12_41
import com.awesomeapp.search.Model12_43
import com.awesomeapp.search.Activity12_44
import com.awesomeapp.search.Model12_46
import com.awesomeapp.search.Activity12_47
import com.awesomeapp.search.Model12_49
import com.awesomeapp.search.Activity12_50
import com.awesomeapp.search.Model12_52
import com.awesomeapp.search.Activity12_53
import com.awesomeapp.search.Model12_55
import com.awesomeapp.search.Activity12_56
import com.awesomeapp.search.Model12_58
import com.awesomeapp.search.Activity12_59
import com.awesomeapp.search.Model12_61
import com.awesomeapp.search.Activity12_62
import com.awesomeapp.search.Model12_64
import com.awesomeapp.search.Activity12_65
import com.awesomeapp.search.Model12_67
import com.awesomeapp.search.Activity12_68
import com.awesomeapp.search.Model12_70
import com.awesomeapp.search.Activity12_71
import com.awesomeapp.search.Model12_73
import com.awesomeapp.search.Activity12_74
import com.awesomeapp.search.Model12_76
import com.awesomeapp.search.Activity12_77
import com.awesomeapp.search.Model12_79
import com.awesomeapp.search.Activity12_80
import com.awesomeapp.search.Model12_82
import com.awesomeapp.search.Activity12_83
import com.awesomeapp.search.Model12_85
import com.awesomeapp.search.Activity12_86
import com.awesomeapp.search.Model12_88
import com.awesomeapp.search.Activity12_89
import com.awesomeapp.search.Model12_91
import com.awesomeapp.search.Activity12_92
import com.awesomeapp.search.Model12_94
import com.awesomeapp.search.Activity12_95
import com.awesomeapp.search.Model12_97
import com.awesomeapp.search.Activity12_98
import com.awesomeapp.search.Model12_100
import com.awesomeapp.search.Activity12_101
import com.awesomeapp.search.Model12_103
import com.awesomeapp.search.Activity12_104
import com.awesomeapp.search.Model12_106
import com.awesomeapp.search.Activity12_107
import com.awesomeapp.search.Model12_109
import com.awesomeapp.search.Activity12_110
import com.awesomeapp.search.Model12_112
import com.awesomeapp.search.Activity12_113
import com.awesomeapp.search.Model12_115
import com.awesomeapp.search.Activity12_116
import com.awesomeapp.search.Model12_118
import com.awesomeapp.search.Activity12_119
import com.awesomeapp.search.Model12_121
import com.awesomeapp.search.Activity12_122
import com.awesomeapp.search.Model12_124
import com.awesomeapp.search.Activity12_125
import com.awesomeapp.search.Model12_127
import com.awesomeapp.search.Activity12_128

@Module
@InstallIn(SingletonComponent::class)
object Module_12 {
    @Provides
    @Singleton
    fun provideRepository12_5(): Repository12_5 {
        return Repository12_5()
    }

    @Provides
    @Singleton
    fun provideApi12_6(): Api12_6 {
        return Api12_6()
    }
}