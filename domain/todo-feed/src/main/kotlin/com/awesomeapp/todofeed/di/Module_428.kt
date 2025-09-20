package com.awesomeapp.todofeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.todofeed.Viewmodel428_1
import com.awesomeapp.todofeed.Activity428_2
import com.awesomeapp.todofeed.Activity428_3
import com.awesomeapp.todofeed.Fragment428_4
import com.awesomeapp.todofeed.Repository428_5
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.todofeed.Model428_8
import com.awesomeapp.todofeed.Model428_9
import com.awesomeapp.todofeed.Activity428_10
import com.awesomeapp.todofeed.Model428_12
import com.awesomeapp.todofeed.Activity428_13
import com.awesomeapp.todofeed.Model428_15
import com.awesomeapp.todofeed.Activity428_16
import com.awesomeapp.todofeed.Model428_18
import com.awesomeapp.todofeed.Activity428_19
import com.awesomeapp.todofeed.Model428_21
import com.awesomeapp.todofeed.Activity428_22
import com.awesomeapp.todofeed.Model428_24
import com.awesomeapp.todofeed.Activity428_25
import com.awesomeapp.todofeed.Model428_27
import com.awesomeapp.todofeed.Activity428_28
import com.awesomeapp.todofeed.Model428_30
import com.awesomeapp.todofeed.Activity428_31
import com.awesomeapp.todofeed.Model428_33
import com.awesomeapp.todofeed.Activity428_34
import com.awesomeapp.todofeed.Model428_36
import com.awesomeapp.todofeed.Activity428_37
import com.awesomeapp.todofeed.Model428_39
import com.awesomeapp.todofeed.Activity428_40
import com.awesomeapp.todofeed.Model428_42
import com.awesomeapp.todofeed.Activity428_43
import com.awesomeapp.todofeed.Model428_45
import com.awesomeapp.todofeed.Activity428_46
import com.awesomeapp.todofeed.Model428_48
import com.awesomeapp.todofeed.Activity428_49
import com.awesomeapp.todofeed.Model428_51
import com.awesomeapp.todofeed.Activity428_52
import com.awesomeapp.todofeed.Model428_54
import com.awesomeapp.todofeed.Activity428_55
import com.awesomeapp.todofeed.Model428_57
import com.awesomeapp.todofeed.Activity428_58
import com.awesomeapp.todofeed.Model428_60
import com.awesomeapp.todofeed.Activity428_61
import com.awesomeapp.todofeed.Model428_63
import com.awesomeapp.todofeed.Activity428_64
import com.awesomeapp.todofeed.Model428_66
import com.awesomeapp.todofeed.Activity428_67
import com.awesomeapp.todofeed.Model428_69
import com.awesomeapp.todofeed.Activity428_70
import com.awesomeapp.todofeed.Model428_72
import com.awesomeapp.todofeed.Activity428_73
import com.awesomeapp.todofeed.Model428_75
import com.awesomeapp.todofeed.Activity428_76
import com.awesomeapp.todofeed.Model428_78
import com.awesomeapp.todofeed.Activity428_79
import com.awesomeapp.todofeed.Model428_81
import com.awesomeapp.todofeed.Activity428_82
import com.awesomeapp.todofeed.Model428_84
import com.awesomeapp.todofeed.Activity428_85
import com.awesomeapp.todofeed.Model428_87
import com.awesomeapp.todofeed.Activity428_88
import com.awesomeapp.todofeed.Model428_90
import com.awesomeapp.todofeed.Activity428_91
import com.awesomeapp.todofeed.Model428_93
import com.awesomeapp.todofeed.Activity428_94
import com.awesomeapp.todofeed.Model428_96
import com.awesomeapp.todofeed.Activity428_97
import com.awesomeapp.todofeed.Model428_99
import com.awesomeapp.todofeed.Activity428_100
import com.awesomeapp.todofeed.Model428_102
import com.awesomeapp.todofeed.Activity428_103
import com.awesomeapp.todofeed.Model428_105
import com.awesomeapp.todofeed.Activity428_106
import com.awesomeapp.todofeed.Model428_108
import com.awesomeapp.todofeed.Activity428_109
import com.awesomeapp.todofeed.Model428_111
import com.awesomeapp.todofeed.Activity428_112
import com.awesomeapp.todofeed.Model428_114
import com.awesomeapp.todofeed.Activity428_115
import com.awesomeapp.todofeed.Model428_117
import com.awesomeapp.todofeed.Activity428_118
import com.awesomeapp.todofeed.Model428_120
import com.awesomeapp.todofeed.Activity428_121
import com.awesomeapp.todofeed.Model428_123
import com.awesomeapp.todofeed.Activity428_124
import com.awesomeapp.todofeed.Model428_126
import com.awesomeapp.todofeed.Activity428_127
import com.awesomeapp.todofeed.Model428_129
import com.awesomeapp.todofeed.Activity428_130

@Module
@InstallIn(SingletonComponent::class)
object Module_428 {
    @Provides
    @Singleton
    fun provideRepository428_5(
        api0: Api168_6 = Api168_6(),
        api1: Api176_6 = Api176_6(),
        api2: Api300_6 = Api300_6(),
        api3: Api248_6 = Api248_6(),
        api4: Api272_6 = Api272_6()
    ): Repository428_5 {
        return Repository428_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi428_6(): Api428_6 {
        return Api428_6()
    }
}