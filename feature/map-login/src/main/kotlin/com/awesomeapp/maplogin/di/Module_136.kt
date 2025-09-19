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
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.search.Api12_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.maplogin.Model136_8
import com.awesomeapp.maplogin.Model136_9
import com.awesomeapp.maplogin.Activity136_10
import com.awesomeapp.maplogin.Model136_12
import com.awesomeapp.maplogin.Activity136_13
import com.awesomeapp.maplogin.Model136_15
import com.awesomeapp.maplogin.Activity136_16

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api36_6 = Api36_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api12_6 = Api12_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}