package com.awesomeapp.taskfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.taskfeed.Viewmodel420_1
import com.awesomeapp.taskfeed.Activity420_2
import com.awesomeapp.taskfeed.Activity420_3
import com.awesomeapp.taskfeed.Fragment420_4
import com.awesomeapp.taskfeed.Repository420_5
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.taskfeed.Service420_7
import com.awesomeapp.taskfeed.Worker420_8
import com.awesomeapp.taskfeed.Usecase420_9
import com.awesomeapp.taskfeed.Model420_11
import com.awesomeapp.taskfeed.Model420_12
import com.awesomeapp.taskfeed.Activity420_13
import com.awesomeapp.taskfeed.Model420_15
import com.awesomeapp.taskfeed.Activity420_16
import com.awesomeapp.taskfeed.Model420_18
import com.awesomeapp.taskfeed.Activity420_19
import com.awesomeapp.taskfeed.Model420_21
import com.awesomeapp.taskfeed.Activity420_22
import com.awesomeapp.taskfeed.Model420_24
import com.awesomeapp.taskfeed.Activity420_25
import com.awesomeapp.taskfeed.Model420_27
import com.awesomeapp.taskfeed.Activity420_28
import com.awesomeapp.taskfeed.Model420_30
import com.awesomeapp.taskfeed.Activity420_31
import com.awesomeapp.taskfeed.Model420_33
import com.awesomeapp.taskfeed.Activity420_34
import com.awesomeapp.taskfeed.Model420_36
import com.awesomeapp.taskfeed.Activity420_37
import com.awesomeapp.taskfeed.Model420_39
import com.awesomeapp.taskfeed.Activity420_40
import com.awesomeapp.taskfeed.Model420_42
import com.awesomeapp.taskfeed.Activity420_43
import com.awesomeapp.taskfeed.Model420_45
import com.awesomeapp.taskfeed.Activity420_46

@Module
@InstallIn(SingletonComponent::class)
object Module_420 {
    @Provides
    @Singleton
    fun provideRepository420_5(
        api0: Api260_6 = Api260_6()
    ): Repository420_5 {
        return Repository420_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi420_6(): Api420_6 {
        return Api420_6()
    }
}