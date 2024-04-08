package com.example.csce3615_moblieapp_project.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.csce3615_moblieapp_project.R

@Composable
fun MenuScreen(
    navigatiorButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    //beginning of the html parser integration
//    Scaffold(
//
//    ){
//        LazyColumn(
//           modifier = Modifier.fillMaxWidth(),
//            contentPadding =  PaddingValues(16.dp)
//        ){
//
//        }

    //end of the html paser integration
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
//            Button(onClick = discoveryParkStarbucksRoute) { Text(stringResource(R.string.Discovery_park_starbucks)) }
            Button(onClick = navigatiorButton) {
                Text(stringResource(R.string.Navigation))
            }
        }
    }
}
