package com.awesomeapp.searchlocation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.searchlocation.Viewmodel600_1
import com.awesomeapp.searchlocation.Activity600_2
import com.awesomeapp.searchlocation.Activity600_3
import com.awesomeapp.searchlocation.Fragment600_4
import com.awesomeapp.searchlocation.Repository600_5
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.searchlocation.Api600_6
import com.awesomeapp.searchlocation.Service600_7
import com.awesomeapp.searchlocation.Worker600_8
import com.awesomeapp.searchlocation.Usecase600_9
import com.awesomeapp.searchlocation.Model600_11
import com.awesomeapp.searchlocation.Model600_12
import com.awesomeapp.searchlocation.Activity600_13
import com.awesomeapp.searchlocation.Model600_15
import com.awesomeapp.searchlocation.Activity600_16
import com.awesomeapp.searchlocation.Model600_18
import com.awesomeapp.searchlocation.Activity600_19
import com.awesomeapp.searchlocation.Model600_21
import com.awesomeapp.searchlocation.Activity600_22
import com.awesomeapp.searchlocation.Model600_24
import com.awesomeapp.searchlocation.Activity600_25
import com.awesomeapp.searchlocation.Model600_27
import com.awesomeapp.searchlocation.Activity600_28
import com.awesomeapp.searchlocation.Model600_30
import com.awesomeapp.searchlocation.Activity600_31
import com.awesomeapp.searchlocation.Model600_33
import com.awesomeapp.searchlocation.Activity600_34
import com.awesomeapp.searchlocation.Model600_36
import com.awesomeapp.searchlocation.Activity600_37
import com.awesomeapp.searchlocation.Model600_39
import com.awesomeapp.searchlocation.Activity600_40
import com.awesomeapp.searchlocation.Model600_42
import com.awesomeapp.searchlocation.Activity600_43
import com.awesomeapp.searchlocation.Model600_45
import com.awesomeapp.searchlocation.Activity600_46
import com.awesomeapp.searchlocation.Model600_48
import com.awesomeapp.searchlocation.Activity600_49
import com.awesomeapp.searchlocation.Model600_51
import com.awesomeapp.searchlocation.Activity600_52
import com.awesomeapp.searchlocation.Model600_54
import com.awesomeapp.searchlocation.Activity600_55
import com.awesomeapp.searchlocation.Model600_57
import com.awesomeapp.searchlocation.Activity600_58
import com.awesomeapp.searchlocation.Model600_60
import com.awesomeapp.searchlocation.Activity600_61
import com.awesomeapp.searchlocation.Model600_63
import com.awesomeapp.searchlocation.Activity600_64
import com.awesomeapp.searchlocation.Model600_66
import com.awesomeapp.searchlocation.Activity600_67
import com.awesomeapp.searchlocation.Model600_69
import com.awesomeapp.searchlocation.Activity600_70
import com.awesomeapp.searchlocation.Model600_72
import com.awesomeapp.searchlocation.Activity600_73
import com.awesomeapp.searchlocation.Model600_75
import com.awesomeapp.searchlocation.Activity600_76
import com.awesomeapp.searchlocation.Model600_78
import com.awesomeapp.searchlocation.Activity600_79
import com.awesomeapp.searchlocation.Model600_81
import com.awesomeapp.searchlocation.Activity600_82
import com.awesomeapp.searchlocation.Model600_84
import com.awesomeapp.searchlocation.Activity600_85
import com.awesomeapp.searchlocation.Model600_87
import com.awesomeapp.searchlocation.Activity600_88
import com.awesomeapp.searchlocation.Model600_90
import com.awesomeapp.searchlocation.Activity600_91
import com.awesomeapp.searchlocation.Model600_93
import com.awesomeapp.searchlocation.Activity600_94
import com.awesomeapp.searchlocation.Model600_96
import com.awesomeapp.searchlocation.Activity600_97
import com.awesomeapp.searchlocation.Model600_99
import com.awesomeapp.searchlocation.Activity600_100
import com.awesomeapp.searchlocation.Model600_102
import com.awesomeapp.searchlocation.Activity600_103
import com.awesomeapp.searchlocation.Model600_105
import com.awesomeapp.searchlocation.Activity600_106
import com.awesomeapp.searchlocation.Model600_108
import com.awesomeapp.searchlocation.Activity600_109
import com.awesomeapp.searchlocation.Model600_111
import com.awesomeapp.searchlocation.Activity600_112
import com.awesomeapp.searchlocation.Model600_114
import com.awesomeapp.searchlocation.Activity600_115
import com.awesomeapp.searchlocation.Model600_117
import com.awesomeapp.searchlocation.Activity600_118
import com.awesomeapp.searchlocation.Model600_120
import com.awesomeapp.searchlocation.Activity600_121
import com.awesomeapp.searchlocation.Model600_123
import com.awesomeapp.searchlocation.Activity600_124
import com.awesomeapp.searchlocation.Model600_126
import com.awesomeapp.searchlocation.Activity600_127
import com.awesomeapp.searchlocation.Model600_129
import com.awesomeapp.searchlocation.Activity600_130
import com.awesomeapp.searchlocation.Model600_132
import com.awesomeapp.searchlocation.Activity600_133
import com.awesomeapp.searchlocation.Model600_135
import com.awesomeapp.searchlocation.Activity600_136

@Module
@InstallIn(SingletonComponent::class)
object Module_600 {
    @Provides
    @Singleton
    fun provideRepository600_5(
        api0: Api408_6 = Api408_6(),
        api1: Api384_6 = Api384_6()
    ): Repository600_5 {
        return Repository600_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi600_6(): Api600_6 {
        return Api600_6()
    }
}