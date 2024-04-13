package com.example.csce3615_moblieapp_project.ui.components

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
import com.example.csce3615_moblieapp_project.R
import com.example.csce3615_moblieapp_project.ui.data.DataSource
import com.example.csce3615_moblieapp_project.ui.data.LocationAndMenu

@Composable
fun OtherScreen(
    cafeGABMenu:(LocationAndMenu) -> Unit,
    EinsteinBrosBagels:(LocationAndMenu) -> Unit,
    StarbucksStand:(LocationAndMenu) -> Unit,
    TheMarketByClarkBakery:(LocationAndMenu) -> Unit,
    WhichWhichMenu:(LocationAndMenu) -> Unit,
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
                Image(painter = painterResource(id = R.drawable.cafe_gab), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {cafeGABMenu(LocationAndMenu("1417%20Maple%20Street%20Denton%2C%20Texas%2076201",DataSource.cafeGABMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.einsteins_bros), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {EinsteinBrosBagels(LocationAndMenu("1201%20W.%20Mulberry%20St.%2C%20Art%20Building%2C%20Room%20101",DataSource.bagleAMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.starbucks_stand), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {StarbucksStand(LocationAndMenu("1501%20W%20Chestnut%20St%2C%20Denton%2C%20TX%2076201",DataSource.StarbuckStandMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.the_market_by_clark_bakery), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {TheMarketByClarkBakery(LocationAndMenu("1416%20Maple%20St%2C%20Denton%2C%20TX%2076201%0A",DataSource.marketMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.which_wich), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {WhichWhichMenu(LocationAndMenu("",DataSource.WhichWichMenu))}))
            }
//            Button(onClick = cafeGABMenu) { Text(stringResource(R.string.Cafe_GAB)) }
//            Button(onClick = EinsteinBrosBagels) { Text(stringResource(R.string.Einstein_Bros_Bagels)) }
//            Button(onClick = StarbucksStand) { Text(stringResource(R.string.Starbucks_Stand)) }
//            Button(onClick = TheMarketByClarkBakery) { Text(stringResource(R.string.The_Market_By_Clark_Bakery)) }
//            Button(onClick = WhichWhichMenu) { Text(stringResource(R.string.Which_Which)) }
        }
    }
}