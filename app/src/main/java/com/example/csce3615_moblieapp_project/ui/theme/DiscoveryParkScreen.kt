package com.example.csce3615_moblieapp_project.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.csce3615_moblieapp_project.DiscoveryPark
import com.example.csce3615_moblieapp_project.R

@Composable
fun DiscoveryParkScreen(
    discoveryParkGrillRoute:() -> Unit,
    discoveryParkStarbucksRoute:() -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Button(onClick = discoveryParkGrillRoute) {
                Text(stringResource(R.string.Discovery_park_grill))
            }
            Button(onClick = discoveryParkStarbucksRoute) {
                Text(stringResource(R.string.Discovery_park_starbucks))
            }
        }
    }
}