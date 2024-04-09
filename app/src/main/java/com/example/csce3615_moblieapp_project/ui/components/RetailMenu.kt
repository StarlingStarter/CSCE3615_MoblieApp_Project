package com.example.csce3615_moblieapp_project.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.csce3615_moblieapp_project.R
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems


//@Composable
//fun RetailMenu(
//    navigatiorButton: () -> Unit,
//    modifier: Modifier = Modifier
//){
//    Column(
//        modifier = modifier,
//        verticalArrangement = Arrangement.Bottom
//    ) {
//        Column(
//            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.SpaceEvenly,
//            horizontalAlignment = Alignment.CenterHorizontally,
////            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
//        ) {
////            Button(onClick = discoveryParkStarbucksRoute) { Text(stringResource(R.string.Discovery_park_starbucks)) }
//            Button(onClick = navigatiorButton) {
//                Text(stringResource(R.string.Navigation))
//            }
//        }
//    }
//}
@Composable
fun RetailMenu(retailMenuList: List<RetailMenuItems>)
{
    Log.d("RetailMenu", "The Retail Menu")
    Column {
        Row{
            Image(
                painter = painterResource(id = R.drawable.image_home_page_header),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                alpha = 1f,
                modifier = Modifier.fillMaxWidth()
            )
        }
        }
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            userScrollEnabled = false
        ) {
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("\uD83C\uDF3F  Test output")
                }
            }
            items(items=retailMenuList){item->
                RetailCard(item = item)
            }
        }
}
