package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
/*RetailMenuItems(the id is an integer type that has to be unique to the list,
                  the name section is a string type that will hold the name of the item,
                  the description section is a string type that holds the description of the item",
                  "the price section is a string type that will hold the price of the item ")
 */
object DPGrillDataSource {
    val dpGrill = listOf(
        //burgers
        RetailMenuItems(0, "Discovery Perks Grill & salad Bar","All items come without toppings. Please add toppings to your meal in the kiosk"," "),
        RetailMenuItems(1, "Single Cheese Burger","a single cheese burger","$2.50"),
        RetailMenuItems(2, "Single Veggie Burger","a single veggie burger ","$2.50"),
        RetailMenuItems(3, "Double Cheese Burger","a double cheese burger ","$3.50"),
        RetailMenuItems(4, "Triple Cheese Burger","a triple cheese burger ","$4.50"),

        RetailMenuItems(5, "Cheesy BLT","Our Grilled Cheese plus bacon, lettuce & tomato.","$3.50"),
        RetailMenuItems(6, "Cheese Steak","Thin-sliced steak grilled with cheese on a hoagie.","$4.75"),
        RetailMenuItems(7, "Chicken Crunch","Crispy boneless chicken breast on a soft roll: Spicy or Original.","$4"),
        RetailMenuItems(8, "Grilled Cheese","Classic cheesy goodness on buttered sourdough.","$2"),

        RetailMenuItems(9, "Little Birdie","Grilled chicken breast with bacon & cheddar, served on a roll.","$3.50"),
        RetailMenuItems(10, "Made To Order Salads","Choose a base. Add your toppings. Dress it up! add 1 protein $2.75","$6.50"),
        RetailMenuItems(11, "Portabello Burger","Marinated, seasoned and grilled. Served on a soft roll.","$6.50"),

        RetailMenuItems(12, "Quesadilla","Steak","$4.25"),
        RetailMenuItems(13, "Quesadilla","Chicken","$3.75"),
        RetailMenuItems(14, "Quesadilla","Cheese","$3"),

        RetailMenuItems(15, "Tender Basket","Two crispy chicken tenders & fries","$3.75"),
        RetailMenuItems(16, "Aloo Gobi","Potato & cauliflower curry","$6.75"),
        RetailMenuItems(17, "Chicken Tikka Masala","Roasted marinated chicken in a spiced sauce","$6.75"),
        RetailMenuItems(18, "Paneer Butter Masala","Rich & creamy curry with cheese cubes","$6.75"),

        RetailMenuItems(19, "Drink","24 oz ","$1.50"),
        RetailMenuItems(20, "Drink","32 oz ","$1.75"),

        RetailMenuItems(21, "Fresh Fruit"," ","$1.29"),
        RetailMenuItems(22, "Mac & Cheese"," ","$2.50"),
        RetailMenuItems(23, "Fries","regular","$2.50"),
        RetailMenuItems(24, "Fries","small","$1.50"),
    )
}