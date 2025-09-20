package com.awesomeapp.calendarlocation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.awesomeapp.calendarlocation.ui.theme.FeatureTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Activity617_3 : ComponentActivity() {
    private val viewModel: Viewmodel617_1 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatureTheme {
                FeatureScreen_Activity617_3(viewModel)
            }
        }
    }
}

@Composable
fun FeatureScreen_Activity617_3(viewModel: Viewmodel617_1) {
    val state by viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = state)
    }
}