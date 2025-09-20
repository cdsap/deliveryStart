package com.awesomeapp.reportfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.reportfeed.Viewmodel416_1
import com.awesomeapp.reportfeed.Activity416_2
import com.awesomeapp.reportfeed.Activity416_3
import com.awesomeapp.reportfeed.Fragment416_4
import com.awesomeapp.reportfeed.Repository416_5
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.reportfeed.Api416_6
import com.awesomeapp.reportfeed.Model416_8
import com.awesomeapp.reportfeed.Model416_9
import com.awesomeapp.reportfeed.Activity416_10

@Module
@InstallIn(SingletonComponent::class)
object Module_416 {
    @Provides
    @Singleton
    fun provideRepository416_5(
        api0: Api252_6 = Api252_6(),
        api1: Api276_6 = Api276_6(),
        api2: Api320_6 = Api320_6(),
        api3: Api244_6 = Api244_6(),
        api4: Api228_6 = Api228_6(),
        api5: Api324_6 = Api324_6(),
        api6: Api240_6 = Api240_6()
    ): Repository416_5 {
        return Repository416_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi416_6(): Api416_6 {
        return Api416_6()
    }
}