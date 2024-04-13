package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
/*RetailMenuItems(the id is an integer type that has to be unique to the list,
                  the name section is a string type that will hold the name of the item,
                  the description section is a string type that holds the description of the item",
                  "the price section is a string type that will hold the price of the item ")
 */
object JambaJuiceDataSource {
    val JambaMenu = listOf(
        RetailMenuItems(0, "Jamba Juice Menu",""," "),
        RetailMenuItems(1, "Aloha Pineapple","pineapple juice, pineapple sherbet, strawberries, bananas, nonfat Greek yogurt"," "),
        RetailMenuItems(2, "Caribbean passion","pear white grape mango orange passion juice blend* orange, sherbet, strawberries, peaches"," "),
        RetailMenuItems(3, "Mango-a-go-go","pear white grape mango orange passion juice blend* mangos, pineapple, sherbet"," "),
        RetailMenuItems(4, "Orange Dream Machine","orange juice, orange sherbet, vanilla, soymilk, fat free vanilla frozen yogurt"," "),
        RetailMenuItems(5, "Gotcha Matcha","matcha green tea, ice, agave caffeine 281mg (small), caffeine 421mg (medium)"," "),
        RetailMenuItems(6, "Sweet Cloud Whip Gotcha Matcha","matcha green tea, ice, coconut milk, sweet cloud whip foam, agave, caffeine 211mg (small) caffeine 351mg (medium)"," "),
        RetailMenuItems(7, "Bold 'n cold brew","cold brew, ice, agave caffeine 169mg (small) caffeine 254mg (medium)"," "),
        RetailMenuItems(8, "Sweet cloud whip bold 'n cold brew","cold brew, ice, coconut milk, sweet cloud whip foam agave. caffeine 127mg (small), 211mg (medium)"," "),
    )
}