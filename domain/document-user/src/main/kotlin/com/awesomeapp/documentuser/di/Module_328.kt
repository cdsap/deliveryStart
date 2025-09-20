package com.awesomeapp.documentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentuser.Viewmodel328_1
import com.awesomeapp.documentuser.Activity328_2
import com.awesomeapp.documentuser.Activity328_3
import com.awesomeapp.documentuser.Fragment328_4
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.documentuser.Api328_6
import com.awesomeapp.documentuser.Model328_8
import com.awesomeapp.documentuser.Model328_9
import com.awesomeapp.documentuser.Activity328_10
import com.awesomeapp.documentuser.Model328_12
import com.awesomeapp.documentuser.Activity328_13
import com.awesomeapp.documentuser.Model328_15
import com.awesomeapp.documentuser.Activity328_16
import com.awesomeapp.documentuser.Model328_18
import com.awesomeapp.documentuser.Activity328_19
import com.awesomeapp.documentuser.Model328_21
import com.awesomeapp.documentuser.Activity328_22
import com.awesomeapp.documentuser.Model328_24
import com.awesomeapp.documentuser.Activity328_25
import com.awesomeapp.documentuser.Model328_27
import com.awesomeapp.documentuser.Activity328_28
import com.awesomeapp.documentuser.Model328_30
import com.awesomeapp.documentuser.Activity328_31
import com.awesomeapp.documentuser.Model328_33
import com.awesomeapp.documentuser.Activity328_34
import com.awesomeapp.documentuser.Model328_36
import com.awesomeapp.documentuser.Activity328_37
import com.awesomeapp.documentuser.Model328_39
import com.awesomeapp.documentuser.Activity328_40
import com.awesomeapp.documentuser.Model328_42
import com.awesomeapp.documentuser.Activity328_43
import com.awesomeapp.documentuser.Model328_45
import com.awesomeapp.documentuser.Activity328_46
import com.awesomeapp.documentuser.Model328_48
import com.awesomeapp.documentuser.Activity328_49
import com.awesomeapp.documentuser.Model328_51
import com.awesomeapp.documentuser.Activity328_52
import com.awesomeapp.documentuser.Model328_54
import com.awesomeapp.documentuser.Activity328_55
import com.awesomeapp.documentuser.Model328_57
import com.awesomeapp.documentuser.Activity328_58
import com.awesomeapp.documentuser.Model328_60
import com.awesomeapp.documentuser.Activity328_61
import com.awesomeapp.documentuser.Model328_63
import com.awesomeapp.documentuser.Activity328_64
import com.awesomeapp.documentuser.Model328_66
import com.awesomeapp.documentuser.Activity328_67
import com.awesomeapp.documentuser.Model328_69
import com.awesomeapp.documentuser.Activity328_70
import com.awesomeapp.documentuser.Model328_72
import com.awesomeapp.documentuser.Activity328_73

@Module
@InstallIn(SingletonComponent::class)
object Module_328 {
    @Provides
    @Singleton
    fun provideRepository328_5(): Repository328_5 {
        return Repository328_5()
    }

    @Provides
    @Singleton
    fun provideApi328_6(): Api328_6 {
        return Api328_6()
    }
}