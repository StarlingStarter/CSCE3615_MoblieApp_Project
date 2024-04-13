package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
/*RetailMenuItems(the id is an integer type that has to be unique to the list,
                  the name section is a string type that will hold the name of the item,
                  the description section is a string type that holds the description of the item",
                  "the price section is a string type that will hold the price of the item ")
 */
object DPStarbucksDataSource {
    val dpStarbuck = listOf(
        RetailMenuItems(0, "Discovery Perks",""," "),
        //Coffee
        RetailMenuItems(1, "Cold Brew","Tall (12 oz)","$2.25"),
        RetailMenuItems(2, "Cold Brew","Grande (16 oz)","$2.75"),
        RetailMenuItems(3, "Cold Brew","Venti (20 oz / Iced 24 oz)","$3.65"),

        //Tea
        RetailMenuItems(4, "Tazo Chai (hot or iced)","Tall (12 oz)","$3.65"),
        RetailMenuItems(5, "Tazo Chai (hot or iced)","Grande (16 oz)","$4.25"),
        RetailMenuItems(6, "Tazo Chai (hot or iced)","Venti (20 oz / Iced 24 oz)","$4.45"),

        RetailMenuItems(7, "Tazo Hot Tea","Tall (12 oz)","$2.25"),
        RetailMenuItems(8, "Tazo Hot Tea","Grande (16 oz)","$2.45"),
        RetailMenuItems(9, "Tazo Hot Tea","Venti (20 oz / Iced 24 oz)","$2.65"),

        RetailMenuItems(10, "Hot Chocolate","Tall (12 oz)","$2.95"),
        RetailMenuItems(11, "Hot Chocolate","Grande (16 oz)","$4.25"),
        RetailMenuItems(12, "Hot Chocolate","Venti (20 oz / Iced 24 oz)","$4.65"),

        RetailMenuItems(13, "Espresso"," Available hot or iced"," "),
        RetailMenuItems(14, "Caramel Macchiato","Tall (12 oz)","$3.95"),
        RetailMenuItems(15, "Caramel Macchiato","Grande (16 oz)","$4.75"),
        RetailMenuItems(16, "Caramel Macchiato","Venti (20 oz / Iced 24 oz) Iced","$5.25"),
        RetailMenuItems(17, "Caramel Macchiato","Venti (20 oz / Iced 24 oz) Hot","$5.15"),

        RetailMenuItems(18, "Cafe Mocha","Tall (12 oz)","$3.99"),
        RetailMenuItems(19, "Cafe Mocha","Grande (16 oz)","$4.39"),
        RetailMenuItems(20, "Cafe Mocha","Venti (20 oz / Iced 24 oz) Iced","$5.05"),
        RetailMenuItems(21, "Cafe Mocha","Venti (20 oz / Iced 24 oz) Hot","$4.75"),

        RetailMenuItems(22, "White Chocolate Mocha","Tall (12 oz)","$4.09"),
        RetailMenuItems(23, "White Chocolate Mocha","Grande (16 oz)","$4.75"),
        RetailMenuItems(24, "White Chocolate Mocha","Venti (20 oz / Iced 24 oz) Iced","$5.25"),
        RetailMenuItems(25, "White Chocolate Mocha","Venti (20 oz / Iced 24 oz) Hot","$5.15"),

        RetailMenuItems(26, "Cafe Latte","Tall (12 oz)","$3.29"),
        RetailMenuItems(27, "Cafe Latte","Grande (16 oz)","$3.85"),
        RetailMenuItems(28, "Cafe Latte","Venti (20 oz / Iced 24 oz) Iced","$4.55"),
        RetailMenuItems(29, "Cafe Latte","Venti (20 oz / Iced 24 oz) Hot","$4.25"),

        RetailMenuItems(30, "Cappuccino (hot only)","Tall (12 oz)","$3.29"),
        RetailMenuItems(31, "Cappuccino (hot only)","Grande (16 oz)","$3.85"),
        RetailMenuItems(32, "Cappuccino (hot only)","Venti (20 oz / Iced 24 oz)","$4.25"),

        RetailMenuItems(33, "Cafe Americano","Tall (12 oz)","$1.95"),
        RetailMenuItems(34, "Cafe Americano","Grande (16 oz)","$2.40"),
        RetailMenuItems(35, "Cafe Americano","Venti (20 oz / Iced 24 oz)","$3.20"),

        RetailMenuItems(36, "Coffee","Grande (16 0z)","$4.25"),
        RetailMenuItems(37, "Caramel","Grande (16 oz)","$4.65"),
        RetailMenuItems(38, "Mocha","Grande (16 0z)","$4.65"),
        RetailMenuItems(39, "Vanilla Bean","Grande (16 0z)","$4.25"),

        RetailMenuItems(40, "Additions","Espresso","$0.80"),
        RetailMenuItems(41, "Additions","Syrup","$0.60"),
        RetailMenuItems(42, "Additions","Sauce","$0.60"),
        RetailMenuItems(43, "Additions","Soy, Coconut, Almond, or Oat Milk","$0.60"),
    )
}