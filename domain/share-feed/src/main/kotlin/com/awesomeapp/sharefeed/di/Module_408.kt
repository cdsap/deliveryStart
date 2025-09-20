package com.awesomeapp.sharefeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sharefeed.Viewmodel408_1
import com.awesomeapp.sharefeed.Activity408_2
import com.awesomeapp.sharefeed.Activity408_3
import com.awesomeapp.sharefeed.Fragment408_4
import com.awesomeapp.sharefeed.Repository408_5
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.sharefeed.Usecase408_7
import com.awesomeapp.sharefeed.Model408_9
import com.awesomeapp.sharefeed.Model408_10
import com.awesomeapp.sharefeed.Activity408_11
import com.awesomeapp.sharefeed.Model408_13
import com.awesomeapp.sharefeed.Activity408_14
import com.awesomeapp.sharefeed.Model408_16
import com.awesomeapp.sharefeed.Activity408_17
import com.awesomeapp.sharefeed.Model408_19
import com.awesomeapp.sharefeed.Activity408_20
import com.awesomeapp.sharefeed.Model408_22
import com.awesomeapp.sharefeed.Activity408_23
import com.awesomeapp.sharefeed.Model408_25
import com.awesomeapp.sharefeed.Activity408_26
import com.awesomeapp.sharefeed.Model408_28
import com.awesomeapp.sharefeed.Activity408_29
import com.awesomeapp.sharefeed.Model408_31
import com.awesomeapp.sharefeed.Activity408_32
import com.awesomeapp.sharefeed.Model408_34
import com.awesomeapp.sharefeed.Activity408_35
import com.awesomeapp.sharefeed.Model408_37
import com.awesomeapp.sharefeed.Activity408_38
import com.awesomeapp.sharefeed.Model408_40
import com.awesomeapp.sharefeed.Activity408_41
import com.awesomeapp.sharefeed.Model408_43
import com.awesomeapp.sharefeed.Activity408_44
import com.awesomeapp.sharefeed.Model408_46
import com.awesomeapp.sharefeed.Activity408_47
import com.awesomeapp.sharefeed.Model408_49
import com.awesomeapp.sharefeed.Activity408_50
import com.awesomeapp.sharefeed.Model408_52
import com.awesomeapp.sharefeed.Activity408_53
import com.awesomeapp.sharefeed.Model408_55
import com.awesomeapp.sharefeed.Activity408_56
import com.awesomeapp.sharefeed.Model408_58
import com.awesomeapp.sharefeed.Activity408_59
import com.awesomeapp.sharefeed.Model408_61
import com.awesomeapp.sharefeed.Activity408_62
import com.awesomeapp.sharefeed.Model408_64
import com.awesomeapp.sharefeed.Activity408_65
import com.awesomeapp.sharefeed.Model408_67
import com.awesomeapp.sharefeed.Activity408_68
import com.awesomeapp.sharefeed.Model408_70
import com.awesomeapp.sharefeed.Activity408_71
import com.awesomeapp.sharefeed.Model408_73
import com.awesomeapp.sharefeed.Activity408_74
import com.awesomeapp.sharefeed.Model408_76
import com.awesomeapp.sharefeed.Activity408_77
import com.awesomeapp.sharefeed.Model408_79
import com.awesomeapp.sharefeed.Activity408_80
import com.awesomeapp.sharefeed.Model408_82
import com.awesomeapp.sharefeed.Activity408_83
import com.awesomeapp.sharefeed.Model408_85
import com.awesomeapp.sharefeed.Activity408_86
import com.awesomeapp.sharefeed.Model408_88
import com.awesomeapp.sharefeed.Activity408_89
import com.awesomeapp.sharefeed.Model408_91
import com.awesomeapp.sharefeed.Activity408_92
import com.awesomeapp.sharefeed.Model408_94
import com.awesomeapp.sharefeed.Activity408_95
import com.awesomeapp.sharefeed.Model408_97
import com.awesomeapp.sharefeed.Activity408_98
import com.awesomeapp.sharefeed.Model408_100
import com.awesomeapp.sharefeed.Activity408_101
import com.awesomeapp.sharefeed.Model408_103
import com.awesomeapp.sharefeed.Activity408_104
import com.awesomeapp.sharefeed.Model408_106
import com.awesomeapp.sharefeed.Activity408_107
import com.awesomeapp.sharefeed.Model408_109
import com.awesomeapp.sharefeed.Activity408_110
import com.awesomeapp.sharefeed.Model408_112
import com.awesomeapp.sharefeed.Activity408_113
import com.awesomeapp.sharefeed.Model408_115
import com.awesomeapp.sharefeed.Activity408_116
import com.awesomeapp.sharefeed.Model408_118
import com.awesomeapp.sharefeed.Activity408_119
import com.awesomeapp.sharefeed.Model408_121
import com.awesomeapp.sharefeed.Activity408_122
import com.awesomeapp.sharefeed.Model408_124
import com.awesomeapp.sharefeed.Activity408_125
import com.awesomeapp.sharefeed.Model408_127
import com.awesomeapp.sharefeed.Activity408_128
import com.awesomeapp.sharefeed.Model408_130
import com.awesomeapp.sharefeed.Activity408_131
import com.awesomeapp.sharefeed.Model408_133
import com.awesomeapp.sharefeed.Activity408_134
import com.awesomeapp.sharefeed.Model408_136
import com.awesomeapp.sharefeed.Activity408_137
import com.awesomeapp.sharefeed.Model408_139
import com.awesomeapp.sharefeed.Activity408_140
import com.awesomeapp.sharefeed.Model408_142
import com.awesomeapp.sharefeed.Activity408_143

@Module
@InstallIn(SingletonComponent::class)
object Module_408 {
    @Provides
    @Singleton
    fun provideRepository408_5(
        api0: Api180_6 = Api180_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api240_6 = Api240_6(),
        api3: Api212_6 = Api212_6(),
        api4: Api260_6 = Api260_6()
    ): Repository408_5 {
        return Repository408_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi408_6(): Api408_6 {
        return Api408_6()
    }
}