package com.example.csce3615_moblieapp_project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.csce3615_moblieapp_project.ui.theme.DiningHallScreen
import com.example.csce3615_moblieapp_project.ui.theme.DiscoveryParkScreen
import com.example.csce3615_moblieapp_project.ui.theme.HomeScreen
import com.example.csce3615_moblieapp_project.ui.theme.MainCampusScreen
import com.example.csce3615_moblieapp_project.ui.theme.OtherScreen
import com.example.csce3615_moblieapp_project.ui.theme.UnionScreen

enum class MainScreen (){
    Start,
    DiscoveryPark,
    MainCampus,
    DiningHall,
    Menu,
    Union,
    Other
}

@Composable
fun MainScreenApp(
    //viewModel: OrderViewModel = viewModel(),
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
//                       .padding(dimensionResource(R.dimen.padding_medium))
                )

            }
            composable(route = MainScreen.MainCampus.name) {
                MainCampusScreen(
//                    subtotal = uiState.price,
                    DiningHallRoute = { navController.navigate(MainScreen.DiningHall.name) },
                    UnionRoute = { navController.navigate(MainScreen.Union.name) },
                    OtherRoute = { navController.navigate(MainScreen.Other.name) }
//                    onCancelButtonClicked = {
//                        cancelOrderAndNavigateToStart(viewModel, navController)
//                    },
//                    options = uiState.pickupOptions,
//                    onSelectionChanged = { viewModel.setDate(it) },
//                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = MainScreen.DiscoveryPark.name) {
//                val context = LocalContext.current
                DiscoveryParkScreen(
                    discoveryParkGrillRoute = { navController.navigate(MainScreen.DiscoveryPark.name) },
                    discoveryParkStarbucksRoute = { navController.navigate(MainScreen.DiscoveryPark.name)},

//                    onCancelButtonClicked = {
//                        cancelOrderAndNavigateToStart(viewModel, navController)
//                    },
//                    options = DataSource.flavors.map { id -> context.resources.getString(id) },
//                    onSelectionChanged = { viewModel.setFlavor(it) },
//                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = MainScreen.DiningHall.name) {
                DiningHallScreen(
//                    subtotal = uiState.price,
                    bruceteriaMenu = { navController.navigate(MainScreen.Menu.name) },
                    champsMenu = { navController.navigate(MainScreen.Menu.name) },
                    eagleLandingMenu = { navController.navigate(MainScreen.Menu.name) },
                    kitcheWestMenu = { navController.navigate(MainScreen.Menu.name) },
                    meanGreenCafeMenu = { navController.navigate(MainScreen.Menu.name) }
//                    onCancelButtonClicked = {
//                        cancelOrderAndNavigateToStart(viewModel, navController)
//                    },
//                    options = uiState.pickupOptions,
//                    onSelectionChanged = { viewModel.setDate(it) },
//                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = MainScreen.Union.name) {
                UnionScreen(
//                    subtotal = uiState.price,
                    AvestaMenu = { navController.navigate(MainScreen.Union.name) },
                    BurgerKingMenu = { navController.navigate(MainScreen.Union.name) },
                    CampusChatMenu = { navController.navigate(MainScreen.Union.name) },
                    ChickfilAMenu = { navController.navigate(MainScreen.Union.name) },
                    FuzzyTacoMenu = { navController.navigate(MainScreen.Union.name) },
                    JambaMenu = { navController.navigate(MainScreen.Union.name) },
                    KrispyKrunchChicken = { navController.navigate(MainScreen.Union.name) },
                    Starbucks = { navController.navigate(MainScreen.Union.name) },
                    VerdeEverydday = { navController.navigate(MainScreen.Union.name) }
//                    onCancelButtonClicked = {
//                        cancelOrderAndNavigateToStart(viewModel, navController)
//                    },
//                    options = uiState.pickupOptions,
//                    onSelectionChanged = { viewModel.setDate(it) },
//                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = MainScreen.Other.name) {
                OtherScreen(
//                    subtotal = uiState.price,
                    cafeGABMenu = { navController.navigate(MainScreen.Other.name) },
                    EinsteinBrosBagels = { navController.navigate(MainScreen.Other.name) },
                    StarbucksStand = { navController.navigate(MainScreen.Other.name) },
                    TheMarketByClarkBakery = { navController.navigate(MainScreen.Other.name) },
                    WhichWhichMenu = { navController.navigate(MainScreen.Other.name) }
//                    onCancelButtonClicked = {
//                        cancelOrderAndNavigateToStart(viewModel, navController)
//                    },
//                    options = uiState.pickupOptions,
//                    onSelectionChanged = { viewModel.setDate(it) },
//                    modifier = Modifier.fillMaxHeight()
                )
            }
        }
    }
}