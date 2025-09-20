package com.awesomeapp.timerfeed.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timerfeed.Viewmodel424_1
import com.awesomeapp.timerfeed.Activity424_2
import com.awesomeapp.timerfeed.Activity424_3
import com.awesomeapp.timerfeed.Fragment424_4
import com.awesomeapp.timerfeed.Repository424_5
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.timerfeed.Api424_6
import com.awesomeapp.timerfeed.Model424_8
import com.awesomeapp.timerfeed.Model424_9
import com.awesomeapp.timerfeed.Activity424_10
import com.awesomeapp.timerfeed.Model424_12
import com.awesomeapp.timerfeed.Activity424_13
import com.awesomeapp.timerfeed.Model424_15
import com.awesomeapp.timerfeed.Activity424_16
import com.awesomeapp.timerfeed.Model424_18
import com.awesomeapp.timerfeed.Activity424_19
import com.awesomeapp.timerfeed.Model424_21
import com.awesomeapp.timerfeed.Activity424_22
import com.awesomeapp.timerfeed.Model424_24
import com.awesomeapp.timerfeed.Activity424_25
import com.awesomeapp.timerfeed.Model424_27
import com.awesomeapp.timerfeed.Activity424_28
import com.awesomeapp.timerfeed.Model424_30
import com.awesomeapp.timerfeed.Activity424_31
import com.awesomeapp.timerfeed.Model424_33
import com.awesomeapp.timerfeed.Activity424_34
import com.awesomeapp.timerfeed.Model424_36
import com.awesomeapp.timerfeed.Activity424_37
import com.awesomeapp.timerfeed.Model424_39
import com.awesomeapp.timerfeed.Activity424_40
import com.awesomeapp.timerfeed.Model424_42
import com.awesomeapp.timerfeed.Activity424_43
import com.awesomeapp.timerfeed.Model424_45
import com.awesomeapp.timerfeed.Activity424_46
import com.awesomeapp.timerfeed.Model424_48
import com.awesomeapp.timerfeed.Activity424_49
import com.awesomeapp.timerfeed.Model424_51
import com.awesomeapp.timerfeed.Activity424_52
import com.awesomeapp.timerfeed.Model424_54
import com.awesomeapp.timerfeed.Activity424_55
import com.awesomeapp.timerfeed.Model424_57
import com.awesomeapp.timerfeed.Activity424_58
import com.awesomeapp.timerfeed.Model424_60
import com.awesomeapp.timerfeed.Activity424_61
import com.awesomeapp.timerfeed.Model424_63
import com.awesomeapp.timerfeed.Activity424_64
import com.awesomeapp.timerfeed.Model424_66
import com.awesomeapp.timerfeed.Activity424_67
import com.awesomeapp.timerfeed.Model424_69
import com.awesomeapp.timerfeed.Activity424_70
import com.awesomeapp.timerfeed.Model424_72
import com.awesomeapp.timerfeed.Activity424_73
import com.awesomeapp.timerfeed.Model424_75
import com.awesomeapp.timerfeed.Activity424_76
import com.awesomeapp.timerfeed.Model424_78
import com.awesomeapp.timerfeed.Activity424_79
import com.awesomeapp.timerfeed.Model424_81
import com.awesomeapp.timerfeed.Activity424_82
import com.awesomeapp.timerfeed.Model424_84
import com.awesomeapp.timerfeed.Activity424_85
import com.awesomeapp.timerfeed.Model424_87
import com.awesomeapp.timerfeed.Activity424_88
import com.awesomeapp.timerfeed.Model424_90
import com.awesomeapp.timerfeed.Activity424_91

@Module
@InstallIn(SingletonComponent::class)
object Module_424 {
    @Provides
    @Singleton
    fun provideRepository424_5(
        api0: Api292_6 = Api292_6(),
        api1: Api160_6 = Api160_6(),
        api2: Api184_6 = Api184_6(),
        api3: Api240_6 = Api240_6()
    ): Repository424_5 {
        return Repository424_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi424_6(): Api424_6 {
        return Api424_6()
    }
}