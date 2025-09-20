package com.awesomeapp.sessionpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionpost.Viewmodel512_1
import com.awesomeapp.sessionpost.Activity512_2
import com.awesomeapp.sessionpost.Activity512_3
import com.awesomeapp.sessionpost.Fragment512_4
import com.awesomeapp.sessionpost.Repository512_5
import com.awesomeapp.feedprofile.Api352_6
import com.awesomeapp.sessionpost.Api512_6
import com.awesomeapp.sessionpost.Model512_8
import com.awesomeapp.sessionpost.Model512_9
import com.awesomeapp.sessionpost.Activity512_10
import com.awesomeapp.sessionpost.Model512_12
import com.awesomeapp.sessionpost.Activity512_13
import com.awesomeapp.sessionpost.Model512_15
import com.awesomeapp.sessionpost.Activity512_16
import com.awesomeapp.sessionpost.Model512_18
import com.awesomeapp.sessionpost.Activity512_19
import com.awesomeapp.sessionpost.Model512_21
import com.awesomeapp.sessionpost.Activity512_22
import com.awesomeapp.sessionpost.Model512_24
import com.awesomeapp.sessionpost.Activity512_25
import com.awesomeapp.sessionpost.Model512_27
import com.awesomeapp.sessionpost.Activity512_28
import com.awesomeapp.sessionpost.Model512_30
import com.awesomeapp.sessionpost.Activity512_31
import com.awesomeapp.sessionpost.Model512_33
import com.awesomeapp.sessionpost.Activity512_34
import com.awesomeapp.sessionpost.Model512_36
import com.awesomeapp.sessionpost.Activity512_37
import com.awesomeapp.sessionpost.Model512_39
import com.awesomeapp.sessionpost.Activity512_40
import com.awesomeapp.sessionpost.Model512_42
import com.awesomeapp.sessionpost.Activity512_43
import com.awesomeapp.sessionpost.Model512_45
import com.awesomeapp.sessionpost.Activity512_46
import com.awesomeapp.sessionpost.Model512_48
import com.awesomeapp.sessionpost.Activity512_49
import com.awesomeapp.sessionpost.Model512_51
import com.awesomeapp.sessionpost.Activity512_52
import com.awesomeapp.sessionpost.Model512_54
import com.awesomeapp.sessionpost.Activity512_55
import com.awesomeapp.sessionpost.Model512_57
import com.awesomeapp.sessionpost.Activity512_58
import com.awesomeapp.sessionpost.Model512_60
import com.awesomeapp.sessionpost.Activity512_61
import com.awesomeapp.sessionpost.Model512_63
import com.awesomeapp.sessionpost.Activity512_64
import com.awesomeapp.sessionpost.Model512_66
import com.awesomeapp.sessionpost.Activity512_67
import com.awesomeapp.sessionpost.Model512_69
import com.awesomeapp.sessionpost.Activity512_70
import com.awesomeapp.sessionpost.Model512_72
import com.awesomeapp.sessionpost.Activity512_73
import com.awesomeapp.sessionpost.Model512_75
import com.awesomeapp.sessionpost.Activity512_76
import com.awesomeapp.sessionpost.Model512_78
import com.awesomeapp.sessionpost.Activity512_79
import com.awesomeapp.sessionpost.Model512_81
import com.awesomeapp.sessionpost.Activity512_82
import com.awesomeapp.sessionpost.Model512_84
import com.awesomeapp.sessionpost.Activity512_85
import com.awesomeapp.sessionpost.Model512_87
import com.awesomeapp.sessionpost.Activity512_88
import com.awesomeapp.sessionpost.Model512_90
import com.awesomeapp.sessionpost.Activity512_91
import com.awesomeapp.sessionpost.Model512_93
import com.awesomeapp.sessionpost.Activity512_94
import com.awesomeapp.sessionpost.Model512_96
import com.awesomeapp.sessionpost.Activity512_97
import com.awesomeapp.sessionpost.Model512_99
import com.awesomeapp.sessionpost.Activity512_100
import com.awesomeapp.sessionpost.Model512_102
import com.awesomeapp.sessionpost.Activity512_103
import com.awesomeapp.sessionpost.Model512_105
import com.awesomeapp.sessionpost.Activity512_106
import com.awesomeapp.sessionpost.Model512_108
import com.awesomeapp.sessionpost.Activity512_109
import com.awesomeapp.sessionpost.Model512_111
import com.awesomeapp.sessionpost.Activity512_112
import com.awesomeapp.sessionpost.Model512_114
import com.awesomeapp.sessionpost.Activity512_115
import com.awesomeapp.sessionpost.Model512_117
import com.awesomeapp.sessionpost.Activity512_118
import com.awesomeapp.sessionpost.Model512_120
import com.awesomeapp.sessionpost.Activity512_121
import com.awesomeapp.sessionpost.Model512_123
import com.awesomeapp.sessionpost.Activity512_124
import com.awesomeapp.sessionpost.Model512_126
import com.awesomeapp.sessionpost.Activity512_127
import com.awesomeapp.sessionpost.Model512_129
import com.awesomeapp.sessionpost.Activity512_130
import com.awesomeapp.sessionpost.Model512_132
import com.awesomeapp.sessionpost.Activity512_133
import com.awesomeapp.sessionpost.Model512_135
import com.awesomeapp.sessionpost.Activity512_136
import com.awesomeapp.sessionpost.Model512_138
import com.awesomeapp.sessionpost.Activity512_139

@Module
@InstallIn(SingletonComponent::class)
object Module_512 {
    @Provides
    @Singleton
    fun provideRepository512_5(
        api0: Api352_6 = Api352_6()
    ): Repository512_5 {
        return Repository512_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi512_6(): Api512_6 {
        return Api512_6()
    }
}