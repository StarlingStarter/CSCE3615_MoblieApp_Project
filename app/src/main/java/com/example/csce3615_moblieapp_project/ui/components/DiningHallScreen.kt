package com.example.csce3615_moblieapp_project.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.lifecycle.ViewModel
import com.example.csce3615_moblieapp_project.HTMLparser
import com.example.csce3615_moblieapp_project.R
import com.example.csce3615_moblieapp_project.ui.data.DiningHallInfo
import com.example.csce3615_moblieapp_project.ui.data.LocationAndMenu
import com.example.csce3615_moblieapp_project.ui.data.LocationandMenuDining
import com.example.csce3615_moblieapp_project.ui.data.Menu.BruceteriaDataSource
import com.example.csce3615_moblieapp_project.ui.data.Menu.ChampsDataSource
import com.example.csce3615_moblieapp_project.ui.data.Menu.EagleLandingDataSource
import com.example.csce3615_moblieapp_project.ui.data.Menu.KitchenWestDataSource
import com.example.csce3615_moblieapp_project.ui.data.Menu.MeanGreenDataSource

@Composable
fun DiningHallScreen(
    bruceteriaMenu:(LocationandMenuDining) -> Unit,
    champsMenu:(LocationandMenuDining) -> Unit,
    eagleLandingMenu:(LocationandMenuDining) -> Unit,
    kitcheWestMenu:(LocationandMenuDining) -> Unit,
    meanGreenCafeMenu:(LocationandMenuDining) -> Unit,
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
                painter = painterResource(id = R.drawable.unt_dining_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_bruceteria_button), contentDescription = null,
                    modifier = Modifier
                        .height(110.dp)
                        .width(216.dp)
                        .clickable(onClick = { bruceteriaMenu(LocationandMenuDining("Bruce%20Hall%2C%201624%20Chestnut%20St%2C%20Denton%2C%20TX%2076201",
                            BruceteriaDataSource.bruceMenu)) }))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_champs_button), contentDescription = null,
                    modifier = Modifier
                        .height(110.dp)
                        .width(216.dp)
                        .clickable(onClick = {champsMenu(LocationandMenuDining("1379%20S%20Bonnie%20Brae%20St%2C%20Denton%2C%20TX%2076207",
                            ChampsDataSource.champsMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_eagle_button), contentDescription = null,
                    modifier = Modifier
                        .height(110.dp)
                        .width(216.dp)
                        .clickable(onClick = {eagleLandingMenu(LocationandMenuDining("%201416%20Maple%2C%20Denton%2C%20TX%2076201",
                            EagleLandingDataSource.eagleLandingMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_kitchen_button), contentDescription = null,
                    modifier = Modifier
                        .height(110.dp)
                        .width(216.dp)
                        .clickable(onClick = {kitcheWestMenu(LocationandMenuDining("West%20Hall%2C%20320%20N%20Texas%20Blvd%2C%20Denton%2C%20TX%2076201",
                            KitchenWestDataSource.kitchenMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_mean_button), contentDescription = null,
                    modifier = Modifier
                        .height(110.dp)
                        .width(216.dp)
                        .clickable(onClick = {meanGreenCafeMenu(LocationandMenuDining("902%20Avenue%20C%2C%20Denton%2C%20TX%2076201",
                            MeanGreenDataSource.meanGreensMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_bottom), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(400.dp),
                    Alignment.BottomCenter
                )
            }
//            Button(onClick = bruceteriaMenu) { Text(stringResource(R.string.Bruceteria)) }
//            Button(onClick = champsMenu) { Text(stringResource(R.string.Champs)) }
//            Button(onClick = eagleLandingMenu) { Text(stringResource(R.string.Eagle_landing)) }
//            Button(onClick = kitcheWestMenu) { Text(stringResource(R.string.Kitchen_West)) }
//            Button(onClick = meanGreenCafeMenu) { Text(stringResource(R.string.Mean_Green_Cafe)) }
        }
    }
}