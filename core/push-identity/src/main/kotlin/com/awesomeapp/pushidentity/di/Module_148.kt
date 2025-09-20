package com.awesomeapp.pushidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushidentity.Viewmodel148_1
import com.awesomeapp.pushidentity.Activity148_2
import com.awesomeapp.pushidentity.Activity148_3
import com.awesomeapp.pushidentity.Fragment148_4
import com.awesomeapp.pushidentity.Repository148_5
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.pushidentity.Model148_8
import com.awesomeapp.pushidentity.Model148_9
import com.awesomeapp.pushidentity.Activity148_10
import com.awesomeapp.pushidentity.Model148_12
import com.awesomeapp.pushidentity.Activity148_13
import com.awesomeapp.pushidentity.Model148_15
import com.awesomeapp.pushidentity.Activity148_16
import com.awesomeapp.pushidentity.Model148_18
import com.awesomeapp.pushidentity.Activity148_19
import com.awesomeapp.pushidentity.Model148_21
import com.awesomeapp.pushidentity.Activity148_22
import com.awesomeapp.pushidentity.Model148_24
import com.awesomeapp.pushidentity.Activity148_25
import com.awesomeapp.pushidentity.Model148_27
import com.awesomeapp.pushidentity.Activity148_28
import com.awesomeapp.pushidentity.Model148_30
import com.awesomeapp.pushidentity.Activity148_31
import com.awesomeapp.pushidentity.Model148_33
import com.awesomeapp.pushidentity.Activity148_34
import com.awesomeapp.pushidentity.Model148_36
import com.awesomeapp.pushidentity.Activity148_37
import com.awesomeapp.pushidentity.Model148_39
import com.awesomeapp.pushidentity.Activity148_40
import com.awesomeapp.pushidentity.Model148_42
import com.awesomeapp.pushidentity.Activity148_43
import com.awesomeapp.pushidentity.Model148_45
import com.awesomeapp.pushidentity.Activity148_46
import com.awesomeapp.pushidentity.Model148_48
import com.awesomeapp.pushidentity.Activity148_49
import com.awesomeapp.pushidentity.Model148_51
import com.awesomeapp.pushidentity.Activity148_52
import com.awesomeapp.pushidentity.Model148_54
import com.awesomeapp.pushidentity.Activity148_55
import com.awesomeapp.pushidentity.Model148_57
import com.awesomeapp.pushidentity.Activity148_58
import com.awesomeapp.pushidentity.Model148_60
import com.awesomeapp.pushidentity.Activity148_61
import com.awesomeapp.pushidentity.Model148_63
import com.awesomeapp.pushidentity.Activity148_64

@Module
@InstallIn(SingletonComponent::class)
object Module_148 {
    @Provides
    @Singleton
    fun provideRepository148_5(): Repository148_5 {
        return Repository148_5()
    }

    @Provides
    @Singleton
    fun provideApi148_6(): Api148_6 {
        return Api148_6()
    }
}