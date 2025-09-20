package com.awesomeapp.alarmnetwork.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmnetwork.Viewmodel668_1
import com.awesomeapp.alarmnetwork.Activity668_2
import com.awesomeapp.alarmnetwork.Activity668_3
import com.awesomeapp.alarmnetwork.Fragment668_4
import com.awesomeapp.alarmnetwork.Repository668_5
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.alarmnetwork.Api668_6
import com.awesomeapp.alarmnetwork.Model668_8
import com.awesomeapp.alarmnetwork.Model668_9
import com.awesomeapp.alarmnetwork.Activity668_10
import com.awesomeapp.alarmnetwork.Model668_12
import com.awesomeapp.alarmnetwork.Activity668_13
import com.awesomeapp.alarmnetwork.Model668_15
import com.awesomeapp.alarmnetwork.Activity668_16
import com.awesomeapp.alarmnetwork.Model668_18
import com.awesomeapp.alarmnetwork.Activity668_19
import com.awesomeapp.alarmnetwork.Model668_21
import com.awesomeapp.alarmnetwork.Activity668_22
import com.awesomeapp.alarmnetwork.Model668_24
import com.awesomeapp.alarmnetwork.Activity668_25
import com.awesomeapp.alarmnetwork.Model668_27
import com.awesomeapp.alarmnetwork.Activity668_28
import com.awesomeapp.alarmnetwork.Model668_30
import com.awesomeapp.alarmnetwork.Activity668_31
import com.awesomeapp.alarmnetwork.Model668_33
import com.awesomeapp.alarmnetwork.Activity668_34
import com.awesomeapp.alarmnetwork.Model668_36
import com.awesomeapp.alarmnetwork.Activity668_37
import com.awesomeapp.alarmnetwork.Model668_39
import com.awesomeapp.alarmnetwork.Activity668_40
import com.awesomeapp.alarmnetwork.Model668_42
import com.awesomeapp.alarmnetwork.Activity668_43
import com.awesomeapp.alarmnetwork.Model668_45
import com.awesomeapp.alarmnetwork.Activity668_46
import com.awesomeapp.alarmnetwork.Model668_48
import com.awesomeapp.alarmnetwork.Activity668_49
import com.awesomeapp.alarmnetwork.Model668_51
import com.awesomeapp.alarmnetwork.Activity668_52
import com.awesomeapp.alarmnetwork.Model668_54
import com.awesomeapp.alarmnetwork.Activity668_55
import com.awesomeapp.alarmnetwork.Model668_57
import com.awesomeapp.alarmnetwork.Activity668_58
import com.awesomeapp.alarmnetwork.Model668_60
import com.awesomeapp.alarmnetwork.Activity668_61
import com.awesomeapp.alarmnetwork.Model668_63
import com.awesomeapp.alarmnetwork.Activity668_64
import com.awesomeapp.alarmnetwork.Model668_66
import com.awesomeapp.alarmnetwork.Activity668_67
import com.awesomeapp.alarmnetwork.Model668_69
import com.awesomeapp.alarmnetwork.Activity668_70
import com.awesomeapp.alarmnetwork.Model668_72
import com.awesomeapp.alarmnetwork.Activity668_73
import com.awesomeapp.alarmnetwork.Model668_75
import com.awesomeapp.alarmnetwork.Activity668_76
import com.awesomeapp.alarmnetwork.Model668_78
import com.awesomeapp.alarmnetwork.Activity668_79
import com.awesomeapp.alarmnetwork.Model668_81
import com.awesomeapp.alarmnetwork.Activity668_82
import com.awesomeapp.alarmnetwork.Model668_84
import com.awesomeapp.alarmnetwork.Activity668_85
import com.awesomeapp.alarmnetwork.Model668_87
import com.awesomeapp.alarmnetwork.Activity668_88
import com.awesomeapp.alarmnetwork.Model668_90
import com.awesomeapp.alarmnetwork.Activity668_91
import com.awesomeapp.alarmnetwork.Model668_93
import com.awesomeapp.alarmnetwork.Activity668_94
import com.awesomeapp.alarmnetwork.Model668_96
import com.awesomeapp.alarmnetwork.Activity668_97
import com.awesomeapp.alarmnetwork.Model668_99
import com.awesomeapp.alarmnetwork.Activity668_100
import com.awesomeapp.alarmnetwork.Model668_102
import com.awesomeapp.alarmnetwork.Activity668_103
import com.awesomeapp.alarmnetwork.Model668_105
import com.awesomeapp.alarmnetwork.Activity668_106
import com.awesomeapp.alarmnetwork.Model668_108
import com.awesomeapp.alarmnetwork.Activity668_109
import com.awesomeapp.alarmnetwork.Model668_111
import com.awesomeapp.alarmnetwork.Activity668_112
import com.awesomeapp.alarmnetwork.Model668_114
import com.awesomeapp.alarmnetwork.Activity668_115
import com.awesomeapp.alarmnetwork.Model668_117
import com.awesomeapp.alarmnetwork.Activity668_118
import com.awesomeapp.alarmnetwork.Model668_120
import com.awesomeapp.alarmnetwork.Activity668_121
import com.awesomeapp.alarmnetwork.Model668_123
import com.awesomeapp.alarmnetwork.Activity668_124
import com.awesomeapp.alarmnetwork.Model668_126
import com.awesomeapp.alarmnetwork.Activity668_127
import com.awesomeapp.alarmnetwork.Model668_129
import com.awesomeapp.alarmnetwork.Activity668_130
import com.awesomeapp.alarmnetwork.Model668_132
import com.awesomeapp.alarmnetwork.Activity668_133
import com.awesomeapp.alarmnetwork.Model668_135
import com.awesomeapp.alarmnetwork.Activity668_136
import com.awesomeapp.alarmnetwork.Model668_138
import com.awesomeapp.alarmnetwork.Activity668_139
import com.awesomeapp.alarmnetwork.Model668_141
import com.awesomeapp.alarmnetwork.Activity668_142
import com.awesomeapp.alarmnetwork.Model668_144
import com.awesomeapp.alarmnetwork.Activity668_145
import com.awesomeapp.alarmnetwork.Model668_147
import com.awesomeapp.alarmnetwork.Activity668_148

@Module
@InstallIn(SingletonComponent::class)
object Module_668 {
    @Provides
    @Singleton
    fun provideRepository668_5(
        api0: Api452_6 = Api452_6()
    ): Repository668_5 {
        return Repository668_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi668_6(): Api668_6 {
        return Api668_6()
    }
}