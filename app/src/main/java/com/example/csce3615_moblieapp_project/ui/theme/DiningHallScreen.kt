package com.example.csce3615_moblieapp_project.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.csce3615_moblieapp_project.R

@Composable
fun DiningHallScreen(
    bruceteriaMenu:() -> Unit,
    champsMenu:() -> Unit,
    eagleLandingMenu:() -> Unit,
    kitcheWestMenu:() -> Unit,
    meanGreenCafeMenu:() -> Unit,
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
            Image(
                painter = painterResource(id = R.drawable.image_home_page_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Button(onClick = bruceteriaMenu) {
                Text(stringResource(R.string.Bruceteria))
            }
            Button(onClick = champsMenu) {
                Text(stringResource(R.string.Champs))
            }
            Button(onClick = eagleLandingMenu) {
                Text(stringResource(R.string.Eagle_landing))
            }
            Button(onClick = kitcheWestMenu) {
                Text(stringResource(R.string.Kitchen_West))
            }
            Button(onClick = meanGreenCafeMenu) {
                Text(stringResource(R.string.Mean_Green_Cafe))
            }
        }
    }
}