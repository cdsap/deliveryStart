package com.awesomeapp.eventlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventlogin.Viewmodel128_1
import com.awesomeapp.eventlogin.Activity128_2
import com.awesomeapp.eventlogin.Activity128_3
import com.awesomeapp.eventlogin.Fragment128_4
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.eventlogin.Model128_8
import com.awesomeapp.eventlogin.Model128_9
import com.awesomeapp.eventlogin.Activity128_10
import com.awesomeapp.eventlogin.Model128_12
import com.awesomeapp.eventlogin.Activity128_13
import com.awesomeapp.eventlogin.Model128_15
import com.awesomeapp.eventlogin.Activity128_16
import com.awesomeapp.eventlogin.Model128_18
import com.awesomeapp.eventlogin.Activity128_19
import com.awesomeapp.eventlogin.Model128_21
import com.awesomeapp.eventlogin.Activity128_22
import com.awesomeapp.eventlogin.Model128_24
import com.awesomeapp.eventlogin.Activity128_25
import com.awesomeapp.eventlogin.Model128_27
import com.awesomeapp.eventlogin.Activity128_28
import com.awesomeapp.eventlogin.Model128_30
import com.awesomeapp.eventlogin.Activity128_31
import com.awesomeapp.eventlogin.Model128_33
import com.awesomeapp.eventlogin.Activity128_34
import com.awesomeapp.eventlogin.Model128_36
import com.awesomeapp.eventlogin.Activity128_37
import com.awesomeapp.eventlogin.Model128_39
import com.awesomeapp.eventlogin.Activity128_40
import com.awesomeapp.eventlogin.Model128_42
import com.awesomeapp.eventlogin.Activity128_43
import com.awesomeapp.eventlogin.Model128_45
import com.awesomeapp.eventlogin.Activity128_46
import com.awesomeapp.eventlogin.Model128_48
import com.awesomeapp.eventlogin.Activity128_49
import com.awesomeapp.eventlogin.Model128_51
import com.awesomeapp.eventlogin.Activity128_52
import com.awesomeapp.eventlogin.Model128_54
import com.awesomeapp.eventlogin.Activity128_55
import com.awesomeapp.eventlogin.Model128_57
import com.awesomeapp.eventlogin.Activity128_58
import com.awesomeapp.eventlogin.Model128_60
import com.awesomeapp.eventlogin.Activity128_61
import com.awesomeapp.eventlogin.Model128_63
import com.awesomeapp.eventlogin.Activity128_64
import com.awesomeapp.eventlogin.Model128_66
import com.awesomeapp.eventlogin.Activity128_67

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(): Repository128_5 {
        return Repository128_5()
    }

    @Provides
    @Singleton
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}