package com.example.csce3615_moblieapp_project.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
import java.security.AllPermission


@Composable
fun RetailCard(item: RetailMenuItems){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
//            Text(text = "please note most of these menu's contain a portion of a location offers, and will be completed future updates")
           // Text(text = item.name)
            Text(text = item.name)
        }
        Row(){
            Text(text = item.description)
        }
        Row(){
            Text(text = item.price)
        }
    }
}