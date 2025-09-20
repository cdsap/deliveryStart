package com.awesomeapp.articlesync.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articlesync.Viewmodel728_1
import com.awesomeapp.articlesync.Activity728_2
import com.awesomeapp.articlesync.Activity728_3
import com.awesomeapp.articlesync.Fragment728_4
import com.awesomeapp.articlesync.Repository728_5
import com.awesomeapp.postcomment.Api452_6
import com.awesomeapp.calendarsearch.Api568_6
import com.awesomeapp.gallerypost.Api536_6
import com.awesomeapp.photosearch.Api584_6
import com.awesomeapp.podcastcomment.Api484_6
import com.awesomeapp.searchlocation.Api600_6
import com.awesomeapp.mediacomment.Api488_6
import com.awesomeapp.synccomment.Api456_6
import com.awesomeapp.metriccomment.Api468_6
import com.awesomeapp.analyticscomment.Api464_6
import com.awesomeapp.articlesync.Api728_6
import com.awesomeapp.articlesync.Model728_8
import com.awesomeapp.articlesync.Model728_9
import com.awesomeapp.articlesync.Activity728_10
import com.awesomeapp.articlesync.Model728_12
import com.awesomeapp.articlesync.Activity728_13
import com.awesomeapp.articlesync.Model728_15
import com.awesomeapp.articlesync.Activity728_16
import com.awesomeapp.articlesync.Model728_18
import com.awesomeapp.articlesync.Activity728_19
import com.awesomeapp.articlesync.Model728_21
import com.awesomeapp.articlesync.Activity728_22
import com.awesomeapp.articlesync.Model728_24
import com.awesomeapp.articlesync.Activity728_25
import com.awesomeapp.articlesync.Model728_27
import com.awesomeapp.articlesync.Activity728_28
import com.awesomeapp.articlesync.Model728_30
import com.awesomeapp.articlesync.Activity728_31
import com.awesomeapp.articlesync.Model728_33
import com.awesomeapp.articlesync.Activity728_34
import com.awesomeapp.articlesync.Model728_36
import com.awesomeapp.articlesync.Activity728_37
import com.awesomeapp.articlesync.Model728_39
import com.awesomeapp.articlesync.Activity728_40
import com.awesomeapp.articlesync.Model728_42
import com.awesomeapp.articlesync.Activity728_43
import com.awesomeapp.articlesync.Model728_45
import com.awesomeapp.articlesync.Activity728_46
import com.awesomeapp.articlesync.Model728_48
import com.awesomeapp.articlesync.Activity728_49
import com.awesomeapp.articlesync.Model728_51
import com.awesomeapp.articlesync.Activity728_52
import com.awesomeapp.articlesync.Model728_54
import com.awesomeapp.articlesync.Activity728_55
import com.awesomeapp.articlesync.Model728_57
import com.awesomeapp.articlesync.Activity728_58
import com.awesomeapp.articlesync.Model728_60
import com.awesomeapp.articlesync.Activity728_61
import com.awesomeapp.articlesync.Model728_63
import com.awesomeapp.articlesync.Activity728_64
import com.awesomeapp.articlesync.Model728_66
import com.awesomeapp.articlesync.Activity728_67
import com.awesomeapp.articlesync.Model728_69
import com.awesomeapp.articlesync.Activity728_70
import com.awesomeapp.articlesync.Model728_72
import com.awesomeapp.articlesync.Activity728_73
import com.awesomeapp.articlesync.Model728_75
import com.awesomeapp.articlesync.Activity728_76
import com.awesomeapp.articlesync.Model728_78
import com.awesomeapp.articlesync.Activity728_79
import com.awesomeapp.articlesync.Model728_81
import com.awesomeapp.articlesync.Activity728_82
import com.awesomeapp.articlesync.Model728_84
import com.awesomeapp.articlesync.Activity728_85
import com.awesomeapp.articlesync.Model728_87
import com.awesomeapp.articlesync.Activity728_88
import com.awesomeapp.articlesync.Model728_90
import com.awesomeapp.articlesync.Activity728_91
import com.awesomeapp.articlesync.Model728_93
import com.awesomeapp.articlesync.Activity728_94
import com.awesomeapp.articlesync.Model728_96
import com.awesomeapp.articlesync.Activity728_97
import com.awesomeapp.articlesync.Model728_99
import com.awesomeapp.articlesync.Activity728_100
import com.awesomeapp.articlesync.Model728_102
import com.awesomeapp.articlesync.Activity728_103
import com.awesomeapp.articlesync.Model728_105
import com.awesomeapp.articlesync.Activity728_106
import com.awesomeapp.articlesync.Model728_108
import com.awesomeapp.articlesync.Activity728_109
import com.awesomeapp.articlesync.Model728_111
import com.awesomeapp.articlesync.Activity728_112
import com.awesomeapp.articlesync.Model728_114
import com.awesomeapp.articlesync.Activity728_115
import com.awesomeapp.articlesync.Model728_117
import com.awesomeapp.articlesync.Activity728_118
import com.awesomeapp.articlesync.Model728_120
import com.awesomeapp.articlesync.Activity728_121
import com.awesomeapp.articlesync.Model728_123
import com.awesomeapp.articlesync.Activity728_124
import com.awesomeapp.articlesync.Model728_126
import com.awesomeapp.articlesync.Activity728_127
import com.awesomeapp.articlesync.Model728_129
import com.awesomeapp.articlesync.Activity728_130
import com.awesomeapp.articlesync.Model728_132
import com.awesomeapp.articlesync.Activity728_133
import com.awesomeapp.articlesync.Model728_135
import com.awesomeapp.articlesync.Activity728_136
import com.awesomeapp.articlesync.Model728_138
import com.awesomeapp.articlesync.Activity728_139
import com.awesomeapp.articlesync.Model728_141

@Module
@InstallIn(SingletonComponent::class)
object Module_728 {
    @Provides
    @Singleton
    fun provideRepository728_5(
        api0: Api452_6 = Api452_6(),
        api1: Api568_6 = Api568_6(),
        api2: Api536_6 = Api536_6(),
        api3: Api584_6 = Api584_6(),
        api4: Api484_6 = Api484_6(),
        api5: Api600_6 = Api600_6(),
        api6: Api488_6 = Api488_6(),
        api7: Api456_6 = Api456_6(),
        api8: Api468_6 = Api468_6(),
        api9: Api464_6 = Api464_6()
    ): Repository728_5 {
        return Repository728_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8, 
        api9)
    }

    @Provides
    @Singleton
    fun provideApi728_6(): Api728_6 {
        return Api728_6()
    }
}