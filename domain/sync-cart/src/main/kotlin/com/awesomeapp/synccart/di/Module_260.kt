package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.accountidentity.Api168_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.gallerylogin.Api144_6
import com.awesomeapp.feedidentity.Api156_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.synccart.Service260_7
import com.awesomeapp.synccart.Worker260_8
import com.awesomeapp.synccart.Model260_10
import com.awesomeapp.synccart.Model260_11
import com.awesomeapp.synccart.Activity260_12
import com.awesomeapp.synccart.Model260_14
import com.awesomeapp.synccart.Activity260_15
import com.awesomeapp.synccart.Model260_17
import com.awesomeapp.synccart.Activity260_18
import com.awesomeapp.synccart.Model260_20
import com.awesomeapp.synccart.Activity260_21
import com.awesomeapp.synccart.Model260_23
import com.awesomeapp.synccart.Activity260_24
import com.awesomeapp.synccart.Model260_26
import com.awesomeapp.synccart.Activity260_27
import com.awesomeapp.synccart.Model260_29
import com.awesomeapp.synccart.Activity260_30
import com.awesomeapp.synccart.Model260_32
import com.awesomeapp.synccart.Activity260_33
import com.awesomeapp.synccart.Model260_35
import com.awesomeapp.synccart.Activity260_36
import com.awesomeapp.synccart.Model260_38
import com.awesomeapp.synccart.Activity260_39
import com.awesomeapp.synccart.Model260_41
import com.awesomeapp.synccart.Activity260_42
import com.awesomeapp.synccart.Model260_44
import com.awesomeapp.synccart.Activity260_45
import com.awesomeapp.synccart.Model260_47
import com.awesomeapp.synccart.Activity260_48
import com.awesomeapp.synccart.Model260_50
import com.awesomeapp.synccart.Activity260_51
import com.awesomeapp.synccart.Model260_53
import com.awesomeapp.synccart.Activity260_54
import com.awesomeapp.synccart.Model260_56
import com.awesomeapp.synccart.Activity260_57

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api180_6 = Api180_6(),
        api1: Api168_6 = Api168_6(),
        api2: Api136_6 = Api136_6(),
        api3: Api172_6 = Api172_6(),
        api4: Api144_6 = Api144_6(),
        api5: Api156_6 = Api156_6(),
        api6: Api116_6 = Api116_6(),
        api7: Api152_6 = Api152_6(),
        api8: Api124_6 = Api124_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
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
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}