package com.example.csce3615_moblieapp_project.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.csce3615_moblieapp_project.R

@Composable
fun MenuScreen(
    navigatiorButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
//            verticalArrangement = Arrangement.SpaceEvenly,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
//            Button(onClick = discoveryParkStarbucksRoute) { Text(stringResource(R.string.Discovery_park_starbucks)) }
            Column {

                Button(onClick = navigatiorButton) {
                    Text(stringResource(R.string.Navigation))
                }
            }
        }
    }
}
