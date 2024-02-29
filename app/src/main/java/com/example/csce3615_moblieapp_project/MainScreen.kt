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
import com.example.csce3615_moblieapp_project.ui.theme.DiscoveryParkScreen
import com.example.csce3615_moblieapp_project.ui.theme.HomeScreen
import com.example.csce3615_moblieapp_project.ui.theme.MainCampusScreen

enum class MainScreen (){
    Start,
    DiscoveryPark,
    MainCampus,
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
                    discoveryParkRoute = {
//                        viewModel.setQuantity(it)
                        navController.navigate(MainScreen.DiscoveryPark.name)
                    },MainCampusRoute = {
//                        viewModel.setQuantity(it)
                        navController.navigate(MainScreen.MainCampus.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
//                       .padding(dimensionResource(R.dimen.padding_medium))
                )
            }
            composable(route = MainScreen.DiscoveryPark.name) {
                val context = LocalContext.current
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
            composable(route = MainScreen.MainCampus.name) {
                MainCampusScreen(
//                    subtotal = uiState.price,
                    DiningHallRoute = { navController.navigate(MainScreen.MainCampus.name) },
                    UnionRoute = { navController.navigate(MainScreen.MainCampus.name) },
                    OtherRoute = { navController.navigate(MainScreen.MainCampus.name) }
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