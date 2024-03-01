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
import com.example.csce3615_moblieapp_project.R

@Composable
fun OtherScreen(
    cafeGABMenu:() -> Unit,
    EinsteinBrosBagels:() -> Unit,
    StarbucksStand:() -> Unit,
    TheMarketByClarkBakery:() -> Unit,
    WhichWhichMenu:() -> Unit,
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
            Button(onClick = cafeGABMenu) {
                Text(stringResource(R.string.Cafe_GAB))
            }
            Button(onClick = EinsteinBrosBagels) {
                Text(stringResource(R.string.Einstein_Bros_Bagels))
            }
            Button(onClick = StarbucksStand) {
                Text(stringResource(R.string.Starbucks_Stand))
            }
            Button(onClick = TheMarketByClarkBakery) {
                Text(stringResource(R.string.The_Market_By_Clark_Bakery))
            }
            Button(onClick = WhichWhichMenu) {
                Text(stringResource(R.string.Which_Which))
            }
        }
    }
}