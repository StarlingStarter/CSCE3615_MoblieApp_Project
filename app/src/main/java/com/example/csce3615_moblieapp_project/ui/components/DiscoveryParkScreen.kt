package com.example.csce3615_moblieapp_project.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.R
import com.example.csce3615_moblieapp_project.ui.data.Menu.DPGrillDataSource
import com.example.csce3615_moblieapp_project.ui.data.Menu.DPStarbucksDataSource
import com.example.csce3615_moblieapp_project.ui.data.LocationAndMenu


@Composable
fun DiscoveryParkScreen(
//    discoveryParkGrillRoute:(String/*,List<RetailMenuItems>*/) -> Unit,
    discoveryParkGrillRoute:(LocationAndMenu) -> Unit,
    discoveryParkStarbucksRoute:(LocationAndMenu) -> Unit,
    //Navigation:() -> Unit,
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
                painter = painterResource(id = R.drawable.unt_discovery_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_dpgrill_button), contentDescription = null,
                    modifier = Modifier
                        .height(120.dp)
                        .width(280.dp)
//                        .clickable(onClick = {discoveryParkGrillRoute("3940%20N%20Elm%20St%2C%20Denton%2C%20TX%2076207", DataSource.dpGrill)}))
                        .clickable(onClick = {discoveryParkGrillRoute(LocationAndMenu("3940%20N%20Elm%20St%2C%20Denton%2C%20TX%2076207",
                            DPGrillDataSource.dpGrill))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_dpstarbuck_button), contentDescription = null,
                    modifier = Modifier
                        .height(120.dp)
                        .width(280.dp)
                        .clickable(onClick = {discoveryParkStarbucksRoute(LocationAndMenu("3940%20N%20Elm%20St%2C%20Denton%2C%20TX%2076207",
                            DPStarbucksDataSource.dpStarbuck))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_bottom), contentDescription = null,
                    modifier = Modifier
                        .height(295.dp)
                        .width(400.dp),
                    Alignment.BottomCenter
                )
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