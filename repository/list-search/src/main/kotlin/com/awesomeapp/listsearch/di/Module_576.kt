package com.awesomeapp.listsearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.listsearch.Viewmodel576_1
import com.awesomeapp.listsearch.Activity576_2
import com.awesomeapp.listsearch.Activity576_3
import com.awesomeapp.listsearch.Fragment576_4
import com.awesomeapp.listsearch.Repository576_5
import com.awesomeapp.playlistprofile.Api392_6
import com.awesomeapp.logincomment.Api444_6
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.checkoutprofile.Api348_6
import com.awesomeapp.articleuser.Api336_6
import com.awesomeapp.settingfeed.Api412_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.statususer.Api320_6
import com.awesomeapp.eventuser.Api324_6
import com.awesomeapp.listsearch.Api576_6
import com.awesomeapp.listsearch.Usecase576_7
import com.awesomeapp.listsearch.Model576_9
import com.awesomeapp.listsearch.Model576_10
import com.awesomeapp.listsearch.Activity576_11

@Module
@InstallIn(SingletonComponent::class)
object Module_576 {
    @Provides
    @Singleton
    fun provideRepository576_5(
        api0: Api392_6 = Api392_6(),
        api1: Api444_6 = Api444_6(),
        api2: Api408_6 = Api408_6(),
        api3: Api348_6 = Api348_6(),
        api4: Api336_6 = Api336_6(),
        api5: Api412_6 = Api412_6(),
        api6: Api308_6 = Api308_6(),
        api7: Api320_6 = Api320_6(),
        api8: Api324_6 = Api324_6()
    ): Repository576_5 {
        return Repository576_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi576_6(): Api576_6 {
        return Api576_6()
    }
}