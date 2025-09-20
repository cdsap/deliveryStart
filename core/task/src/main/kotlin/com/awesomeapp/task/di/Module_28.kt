package com.awesomeapp.task.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.task.Viewmodel28_1
import com.awesomeapp.task.Activity28_2
import com.awesomeapp.task.Activity28_3
import com.awesomeapp.task.Fragment28_4
import com.awesomeapp.task.Repository28_5
import com.awesomeapp.task.Api28_6
import com.awesomeapp.task.Model28_8
import com.awesomeapp.task.Model28_9
import com.awesomeapp.task.Activity28_10
import com.awesomeapp.task.Model28_12
import com.awesomeapp.task.Activity28_13
import com.awesomeapp.task.Model28_15
import com.awesomeapp.task.Activity28_16
import com.awesomeapp.task.Model28_18
import com.awesomeapp.task.Activity28_19
import com.awesomeapp.task.Model28_21
import com.awesomeapp.task.Activity28_22
import com.awesomeapp.task.Model28_24
import com.awesomeapp.task.Activity28_25
import com.awesomeapp.task.Model28_27
import com.awesomeapp.task.Activity28_28
import com.awesomeapp.task.Model28_30
import com.awesomeapp.task.Activity28_31
import com.awesomeapp.task.Model28_33
import com.awesomeapp.task.Activity28_34
import com.awesomeapp.task.Model28_36
import com.awesomeapp.task.Activity28_37
import com.awesomeapp.task.Model28_39
import com.awesomeapp.task.Activity28_40
import com.awesomeapp.task.Model28_42
import com.awesomeapp.task.Activity28_43
import com.awesomeapp.task.Model28_45
import com.awesomeapp.task.Activity28_46
import com.awesomeapp.task.Model28_48
import com.awesomeapp.task.Activity28_49
import com.awesomeapp.task.Model28_51
import com.awesomeapp.task.Activity28_52
import com.awesomeapp.task.Model28_54
import com.awesomeapp.task.Activity28_55
import com.awesomeapp.task.Model28_57
import com.awesomeapp.task.Activity28_58
import com.awesomeapp.task.Model28_60
import com.awesomeapp.task.Activity28_61
import com.awesomeapp.task.Model28_63
import com.awesomeapp.task.Activity28_64
import com.awesomeapp.task.Model28_66
import com.awesomeapp.task.Activity28_67
import com.awesomeapp.task.Model28_69
import com.awesomeapp.task.Activity28_70
import com.awesomeapp.task.Model28_72
import com.awesomeapp.task.Activity28_73
import com.awesomeapp.task.Model28_75
import com.awesomeapp.task.Activity28_76
import com.awesomeapp.task.Model28_78
import com.awesomeapp.task.Activity28_79
import com.awesomeapp.task.Model28_81
import com.awesomeapp.task.Activity28_82
import com.awesomeapp.task.Model28_84
import com.awesomeapp.task.Activity28_85
import com.awesomeapp.task.Model28_87
import com.awesomeapp.task.Activity28_88
import com.awesomeapp.task.Model28_90
import com.awesomeapp.task.Activity28_91
import com.awesomeapp.task.Model28_93
import com.awesomeapp.task.Activity28_94
import com.awesomeapp.task.Model28_96
import com.awesomeapp.task.Activity28_97
import com.awesomeapp.task.Model28_99
import com.awesomeapp.task.Activity28_100
import com.awesomeapp.task.Model28_102
import com.awesomeapp.task.Activity28_103
import com.awesomeapp.task.Model28_105
import com.awesomeapp.task.Activity28_106
import com.awesomeapp.task.Model28_108
import com.awesomeapp.task.Activity28_109
import com.awesomeapp.task.Model28_111
import com.awesomeapp.task.Activity28_112
import com.awesomeapp.task.Model28_114
import com.awesomeapp.task.Activity28_115
import com.awesomeapp.task.Model28_117
import com.awesomeapp.task.Activity28_118
import com.awesomeapp.task.Model28_120
import com.awesomeapp.task.Activity28_121
import com.awesomeapp.task.Model28_123
import com.awesomeapp.task.Activity28_124
import com.awesomeapp.task.Model28_126
import com.awesomeapp.task.Activity28_127
import com.awesomeapp.task.Model28_129
import com.awesomeapp.task.Activity28_130
import com.awesomeapp.task.Model28_132
import com.awesomeapp.task.Activity28_133

@Module
@InstallIn(SingletonComponent::class)
object Module_28 {
    @Provides
    @Singleton
    fun provideRepository28_5(): Repository28_5 {
        return Repository28_5()
    }

    @Provides
    @Singleton
    fun provideApi28_6(): Api28_6 {
        return Api28_6()
    }
}