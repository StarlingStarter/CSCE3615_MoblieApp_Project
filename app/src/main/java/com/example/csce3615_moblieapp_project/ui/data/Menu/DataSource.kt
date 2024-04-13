package com.example.csce3615_moblieapp_project.ui.data.Menu

import com.example.csce3615_moblieapp_project.ui.data.RetailMenuItems

object DataSource {
//    val dpGrill = listOf(
//        //burgers
//        RetailMenuItems(0, "Discovery Perks Grill & salad Bar","All items come without toppings. Please add toppings to your meal in the kiosk"," "),
//        RetailMenuItems(1, "Single Cheese Burger","a single cheese burger","$2.50"),
//        RetailMenuItems(2, "Single Veggie Burger","a single veggie burger ","$2.50"),
//        RetailMenuItems(3, "Double Cheese Burger","a double cheese burger ","$3.50"),
//        RetailMenuItems(4, "Triple Cheese Burger","a triple cheese burger ","$4.50"),
//
//        RetailMenuItems(5, "Cheesy BLT","Our Grilled Cheese plus bacon, lettuce & tomato.","$3.50"),
//        RetailMenuItems(6, "Cheese Steak","Thin-sliced steak grilled with cheese on a hoagie.","$4.75"),
//        RetailMenuItems(7, "Chicken Crunch","Crispy boneless chicken breast on a soft roll: Spicy or Original.","$4"),
//        RetailMenuItems(8, "Grilled Cheese","Classic cheesy goodness on buttered sourdough.","$2"),
//
//        RetailMenuItems(9, "Little Birdie","Grilled chicken breast with bacon & cheddar, served on a roll.","$3.50"),
//        RetailMenuItems(10, "Made To Order Salads","Choose a base. Add your toppings. Dress it up! add 1 protein $2.75","$6.50"),
//        RetailMenuItems(11, "Portabello Burger","Marinated, seasoned and grilled. Served on a soft roll.","$6.50"),
//
//        RetailMenuItems(12, "Quesadilla","Steak","$4.25"),
//        RetailMenuItems(13, "Quesadilla","Chicken","$3.75"),
//        RetailMenuItems(14, "Quesadilla","Cheese","$3"),
//
//        RetailMenuItems(15, "Tender Basket","Two crispy chicken tenders & fries","$3.75"),
//        RetailMenuItems(16, "Aloo Gobi","Potato & cauliflower curry","$6.75"),
//        RetailMenuItems(17, "Chicken Tikka Masala","Roasted marinated chicken in a spiced sauce","$6.75"),
//        RetailMenuItems(18, "Paneer Butter Masala","Rich & creamy curry with cheese cubes","$6.75"),
//
//        RetailMenuItems(19, "Drink","24 oz ","$1.50"),
//        RetailMenuItems(20, "Drink","32 oz ","$1.75"),
//
//        RetailMenuItems(21, "Fresh Fruit"," ","$1.29"),
//        RetailMenuItems(22, "Mac & Cheese"," ","$2.50"),
//        RetailMenuItems(23, "Fries","regular","$2.50"),
//        RetailMenuItems(24, "Fries","small","$1.50"),
//    )
//    val dpStarbuck = listOf(
//        RetailMenuItems(0, "Discovery Perks",""," "),
//        //Coffee
//        RetailMenuItems(1, "Cold Brew","Tall (12 oz)","$2.25"),
//        RetailMenuItems(2, "Cold Brew","Grande (16 oz)","$2.75"),
//        RetailMenuItems(3, "Cold Brew","Venti (20 oz / Iced 24 oz)","$3.65"),
//
//        //Tea
//        RetailMenuItems(4, "Tazo Chai (hot or iced)","Tall (12 oz)","$3.65"),
//        RetailMenuItems(5, "Tazo Chai (hot or iced)","Grande (16 oz)","$4.25"),
//        RetailMenuItems(6, "Tazo Chai (hot or iced)","Venti (20 oz / Iced 24 oz)","$4.45"),
//
//        RetailMenuItems(7, "Tazo Hot Tea","Tall (12 oz)","$2.25"),
//        RetailMenuItems(8, "Tazo Hot Tea","Grande (16 oz)","$2.45"),
//        RetailMenuItems(9, "Tazo Hot Tea","Venti (20 oz / Iced 24 oz)","$2.65"),
//
//        RetailMenuItems(10, "Hot Chocolate","Tall (12 oz)","$2.95"),
//        RetailMenuItems(11, "Hot Chocolate","Grande (16 oz)","$4.25"),
//        RetailMenuItems(12, "Hot Chocolate","Venti (20 oz / Iced 24 oz)","$4.65"),
//
//        RetailMenuItems(13, "Espresso"," Available hot or iced"," "),
//        RetailMenuItems(14, "Caramel Macchiato","Tall (12 oz)","$3.95"),
//        RetailMenuItems(15, "Caramel Macchiato","Grande (16 oz)","$4.75"),
//        RetailMenuItems(16, "Caramel Macchiato","Venti (20 oz / Iced 24 oz) Iced","$5.25"),
//        RetailMenuItems(17, "Caramel Macchiato","Venti (20 oz / Iced 24 oz) Hot","$5.15"),
//
//        RetailMenuItems(18, "Cafe Mocha","Tall (12 oz)","$3.99"),
//        RetailMenuItems(19, "Cafe Mocha","Grande (16 oz)","$4.39"),
//        RetailMenuItems(20, "Cafe Mocha","Venti (20 oz / Iced 24 oz) Iced","$5.05"),
//        RetailMenuItems(21, "Cafe Mocha","Venti (20 oz / Iced 24 oz) Hot","$4.75"),
//
//        RetailMenuItems(22, "White Chocolate Mocha","Tall (12 oz)","$4.09"),
//        RetailMenuItems(23, "White Chocolate Mocha","Grande (16 oz)","$4.75"),
//        RetailMenuItems(24, "White Chocolate Mocha","Venti (20 oz / Iced 24 oz) Iced","$5.25"),
//        RetailMenuItems(25, "White Chocolate Mocha","Venti (20 oz / Iced 24 oz) Hot","$5.15"),
//
//        RetailMenuItems(26, "Cafe Latte","Tall (12 oz)","$3.29"),
//        RetailMenuItems(27, "Cafe Latte","Grande (16 oz)","$3.85"),
//        RetailMenuItems(28, "Cafe Latte","Venti (20 oz / Iced 24 oz) Iced","$4.55"),
//        RetailMenuItems(29, "Cafe Latte","Venti (20 oz / Iced 24 oz) Hot","$4.25"),
//
//        RetailMenuItems(30, "Cappuccino (hot only)","Tall (12 oz)","$3.29"),
//        RetailMenuItems(31, "Cappuccino (hot only)","Grande (16 oz)","$3.85"),
//        RetailMenuItems(32, "Cappuccino (hot only)","Venti (20 oz / Iced 24 oz)","$4.25"),
//
//        RetailMenuItems(33, "Cafe Americano","Tall (12 oz)","$1.95"),
//        RetailMenuItems(34, "Cafe Americano","Grande (16 oz)","$2.40"),
//        RetailMenuItems(35, "Cafe Americano","Venti (20 oz / Iced 24 oz)","$3.20"),
//
//        RetailMenuItems(36, "Coffee","Grande (16 0z)","$4.25"),
//        RetailMenuItems(37, "Caramel","Grande (16 oz)","$4.65"),
//        RetailMenuItems(38, "Mocha","Grande (16 0z)","$4.65"),
//        RetailMenuItems(39, "Vanilla Bean","Grande (16 0z)","$4.25"),
//
//        RetailMenuItems(40, "Additions","Espresso","$0.80"),
//        RetailMenuItems(41, "Additions","Syrup","$0.60"),
//        RetailMenuItems(42, "Additions","Sauce","$0.60"),
//        RetailMenuItems(43, "Additions","Soy, Coconut, Almond, or Oat Milk","$0.60"),
//    )

//    val AvestaMenu = listOf(
//        RetailMenuItems(0, "Avesta Menu","Will be updated in a later patch"," "),
//    )
//    val BurgerKingMenu = listOf(
//        RetailMenuItems(0, "original Chicken Sandwich","Lightly breaded chicken topped with crisp lettuce and creamy mayonnaise on a sesame seed bun.","$5.99"),
//        RetailMenuItems(1, "Texas double Whopper","Two ¼ lb.* flame-grilled beef patties topped with melty American cheese, crispy bacon, juicy tomatoes, crisp lettuce, sliced white onions, crunchy pickles, jalapenos, creamy mayonnaise, yellow mustard on a toasted sesame seed bun.","$8.29"),
//        RetailMenuItems(2, "Whooper with cheese","A flame-grilled beef patty topped with melted American cheese, crunchy pickles, yellow mustard, and ketchup on a toasted sesame seed bun.","$1.99"),
//        RetailMenuItems(3, "Spicy Royal crispy Chicken","Crispy white meat breast fillet coated with our triple pepper spicy glaze, topped with savory sauce, lettuce and juicy tomatoes on a toasted potato bun.","$5.99"),
//        RetailMenuItems(4, "Double Whooper","Two ¼ lb.* flame-grilled beef patties with juicy tomatoes, crisp lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a toasted sesame seed bun.","$7.39"),
//        RetailMenuItems(5, "Bacon Swiss Royal Crispy Chicken","Crispy white meat breast fillet topped with savory sauce, creamy swiss cheese, crispy bacon, lettuce and juicy tomatoes on a toasted potato bun.","$6.99"),
//        RetailMenuItems(6, "Bacon king","Two 1/4 lb* flame-grilled beef patties with crispy bacon, melted American cheese, ketchup, and creamy mayonnaise on a toasted sesame seed bun.","$8.99"),
//        RetailMenuItems(7, "big fish","White Alaskan Pollock with crispy panko breading, sweet tartar sauce, lettuce and crunchy pickles on a toasted potato bun.","$3.99"),
//        RetailMenuItems(8, "Chicken jr","its a chicken sandwich","$1.89"),
//        RetailMenuItems(9, "Hamburger","A flame-grilled beef patty with crunchy pickles, yellow mustard, and ketchup on a toasted sesame seed bun.","$1.69"),
//        RetailMenuItems(10, "Impossible Whopper","A flame-grilled, plant-based patty with juicy tomatoes, crisp lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a toasted sesame seed bun. ","$6.99"),
//        RetailMenuItems(11, "Rodeo Burger","A flame-grilled beef patty with sweet and smoky BBQ sauce and crispy onion rings on a toasted sesame seed bun.","$1.69"),
//        RetailMenuItems(12, "Whopper Jr","A flame-grilled beef patty with juicy tomatoes, crisp lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a toasted sesame seed bun.","$2.99"),
//        //RetailMenuItems(13, "Classic Royal Crispy Chicken"," ","$ "),
//        RetailMenuItems(14, "Whopper","America's Favorite Burger*, The Whopper Sandwich is a ¼ lb** of flame-grilled beef with juicy tomatoes, crisp lettuce, creamy mayonnaise, ketchup, crunchy pickles, and sliced white onions on a toasted sesame seed bun.","$5.99"),
////        RetailMenuItems(15, "SEC Biscuit"," ","$ "),
////        RetailMenuItems(16, "Full Loaded Croissan'wich"," ","$ "),
////        RetailMenuItems(17, "French Toast Sticks"," ","$ "),
////        RetailMenuItems(18, "Hash Browns"," ","$ "),
//        RetailMenuItems(19, "Chicken Fries","Breaded, crispy white meat chicken perfect for dipping in any of our delicious dipping sauces.","$1.99"),
//        RetailMenuItems(20, "Fries","Piping hot and perfectly salted.","$3.09"),
//        RetailMenuItems(21, "4 PC Nuggets","Bite-sized white meat chicken coated in crispy homestyle seasoned breading.","$1.49"),
//        RetailMenuItems(22, "Mozzarella Sticks","Perfectly matched with a marinara dipping sauce.","$1.69"),
//        RetailMenuItems(23, "Onion Rings","Golden brown, hot, and crispy.","$3.09 "),
//        RetailMenuItems(24, "Hershey Pie","A crunchy chocolate crust filled with chocolate crème filling and garnished with real HERSHEY’S® Chocolate Chips. ","$2.39 "),
//        RetailMenuItems(25, "2 Chocolate Chip Cookies","Our delicious OTIS SPUNKMEYER® Chocolate Chip cookie is loaded with melty chocolate chips and baked daily to perfection.","$1.00 "),
//
//    )
//    val CampusChatMenu = listOf(
//        RetailMenuItems(0, "The campus chat","These locations didn't have menu's posted online"," "),
//        RetailMenuItems(0, "Union Circle Fresh Salads & Sandwiches","Garden-fresh salads and fruit, plant-based proteins and naturally gluten-friendly options. UNT-themed panini sandwiches with layers of flavorful ingredients on Clark Bakery bread. Complete your meal with chips and one of our signature soups. "," "),
//        RetailMenuItems(1, "Clark Bakery","Baked on campus for ultimate freshness, our delicious, warm baked goods come right out of our ovens and to the bake shop. Stop by for some fresh donuts, muffins, bagels, croissants and more, while they last!"," "),
//        RetailMenuItems(2, "Flattop Grill","Enjoy hot-off-the grill, made-to-order burgers, chicken sandwiches, fries and other specialty grilled delights. We use fresh ground beef and buns made right here on campus. Be sure to check out the Daily Specials! "," "),
//        RetailMenuItems(3, "MiA'S Pizza","Artisan pizza, lasagna and more fired in a wood-burning oven. Our pizzas are lovingly made with hand-stretched-crust using Italian Caputo flour for an authentic Neapolitan experience."," "),
//        RetailMenuItems(4, "Sauté","Savor the flavor of “Mediterrasian” cuisine with our customizable noodle bar of Asian, Mediterranean and American flavors. Choose a chef-designed bowl or build your own from our selection of fresh vegetables, protein, noodles and sauce. Then watch as we sauté them to perfection. "," "),
//        RetailMenuItems(5, "Sushix","Specially– trained sushi chefs create a wonderful array of rice bowls, poke bowls and sushi selections fresh every day. "," "),
//    )
//    val ChickFilaMenu = listOf(
//        RetailMenuItems(0, "Chick-Fil-A Chicken Sandwich","Our original recipe for almost 60 years. A boneless breast of chicken seasoned to perfection, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttery bun with dill pickle chips","4.99"),
//        RetailMenuItems(1, "Chick-Fil-A Chicken Deluxe Sandwich","A boneless breast of chicken seasoned to perfection, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttered bun with dill pickle chips, green leaf lettuce, tomato and American cheese.","$5.69"),
//        RetailMenuItems(2, "Spicy Deluxe Sandwich","A boneless breast of chicken seasoned with a spicy blend of peppers, hand-breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttery bun with dill pickle chips, green leaf lettuce, tomato and Pepper Jack Cheese.","$5.99"),
//        RetailMenuItems(3, "Grilled Chicken Sandwich","A lemon-herb marinated boneless breast of chicken, grilled for a tender and juicy backyard-smoky taste, served on a toasted multigrain bun with green leaf lettuce and tomato. The grilled chicken sandwich pairs well with Honey Roasted BBQ sauce.","$6.69"),
//        RetailMenuItems(4, "Spicy Chicken Sandwich","A boneless breast of chicken seasoned with a spicy blend of peppers, freshly breaded, pressure cooked in 100% refined peanut oil and served on a toasted, buttered bun with dill pickle chips. Also available on a multigrain bun.","$5.29"),
//        RetailMenuItems(5, "Chick-Fil-A Nuggets","Bite-sized pieces of boneless chicken breast, seasoned to perfection, freshly breaded and pressure cooked in 100% refined peanut oil. Available with choice of dipping sauce.","$5.09"),
//        RetailMenuItems(6, "Grilled Nuggets","Bite-sized pieces of freshly marinated boneless breast of chicken, grilled for a tender and juicy backyard-smoky taste. Available with guest's choice of dipping sauce.","$5.95"),
//        RetailMenuItems(7, "Fries","All items come without toppings. Please add toppings to your meal in the kiosk","$9.69"),
//        RetailMenuItems(8, "Cobb Salad","Chick-fil-A® Nuggets, freshly breaded and pressure-cooked, sliced and served on a fresh bed of mixed greens, topped with roasted corn kernels, a blend of shredded Monterey Jack and Cheddar cheeses, crumbled bacon, sliced hard-boiled egg and grape tomatoes. Prepared fresh daily. Served with Charred Tomato and Crispy Red Bell Peppers. Pairs well with Avocado Lime Ranch dressing.","9.49"),
//        RetailMenuItems(9, "Spicy Southwest Salad","Slices of grilled spicy chicken breast served on a fresh bed of mixed greens, topped with grape tomatoes, a blend of Monterey Jack and Cheddar cheeses, and a zesty combination of roasted corn, black beans, poblano chiles, and red bell peppers. Prepared fresh daily. Served with Seasoned Tortilla Strips and Chili Lime Pepitas. Pairs well with Creamy Salsa dressing.k","$9.69"),
//        RetailMenuItems(10, "Market Salad","Sliced grilled chicken breast served on a fresh bed of mixed greens, topped with crumbled blue cheese and a mix of red and green apples, strawberries and blueberries. Prepared fresh daily. Served with Harvest Nut Granola and Roasted Almonds. Pairs well with Zesty Apple Cider Vinaigrette.","$9.69"),
//        RetailMenuItems(11, "Chocolate Chunk Cookie","Cookies have both semi-sweet dark and milk chocolate chunks, along with wholesome oats.","$1.65"),
//        RetailMenuItems(12, "Chocolate Fudge Brownie","A decadent dessert treat with rich semi-sweet chocolate melted into the batter and fury chunks","$2.25"),
//    )
//    val FuzzyTacoMenu = listOf(
//        RetailMenuItems(0, "Fuzzy Taco Menu",""," "),
//        RetailMenuItems(1, "Bacon, Egg, & Cheese Taco","Diced bacon, freshly cracked eggs, and shredded cheese served on a flour tortilla."," "),
//        RetailMenuItems(2, "Bacon, Egg, & Cheese Burrito","Diced bacon, freshly cracked eggs, and shredded cheese wrapped in a large flour tortilla."," "),
//        RetailMenuItems(3, "Chorizo, Egg & Cheese Taco","Chorizo, freshly cracked eggs, and shredded cheese served on a flour tortilla."," "),
//        RetailMenuItems(4, "Chorizo, Egg & Cheese Burrito","Chorizo, freshly cracked eggs, and shredded cheese wrapped in a large flour tortilla."," "),
//    )
//    val JambaMenu = listOf(
//        RetailMenuItems(0, "Jamba Juice Menu",""," "),
//        RetailMenuItems(1, "Aloha Pineapple","pineapple juice, pineapple sherbet, strawberries, bananas, nonfat Greek yogurt"," "),
//        RetailMenuItems(2, "Caribbean passion","pear white grape mango orange passion juice blend* orange, sherbet, strawberries, peaches"," "),
//        RetailMenuItems(3, "Mango-a-go-go","pear white grape mango orange passion juice blend* mangos, pineapple, sherbet"," "),
//        RetailMenuItems(4, "Orange Dream Machine","orange juice, orange sherbet, vanilla, soymilk, fat free vanilla frozen yogurt"," "),
//        RetailMenuItems(5, "Gotcha Matcha","matcha green tea, ice, agave caffeine 281mg (small), caffeine 421mg (medium)"," "),
//        RetailMenuItems(6, "Sweet Cloud Whip Gotcha Matcha","matcha green tea, ice, coconut milk, sweet cloud whip foam, agave, caffeine 211mg (small) caffeine 351mg (medium)"," "),
//        RetailMenuItems(7, "Bold 'n cold brew","cold brew, ice, agave caffeine 169mg (small) caffeine 254mg (medium)"," "),
//        RetailMenuItems(8, "Sweet cloud whip bold 'n cold brew","cold brew, ice, coconut milk, sweet cloud whip foam agave. caffeine 127mg (small), 211mg (medium)"," "),
//    )
//    val KrispyKrunchChickenMenu = listOf(
//        RetailMenuItems(0, "Krispy Krunch Menu",""," "),
//        RetailMenuItems(1, "2 Piece Chicken Meal Deal","Served with 1 honey butter biscuit","$5.29+"),
//        RetailMenuItems(2, "3 Piece Chicken Meal Deal","Served with 1 honey butter biscuit","$6.99+"),
//        RetailMenuItems(3, "5 Piece Chicken Meal Deal","Served with 1 honey butter biscuit","$8.49+"),
//        RetailMenuItems(4, "Cajun Tenders Meal Deal","Served with 1 honey butter biscuit","$6.99+"),
//        RetailMenuItems(5, "Cajun Fish Meal Deal","Served with 1 honey butter biscuit","$5.49+"),
//        RetailMenuItems(6, "Krispy Shrimp Meal Deal","Served with 1 honey butter biscuit","$5.79+"),
//        RetailMenuItems(7, "Krispy Chicken Sandwich Meal Deal","Does not include biscuit.","$4.59+"),
//        RetailMenuItems(8, "Family Meal - Chicken & Tenders","12 Piece Chicken Mix, 6 Piece Cajun Tenders, 6 Biscuits & Family Fries","$34.99"),
//
//    )
//    val StarbucksMenu = listOf(
//        RetailMenuItems(0, "Starbuck Menu","Will be updated in a later patch"," "),
//    )
//    val verdeEverydayMenu = listOf(
//        RetailMenuItems(0, "Verde Everday Menu" ,"Will be updated in a later patch"," "),
//    )
//    val cafeGABMenu = listOf(
//        RetailMenuItems(0, "cafe GAB ","Will be updated in a later patch"," "),
//    )
//    val bagleAMenu = listOf(
//        RetailMenuItems(0, "Einstein Bagles bros","Will be updated in a later patch"," "),
//    )
//    val StarbuckStandMenu = listOf(
//        RetailMenuItems(0, "Starbucks Stand","Will be updated in a later patch"," "),
//    )
//    val marketMenu = listOf(
//        RetailMenuItems(0, "The Market by Clark Bakery","Will be updated in a later patch"," "),
//    )
//    val WhichWichMenu = listOf(
//        RetailMenuItems(0, "Which Which","Will be updated in a later patch"," "),
//    )
}