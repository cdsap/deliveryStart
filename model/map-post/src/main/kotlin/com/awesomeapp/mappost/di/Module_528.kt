package com.awesomeapp.mappost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mappost.Viewmodel528_1
import com.awesomeapp.mappost.Activity528_2
import com.awesomeapp.mappost.Activity528_3
import com.awesomeapp.mappost.Fragment528_4
import com.awesomeapp.mappost.Repository528_5
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.logprofile.Api368_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.videofeed.Api436_6
import com.awesomeapp.taskfeed.Api420_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.mappost.Api528_6
import com.awesomeapp.mappost.Usecase528_7
import com.awesomeapp.mappost.Model528_9
import com.awesomeapp.mappost.Model528_10
import com.awesomeapp.mappost.Activity528_11
import com.awesomeapp.mappost.Model528_13
import com.awesomeapp.mappost.Activity528_14

@Module
@InstallIn(SingletonComponent::class)
object Module_528 {
    @Provides
    @Singleton
    fun provideRepository528_5(
        api0: Api348_6 = Api348_6(),
        api1: Api368_6 = Api368_6(),
        api2: Api384_6 = Api384_6(),
        api3: Api412_6 = Api412_6(),
        api4: Api436_6 = Api436_6(),
        api5: Api420_6 = Api420_6(),
        api6: Api336_6 = Api336_6()
    ): Repository528_5 {
        return Repository528_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi528_6(): Api528_6 {
        return Api528_6()
    }
}