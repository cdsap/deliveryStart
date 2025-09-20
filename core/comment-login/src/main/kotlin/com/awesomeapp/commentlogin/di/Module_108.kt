package com.awesomeapp.commentlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentlogin.Viewmodel108_1
import com.awesomeapp.commentlogin.Activity108_2
import com.awesomeapp.commentlogin.Activity108_3
import com.awesomeapp.commentlogin.Fragment108_4
import com.awesomeapp.commentlogin.Repository108_5
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.commentlogin.Usecase108_7
import com.awesomeapp.commentlogin.Model108_9
import com.awesomeapp.commentlogin.Model108_10
import com.awesomeapp.commentlogin.Activity108_11
import com.awesomeapp.commentlogin.Model108_13
import com.awesomeapp.commentlogin.Activity108_14
import com.awesomeapp.commentlogin.Model108_16
import com.awesomeapp.commentlogin.Activity108_17
import com.awesomeapp.commentlogin.Model108_19
import com.awesomeapp.commentlogin.Activity108_20
import com.awesomeapp.commentlogin.Model108_22
import com.awesomeapp.commentlogin.Activity108_23
import com.awesomeapp.commentlogin.Model108_25
import com.awesomeapp.commentlogin.Activity108_26
import com.awesomeapp.commentlogin.Model108_28
import com.awesomeapp.commentlogin.Activity108_29
import com.awesomeapp.commentlogin.Model108_31
import com.awesomeapp.commentlogin.Activity108_32
import com.awesomeapp.commentlogin.Model108_34
import com.awesomeapp.commentlogin.Activity108_35
import com.awesomeapp.commentlogin.Model108_37
import com.awesomeapp.commentlogin.Activity108_38
import com.awesomeapp.commentlogin.Model108_40
import com.awesomeapp.commentlogin.Activity108_41
import com.awesomeapp.commentlogin.Model108_43
import com.awesomeapp.commentlogin.Activity108_44
import com.awesomeapp.commentlogin.Model108_46
import com.awesomeapp.commentlogin.Activity108_47
import com.awesomeapp.commentlogin.Model108_49
import com.awesomeapp.commentlogin.Activity108_50
import com.awesomeapp.commentlogin.Model108_52
import com.awesomeapp.commentlogin.Activity108_53
import com.awesomeapp.commentlogin.Model108_55
import com.awesomeapp.commentlogin.Activity108_56
import com.awesomeapp.commentlogin.Model108_58
import com.awesomeapp.commentlogin.Activity108_59

@Module
@InstallIn(SingletonComponent::class)
object Module_108 {
    @Provides
    @Singleton
    fun provideRepository108_5(): Repository108_5 {
        return Repository108_5()
    }

    @Provides
    @Singleton
    fun provideApi108_6(): Api108_6 {
        return Api108_6()
    }
}