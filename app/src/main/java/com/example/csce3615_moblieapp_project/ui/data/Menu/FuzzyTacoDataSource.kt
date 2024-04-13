package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
/*RetailMenuItems(the id is an integer type that has to be unique to the list,
                  the name section is a string type that will hold the name of the item,
                  the description section is a string type that holds the description of the item",
                  "the price section is a string type that will hold the price of the item ")
 */
object FuzzyTacoDataSource {
    val FuzzyTacoMenu = listOf(
        RetailMenuItems(0, "Fuzzy Taco Menu",""," "),
        RetailMenuItems(1, "Bacon, Egg, & Cheese Taco","Diced bacon, freshly cracked eggs, and shredded cheese served on a flour tortilla."," "),
        RetailMenuItems(2, "Bacon, Egg, & Cheese Burrito","Diced bacon, freshly cracked eggs, and shredded cheese wrapped in a large flour tortilla."," "),
        RetailMenuItems(3, "Chorizo, Egg & Cheese Taco","Chorizo, freshly cracked eggs, and shredded cheese served on a flour tortilla."," "),
        RetailMenuItems(4, "Chorizo, Egg & Cheese Burrito","Chorizo, freshly cracked eggs, and shredded cheese wrapped in a large flour tortilla."," "),
    )
}