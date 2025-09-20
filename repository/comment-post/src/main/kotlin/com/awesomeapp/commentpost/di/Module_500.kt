package com.awesomeapp.commentpost.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentpost.Viewmodel500_1
import com.awesomeapp.commentpost.Activity500_2
import com.awesomeapp.commentpost.Activity500_3
import com.awesomeapp.commentpost.Fragment500_4
import com.awesomeapp.commentpost.Repository500_5
import com.awesomeapp.searchfeed.Api404_6
import com.awesomeapp.newsprofile.Api384_6
import com.awesomeapp.todofeed.Api428_6
import com.awesomeapp.photoprofile.Api388_6
import com.awesomeapp.commentpost.Api500_6
import com.awesomeapp.commentpost.Service500_7
import com.awesomeapp.commentpost.Worker500_8
import com.awesomeapp.commentpost.Model500_10
import com.awesomeapp.commentpost.Model500_11
import com.awesomeapp.commentpost.Activity500_12
import com.awesomeapp.commentpost.Model500_14
import com.awesomeapp.commentpost.Activity500_15
import com.awesomeapp.commentpost.Model500_17
import com.awesomeapp.commentpost.Activity500_18
import com.awesomeapp.commentpost.Model500_20
import com.awesomeapp.commentpost.Activity500_21
import com.awesomeapp.commentpost.Model500_23
import com.awesomeapp.commentpost.Activity500_24
import com.awesomeapp.commentpost.Model500_26
import com.awesomeapp.commentpost.Activity500_27
import com.awesomeapp.commentpost.Model500_29
import com.awesomeapp.commentpost.Activity500_30
import com.awesomeapp.commentpost.Model500_32
import com.awesomeapp.commentpost.Activity500_33
import com.awesomeapp.commentpost.Model500_35
import com.awesomeapp.commentpost.Activity500_36
import com.awesomeapp.commentpost.Model500_38
import com.awesomeapp.commentpost.Activity500_39
import com.awesomeapp.commentpost.Model500_41
import com.awesomeapp.commentpost.Activity500_42
import com.awesomeapp.commentpost.Model500_44
import com.awesomeapp.commentpost.Activity500_45
import com.awesomeapp.commentpost.Model500_47
import com.awesomeapp.commentpost.Activity500_48
import com.awesomeapp.commentpost.Model500_50
import com.awesomeapp.commentpost.Activity500_51
import com.awesomeapp.commentpost.Model500_53
import com.awesomeapp.commentpost.Activity500_54
import com.awesomeapp.commentpost.Model500_56
import com.awesomeapp.commentpost.Activity500_57
import com.awesomeapp.commentpost.Model500_59
import com.awesomeapp.commentpost.Activity500_60
import com.awesomeapp.commentpost.Model500_62
import com.awesomeapp.commentpost.Activity500_63
import com.awesomeapp.commentpost.Model500_65
import com.awesomeapp.commentpost.Activity500_66
import com.awesomeapp.commentpost.Model500_68
import com.awesomeapp.commentpost.Activity500_69
import com.awesomeapp.commentpost.Model500_71
import com.awesomeapp.commentpost.Activity500_72
import com.awesomeapp.commentpost.Model500_74
import com.awesomeapp.commentpost.Activity500_75
import com.awesomeapp.commentpost.Model500_77
import com.awesomeapp.commentpost.Activity500_78
import com.awesomeapp.commentpost.Model500_80
import com.awesomeapp.commentpost.Activity500_81
import com.awesomeapp.commentpost.Model500_83
import com.awesomeapp.commentpost.Activity500_84
import com.awesomeapp.commentpost.Model500_86
import com.awesomeapp.commentpost.Activity500_87
import com.awesomeapp.commentpost.Model500_89
import com.awesomeapp.commentpost.Activity500_90
import com.awesomeapp.commentpost.Model500_92
import com.awesomeapp.commentpost.Activity500_93
import com.awesomeapp.commentpost.Model500_95
import com.awesomeapp.commentpost.Activity500_96
import com.awesomeapp.commentpost.Model500_98
import com.awesomeapp.commentpost.Activity500_99
import com.awesomeapp.commentpost.Model500_101
import com.awesomeapp.commentpost.Activity500_102
import com.awesomeapp.commentpost.Model500_104

@Module
@InstallIn(SingletonComponent::class)
object Module_500 {
    @Provides
    @Singleton
    fun provideRepository500_5(
        api0: Api404_6 = Api404_6(),
        api1: Api384_6 = Api384_6(),
        api2: Api428_6 = Api428_6(),
        api3: Api388_6 = Api388_6()
    ): Repository500_5 {
        return Repository500_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi500_6(): Api500_6 {
        return Api500_6()
    }
}