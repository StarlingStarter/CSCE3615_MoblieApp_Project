package com.example.csce3615_moblieapp_project.ui.components

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.background
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.example.csce3615_moblieapp_project.ui.data.DataSource
import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems

private const val TAG = "MainScreen";
enum class MainScreen (){
    Start,
    DiscoveryPark,
    MainCampus,
    DiningHall,
    Menu,
    RetailMenu,
    Union,
    Other,
    Navigation
}
var address: String = ""
var menu: List<RetailMenuItems> = DataSource.dpGrill
//var DPGrill: List<RetailMenuItems> = DataSource.dpGrill
//var DPStarbucks: List<RetailMenuItems> = DataSource.dpStarbuck
@Composable
fun MainScreenApp(
    //viewModel: OrderViewModel = viewModel(),
    mapHandler:(String) -> Unit,
    navController: NavHostController = rememberNavController()
) {
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = MainScreen.valueOf(
        backStackEntry?.destination?.route ?: MainScreen.Start.name
    )

    Scaffold(
//        topBar = {
////            MainScreenAppBar(
////                currentScreen = currentScreen,
////                canNavigateBack = navController.previousBackStackEntry != null,
////                navigateUp = { navController.navigateUp() }
////            )
//        }
    ) { innerPadding ->
        //val uiState by viewModel.uiState.collectAsState()
        //
        //var address = remember { mutableStateOf("") }
        //address = "Bruce%20Hall%2C%201624%20Chestnut%20St%2C%20Denton%2C%20TX%2076201"
        NavHost(
            navController = navController,
            startDestination = MainScreen.Start.name,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {
            composable(route = MainScreen.Start.name) {
                HomeScreen(
                    /*Discovery Park Navigation and Main Campus Button display*/

                    MainCampusRoute = {
//                        viewModel.setQuantity(it)
                        navController.navigate(MainScreen.MainCampus.name)
                    },discoveryParkRoute = {
//                        viewModel.setQuantity(it)
                        navController.navigate(MainScreen.DiscoveryPark.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
//                       .padding(dimensionResource(R.dimen.padding_medium))
                )

            }
            composable(route = MainScreen.MainCampus.name) {
                MainCampusScreen(
                    DiningHallRoute = { navController.navigate(MainScreen.DiningHall.name) },
                    UnionRoute = { navController.navigate(MainScreen.Union.name) },
                    OtherRoute = { navController.navigate(MainScreen.Other.name) },
                    modifier = Modifier
                               .fillMaxSize()
                               .background(Color.White)
                )
            }
            composable(route = MainScreen.DiscoveryPark.name) {
                DiscoveryParkScreen(
                    discoveryParkGrillRoute = {
                        menu = it.menu
                        address = it.address
                        navController.navigate(MainScreen.RetailMenu.name) },
                    discoveryParkStarbucksRoute = {
                        menu = it.menu
                        address = it.address
                        navController.navigate(MainScreen.RetailMenu.name)},

                    Navigation = { navController.navigate(MainScreen.Menu.name)},
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                )
            }
            composable(route = MainScreen.DiningHall.name) {
                DiningHallScreen(
                    bruceteriaMenu = {
//                        Log.d(TAG, "IT=$it")
                        address = it
//                        Log.d(TAG, "Address=$address")
                        navController.navigate(MainScreen.Menu.name) },

                    champsMenu = {
                        address = it
                        navController.navigate(MainScreen.Menu.name) },
                    eagleLandingMenu = {
                        address = it
                        navController.navigate(MainScreen.Menu.name) },
                    kitcheWestMenu = {
                        address = it
                        navController.navigate(MainScreen.Menu.name) },
                    meanGreenCafeMenu = {
                        address = it
                        navController.navigate(MainScreen.Menu.name) } ,
                    modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                )
            }
            composable(route = MainScreen.Union.name) {
                UnionScreen(
                    AvestaMenu = { navController.navigate(MainScreen.Union.name) },
                    BurgerKingMenu = { navController.navigate(MainScreen.Union.name) },
                    CampusChatMenu = { navController.navigate(MainScreen.Union.name) },
                    ChickfilAMenu = { navController.navigate(MainScreen.Union.name) },
                    FuzzyTacoMenu = { navController.navigate(MainScreen.Union.name) },
                    JambaMenu = { navController.navigate(MainScreen.Union.name) },
                    KrispyKrunchChicken = { navController.navigate(MainScreen.Union.name) },
                    Starbucks = { navController.navigate(MainScreen.Union.name) },
                    VerdeEveryday = { navController.navigate(MainScreen.Union.name) },
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                )
            }
            composable(route = MainScreen.Other.name) {
                OtherScreen(
                    cafeGABMenu = { navController.navigate(MainScreen.Other.name) },
                    EinsteinBrosBagels = { navController.navigate(MainScreen.Other.name) },
                    StarbucksStand = { navController.navigate(MainScreen.Other.name) },
                    TheMarketByClarkBakery = { navController.navigate(MainScreen.Other.name) },
                    WhichWhichMenu = { navController.navigate(MainScreen.Other.name) },
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)

                )
            }
            composable(route = MainScreen.Menu.name) {
                MenuScreen(
                    navigatiorButton = {
                        Log.d(TAG, "Address=${address}")
                        mapHandler(address)},
                    modifier = Modifier
                        //.fillMaxSize()
                        .background(Color.White)

                )
            }
            composable(route = MainScreen.RetailMenu.name) {
                RetailMenu(
                    navigatiorButton = {
                        Log.d(TAG, "Address=${address}")
                        mapHandler(address)},
                    menu
                )
            }
        }
    }
}

//                 (
//                    navigatiorButton = {
//                        Log.d(TAG, "Address=${address}")
//                        mapHandler(address)},
//                    modifier = Modifier
//                        //.fillMaxSize()
//                        .background(Color.White)
//
//                )