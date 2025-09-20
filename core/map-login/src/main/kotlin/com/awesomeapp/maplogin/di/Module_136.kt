package com.awesomeapp.maplogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.maplogin.Viewmodel136_1
import com.awesomeapp.maplogin.Activity136_2
import com.awesomeapp.maplogin.Activity136_3
import com.awesomeapp.maplogin.Fragment136_4
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.maplogin.Model136_8
import com.awesomeapp.maplogin.Model136_9
import com.awesomeapp.maplogin.Activity136_10
import com.awesomeapp.maplogin.Model136_12
import com.awesomeapp.maplogin.Activity136_13
import com.awesomeapp.maplogin.Model136_15
import com.awesomeapp.maplogin.Activity136_16
import com.awesomeapp.maplogin.Model136_18
import com.awesomeapp.maplogin.Activity136_19
import com.awesomeapp.maplogin.Model136_21
import com.awesomeapp.maplogin.Activity136_22
import com.awesomeapp.maplogin.Model136_24
import com.awesomeapp.maplogin.Activity136_25
import com.awesomeapp.maplogin.Model136_27
import com.awesomeapp.maplogin.Activity136_28
import com.awesomeapp.maplogin.Model136_30
import com.awesomeapp.maplogin.Activity136_31
import com.awesomeapp.maplogin.Model136_33
import com.awesomeapp.maplogin.Activity136_34
import com.awesomeapp.maplogin.Model136_36
import com.awesomeapp.maplogin.Activity136_37
import com.awesomeapp.maplogin.Model136_39
import com.awesomeapp.maplogin.Activity136_40
import com.awesomeapp.maplogin.Model136_42
import com.awesomeapp.maplogin.Activity136_43
import com.awesomeapp.maplogin.Model136_45
import com.awesomeapp.maplogin.Activity136_46
import com.awesomeapp.maplogin.Model136_48
import com.awesomeapp.maplogin.Activity136_49
import com.awesomeapp.maplogin.Model136_51
import com.awesomeapp.maplogin.Activity136_52
import com.awesomeapp.maplogin.Model136_54
import com.awesomeapp.maplogin.Activity136_55
import com.awesomeapp.maplogin.Model136_57
import com.awesomeapp.maplogin.Activity136_58
import com.awesomeapp.maplogin.Model136_60
import com.awesomeapp.maplogin.Activity136_61
import com.awesomeapp.maplogin.Model136_63
import com.awesomeapp.maplogin.Activity136_64
import com.awesomeapp.maplogin.Model136_66
import com.awesomeapp.maplogin.Activity136_67
import com.awesomeapp.maplogin.Model136_69
import com.awesomeapp.maplogin.Activity136_70
import com.awesomeapp.maplogin.Model136_72
import com.awesomeapp.maplogin.Activity136_73
import com.awesomeapp.maplogin.Model136_75
import com.awesomeapp.maplogin.Activity136_76
import com.awesomeapp.maplogin.Model136_78
import com.awesomeapp.maplogin.Activity136_79
import com.awesomeapp.maplogin.Model136_81
import com.awesomeapp.maplogin.Activity136_82

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(): Repository136_5 {
        return Repository136_5()
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}