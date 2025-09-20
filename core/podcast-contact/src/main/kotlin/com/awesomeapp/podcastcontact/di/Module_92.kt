package com.awesomeapp.podcastcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcontact.Viewmodel92_1
import com.awesomeapp.podcastcontact.Activity92_2
import com.awesomeapp.podcastcontact.Activity92_3
import com.awesomeapp.podcastcontact.Fragment92_4
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.podcastcontact.Model92_8
import com.awesomeapp.podcastcontact.Model92_9
import com.awesomeapp.podcastcontact.Activity92_10
import com.awesomeapp.podcastcontact.Model92_12
import com.awesomeapp.podcastcontact.Activity92_13
import com.awesomeapp.podcastcontact.Model92_15
import com.awesomeapp.podcastcontact.Activity92_16
import com.awesomeapp.podcastcontact.Model92_18
import com.awesomeapp.podcastcontact.Activity92_19
import com.awesomeapp.podcastcontact.Model92_21
import com.awesomeapp.podcastcontact.Activity92_22
import com.awesomeapp.podcastcontact.Model92_24
import com.awesomeapp.podcastcontact.Activity92_25
import com.awesomeapp.podcastcontact.Model92_27
import com.awesomeapp.podcastcontact.Activity92_28
import com.awesomeapp.podcastcontact.Model92_30
import com.awesomeapp.podcastcontact.Activity92_31
import com.awesomeapp.podcastcontact.Model92_33
import com.awesomeapp.podcastcontact.Activity92_34
import com.awesomeapp.podcastcontact.Model92_36
import com.awesomeapp.podcastcontact.Activity92_37
import com.awesomeapp.podcastcontact.Model92_39
import com.awesomeapp.podcastcontact.Activity92_40
import com.awesomeapp.podcastcontact.Model92_42
import com.awesomeapp.podcastcontact.Activity92_43
import com.awesomeapp.podcastcontact.Model92_45
import com.awesomeapp.podcastcontact.Activity92_46
import com.awesomeapp.podcastcontact.Model92_48
import com.awesomeapp.podcastcontact.Activity92_49
import com.awesomeapp.podcastcontact.Model92_51
import com.awesomeapp.podcastcontact.Activity92_52

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(): Repository92_5 {
        return Repository92_5()
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}