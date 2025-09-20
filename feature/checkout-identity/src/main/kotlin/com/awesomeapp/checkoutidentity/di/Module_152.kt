package com.awesomeapp.checkoutidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutidentity.Viewmodel152_1
import com.awesomeapp.checkoutidentity.Activity152_2
import com.awesomeapp.checkoutidentity.Activity152_3
import com.awesomeapp.checkoutidentity.Fragment152_4
import com.awesomeapp.checkoutidentity.Repository152_5
import com.awesomeapp.report.Api24_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.checkoutidentity.Api152_6
import com.awesomeapp.checkoutidentity.Model152_8
import com.awesomeapp.checkoutidentity.Model152_9
import com.awesomeapp.checkoutidentity.Activity152_10
import com.awesomeapp.checkoutidentity.Model152_12
import com.awesomeapp.checkoutidentity.Activity152_13
import com.awesomeapp.checkoutidentity.Model152_15
import com.awesomeapp.checkoutidentity.Activity152_16
import com.awesomeapp.checkoutidentity.Model152_18
import com.awesomeapp.checkoutidentity.Activity152_19
import com.awesomeapp.checkoutidentity.Model152_21
import com.awesomeapp.checkoutidentity.Activity152_22
import com.awesomeapp.checkoutidentity.Model152_24
import com.awesomeapp.checkoutidentity.Activity152_25
import com.awesomeapp.checkoutidentity.Model152_27
import com.awesomeapp.checkoutidentity.Activity152_28
import com.awesomeapp.checkoutidentity.Model152_30
import com.awesomeapp.checkoutidentity.Activity152_31
import com.awesomeapp.checkoutidentity.Model152_33
import com.awesomeapp.checkoutidentity.Activity152_34
import com.awesomeapp.checkoutidentity.Model152_36
import com.awesomeapp.checkoutidentity.Activity152_37
import com.awesomeapp.checkoutidentity.Model152_39
import com.awesomeapp.checkoutidentity.Activity152_40
import com.awesomeapp.checkoutidentity.Model152_42
import com.awesomeapp.checkoutidentity.Activity152_43
import com.awesomeapp.checkoutidentity.Model152_45
import com.awesomeapp.checkoutidentity.Activity152_46
import com.awesomeapp.checkoutidentity.Model152_48
import com.awesomeapp.checkoutidentity.Activity152_49
import com.awesomeapp.checkoutidentity.Model152_51
import com.awesomeapp.checkoutidentity.Activity152_52
import com.awesomeapp.checkoutidentity.Model152_54
import com.awesomeapp.checkoutidentity.Activity152_55
import com.awesomeapp.checkoutidentity.Model152_57
import com.awesomeapp.checkoutidentity.Activity152_58
import com.awesomeapp.checkoutidentity.Model152_60
import com.awesomeapp.checkoutidentity.Activity152_61
import com.awesomeapp.checkoutidentity.Model152_63
import com.awesomeapp.checkoutidentity.Activity152_64
import com.awesomeapp.checkoutidentity.Model152_66
import com.awesomeapp.checkoutidentity.Activity152_67
import com.awesomeapp.checkoutidentity.Model152_69
import com.awesomeapp.checkoutidentity.Activity152_70
import com.awesomeapp.checkoutidentity.Model152_72
import com.awesomeapp.checkoutidentity.Activity152_73
import com.awesomeapp.checkoutidentity.Model152_75
import com.awesomeapp.checkoutidentity.Activity152_76
import com.awesomeapp.checkoutidentity.Model152_78
import com.awesomeapp.checkoutidentity.Activity152_79

@Module
@InstallIn(SingletonComponent::class)
object Module_152 {
    @Provides
    @Singleton
    fun provideRepository152_5(
        api0: Api24_6 = Api24_6(),
        api1: Api64_6 = Api64_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api80_6 = Api80_6(),
        api4: Api104_6 = Api104_6(),
        api5: Api52_6 = Api52_6()
    ): Repository152_5 {
        return Repository152_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi152_6(): Api152_6 {
        return Api152_6()
    }
}