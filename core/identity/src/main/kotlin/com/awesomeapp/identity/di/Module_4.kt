package com.awesomeapp.identity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.identity.Viewmodel4_1
import com.awesomeapp.identity.Activity4_2
import com.awesomeapp.identity.Activity4_3
import com.awesomeapp.identity.Fragment4_4
import com.awesomeapp.identity.Repository4_5
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.identity.Model4_8
import com.awesomeapp.identity.Model4_9
import com.awesomeapp.identity.Activity4_10
import com.awesomeapp.identity.Model4_12
import com.awesomeapp.identity.Activity4_13
import com.awesomeapp.identity.Model4_15
import com.awesomeapp.identity.Activity4_16
import com.awesomeapp.identity.Model4_18
import com.awesomeapp.identity.Activity4_19
import com.awesomeapp.identity.Model4_21
import com.awesomeapp.identity.Activity4_22
import com.awesomeapp.identity.Model4_24
import com.awesomeapp.identity.Activity4_25
import com.awesomeapp.identity.Model4_27
import com.awesomeapp.identity.Activity4_28
import com.awesomeapp.identity.Model4_30
import com.awesomeapp.identity.Activity4_31
import com.awesomeapp.identity.Model4_33
import com.awesomeapp.identity.Activity4_34
import com.awesomeapp.identity.Model4_36
import com.awesomeapp.identity.Activity4_37
import com.awesomeapp.identity.Model4_39
import com.awesomeapp.identity.Activity4_40
import com.awesomeapp.identity.Model4_42
import com.awesomeapp.identity.Activity4_43
import com.awesomeapp.identity.Model4_45
import com.awesomeapp.identity.Activity4_46
import com.awesomeapp.identity.Model4_48
import com.awesomeapp.identity.Activity4_49
import com.awesomeapp.identity.Model4_51
import com.awesomeapp.identity.Activity4_52
import com.awesomeapp.identity.Model4_54
import com.awesomeapp.identity.Activity4_55
import com.awesomeapp.identity.Model4_57
import com.awesomeapp.identity.Activity4_58
import com.awesomeapp.identity.Model4_60
import com.awesomeapp.identity.Activity4_61
import com.awesomeapp.identity.Model4_63
import com.awesomeapp.identity.Activity4_64
import com.awesomeapp.identity.Model4_66
import com.awesomeapp.identity.Activity4_67
import com.awesomeapp.identity.Model4_69
import com.awesomeapp.identity.Activity4_70
import com.awesomeapp.identity.Model4_72
import com.awesomeapp.identity.Activity4_73
import com.awesomeapp.identity.Model4_75
import com.awesomeapp.identity.Activity4_76
import com.awesomeapp.identity.Model4_78
import com.awesomeapp.identity.Activity4_79
import com.awesomeapp.identity.Model4_81
import com.awesomeapp.identity.Activity4_82
import com.awesomeapp.identity.Model4_84
import com.awesomeapp.identity.Activity4_85

@Module
@InstallIn(SingletonComponent::class)
object Module_4 {
    @Provides
    @Singleton
    fun provideRepository4_5(): Repository4_5 {
        return Repository4_5()
    }

    @Provides
    @Singleton
    fun provideApi4_6(): Api4_6 {
        return Api4_6()
    }
}