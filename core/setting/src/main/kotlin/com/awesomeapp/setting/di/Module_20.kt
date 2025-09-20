package com.awesomeapp.setting.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.setting.Viewmodel20_1
import com.awesomeapp.setting.Activity20_2
import com.awesomeapp.setting.Activity20_3
import com.awesomeapp.setting.Fragment20_4
import com.awesomeapp.setting.Repository20_5
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.setting.Service20_7
import com.awesomeapp.setting.Worker20_8
import com.awesomeapp.setting.Model20_10
import com.awesomeapp.setting.Model20_11
import com.awesomeapp.setting.Activity20_12
import com.awesomeapp.setting.Model20_14
import com.awesomeapp.setting.Activity20_15
import com.awesomeapp.setting.Model20_17
import com.awesomeapp.setting.Activity20_18
import com.awesomeapp.setting.Model20_20
import com.awesomeapp.setting.Activity20_21
import com.awesomeapp.setting.Model20_23
import com.awesomeapp.setting.Activity20_24
import com.awesomeapp.setting.Model20_26
import com.awesomeapp.setting.Activity20_27
import com.awesomeapp.setting.Model20_29
import com.awesomeapp.setting.Activity20_30
import com.awesomeapp.setting.Model20_32
import com.awesomeapp.setting.Activity20_33
import com.awesomeapp.setting.Model20_35
import com.awesomeapp.setting.Activity20_36
import com.awesomeapp.setting.Model20_38
import com.awesomeapp.setting.Activity20_39
import com.awesomeapp.setting.Model20_41
import com.awesomeapp.setting.Activity20_42
import com.awesomeapp.setting.Model20_44
import com.awesomeapp.setting.Activity20_45
import com.awesomeapp.setting.Model20_47
import com.awesomeapp.setting.Activity20_48
import com.awesomeapp.setting.Model20_50
import com.awesomeapp.setting.Activity20_51
import com.awesomeapp.setting.Model20_53
import com.awesomeapp.setting.Activity20_54
import com.awesomeapp.setting.Model20_56
import com.awesomeapp.setting.Activity20_57
import com.awesomeapp.setting.Model20_59
import com.awesomeapp.setting.Activity20_60
import com.awesomeapp.setting.Model20_62
import com.awesomeapp.setting.Activity20_63
import com.awesomeapp.setting.Model20_65
import com.awesomeapp.setting.Activity20_66
import com.awesomeapp.setting.Model20_68
import com.awesomeapp.setting.Activity20_69
import com.awesomeapp.setting.Model20_71
import com.awesomeapp.setting.Activity20_72
import com.awesomeapp.setting.Model20_74
import com.awesomeapp.setting.Activity20_75
import com.awesomeapp.setting.Model20_77
import com.awesomeapp.setting.Activity20_78

@Module
@InstallIn(SingletonComponent::class)
object Module_20 {
    @Provides
    @Singleton
    fun provideRepository20_5(): Repository20_5 {
        return Repository20_5()
    }

    @Provides
    @Singleton
    fun provideApi20_6(): Api20_6 {
        return Api20_6()
    }
}