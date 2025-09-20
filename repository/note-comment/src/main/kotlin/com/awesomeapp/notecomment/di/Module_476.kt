package com.awesomeapp.notecomment.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notecomment.Viewmodel476_1
import com.awesomeapp.notecomment.Activity476_2
import com.awesomeapp.notecomment.Activity476_3
import com.awesomeapp.notecomment.Fragment476_4
import com.awesomeapp.notecomment.Repository476_5
import com.awesomeapp.sharefeed.Api408_6
import com.awesomeapp.notecomment.Api476_6
import com.awesomeapp.notecomment.Model476_8
import com.awesomeapp.notecomment.Model476_9
import com.awesomeapp.notecomment.Activity476_10
import com.awesomeapp.notecomment.Model476_12
import com.awesomeapp.notecomment.Activity476_13
import com.awesomeapp.notecomment.Model476_15
import com.awesomeapp.notecomment.Activity476_16
import com.awesomeapp.notecomment.Model476_18
import com.awesomeapp.notecomment.Activity476_19
import com.awesomeapp.notecomment.Model476_21
import com.awesomeapp.notecomment.Activity476_22
import com.awesomeapp.notecomment.Model476_24
import com.awesomeapp.notecomment.Activity476_25
import com.awesomeapp.notecomment.Model476_27
import com.awesomeapp.notecomment.Activity476_28
import com.awesomeapp.notecomment.Model476_30
import com.awesomeapp.notecomment.Activity476_31
import com.awesomeapp.notecomment.Model476_33
import com.awesomeapp.notecomment.Activity476_34
import com.awesomeapp.notecomment.Model476_36
import com.awesomeapp.notecomment.Activity476_37
import com.awesomeapp.notecomment.Model476_39
import com.awesomeapp.notecomment.Activity476_40
import com.awesomeapp.notecomment.Model476_42
import com.awesomeapp.notecomment.Activity476_43
import com.awesomeapp.notecomment.Model476_45
import com.awesomeapp.notecomment.Activity476_46
import com.awesomeapp.notecomment.Model476_48
import com.awesomeapp.notecomment.Activity476_49
import com.awesomeapp.notecomment.Model476_51
import com.awesomeapp.notecomment.Activity476_52
import com.awesomeapp.notecomment.Model476_54
import com.awesomeapp.notecomment.Activity476_55
import com.awesomeapp.notecomment.Model476_57
import com.awesomeapp.notecomment.Activity476_58
import com.awesomeapp.notecomment.Model476_60
import com.awesomeapp.notecomment.Activity476_61
import com.awesomeapp.notecomment.Model476_63
import com.awesomeapp.notecomment.Activity476_64
import com.awesomeapp.notecomment.Model476_66
import com.awesomeapp.notecomment.Activity476_67
import com.awesomeapp.notecomment.Model476_69
import com.awesomeapp.notecomment.Activity476_70
import com.awesomeapp.notecomment.Model476_72
import com.awesomeapp.notecomment.Activity476_73
import com.awesomeapp.notecomment.Model476_75
import com.awesomeapp.notecomment.Activity476_76

@Module
@InstallIn(SingletonComponent::class)
object Module_476 {
    @Provides
    @Singleton
    fun provideRepository476_5(
        api0: Api408_6 = Api408_6()
    ): Repository476_5 {
        return Repository476_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi476_6(): Api476_6 {
        return Api476_6()
    }
}