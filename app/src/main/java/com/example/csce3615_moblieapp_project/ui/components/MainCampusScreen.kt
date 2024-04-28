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
import androidx.lifecycle.ViewModel
import com.example.csce3615_moblieapp_project.R


@Composable
fun MainCampusScreen(
    DiningHallRoute:() -> Unit,
    UnionRoute:() -> Unit,
    OtherRoute:() -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
//           verticalArrangement = Arrangement.Bottom
        ) {
            Image(
                painter = painterResource(id = R.drawable.unt_mc_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_dining_button), contentDescription = null,
                    modifier = Modifier
                        .height(150.dp)
                        .width(216.dp)
                        .clickable(onClick = DiningHallRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_union_button), contentDescription = null,
                    modifier = Modifier
                        .height(150.dp)
                        .width(216.dp)
                        .clickable(onClick = UnionRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_other_button), contentDescription = null,
                    modifier = Modifier
                        .height(150.dp)
                        .width(216.dp)
                        .clickable(onClick = OtherRoute))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.unt_bottom), contentDescription = null,
                    modifier = Modifier
                        .height(80.dp)
                        .width(400.dp),
                    Alignment.BottomCenter
                )
            }
//            Button(onClick = DiningHallRoute) { Text(stringResource(R.string.DiningHalls)) }
//            Button(onClick = UnionRoute) { Text(stringResource(R.string.Union)) }
//            Button(onClick = OtherRoute) { Text(stringResource(R.string.Other)) }
        }
    }
}