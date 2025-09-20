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
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.analyticscontact.Api72_6
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

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api32_6 = Api32_6(),
        api1: Api72_6 = Api72_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}