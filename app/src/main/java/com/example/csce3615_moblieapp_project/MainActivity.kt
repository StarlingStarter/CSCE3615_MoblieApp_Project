package com.example.csce3615_moblieapp_project

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.csce3615_moblieapp_project.ui.components.MainScreenApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenApp({Intent(Intent.ACTION_MAIN).also {
//                it.`package`="com.google.android.youtube"
                it.`package`="com.google.android.apps.maps"
                try {
                    startActivity(it)
                } catch (e: ActivityNotFoundException){
                    e.printStackTrace()
                }
            }})
//            CSCE3615_MoblieApp_ProjectTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")

//                }
//            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CSCE3615_MoblieApp_ProjectTheme {
//        Greeting("Android")
//    }
//}