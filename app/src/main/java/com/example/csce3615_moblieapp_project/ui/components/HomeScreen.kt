package com.example.csce3615_moblieapp_project.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.R

@Composable
fun HomeScreen(
    discoveryParkRoute:() -> Unit,
    MainCampusRoute:() -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(90.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.unt_opening_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Box() {
                Image(painter = painterResource(id = R.drawable.main_campus_button), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)//90
                        .width(216.dp)//216
                        .clickable(onClick = MainCampusRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.discovery_park_button), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = discoveryParkRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_bottom), contentDescription = null,
                    modifier = Modifier
                        .height(115.dp)
                        .width(400.dp)
                )
            }
//            Button(onClick = MainCampusRoute) { Text(stringResource(R.string.main_campus)) }
//            Button(onClick = discoveryParkRoute) { Text(stringResource(R.string.Discovery_park)) }
        }
    }
}

@Composable
fun SelectQuantityButton(
    @StringRes labelResourceId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(min = 250.dp)
    ) {
        Text(stringResource(labelResourceId))
    }
}

@Preview
@Composable
fun StartOrderPreview() {
//    CupcakeTheme {
//        HomeScreen(
//            quantityOptions = DataSource.quantityOptions,
//            onNextButtonClicked = {},
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(dimensionResource(R.dimen.padding_medium))
//        )
//    }
}