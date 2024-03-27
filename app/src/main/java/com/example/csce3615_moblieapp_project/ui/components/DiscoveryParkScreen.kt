package com.example.csce3615_moblieapp_project.ui.components

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.csce3615_moblieapp_project.R


@Composable
fun DiscoveryParkScreen(
    discoveryParkGrillRoute:() -> Unit,
    discoveryParkStarbucksRoute:() -> Unit,
    Navigation:() -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_home_page_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Box() {
                Image(painter = painterResource(id = R.drawable.dp_grill___market), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = discoveryParkGrillRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.starbucks_dp), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = discoveryParkStarbucksRoute))
            }
//            Button(onClick = discoveryParkStarbucksRoute) { Text(stringResource(R.string.Discovery_park_starbucks)) }
        }
    }
//    Button(onClick = Navigation) {
//        Intent(Intent.ACTION_MAIN).also {
//            it.`package`="com.google.android.apps.maps"
//            try {
//                //startActivity()
//            } catch (e: ActivityNotFoundException){
//                e.printStackTrace()
//            }
//        }
//    }
}