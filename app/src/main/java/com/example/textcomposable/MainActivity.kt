package com.example.textcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textcomposable.ui.theme.TextComposableTheme
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextComposableTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    WinterImage(
                        txt = stringResource(R.string.hello_premier),
                        txt1 = stringResource(R.string.are_you_ready_for_the_winter_festival)
                    )
                }
            }
        }
    }
}

@Composable
fun Winter(txt: String, txt1: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()

    ) {
        Text(
            text = txt,
            fontSize = 50.sp,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = txt1,
            fontSize = 20.sp,
            modifier = Modifier.padding(10.dp)
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            color = Color.Black
        )
    }
}

@Composable
fun WinterImage(txt: String, txt1: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty) // Replace with your drawable resource
    Box(
        modifier = modifier
            .fillMaxSize() // Make the Box fill the available screen space
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Winter(
            txt = txt,
            txt1 = txt1,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextComposablePreview() {
    TextComposableTheme {
        WinterImage(
            txt = stringResource(R.string.hello_premier),
            txt1 = stringResource(R.string.are_you_ready_for_the_winter_festival)
        )
    }
}
