package com.awesomeapp.photoprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.photoprofile.Viewmodel388_1
import com.awesomeapp.photoprofile.Activity388_2
import com.awesomeapp.photoprofile.Activity388_3
import com.awesomeapp.photoprofile.Fragment388_4
import com.awesomeapp.photoprofile.Repository388_5
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.photoprofile.Model388_8
import com.awesomeapp.photoprofile.Model388_9
import com.awesomeapp.photoprofile.Activity388_10
import com.awesomeapp.photoprofile.Model388_12
import com.awesomeapp.photoprofile.Activity388_13
import com.awesomeapp.photoprofile.Model388_15
import com.awesomeapp.photoprofile.Activity388_16
import com.awesomeapp.photoprofile.Model388_18
import com.awesomeapp.photoprofile.Activity388_19
import com.awesomeapp.photoprofile.Model388_21
import com.awesomeapp.photoprofile.Activity388_22
import com.awesomeapp.photoprofile.Model388_24
import com.awesomeapp.photoprofile.Activity388_25
import com.awesomeapp.photoprofile.Model388_27
import com.awesomeapp.photoprofile.Activity388_28
import com.awesomeapp.photoprofile.Model388_30
import com.awesomeapp.photoprofile.Activity388_31
import com.awesomeapp.photoprofile.Model388_33
import com.awesomeapp.photoprofile.Activity388_34
import com.awesomeapp.photoprofile.Model388_36
import com.awesomeapp.photoprofile.Activity388_37
import com.awesomeapp.photoprofile.Model388_39
import com.awesomeapp.photoprofile.Activity388_40
import com.awesomeapp.photoprofile.Model388_42
import com.awesomeapp.photoprofile.Activity388_43
import com.awesomeapp.photoprofile.Model388_45
import com.awesomeapp.photoprofile.Activity388_46
import com.awesomeapp.photoprofile.Model388_48
import com.awesomeapp.photoprofile.Activity388_49
import com.awesomeapp.photoprofile.Model388_51
import com.awesomeapp.photoprofile.Activity388_52

@Module
@InstallIn(SingletonComponent::class)
object Module_388 {
    @Provides
    @Singleton
    fun provideRepository388_5(
        api0: Api236_6 = Api236_6(),
        api1: Api308_6 = Api308_6(),
        api2: Api248_6 = Api248_6(),
        api3: Api228_6 = Api228_6(),
        api4: Api276_6 = Api276_6(),
        api5: Api292_6 = Api292_6(),
        api6: Api232_6 = Api232_6()
    ): Repository388_5 {
        return Repository388_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi388_6(): Api388_6 {
        return Api388_6()
    }
}