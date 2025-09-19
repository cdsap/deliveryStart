package com.awesomeapp.newsidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.newsidentity.Viewmodel188_1
import com.awesomeapp.newsidentity.Activity188_2
import com.awesomeapp.newsidentity.Activity188_3
import com.awesomeapp.newsidentity.Fragment188_4
import com.awesomeapp.newsidentity.Repository188_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.newsidentity.Model188_8
import com.awesomeapp.newsidentity.Model188_9
import com.awesomeapp.newsidentity.Activity188_10
import com.awesomeapp.newsidentity.Model188_12
import com.awesomeapp.newsidentity.Activity188_13
import com.awesomeapp.newsidentity.Model188_15
import com.awesomeapp.newsidentity.Activity188_16
import com.awesomeapp.newsidentity.Model188_18
import com.awesomeapp.newsidentity.Activity188_19

@Module
@InstallIn(SingletonComponent::class)
object Module_188 {
    @Provides
    @Singleton
    fun provideRepository188_5(
        api0: Api132_6 = Api132_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api136_6 = Api136_6(),
        api4: Api92_6 = Api92_6(),
        api5: Api112_6 = Api112_6(),
        api6: Api120_6 = Api120_6()
    ): Repository188_5 {
        return Repository188_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi188_6(): Api188_6 {
        return Api188_6()
    }
}