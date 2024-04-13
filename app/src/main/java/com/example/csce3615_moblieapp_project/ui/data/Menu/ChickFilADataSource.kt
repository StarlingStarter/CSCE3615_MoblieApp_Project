package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems
/*RetailMenuItems(the id is an integer type that has to be unique to the list,
                  the name section is a string type that will hold the name of the item,
                  the description section is a string type that holds the description of the item",
                  "the price section is a string type that will hold the price of the item ")
 */
object ChickFilADataSource {
    val ChickFilaMenu = listOf(
        RetailMenuItems(0, "Chick-Fil-A Chicken Sandwich","Our original recipe for almost 60 years. A boneless breast of chicken seasoned to perfection, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttery bun with dill pickle chips","4.99"),
        RetailMenuItems(1, "Chick-Fil-A Chicken Deluxe Sandwich","A boneless breast of chicken seasoned to perfection, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttered bun with dill pickle chips, green leaf lettuce, tomato and American cheese.","$5.69"),
        RetailMenuItems(2, "Spicy Deluxe Sandwich","A boneless breast of chicken seasoned with a spicy blend of peppers, hand-breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttery bun with dill pickle chips, green leaf lettuce, tomato and Pepper Jack Cheese.","$5.99"),
        RetailMenuItems(3, "Grilled Chicken Sandwich","A lemon-herb marinated boneless breast of chicken, grilled for a tender and juicy backyard-smoky taste, served on a toasted multigrain bun with green leaf lettuce and tomato. The grilled chicken sandwich pairs well with Honey Roasted BBQ sauce.","$6.69"),
        RetailMenuItems(4, "Spicy Chicken Sandwich","A boneless breast of chicken seasoned with a spicy blend of peppers, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttered bun with dill pickle chips. Also available on a multigrain bun.","$5.29"),
        RetailMenuItems(5, "Chick-Fil-A Nuggets","Bite-sized pieces of boneless chicken breast, seasoned to perfection, freshly breaded and pressure cooked in 100% refined peanut oil. Available with choice of dipping sauce.","$5.09"),
        RetailMenuItems(6, "Grilled Nuggets","Bite-sized pieces of freshly marinated boneless breast of chicken, grilled for a tender and juicy backyard-smoky taste. Available with guest's choice of dipping sauce.","$5.95"),
        RetailMenuItems(7, "Fries","All items come without toppings. Please add toppings to your meal in the kiosk","$9.69"),
        RetailMenuItems(8, "Cobb Salad","Chick-fil-A® Nuggets, freshly breaded and pressure-cooked, sliced and served on a fresh bed of mixed greens, topped with roasted corn kernels, a blend of shredded Monterey Jack and Cheddar cheeses, crumbled bacon, sliced hard-boiled egg and grape tomatoes. Prepared fresh daily. Served with Charred Tomato and Crispy Red Bell Peppers. Pairs well with Avocado Lime Ranch dressing.","9.49"),
        RetailMenuItems(9, "Spicy Southwest Salad","Slices of grilled spicy chicken breast served on a fresh bed of mixed greens, topped with grape tomatoes, a blend of Monterey Jack and Cheddar cheeses, and a zesty combination of roasted corn, black beans, poblano chiles, and red bell peppers. Prepared fresh daily. Served with Seasoned Tortilla Strips and Chili Lime Pepitas. Pairs well with Creamy Salsa dressing.k","$9.69"),
        RetailMenuItems(10, "Market Salad","Sliced grilled chicken breast served on a fresh bed of mixed greens, topped with crumbled blue cheese and a mix of red and green apples, strawberries and blueberries. Prepared fresh daily. Served with Harvest Nut Granola and Roasted Almonds. Pairs well with Zesty Apple Cider Vinaigrette.","$9.69"),
        RetailMenuItems(11, "Chocolate Chunk Cookie","Cookies have both semi-sweet dark and milk chocolate chunks, along with wholesome oats.","$1.65"),
        RetailMenuItems(12, "Chocolate Fudge Brownie","A decadent dessert treat with rich semi-sweet chocolate melted into the batter and fury chunks","$2.25"),
    )
}