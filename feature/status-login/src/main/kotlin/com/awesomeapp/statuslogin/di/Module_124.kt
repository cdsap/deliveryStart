package com.awesomeapp.statuslogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statuslogin.Viewmodel124_1
import com.awesomeapp.statuslogin.Activity124_2
import com.awesomeapp.statuslogin.Activity124_3
import com.awesomeapp.statuslogin.Fragment124_4
import com.awesomeapp.statuslogin.Repository124_5
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.statuslogin.Model124_8
import com.awesomeapp.statuslogin.Model124_9
import com.awesomeapp.statuslogin.Activity124_10
import com.awesomeapp.statuslogin.Model124_12
import com.awesomeapp.statuslogin.Activity124_13
import com.awesomeapp.statuslogin.Model124_15
import com.awesomeapp.statuslogin.Activity124_16
import com.awesomeapp.statuslogin.Model124_18
import com.awesomeapp.statuslogin.Activity124_19
import com.awesomeapp.statuslogin.Model124_21
import com.awesomeapp.statuslogin.Activity124_22
import com.awesomeapp.statuslogin.Model124_24
import com.awesomeapp.statuslogin.Activity124_25
import com.awesomeapp.statuslogin.Model124_27
import com.awesomeapp.statuslogin.Activity124_28
import com.awesomeapp.statuslogin.Model124_30
import com.awesomeapp.statuslogin.Activity124_31
import com.awesomeapp.statuslogin.Model124_33
import com.awesomeapp.statuslogin.Activity124_34
import com.awesomeapp.statuslogin.Model124_36
import com.awesomeapp.statuslogin.Activity124_37
import com.awesomeapp.statuslogin.Model124_39
import com.awesomeapp.statuslogin.Activity124_40
import com.awesomeapp.statuslogin.Model124_42
import com.awesomeapp.statuslogin.Activity124_43
import com.awesomeapp.statuslogin.Model124_45
import com.awesomeapp.statuslogin.Activity124_46
import com.awesomeapp.statuslogin.Model124_48
import com.awesomeapp.statuslogin.Activity124_49
import com.awesomeapp.statuslogin.Model124_51
import com.awesomeapp.statuslogin.Activity124_52
import com.awesomeapp.statuslogin.Model124_54
import com.awesomeapp.statuslogin.Activity124_55

@Module
@InstallIn(SingletonComponent::class)
object Module_124 {
    @Provides
    @Singleton
    fun provideRepository124_5(
        api0: Api76_6 = Api76_6()
    ): Repository124_5 {
        return Repository124_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi124_6(): Api124_6 {
        return Api124_6()
    }
}