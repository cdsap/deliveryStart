package com.awesomeapp.articlelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlelogin.Viewmodel140_1
import com.awesomeapp.articlelogin.Activity140_2
import com.awesomeapp.articlelogin.Activity140_3
import com.awesomeapp.articlelogin.Fragment140_4
import com.awesomeapp.articlelogin.Repository140_5
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.articlelogin.Service140_7
import com.awesomeapp.articlelogin.Worker140_8
import com.awesomeapp.articlelogin.Model140_10
import com.awesomeapp.articlelogin.Model140_11
import com.awesomeapp.articlelogin.Activity140_12
import com.awesomeapp.articlelogin.Model140_14
import com.awesomeapp.articlelogin.Activity140_15
import com.awesomeapp.articlelogin.Model140_17
import com.awesomeapp.articlelogin.Activity140_18
import com.awesomeapp.articlelogin.Model140_20
import com.awesomeapp.articlelogin.Activity140_21
import com.awesomeapp.articlelogin.Model140_23
import com.awesomeapp.articlelogin.Activity140_24
import com.awesomeapp.articlelogin.Model140_26
import com.awesomeapp.articlelogin.Activity140_27
import com.awesomeapp.articlelogin.Model140_29
import com.awesomeapp.articlelogin.Activity140_30
import com.awesomeapp.articlelogin.Model140_32
import com.awesomeapp.articlelogin.Activity140_33
import com.awesomeapp.articlelogin.Model140_35
import com.awesomeapp.articlelogin.Activity140_36
import com.awesomeapp.articlelogin.Model140_38
import com.awesomeapp.articlelogin.Activity140_39
import com.awesomeapp.articlelogin.Model140_41
import com.awesomeapp.articlelogin.Activity140_42
import com.awesomeapp.articlelogin.Model140_44
import com.awesomeapp.articlelogin.Activity140_45
import com.awesomeapp.articlelogin.Model140_47
import com.awesomeapp.articlelogin.Activity140_48
import com.awesomeapp.articlelogin.Model140_50
import com.awesomeapp.articlelogin.Activity140_51
import com.awesomeapp.articlelogin.Model140_53
import com.awesomeapp.articlelogin.Activity140_54
import com.awesomeapp.articlelogin.Model140_56
import com.awesomeapp.articlelogin.Activity140_57
import com.awesomeapp.articlelogin.Model140_59
import com.awesomeapp.articlelogin.Activity140_60
import com.awesomeapp.articlelogin.Model140_62
import com.awesomeapp.articlelogin.Activity140_63
import com.awesomeapp.articlelogin.Model140_65
import com.awesomeapp.articlelogin.Activity140_66
import com.awesomeapp.articlelogin.Model140_68
import com.awesomeapp.articlelogin.Activity140_69
import com.awesomeapp.articlelogin.Model140_71
import com.awesomeapp.articlelogin.Activity140_72
import com.awesomeapp.articlelogin.Model140_74
import com.awesomeapp.articlelogin.Activity140_75
import com.awesomeapp.articlelogin.Model140_77
import com.awesomeapp.articlelogin.Activity140_78
import com.awesomeapp.articlelogin.Model140_80
import com.awesomeapp.articlelogin.Activity140_81
import com.awesomeapp.articlelogin.Model140_83
import com.awesomeapp.articlelogin.Activity140_84
import com.awesomeapp.articlelogin.Model140_86
import com.awesomeapp.articlelogin.Activity140_87
import com.awesomeapp.articlelogin.Model140_89
import com.awesomeapp.articlelogin.Activity140_90
import com.awesomeapp.articlelogin.Model140_92
import com.awesomeapp.articlelogin.Activity140_93
import com.awesomeapp.articlelogin.Model140_95
import com.awesomeapp.articlelogin.Activity140_96
import com.awesomeapp.articlelogin.Model140_98
import com.awesomeapp.articlelogin.Activity140_99

@Module
@InstallIn(SingletonComponent::class)
object Module_140 {
    @Provides
    @Singleton
    fun provideRepository140_5(): Repository140_5 {
        return Repository140_5()
    }

    @Provides
    @Singleton
    fun provideApi140_6(): Api140_6 {
        return Api140_6()
    }
}