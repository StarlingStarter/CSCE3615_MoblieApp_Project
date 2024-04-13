package com.example.csce3615_moblieapp_project

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.csce3615_moblieapp_project.ui.components.MainScreenApp
import com.example.csce3615_moblieapp_project.ui.theme.CSCE3615_MoblieApp_ProjectTheme

private const val TAG = "MainActivity";
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CSCE3615_MoblieApp_ProjectTheme {
            // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreenApp(
                        {
                            Log.d(TAG, "coordinates=$it")
                            val uri = Uri.parse("google.navigation:q=$it&mode=d")
                            Intent(Intent.ACTION_VIEW,uri).also {
                                it.`package`="com.google.android.apps.maps"
                                try {
                                    startActivity(it)
                                } catch (e: ActivityNotFoundException){
                                    e.printStackTrace()
                                }
                            }})
                }
            }
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