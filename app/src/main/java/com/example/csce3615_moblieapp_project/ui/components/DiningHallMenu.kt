package com.example.csce3615_moblieapp_project.ui.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.R
import com.example.csce3615_moblieapp_project.ui.data.DiningHallMenuItem
//import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems

@Composable
fun DiningHallMenu(
    navigatiorButton: () -> Unit,
    DiningHallMenuList: List<DiningHallMenuItem>,
    modifier: Modifier = Modifier
) {
    Log.d("RetailMenu", "The Retail Menu")
    Column(
//        modifier = Modifier.fillMaxHeight()
    ) {
        LazyColumn(
            modifier = Modifier
                .height(900.dp),
//                .fillMaxHeight(),
            contentPadding = PaddingValues(16.dp),
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
                    //Text("\uD83C\uDF3F  ")
                    Button(onClick = navigatiorButton) {
                        Text(stringResource(R.string.Navigation))
                    }
                }
            }
            items(items=DiningHallMenuList){item->
                DiningHallCard(item = item)

            }

        }
    }
}
