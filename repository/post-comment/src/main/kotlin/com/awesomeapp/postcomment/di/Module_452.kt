package com.awesomeapp.postcomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.postcomment.Viewmodel452_1
import com.awesomeapp.postcomment.Activity452_2
import com.awesomeapp.postcomment.Activity452_3
import com.awesomeapp.postcomment.Fragment452_4
import com.awesomeapp.postcomment.Repository452_5
import com.awesomeapp.listprofile.Api380_6
import com.awesomeapp.accountprofile.Api364_6
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.postcomment.Model452_8
import com.awesomeapp.postcomment.Model452_9
import com.awesomeapp.postcomment.Activity452_10
import com.awesomeapp.postcomment.Model452_12
import com.awesomeapp.postcomment.Activity452_13
import com.awesomeapp.postcomment.Model452_15
import com.awesomeapp.postcomment.Activity452_16
import com.awesomeapp.postcomment.Model452_18
import com.awesomeapp.postcomment.Activity452_19
import com.awesomeapp.postcomment.Model452_21
import com.awesomeapp.postcomment.Activity452_22
import com.awesomeapp.postcomment.Model452_24
import com.awesomeapp.postcomment.Activity452_25
import com.awesomeapp.postcomment.Model452_27
import com.awesomeapp.postcomment.Activity452_28
import com.awesomeapp.postcomment.Model452_30
import com.awesomeapp.postcomment.Activity452_31
import com.awesomeapp.postcomment.Model452_33
import com.awesomeapp.postcomment.Activity452_34
import com.awesomeapp.postcomment.Model452_36
import com.awesomeapp.postcomment.Activity452_37
import com.awesomeapp.postcomment.Model452_39
import com.awesomeapp.postcomment.Activity452_40
import com.awesomeapp.postcomment.Model452_42
import com.awesomeapp.postcomment.Activity452_43
import com.awesomeapp.postcomment.Model452_45
import com.awesomeapp.postcomment.Activity452_46
import com.awesomeapp.postcomment.Model452_48
import com.awesomeapp.postcomment.Activity452_49
import com.awesomeapp.postcomment.Model452_51
import com.awesomeapp.postcomment.Activity452_52
import com.awesomeapp.postcomment.Model452_54
import com.awesomeapp.postcomment.Activity452_55
import com.awesomeapp.postcomment.Model452_57
import com.awesomeapp.postcomment.Activity452_58
import com.awesomeapp.postcomment.Model452_60
import com.awesomeapp.postcomment.Activity452_61
import com.awesomeapp.postcomment.Model452_63
import com.awesomeapp.postcomment.Activity452_64
import com.awesomeapp.postcomment.Model452_66
import com.awesomeapp.postcomment.Activity452_67
import com.awesomeapp.postcomment.Model452_69
import com.awesomeapp.postcomment.Activity452_70
import com.awesomeapp.postcomment.Model452_72
import com.awesomeapp.postcomment.Activity452_73
import com.awesomeapp.postcomment.Model452_75
import com.awesomeapp.postcomment.Activity452_76
import com.awesomeapp.postcomment.Model452_78
import com.awesomeapp.postcomment.Activity452_79
import com.awesomeapp.postcomment.Model452_81
import com.awesomeapp.postcomment.Activity452_82
import com.awesomeapp.postcomment.Model452_84
import com.awesomeapp.postcomment.Activity452_85
import com.awesomeapp.postcomment.Model452_87
import com.awesomeapp.postcomment.Activity452_88
import com.awesomeapp.postcomment.Model452_90
import com.awesomeapp.postcomment.Activity452_91
import com.awesomeapp.postcomment.Model452_93
import com.awesomeapp.postcomment.Activity452_94

@Module
@InstallIn(SingletonComponent::class)
object Module_452 {
    @Provides
    @Singleton
    fun provideRepository452_5(
        api0: Api380_6 = Api380_6(),
        api1: Api364_6 = Api364_6()
    ): Repository452_5 {
        return Repository452_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi452_6(): Api452_6 {
        return Api452_6()
    }
}