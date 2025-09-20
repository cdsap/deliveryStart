package com.awesomeapp.documentcart

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
import com.awesomeapp.documentcart.ui.theme.FeatureTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Activity279_2 : ComponentActivity() {
    private val viewModel: Viewmodel279_1 by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatureTheme {
                FeatureScreen_Activity279_2(viewModel)
            }
        }
    }
}

@Composable
fun FeatureScreen_Activity279_2(viewModel: Viewmodel279_1) {
    val state by viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = state)
    }
}