package com.example.csce3615_moblieapp_project
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.ui.theme.CSCE3615_MoblieApp_ProjectTheme

class Main : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CSCE3615_MoblieApp_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    appHomeScreen()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun appHomeScreen() {
        CSCE3615_MoblieApp_ProjectTheme {
            Image(
                painter = painterResource(id = R.drawable.home_screen),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 1f
            )
            MainCampusMenuDisplay()
            DiscoveryPark()
        }
    }
}
    //Takes you to the Main Campus class
    @Composable
    fun MainCampusMenuDisplay(modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)){
        var isButtonClicked by remember {mutableStateOf(false)}

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
        {

            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {isButtonClicked = !isButtonClicked}) {
                //Text(stringResource(R.string.img1))
            }
            if(isButtonClicked == true)
            {
                Image(painter = painterResource(R.drawable.test_img), contentDescription = "just a test button")
            }
        }
        }


    //Takes you to the discovery park class
    @Composable
    fun DiscoveryPark(modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.BottomCenter)){
        var isButtonClicked by remember {mutableStateOf(false)}

        Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally)
        {

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = {isButtonClicked = !isButtonClicked}) {
                //Text(stringResource(R.string.avesta))
            }
            if(isButtonClicked == true)
            {
                //Image(painter = painterResource(R.drawable.cafe_gab), contentDescription = "Tepig")
            }
        }
    }