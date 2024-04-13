package com.example.csce3615_moblieapp_project.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.csce3615_moblieapp_project.ui.data.DataSource

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems


//@Composable
//fun RetailMenu(

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

//        }
//    }
//}
@Composable
fun RetailMenu(
    navigatiorButton: () -> Unit,
    retailMenuList: List<RetailMenuItems>,
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
            items(items=retailMenuList){item->
                RetailCard(item = item)

            }

        }
    }
}



//        Row{
//            Image(
//                painter = painterResource(id = R.drawable.image_home_page_header),
//                contentDescription = null,
//                contentScale = ContentScale.FillWidth,
//                alpha = 1f,
//                modifier = Modifier.fillMaxWidth()
//            )
//        }
//            //burgers
//            RetailCard(RetailMenuItems(0, "Single Cheese Burger ","Price: 2.50"));
//            RetailCard(RetailMenuItems(0, "Single Veggie Burger ","Price: 2.50"));
//            RetailCard(RetailMenuItems(0, "Double Cheese Burger ","Price: 3.50"));
//            RetailCard(RetailMenuItems(0, "Triple Cheese Burger ","Price: 4.50"));
//
//            //BLT
//            RetailCard(RetailMenuItems(0, "Cheesy BLT ","Price: 3.50"));
//
//            //CheeseSteak
//            RetailCard(RetailMenuItems(0, "CheeseSteak ","Price: 3.50"));
//
//            //Chicken Crunch
//            RetailCard(RetailMenuItems(0, "Chicken Crunch original","Price: 4.00"));
//            RetailCard(RetailMenuItems(0, "Chicken Crunch spicy","Price: 4.00"));
//
//            //Grilled Cheese
//            RetailCard(RetailMenuItems(0, "Grilled Cheese ","Price: 2"));
//
//            //Little Birdie
//            RetailCard(RetailMenuItems(0, "Little Birdie ","Price: 5.25"));
//
//            //Made To Order Salads
//            RetailCard(RetailMenuItems(0, "Made To Order Salads ","Price: 6.50"));
//
//            //Portabello burger
//            RetailCard(RetailMenuItems(0, "Portabello Burger ","Price: 6.50"));
//
//            //Quesadilla
//            RetailCard(RetailMenuItems(0, "Steak   Quesadilla  ","Price: 4.25"));
//            RetailCard(RetailMenuItems(0, "Chicken Quesadilla  ","Price: 3.75"));
//            RetailCard(RetailMenuItems(0, "Cheese  Quesadilla "," Price: 3.00"));
//
//            //Tender Basket
//            RetailCard(RetailMenuItems(0, "Tender Basket ","Price: 3.75"));
//
//            //Aloo  Gobi
//            RetailCard(RetailMenuItems(0, "Aloo Gobi ","Price: 6.75"));
//
//            //Chicken Tikka Masala
//            RetailCard(RetailMenuItems(0, "Chicken Tikka Masala ","Price: 6.75"));
//
//            //Paneer  Butter Masala
//            RetailCard(RetailMenuItems(0, "Paneer Butter Masala ","Price: 6.75"));