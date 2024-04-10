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
import com.example.csce3615_moblieapp_project.ui.data.DataSource
import com.example.csce3615_moblieapp_project.ui.data.LocationAndMenu

@Composable
fun UnionScreen(
    AvestaMenu:(LocationAndMenu) -> Unit,
    BurgerKingMenu:(LocationAndMenu) -> Unit,
    CampusChatMenu:(LocationAndMenu) -> Unit,
    ChickfilAMenu:(LocationAndMenu) -> Unit,
    FuzzyTacoMenu:(LocationAndMenu) -> Unit,
    JambaMenu:(LocationAndMenu) -> Unit,
    KrispyKrunchChicken:(LocationAndMenu) -> Unit,
    Starbucks:(LocationAndMenu) -> Unit,
    VerdeEveryday:(LocationAndMenu) -> Unit,
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
                Image(painter = painterResource(id = R.drawable.avesta), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {AvestaMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.AvestaMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.burger_king), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = { BurgerKingMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.BurgerKingMenu)) }))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.campus_chat_food_court), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = { CampusChatMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.CampusChatMenu)) }))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.chick_fil_a), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = { ChickfilAMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.ChickFilaMenu)) }))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.fuzzy_s_taco_shop), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {FuzzyTacoMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.FuzzyTacoMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.jamba), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {JambaMenu(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.JambaMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.krispykrunchchicken), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {KrispyKrunchChicken(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.KrispyKrunchChickenMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.starbucks_union), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {Starbucks(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.StarbucksMenu))}))
            }
            Box() {
                Image(painter = painterResource(id = R.drawable.verde_everyday_express), contentDescription = null,
                    modifier = Modifier
                        .height(90.dp)
                        .width(216.dp)
                        .clickable(onClick = {VerdeEveryday(LocationAndMenu("1155%20Union%20Cir%2C%20Denton%2C%20TX%2076203", DataSource.verdeEverydayMenu))}))
            }
//            Button(onClick = AvestaMenu) { Text(stringResource(R.string.Avesta)) }
//            Button(onClick = BurgerKingMenu) { Text(stringResource(R.string.Burger_King)) }
//            Button(onClick = CampusChatMenu) { Text(stringResource(R.string.Campus_Chat_Food_Court)) }
//            Button(onClick = ChickfilAMenu) { Text(stringResource(R.string.Chick_fil_a)) }
//            Button(onClick = FuzzyTacoMenu) { Text(stringResource(R.string.fuzzys_Taco_Shop)) }
//            Button(onClick = JambaMenu) { Text(stringResource(R.string.Jamba)) }
//            Button(onClick = KrispyKrunchChicken) { Text(stringResource(R.string.Krispy_Kruch_Chicken)) }
//            Button(onClick = Starbucks) { Text(stringResource(R.string.Starbucks)) }
//            Button(onClick = VerdeEverydday) { Text(stringResource(R.string.Verde_Everyday_Express)) }
        }
    }
}