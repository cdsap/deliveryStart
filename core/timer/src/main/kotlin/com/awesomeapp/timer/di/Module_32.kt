package com.awesomeapp.timer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timer.Viewmodel32_1
import com.awesomeapp.timer.Activity32_2
import com.awesomeapp.timer.Activity32_3
import com.awesomeapp.timer.Fragment32_4
import com.awesomeapp.timer.Repository32_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.timer.Model32_8
import com.awesomeapp.timer.Model32_9
import com.awesomeapp.timer.Activity32_10
import com.awesomeapp.timer.Model32_12
import com.awesomeapp.timer.Activity32_13
import com.awesomeapp.timer.Model32_15
import com.awesomeapp.timer.Activity32_16
import com.awesomeapp.timer.Model32_18
import com.awesomeapp.timer.Activity32_19
import com.awesomeapp.timer.Model32_21
import com.awesomeapp.timer.Activity32_22
import com.awesomeapp.timer.Model32_24
import com.awesomeapp.timer.Activity32_25
import com.awesomeapp.timer.Model32_27
import com.awesomeapp.timer.Activity32_28
import com.awesomeapp.timer.Model32_30
import com.awesomeapp.timer.Activity32_31
import com.awesomeapp.timer.Model32_33
import com.awesomeapp.timer.Activity32_34
import com.awesomeapp.timer.Model32_36
import com.awesomeapp.timer.Activity32_37
import com.awesomeapp.timer.Model32_39
import com.awesomeapp.timer.Activity32_40
import com.awesomeapp.timer.Model32_42
import com.awesomeapp.timer.Activity32_43
import com.awesomeapp.timer.Model32_45
import com.awesomeapp.timer.Activity32_46
import com.awesomeapp.timer.Model32_48
import com.awesomeapp.timer.Activity32_49
import com.awesomeapp.timer.Model32_51
import com.awesomeapp.timer.Activity32_52
import com.awesomeapp.timer.Model32_54
import com.awesomeapp.timer.Activity32_55
import com.awesomeapp.timer.Model32_57
import com.awesomeapp.timer.Activity32_58
import com.awesomeapp.timer.Model32_60
import com.awesomeapp.timer.Activity32_61

@Module
@InstallIn(SingletonComponent::class)
object Module_32 {
    @Provides
    @Singleton
    fun provideRepository32_5(): Repository32_5 {
        return Repository32_5()
    }

    @Provides
    @Singleton
    fun provideApi32_6(): Api32_6 {
        return Api32_6()
    }
}