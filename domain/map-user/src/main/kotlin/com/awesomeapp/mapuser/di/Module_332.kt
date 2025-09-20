package com.awesomeapp.mapuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mapuser.Viewmodel332_1
import com.awesomeapp.mapuser.Activity332_2
import com.awesomeapp.mapuser.Activity332_3
import com.awesomeapp.mapuser.Fragment332_4
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.mapuser.Api332_6
import com.awesomeapp.mapuser.Model332_8
import com.awesomeapp.mapuser.Model332_9
import com.awesomeapp.mapuser.Activity332_10
import com.awesomeapp.mapuser.Model332_12
import com.awesomeapp.mapuser.Activity332_13
import com.awesomeapp.mapuser.Model332_15
import com.awesomeapp.mapuser.Activity332_16
import com.awesomeapp.mapuser.Model332_18
import com.awesomeapp.mapuser.Activity332_19
import com.awesomeapp.mapuser.Model332_21
import com.awesomeapp.mapuser.Activity332_22
import com.awesomeapp.mapuser.Model332_24
import com.awesomeapp.mapuser.Activity332_25
import com.awesomeapp.mapuser.Model332_27
import com.awesomeapp.mapuser.Activity332_28
import com.awesomeapp.mapuser.Model332_30
import com.awesomeapp.mapuser.Activity332_31
import com.awesomeapp.mapuser.Model332_33
import com.awesomeapp.mapuser.Activity332_34
import com.awesomeapp.mapuser.Model332_36
import com.awesomeapp.mapuser.Activity332_37
import com.awesomeapp.mapuser.Model332_39
import com.awesomeapp.mapuser.Activity332_40
import com.awesomeapp.mapuser.Model332_42
import com.awesomeapp.mapuser.Activity332_43
import com.awesomeapp.mapuser.Model332_45
import com.awesomeapp.mapuser.Activity332_46
import com.awesomeapp.mapuser.Model332_48
import com.awesomeapp.mapuser.Activity332_49
import com.awesomeapp.mapuser.Model332_51
import com.awesomeapp.mapuser.Activity332_52
import com.awesomeapp.mapuser.Model332_54
import com.awesomeapp.mapuser.Activity332_55
import com.awesomeapp.mapuser.Model332_57
import com.awesomeapp.mapuser.Activity332_58
import com.awesomeapp.mapuser.Model332_60
import com.awesomeapp.mapuser.Activity332_61
import com.awesomeapp.mapuser.Model332_63
import com.awesomeapp.mapuser.Activity332_64
import com.awesomeapp.mapuser.Model332_66
import com.awesomeapp.mapuser.Activity332_67
import com.awesomeapp.mapuser.Model332_69
import com.awesomeapp.mapuser.Activity332_70
import com.awesomeapp.mapuser.Model332_72
import com.awesomeapp.mapuser.Activity332_73
import com.awesomeapp.mapuser.Model332_75
import com.awesomeapp.mapuser.Activity332_76
import com.awesomeapp.mapuser.Model332_78
import com.awesomeapp.mapuser.Activity332_79
import com.awesomeapp.mapuser.Model332_81
import com.awesomeapp.mapuser.Activity332_82
import com.awesomeapp.mapuser.Model332_84
import com.awesomeapp.mapuser.Activity332_85
import com.awesomeapp.mapuser.Model332_87
import com.awesomeapp.mapuser.Activity332_88
import com.awesomeapp.mapuser.Model332_90
import com.awesomeapp.mapuser.Activity332_91
import com.awesomeapp.mapuser.Model332_93
import com.awesomeapp.mapuser.Activity332_94
import com.awesomeapp.mapuser.Model332_96
import com.awesomeapp.mapuser.Activity332_97
import com.awesomeapp.mapuser.Model332_99
import com.awesomeapp.mapuser.Activity332_100
import com.awesomeapp.mapuser.Model332_102
import com.awesomeapp.mapuser.Activity332_103
import com.awesomeapp.mapuser.Model332_105

@Module
@InstallIn(SingletonComponent::class)
object Module_332 {
    @Provides
    @Singleton
    fun provideRepository332_5(
        api0: Api264_6 = Api264_6()
    ): Repository332_5 {
        return Repository332_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi332_6(): Api332_6 {
        return Api332_6()
    }
}