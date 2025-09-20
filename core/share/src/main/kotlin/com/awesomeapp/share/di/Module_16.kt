package com.awesomeapp.share.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.share.Viewmodel16_1
import com.awesomeapp.share.Activity16_2
import com.awesomeapp.share.Activity16_3
import com.awesomeapp.share.Fragment16_4
import com.awesomeapp.share.Repository16_5
import com.awesomeapp.share.Api16_6
import com.awesomeapp.share.Model16_8
import com.awesomeapp.share.Model16_9
import com.awesomeapp.share.Activity16_10
import com.awesomeapp.share.Model16_12
import com.awesomeapp.share.Activity16_13
import com.awesomeapp.share.Model16_15
import com.awesomeapp.share.Activity16_16
import com.awesomeapp.share.Model16_18
import com.awesomeapp.share.Activity16_19
import com.awesomeapp.share.Model16_21
import com.awesomeapp.share.Activity16_22
import com.awesomeapp.share.Model16_24
import com.awesomeapp.share.Activity16_25
import com.awesomeapp.share.Model16_27
import com.awesomeapp.share.Activity16_28
import com.awesomeapp.share.Model16_30
import com.awesomeapp.share.Activity16_31
import com.awesomeapp.share.Model16_33
import com.awesomeapp.share.Activity16_34
import com.awesomeapp.share.Model16_36
import com.awesomeapp.share.Activity16_37
import com.awesomeapp.share.Model16_39
import com.awesomeapp.share.Activity16_40
import com.awesomeapp.share.Model16_42
import com.awesomeapp.share.Activity16_43
import com.awesomeapp.share.Model16_45
import com.awesomeapp.share.Activity16_46
import com.awesomeapp.share.Model16_48
import com.awesomeapp.share.Activity16_49
import com.awesomeapp.share.Model16_51
import com.awesomeapp.share.Activity16_52
import com.awesomeapp.share.Model16_54
import com.awesomeapp.share.Activity16_55
import com.awesomeapp.share.Model16_57
import com.awesomeapp.share.Activity16_58
import com.awesomeapp.share.Model16_60
import com.awesomeapp.share.Activity16_61
import com.awesomeapp.share.Model16_63
import com.awesomeapp.share.Activity16_64
import com.awesomeapp.share.Model16_66
import com.awesomeapp.share.Activity16_67
import com.awesomeapp.share.Model16_69
import com.awesomeapp.share.Activity16_70
import com.awesomeapp.share.Model16_72
import com.awesomeapp.share.Activity16_73
import com.awesomeapp.share.Model16_75
import com.awesomeapp.share.Activity16_76
import com.awesomeapp.share.Model16_78
import com.awesomeapp.share.Activity16_79
import com.awesomeapp.share.Model16_81
import com.awesomeapp.share.Activity16_82
import com.awesomeapp.share.Model16_84
import com.awesomeapp.share.Activity16_85
import com.awesomeapp.share.Model16_87
import com.awesomeapp.share.Activity16_88
import com.awesomeapp.share.Model16_90
import com.awesomeapp.share.Activity16_91
import com.awesomeapp.share.Model16_93
import com.awesomeapp.share.Activity16_94
import com.awesomeapp.share.Model16_96
import com.awesomeapp.share.Activity16_97
import com.awesomeapp.share.Model16_99
import com.awesomeapp.share.Activity16_100
import com.awesomeapp.share.Model16_102
import com.awesomeapp.share.Activity16_103
import com.awesomeapp.share.Model16_105
import com.awesomeapp.share.Activity16_106
import com.awesomeapp.share.Model16_108
import com.awesomeapp.share.Activity16_109

@Module
@InstallIn(SingletonComponent::class)
object Module_16 {
    @Provides
    @Singleton
    fun provideRepository16_5(): Repository16_5 {
        return Repository16_5()
    }

    @Provides
    @Singleton
    fun provideApi16_6(): Api16_6 {
        return Api16_6()
    }
}