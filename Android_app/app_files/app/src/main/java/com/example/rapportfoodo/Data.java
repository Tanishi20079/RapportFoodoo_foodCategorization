package com.example.rapportfoodo;

import java.util.HashMap;
import java.util.List;

public class Data {

    public static String name;

    public static String[] dishNames = new String[]{
            "hot_dog","chocolate_cake","chocolate_mousse","ice_cream","pancakes","pizza","samosa","cup_cakes","donuts",
            "sushi","dumplings","french_toast","french_fries","hamburger","mussels","spring_rolls","macarons","grilled_cheese_sandwich",
            "gnocchi","garlic_bread","fried_rice","nachos","red_velvet_cake","strawberry_shortcake","waffles"};



    //1
    public static String[][] mainArray=new String[][]{{
            "Hot Dog",
            "Restaurant",
            "2 tbsp oil\n"+"1 chilli (finely chopped) \n"+"2 clove garlic (finely chopped) \n"+"1 inch ginger (finely chopped)\n"+"1 onion (finely chopped)\n"+"1 carrot (grated)\n"+"1 cup cabbage (finely chopped)\n"+"1 capsicum (finely chopped)\n"+"2 tbsp sweet corn\n"+"½ tsp kashmiri red chilli powder\n"+"½ tsp cumin powder\n"+"½ tsp garam masala\n"+"¼ tsp pepper powder\n"+"½ tsp salt\n"+"2 potato (boiled & mashed)\n"+"1 cup paneer / cottage cheese (grated)\n"+"2 tbsp coriander (finely chopped)\n"+"1 tsp lemon juice\n"+"for caramelized onion:2 tbsp oil\n"+"2 onion (sliced)\n"+"1 tsp butter\n"+"1 tsp sugar\n"+"½ tsp salt\n"+"for assembling:2 hot dog bread roll\n"+"eggless mayonnaise\n"+"tomato sauce\n"+"mustard sauce\n"+"cheese (grated)\n",
            "Step1 aloo paneer mixture for veg sausage roll:firstly in a large kadai heat 2 tbsp oil and saute 1 chilli, 2 clove garlic, 1 inch ginger,add 1 onion and saute slightly\n"+
                    "Step2 Now add 1 carrot, 1 cup cabbage,capsicum and 2 tbsp sweet corn.,saute well until the vegetables shrink slightly.,further add ½ tsp chilli powder, ½ tsp cumin powder, ½ tsp garam masala, ¼ tsp pepper powder and ½ tsp salt\n"+
                    "Step3 saute for a minute or until the spices turn aromatic.,now add 2 potato, 1 cup paneer and mix well. mix until everything is well combined.,additionally, add 2 tbsp coriander and 1 tsp lemon juice.,mix well, aloo paneer mixture is ready.,to prepare veg sausage roll, grease hands with oil and pinch a large ball sized mixture.,shape into a long cylindrical shape.\n"+
                    "Step4 Now grill it in a pan cooking all the sides. keep aside.,caramelized onion preparation:,in a heavy-bottomed pan heat 2 tbsp oil and add 2 onion.,mix gently making sure to coat the onions well with oil.,cook on low flame until the bottom of the onion is cooked well.,stir in between to cook uniformly. do not over stir as the caramelization process will not happen.\n"+
                    "Step5 Add 1 tsp butter, 1 tsp sugar and ½ tsp salt.,mix well and cook on low flame until the onions are cooked completely.,caramelized onions are ready. keep aside.,way 1 hot dog assembling:,firstly, slit the hot dog in the centre. you can alternatively, slit from the cross side.,squeeze in 2 tsp of eggless mayonnaise.,also, add 1 tbsp of caramelised onion and place in a prepared veg sausage roll.,top with few more caramelised onion.,now garnish with tomato sauce and mustard sauce.,way 2 hot dog assembling:,firstly, slit the hot dog in the centre. you can alternatively, slit from the cross side.,squeeze in 2 tsp of eggless mayonnaise.,also, add 1 tbsp of caramelised onion and place in a tbsp of prepared aloo paneer mixture.,top with few more caramelised onion.,now garnish with tomato sauce and mustard sauce."
    },{
            "Chocolate Cake",
            "Cake",
            "1.75 cups all purpose flour, or (plain flour), (8 oz | 227 g) \n"+
                    "0.75 cup unsweetened cocoa powder, (2.6 oz | 75 g) or regular Hershey's cocoa powder\n"+
                    "½ teaspoon baking powder\n"+
                    "1½ teaspoon baking soda, (or bi-carb soda)\n"+
                    "1 teaspoon salt\n"+
                    "2 cups white granulated sugar, (14 oz | 410 g)\n"+
                    "2 large eggs\n"+
                    "1 cup milk, (250 ml)\n"+
                    "½ cup vegetable oil, (125 ml)\n"+
                    "2 teaspoons pure vanilla extract\n"+
                    "1 cup boiling water (250 ml)\n"+
                    "\nCHOCOLATE BUTTERCREAM FROSTING\n"+
                    "4 oz butter, (120 g | ½ cup)\n"+
                    "2/3 cup unsweetened cocoa powder, or regular HERSHEY'S (2.4 oz | 65 g)\n"+
                    "3 cups powdered sugar, (confectioners or icing sugar)\n"+
                    "1/3 cup milk\n"+
                    "1 teaspoon pure vanilla extract \n",

            "Step 1 - Preheat oven to 350°F (180°C) standard or 320°F (160°C) fan/convection.\n"+
                    "Step 2 - Lightly grease 2x 9-inch (22cm) round cake pans with butter. Line base with parchment paper.\n"+
                    "Step 3 - Sift together flour, cocoa, baking powder, baking soda and salt into a large bowl. Whisk in sugar, then add eggs, milk, oil and vanilla.\n "+
                    "Step 4 - Whisk well to combine until lump free, about 30 seconds.\n"+
                    "Step 5 - Pour boiling water into batter, mixing well. Cake batter is thin in consistency.\n"+
                    "Step 6 - Pour batter into cake pans and bake for 30-35 minutes or until a wooden skewer inserted into the centre comes out clean.\n"+
                    "Step 7 - Let cool for 10 minutes, then turn out onto wire racks to cool completely before frosting."
    },{
            "Chocolate Mousse","Cake",
            "You’ll only need 5 ingredients for this recipe!\n"+
                    "Heavy cream – this rich ingredient makes the mousse light and fluffy and amazingly decadent.\n"+
                    "Egg yolks – this thickens up custard mixture in the mousse and boosts richness.\n"+
                    "Granulated sugar – you can adjust this slightly to taste.\n"+
                    "Vanilla extract – I usually like to add a fair amount of vanilla to chocolate desserts. It compliments those flavors so nicely.\n"+
                    "Bittersweet chocolate – use chocolate baking bars or other good quality chocolate bars.\n"+
                    "Sea salt (optional) – regular table salt works fine too. You only need to add a pinch or two, and honestly it can even be omitted. It just picks up the flavors a bit.",

            "Step 1. Whip egg yolks and sugar: In medium mixing bowl using an electric hand mixer whip together egg yolks and granulated sugar on high speed until pale and fluffy, about 2 minutes.\n"+
                    "Step 2. Heat 3/4 cup cream: Warm 3/4 cup of the heavy cream in a 2-quart saucepan on the stovetop over low heat until hot.\n"+
                    "Step 3. Temper eggs with cream mixture: While whisking egg mixture slowly pour in warm cream mixture to temper egg yolks. Then pour combined egg yolk and cream mixture back into saucepan.\n"+
                    "Step 4. Cook mixture to 160 degrees: Cook over low heat, whisking constantly, until mixture thickens just slightly and reaches 160 degrees on an instant read thermometer. If you notice any clumps strain through a sieve and return to saucepan.\n"+
                    "Mixing egg yolks and sugar with electric mixer. Tempering egg yolks in mixing bowl for mousse and cooking mixture in saucepan.\n"+

                    "Step 5. Melt in chocolate: Off heat add in chocolate, stir until melted.\n"+
                    "Step 6. Let cool to room temp: Pour mixture into a clean medium bowl, cover and chill, stirring about every 10 – 15 minutes until it reaches 70 degrees (or no longer warm), about 30 – 40 minutes total.\n"+
                    "Step 7. Whip remaining cream, fold into chocolate mixture: Whip remaining heavy cream until very stiff peaks form. Fold whipped cream into chocolate mixture until combined.\n"+
                    "Step 8. Divide mixture among dessert cups, chill: Pipe or spoon into dessert cups. Chill 2 hours. Top with sweetened whipped cream if desired and garnish with shaved or grated chocolate.\n"
    } ,{
            "Ice Cream",
            "Restaurant",
            "1 can chilled sweetened condensed milk or 400 grams sweetened condensed milk\n"+"2.5 to 2.75 cups chilled whipping cream - 35% to 50% fat\n"+"2 teaspoons vanilla extract or 1 teaspoon vanilla essence or 1 vanilla bean or 1 teaspoon vanilla powder\n"+"some grated chocolate for garnish - optional",
            "Step1 In a large bowl, take 2.5 to 2.75 cups of chilled whipping cream (30% to 50% fat). Add 2 teaspoons vanilla extract. If using vanilla essence, then add 1 teaspoon of it.\n" +
                    "Step2 With an electric beater at full speed, begin to whip the cream. Timing will vary depending on the fat content in the cream. \n" +
                    "Step3 Both for amul fresh cream and amul whipping cream, it takes about 8 to 10 minutes. Also be careful while whipping and do not whip too much, as then the cream would get churned into butter.,Whip till stiff peaks are formed. You can also whip till soft peaks\n" +
                    "Step4 If using 25% fat cream, then you can whip till soft peaks. Now add 400 grams of chilled sweetened condensed milk (about 1.6 cups).,Fold gently but very well. Also remember not to overfold as then the ice cream mixture can fall flat.\n" +
                    "Step5 Remove the vanilla ice cream mixture in a container or box and then cover it tightly. Or you can cover the same bowl (if its freezer safe) with a tight fitting lid or aluminium foil.\n"+
                    "Freeze till the ice cream is set. Before serving, keep the ice cream box or bowl for some minutes at room temperature. Then using a scoop, remove the ice cream.\n" +
                    "Step6 Serve vanilla ice cream. You can sprinkle some chocolate chips or grated chocolate or candied fruits or even tutti frutti from top if you want."
    },{
            "Pancakes",
            "Restaurant",
            "1 ½ cups all-purpose flour\n"+"3 ½ teaspoons baking powder\n" + "1 teaspoon salt\n" + "1 tablespoon white sugar\n 1 ¼ cups milk \n 1 egg \n 3 tablespoons butter melted\n",
            "Step1 In a large bowl, sift together the flour, baking powder, salt and sugar. Make a well in the center and pour in the milk, egg and melted butter; mix until smooth.\n" +
                    "Step2 Heat a lightly oiled griddle or frying pan over medium-high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. Brown on both sides and serve hot."
    },{
            "Pizza",
            "Restaurant",
            "Written with instructions",
            "Step 1 – Making Pizza Dough\n 1.1 - First, in a large bowl mix together 1.5 teaspoons instant yeast and ½ teaspoon of sugar.\n 1.2. Add 1 cup of lukewarm water (44 degrees Celsius) and stir. Set aside and let the yeast activate.\n 1.3. You should start to see the yeast mixture bubbling up and doubling in size after about 10 to 15 minutes.\n 1.4. Combine 1 cup of unbleached all purpose flour (or bread flour) with 1 teaspoon of salt and 3 tablespoons of olive oil.\n 1.5. Stir with a whisk or wooden spoon or steel spoon. \n 1.6. Add one more cup of the flour.\n 1.7. Keep on stirring. The mixture will be quite sticky, like in the photo below.\n 1.8. Add the last cup of flour and continue to stir. The dough will start to form and leave the sides of the bowl, but will still be sticky.\n 1.9. Now it’s time to knead the dough by hand until it forms a smooth dough. Dust with flour to prevent sticking as you work. The dough will be soft and elastic, and no longer sticky. \n 1.10. Keep your dough in the deep bowl, and lightly apply a bit of olive oil all around the outside of the dough. This will keep it from sticking to the sides of the bowl once the dough proves and grows.\n\n Cover loosely with a kitchen napkin or towel, and let rest at room temperature for the dough to leaven: \n    45 minutes to 1 hour for instant yeast\n    1.5 to 2 hours for dry active yeast\n\n 1.11. After exactly 1 hour my dough had risen and doubled up to what you see below.\n 1.12. To make the pizza right away, portion and flatten the dough to a disk. In the below photo, you can see that the dough has leavened well, with stringy strands and many air pockets that will make a chewy crust.\n Step 2 – Making Pizza Sauce from scratch\n 2.1. You can choose to either chop the tomatoes (500 grams or 5 to 6 medium tomatoes) and use them fresh to make the sauce, or blanch them first and then add in a blender. Blanching will reduce the cooking time, but is not necessary for making a delicious sauce.\n 2.2. Crush the raw or blanched tomatoes in the blender to make a puree that is as smooth or chunky as you like for this pizza recipe.\n 2.3. Next, in a large sauce pan heat ¼ cup olive oil, and add 2 teaspoons minced garlic. Sauté and stir for some seconds to soften the garlic.\n 2.3. Now add the tomato puree, and mix well.\n 2.4. Continue stirring and let the tomatoes cook for 5 minutes. \n 5. Add salt as needed. Mix and stir.\n 2.6. Cover the pan with lid and simmer the tomato sauce on low heat for 20 minutes, stirring occasionally, until the tomatoes have softened. If the sauce looks too thick you can add ¼ cup water. Then cover and continue to cook.\n 2.7. Simmer until the tomatoes have completely cooked and the sauce has thickened.\n 2.8. Stir in herbs and crushed black pepper. \nFor the pizza sauce seasonings in this recipe, you can add ¼ cup chopped basil (or 3 to 4 teaspoons dried basil), 2 to 3 teaspoons dried oregano (or 2 tablespoons fresh oregano) and fresh crushed black pepper as needed. If you can I recommend using fresh herbs for the boldest Italian flavor.\n 2.8. Mix the sauce well and set aside. \n Step 3 – Assembling and baking\n 3.1. First, preheat the oven to the highest temperature in your oven. In my oven it is 230 degrees Celsius (450 degrees Fahrenheit). Grease a round metal baking pan with olive oil, and then lightly dust it with maize flour (cornmeal), semolina (rava or sooji) or flour. \n 3.2. Divide the pizza dough into equals parts to make either 4 small or 2 large or 3 medium size pizzas. Wrap any dough you’re not using in plastic wrap and keep in the fridge for up to 3 days total. \n 2.3. Using clean, dry hands, take one portion of the divided dough and roll it into a neat round ball. Place on a cutting board or countertop that’s been lightly coated with some flour, and sprinkle the dough with a light dusting of more flour. \n 3.4. Use a rolling pin to roll the dough ball into a large round or oval shape of about ⅛ to ¼ inch thickness. Roll the dough from the center towards the outer edges for the most even pizza dough. You may have to dust the surface with flour as you work. \n 3.5. Once stretched to the desired size, gently place the pizza base in the greased baking pan. Be careful not to tear the dough, as it is very soft and stretchy.\n 3.6. At this point you can prick the dough with a fork if you want a thinner, crisper crust. This also helps in the crust not puffing up when baking. However, you can leave the dough as-is for a fluffier, chewier veg pizza crust.\n 3.7. Use a pastry brush to lightly brush the surface of the crust with olive oil.\n 3.8. Then, spread the tomato sauce on the pizza in a thin, even layer. Leave about an inch of dough around the outer edge free from sauce for a perfect pizza crust.\n 3.9. Top the sauce with a generous handful or two of shredded mozzarella cheese.\n 3.10. Place your choice of veggies on top of the cheese, making sure to spread the toppings evenly.\n 3.11. Here is another topping idea for you – a few mushrooms, onions, capsicum and green olives. When using mushrooms make sure they are fresh and top then sparingly. Many mushrooms will make the crust soggy.\n 3.12. Next, add a light layer of grated parmesan cheese to finish the pizza.\n 3.13. Place the baking pan close to the lower heating element (or you can keep it even on the crumb tray of your OTG) to get the crispiest crust and perfectly molten, gooey melted cheese. Bake the veg pizza in the preheated oven for 10 to 15 minutes, until the cheese melts and the crust is golden.\n\n Your perfect personalized veg pizza is now ready to enjoy!!!!"

    },{
            "Samosa",
            "Restaurant",
            "For Making Samosa Pastry2 cups all-purpose flour (maida) 250 grams \n 1 teaspoon carom seeds \n 1 teaspoon salt or add as required\n 6 tablespoons Ghee (clarified butter) 50 grams \n7 to 8 tablespoons water or add as required \n For Cooking Potato & Peas,3 medium-sized potatoes – 300 to 350 grams or 3 cups chopped boiled potatoes\n ½ cup green peas – 180 grams fresh – can use frozen peas\n 2 cups water – for steaming \n Other Ingredients:1 tablespoon oil – I used mustard oil. sunflower, canola, grapeseed oil can be used\n ½ teaspoon cumin seeds\n 1 teaspoon finely chopped ginger or 1 inch ginger\n 2 teaspoons finely chopped green chillies or serrano peppers or 1 to 2 green chillies\n ½ teaspoon red chili powder or cayenne pepper \n 1 pinch asafoetida (hing) – optional\n 1 to 2 teaspoons dry mango powder (amchur)\n salt as required\n 1 tablespoon chopped coriander leaves (cilantro)\n oil for deep frying – as required, any neutral tasting oil\n" +
                    "Whole Spices To Be Ground½ inch cinnamon \n" +
                    "1 clove – optional\n 3 black peppercorns\n 1 green cardamom\n ½ teaspoon cumin seeds\n ½ teaspoon fennel seeds\n 2 teaspoons coriander seeds",
            "Step1 Making The Dough:Take the flour, carom seeds, salt in a bowl. Mix well and add ghee.,With your fingertips rub the ghee or oil in the flour to get a breadcrumb like consistency.,The whole mixture should clump together when joined and not fall apart.\n" +
                    "Step2 Add water in parts and knead to a firm dough.,If the dough looks dry or floury, then add 1 to 2 tablespoons more water and knead.,Cover the dough with a moistened napkin and set aside for 30 minutes.,Making Potato Stuffing,Steam or boil the potatoes and peas till are cooked completely. \n" +
                    "Step3 Drain them of any extra water in a colander or sieve.,Peel the boiled potatoes and chop them into small cubes,Dry roast all the whole spices mentioned in the above list until fragrant taking care not to burn them.,When the spices are warm or cool at room temperature, grind them in a dry grinder or coffee grinder to a semi-fine or fine powder.,Heat oil in a pan. add the cumin seeds and crackle them.\n" +
                    "Step4 Add the ginger and green chillies. Sauté for a few seconds until the raw aroma of ginger goes away.,Add the steamed green peas, red chili powder, the freshly ground spice powder, dry mango powder and asafoetida.\n" +
                    "Step5 Stir and sauté on a low heat for 1 to 2 minutes.,Add the potato cubes. Mix very well and sauté for about 2 to 3 minutes on low heat with frequent stirring.,Set aside the potato filling aside to cool at room temperature\n"
    },{
            "Cupcake cake",
            "Cake",
            "3/4 cup (94g) all-purpose flour (spoon & leveled)\n"+
                    "1/2 cup (45g) unsweetened natural cocoa powder\n"+
                    "3/4 teaspoon baking powder\n"+
                    "1/2 teaspoon baking soda\n"+
                    "1/4 teaspoon salt\n"+
                    "2 large eggs, at room temperature\n"+
                    "1/2 cup (100g) granulated sugar\n"+
                    "1/2 cup (100g) packed light brown sugar\n"+
                    "1/3 cup (80ml) vegetable or canola oil (or melted coconut oil)\n"+
                    "2 teaspoons pure vanilla extract\n"+
                    "1/2 cup (120ml) buttermilk, at room temperature",
            "Step 1 - Preheat the oven to 350°F (177°C). Line a 12-cup muffin pan with cupcake liners. Line a second pan with 2 liners – this recipe makes about 14 cupcakes. Set aside.\n"+
                    "Step 2 - Cupcakes: Whisk the flour, cocoa powder, baking powder, baking soda, and salt together in a large bowl until thoroughly combined. Set aside. In a medium bowl, whisk the eggs, granulated sugar, brown sugar, oil, and vanilla together until combined. Pour half of the wet ingredients into the dry ingredients. Then half of the buttermilk. Gently whisk for a few seconds. Repeat with the remaining wet ingredients and buttermilk. Stir until just combined; do not overmix. The batter will be thin.\n"+
                    "Step 3 - Pour or spoon the batter into the liners. Fill only halfway (this is imperative! only halfway!) to avoid spilling over the sides or sinking.\n"+
                    "Step 4 - Bake for 18-21 minutes, or until a toothpick inserted in the center comes out clean. Allow to cool completely before frosting. I usually let them cool in the pan.\n"+
                    "Step 5 - Frost cooled cupcakes however you’d like. I used chocolate buttercream and Wilton 1M piping tip for these pictured cupcakes. Top with sprinkles, if desired. Store leftovers in the refrigerator for up to 5 days.\n"
    },{
            "Donuts",
            "Cafe",
            "3 1/2 cups (1lb 2oz/497g) all-purpose flour\n"+
                    "3/4 cup (6oz/170g) sugar\n"+
                    "1/2 teaspoon baking soda\n"+
                    "2 teaspoons baking powder\n"+
                    "1 teaspoon salt\n"+
                    "1 teaspoon ground cinnamon\n"+
                    "1/2 teaspoon ground nutmeg , optional\n"+
                    "3/4 cup (6floz/170ml) buttermilk\n"+
                    "1/4 cup (2oz/57g) butter, melted\n"+
                    "2 eggs\n"+
                    "Vegetable oil , for frying\n"
            ,

            "Step1 Fill a pan with about 1 inch of vegetable oil then line a baking tray with a wire rack and paper towel for the donuts to cool and drain, set aside while making the dough.\n"+
                    "Step2 In a medium bowl combine the flour, sugar, baking powder, baking soda, salt and spices, set aside.\n"+
                    "step3 In another large bowl combine the melted butter, buttermilk and eggs. (Check notes for egg substitute)\n"+
                    "Step4 Using a whisk, gradually whisk the dry ingredients into the wet until a sticky dough is formed.\n"+
                    "Step5 Transfer the dough to a lightly floured work surface and bring the dough together. Then use your palms to press the dough into roughly a 12-inch rectangle about 1/2 inch thick.\n"+
                    "Step6 Before cutting out your dough, heat the oil over medium-low heat (this should take 5-7 minutes).\n"+
                    "Step7 While the oil is heating, cut out your donuts: Using a 3 inch round cookie cutter and a 1-inch cookie cutter, cut out the donuts and the donut holes. You should be able to cut out about 12 donuts. If you have any extra dough left after cutting out, stick it all together, press it out and repeat the process until you have used up all of the dough.\n"+
                    "Step8 Transfer your cut out donuts and donut holes to a baking tray and place the tray near your stove so you can easily place the donuts into the oil.\n"+
                    "Step9 To make sure your oil is the right temperature test it with a donut hole. If it's hot enough this should puff up and be golden brown after cooking for roughly 2 minutes per side.\n"+
                    "Step10 When ready to fry carefully drop the donuts into the oil. Allow the donuts to fry for about 3 minutes per side (donut holes for 2), or until golden brown.\n"+
                    "Step11 Once puffed up and golden brown on both sides carefully remove from the oil using a fish turner, tongs or spider. Be careful as the oil will be very hot. DO NOT walk away from the pan at any stage of frying. If you need assistance with this step ask for help.\n"+
                    "Step12 After transferring the cooked donuts to your wire rack, repeat the process with the remaining donuts and donut holes until they are all fried off.\n"+
                    "Step13 If tossing in cinnamon sugar, this can be done as soon as the donuts are cool enough to handle.\n"+
                    "Step14 If glazing the donuts do this while still warm so the glaze soaks in. Follow my directions for 5 donut glazes. Allow to cool for about 5-7 minutes then dunk both sides in the glaze. Return to wire rack to set (you may want to do this 2 times for an extra thick layer of glaze).\n"+
                    "Enjoy immediately. These donuts are best eaten within 24 hours of cooking. Enjoy!!!!"


    },{
            "Sushi",
            "Resturant",
            "6 sheets sushi seaweed aka nori\n"+"1 batch prepared sushi rice\n"+"1/2 lb sushi-grade raw salmon or desired raw fish of choice\n " +
                    "4 oz cream cheese sliced into strips\n"+"1 avocado sliced\n"+"soy sauce for serving",
            "Step1 Place the seaweed on a bamboo mat, then cover the sheet of seaweed with an even layer of prepared sushi rice.\n" +
                    "Step2 Smooth gently with the rice paddle,Layer salmon, cream cheese, and avocado on the rice, and roll it up tightly.\n" +
                    "Step3 Slice with a sharp knife, and enjoy with soy sauce."
    },{

            "Dumplings","Restuarant",
            "for 24 dumplings\n"+
                    "4 cups all-purpose flour (500 g)\n"+
                    "2 teaspoons salt, divided\n"+
                    "1 ¼ cups warm water (300 mL)\n"+
                    "2 cups red cabbage (200 g)\n"+
                    "2 cups green onion (300 g), sliced\n"+
                    "6 cloves garlic, minced\n"+
                    "4 tablespoons ginger, minced\n"+
                    "2 tablespoons soy sauce\n"+
                    "2 tablespoons sesame oil\n"+
                    "½ lb ground pork (225 g)\n"+
                    "½ teaspoon pepper\n"+
                    "¾ cup mushroom (55 g), diced\n"+
                    "¾ cup carrot (90 g), diced\n"+
                    "½ lb shrimp (225 g), peeled and deveined\n\n"+
                    "DIPPING SAUCE\n"+
                    "¼ cup soy sauce (60 mL)\n"+
                    "¼ cup rice wine vinegar (60 mL)\n"+
                    "1 teaspoon sesame oil\n"+
                    "1 teaspoon crushed red pepper flake",

            "Step 1 - Preparation\n"+
                    "Step 2 - In a large bowl, combine the flour, 1 teaspoon of salt, and the warm water and mix until well-combined.\n"+
                    "Step 3 - Roll out dough on a floured surface and knead until smooth.\n"+
                    "Step 4 - Divide the dough into 4 equal parts.\n"+
                    "Step 5 - Roll out 1 piece of dough into a thin log and divide into 6 or 8 pieces, depending on the size of dumplings you want. Repeat with the remaining dough portions.\n"+
                    "Step 6 - Lightly flour the dough pieces and roll out 1 piece into a thin circle roughly 4-inches (10 cm) in diameter.\n"+
                    "Step 7 - Keep the dumpling wrappers separated with a small piece of parchment paper and repeat with the remaining dough.\n"+
                    "Step 8 - Combine the cabbage, green onions, garlic, ginger, soy sauce, and sesame oil in a medium bowl and mix until well-incorporated.\n"+
                    "Step 9 - For the pork filling, combine the ground pork with the remaining teaspoon of salt, the pepper and 1 cup (125g) of the cabbage mixture and stir until well-incorporated.\n"+
                    "Step 10 - For the veggie filling, combine the mushrooms and carrot and microwave for 3 minutes, until soft. Add 1 cup (125g) of the cabbage mixture and stir until well-incorporated.\n"+
                    "Step 11 - For the shrimp filling, combine the shrimp with 1 cup (125g) of the cabbage mixture and stir until well-incorporated.\n"+
                    "Step 12 - To assemble the dumplings, add roughly 1 heaping tablespoon of filling to the center of a dumpling wrapper. With your finger, lightly coat half of the outside of the wrapper with water. Fold the moistened half of the wrapper over the filling and, using your fingers, pleat the edges to seal. Repeat with the remaining fillings and wrappers.\n"+
                    "Step 13 - Heat the oil over medium high in a large skillet and add a few dumplings, cooking them in batches. Once the bottoms of the dumplings start to brown, add a splash of water and cover with a lid. Steam for about 5 minutes, or until the dumplings are cooked and the water has evaporated. Transfer the cooked dumplings to a paper towel-lined plate to remove any excess moisture or grease.\n"+
                    "Step 14 - In a small bowl, combine the soy sauce, rice vinegar, sesame oil, and pepper flakes and stir to combine. Serve the dumplings immediately with the dipping sauce.\n"+
                    "Enjoy!!!!!"
    },{
            "French Toast",
            "Cafe",
            "6 thick slices bread\n"+
                    "2 eggs\n"+
                    "⅔ cup milk\n"+
                    "¼ teaspoon ground cinnamon (Optional)\n"+
                    "¼ teaspoon ground nutmeg (Optional)\n"+
                    "1 teaspoon vanilla extract (Optional)\n"+
                    "salt to taste",

            "Step 1 - Beat together egg, milk, salt, desired spices and vanilla.\n"+
                    "Step 2 - Heat a lightly oiled griddle or skillet over medium-high heat.\n"+
                    "Step 3 - Dunk each slice of bread in egg mixture, soaking both sides. Place in pan, and cook on both sides until golden. Serve hot.\n"+
                    "Enjoy!!!!!"
    },{
            "French Fries",
            "Restuarant",
            "8 Servings\n"+
                    "500 gm potato\n"+
                    "5 pinches salt\n"+
                    "2 cup refined oil\n"+
                    "For Garnishing\n"+
                    "3 pinches black pepper",
            "Step 1 - Chop the potatoes\nTo prepare this easy recipe, you need to make sure that they are cut in the right shape and size. They should neither be too thick, nor too thin and should be cut clean and sharp. The trick is to first slice the potatoes and then cut them lengthwise. You can also use a fries cutter for that long, even shape.\n"+
                    "Step 2 - Soak cut potatoes in ice-cold water for 10-15 minutes\nNow, wash the potatoes under running water till they are squeaky clean. Place them in a bowl of iced water for 10 to 15 minutes. Keep them submerged in water or they will turn black.\n"+
                    "Step 3 - Deep fry the potato fries\nNow, heat the oil in a deep bottomed pan. Once the smoke starts appearing, reduce the flame and allow it to acquire a lower temperature. Now, deep fry the potatoes in batches. Keep the flame low. This will make them crunchy and also help retain their colour.\n"+
                    "Step 4 - Sprinkle salt and pepper and serve hot\nDrain excess oil and place on an absorbent paper. Allow them to cool. Now sprinkle salt and pepper and toss well. Serve immediately with ketchup. They can also be served with burgers and cutlets. They replace carbs in most continental meals. You can pack them for your kid's lunch.\n"+
                    "Enjoy!!!!!"
    },{
            "Hamburger",
            "Restaurant",
            "1 1/2 pounds 80% lean 20% fat ground beef or ground chuck\n 1 tablespoon Worcestershire sauce\n 1 1/2 teaspoons seasoning salt\n 1 teaspoon garlic powder\n 1/2 teaspoon ground black pepper\n Optional: 4 slices of cheese\n 4 hamburger buns\n Optional: hamburger toppings - lettuce tomato, onion, pickles, ketchup, mustard, mayo, etc.",
            "Step1 Preheat the grill to 375 degrees F (medium-high).,In a large bowl, add the beef. Sprinkle evenly with the Worcestershire sauce, seasoning salt, garlic powder, and pepper. Use your hands to mix the ingredients until they are just combined.\n" +
                    "Step2 Divide the meat mixture into fourths. Take 1/4 of the meat mixture and use your hands to press it into the shape of a hamburger patty that is about 3/4 inch thick.\n " +
                    "Step3 Make an indention in the middle,of the patty to prevent bulging in the center of the hamburger as it cooks. Repeat with the remaining meat mixture, making 4 hamburgers.\n" +
                    "Step4 Place the burgers on the grill. Cook 4-5 minutes on the first side. Flip the burgers over and cook an additional 4-5 minutes, until the burgers have reached the desired doneness.\n " +
                    "Optional *If adding cheese, lay a slice of cheese on each burger patty about 1 minute before taking the burgers off the grill, so the cheese has a chance to melt.\n" +
                    "Serve the burgers on hamburger buns with optional hamburger toppings."
    },{
            " Mussels",
            "Restaurant",
            "4 lbs mussels fresh rinsed and any opened mussel discarded\n " +
                    "2 tablespoons butter or olive oil, coconut oil, neutral oil\n" +
                    "4 cloves garlic minced ( or shallots, gingers, red onions , etc)\n " +
                    "1 teaspoon salt\n" +
                    "1 teaspoon pepper\n " +
                    "1 zest lemon\n" +
                    "1 juice lemon\n " +
                    "3 Tablespoons fresh parsley leaves minced ( add basil, mint, cilantro etc)\n " +
                    "2 Tablespoons olive oil,bread crunchy for serving\n",
            "Step1 Preheat a 10 inch sautee pan with lid over high heat and add in the butter and garlic. Sautee the garlic for 2 minutes and then add in the mussels. Toss the mussels with the garlic butter and then close the lid.\n" +
                    "Step2 Lower the heat to medium low and let the mussels cook for 10-15 minutes until you notice all mussels have opened up\n" +
                    "Step3 Uncover the post and let some of the liquid evaporate over high heat.\n" +
                    "Step4 Add in the lemon zest, lemon juice, parsley and olive oil. Toss the mussels one final time and serve right away"
    },{
            "Spring Rolls",
            "Restaurant",
            "for sheet/wrapper: 2 cup maida / plain flour\n 2 tbsp corn flour \n ½ tsp salt \n 2½ cup water \n for stuffing:2 tbsp oil \n 3 clove garlic (finely chopped) \n 2 chilli (finely chopped) \n 2 tbsp spring onion (chopped) \n ½ onion (sliced) \n 1 carrot (julienne) \n 2 cup cabbage (chopped) \n 5 beans (chopped) \n ½ capsicum (chopped) \n 2 tbsp vinegar \n 2 tbsp soy sauce \n 2 tsp chilli sauce \n" +
                    "¼ tsp pepper powder \n ½ tsp salt \n other ingredients:½ cup maida paste (for sealing),oil (for frying)",
            "Step1 Firstly, in a large bowl take 2 cup maida, 2 tbsp corn flour and ½ tsp salt.,add 2½ cup water and mix well using a whisk.,whisk until a smooth lump-free batter is formed adding water as required.\n" +
                    "Step2 Now grease the pan and pour a ladleful of batter on a hot pan.,swirl once making sure the batter is uniformly spread.,cook for a minute or until the sheet is cooked without browning.\n" +
                    "Step3 Flip over gently and continue to cook.,finally, spring roll wrapper is ready. You can cover and use to prepare patti samosa or spring rolls.\n" +
                    "Step4 For veg stuffing\n" +
                    "     Stepa. firstly, in a large wok, heat 2 tbsp oil. saute 3 clove garlic, 2 chilli and 2 tbsp spring onion.,add ½ onion and stir fry on high flame.\n" +
                    "     Stepb. Now add 1 carrot, 2 cup cabbage, 5 beans, ½ capsicum.,stir fry without losing the crunchiness of vegetables.,further, add 2 tbsp vinegar, 2 tbsp soy sauce, 2 tsp chilli sauce, ¼ tsp pepper powder and ½ tsp salt.,mix well making sure everything is well combined. stuffing is ready." +
                    "Step5 Fold and fry spring roll:\n firstly, take a prepared wrapper and place a tbsp of prepared veg stuffing.,rub a tsp of maida paste around the edge. maida helps to seal the roll.,now roll and fold the sides making sure the roll is sealed tight.,deep fry in hot oil, keeping the flame on low.,stir occasionally, until the roll turns golden brown and crisp.,drain off removing excess oil.\n" +
                    "Finally, enjoy veg spring roll with sweet chilli sauce"
    },{

            "Macarons",
            "Restaurant",
            "3 egg whites\n"+
                    "¼ cup white sugar\n"+
                    "1⅔ cups confectioners sugar\n"+
                    "1 cup finely ground almonds",

            "Step 1 - Line a baking sheet with a silicone baking mat.\n"+

                    "Step 2 - Beat egg whites in the bowl of a stand mixer fitted with a whisk attachment until whites are foamy; beat in white sugar and continue beating until egg whites are glossy, fluffy, and hold soft peaks. Sift confectioners' sugar and ground almonds in a separate bowl and quickly fold the almond mixture into the egg whites, about 30 strokes.\n"+

                    "Step 3 - Spoon a small amount of batter into a plastic bag with a small corner cut off and pipe a test disk of batter, about 1 1/2 inches in diameter, onto prepared baking sheet. If the disk of batter holds a peak instead of flattening immediately, gently fold the batter a few more times and retest.\n"+

                    "Step 4 - When batter is mixed enough to flatten immediately into an even disk, spoon into a pastry bag fitted with a plain round tip. Pipe the batter onto the baking sheet in rounds, leaving space between the disks. Let the piped cookies stand out at room temperature until they form a hard skin on top, about 1 hour.\n"+

                    "Step 5 - Preheat oven to 285 degrees F (140 degrees C).\n"+

                    "Step 6 - Bake cookies until set but not browned, about 10 minutes; let cookies cool completely before filling.\n"+
                    "Enjoy!!!!!"
    },{

            "Grilled Cheese Sandwich",
            "Restaurant",
            "2 tablespoons butter, softened\n"+
                    "2 slices of your favorite bread\n"+
                    "2 slices of your favorite cheese",

            "Step 1 - Butter bread slices on 1 side. Turn them over.\n"+

                    "Step 2 - Lay cheese slices on 1 bread slice. Top with the other bread slice, buttered side up. (The buttered sides face out so that they'll turn crisp and golden when they touch the hot pan.)\n"+

                    "Step 3 - Heat a medium frying pan over medium heat. Flick a drop of water into the pan; if it sizzles and evaporates, the pan is hot enough.\n"+

                    "Step 4 - Put sandwich, buttered side down, in pan with both hands. Let it cook 3 to 4 minutes, or until golden and crunchy underneath. Using a spatula (or one in each hand, if the bread is large), turn the sandwich over. Let it cook another 3 to 4 minutes, or until golden and crunchy on the second side.\n"+

                    "Step 5 - Choose a cheese that melts well. Some classics for grilled cheese: cheddar, jack and pepper jack, Colby, gruyère, Swiss, fontina, provolone. Brie works well too.\n"+
                    "Enjoy!!!!!"
    },{

            "Gnocchi",
            "Restaurant",
            "Recipe yields 4 servings\n"+
                    "2 potatoes\n"+
                    "2 cups all-purpose flour\n"+
                    "1 egg",

            "Step 1 - Bring a large pot of salted water to a boil. Peel potatoes and add to pot. Cook until tender but still firm, about 15 minutes. Drain, cool and mash with a fork or potato masher.\n"+

                    "Step 2 - Combine 1 cup mashed potato, flour and egg in a large bowl. Knead until dough forms a ball. Shape small portions of the dough into long Snakes. On a floured surface, cut snakes into half-inch pieces.\n"+

                    "Step 3 - Bring a large pot of lightly salted water to a boil. Drop in gnocchi and cook for 3 to 5 minutes or until gnocchi have risen to the top; drain and serve.\n"+
                    "Enjoy!!!!!"
    },
            { "Garlic Bread",
                    "Restaurant",
                    "Recipe yields 8 servings\n"+
                            "½ cup butter\n"+
                            "1½ tablespoons garlic powder\n"+
                            "1 tablespoon dried parsley\n"+
                            "1 (1 pound) loaf Italian bread, cut into 1/2 inch slices\n"+
                            "1 (8 ounce) package shredded mozzarella cheese",

                    "Step 1 - Preheat oven to 350 degrees F (175 degrees C).\n"+
                            "Step 2 - In a small saucepan over medium heat, melt butter and mix with garlic powder and dried parsley.\n"+
                            "Step 3 - Place Italian bread on a medium baking sheet. Using a basting brush, brush generously with the butter mixture.\n"+
                            "Step 4 - Bake in the preheated oven approximately 10 minutes, until lightly toasted. Remove from heat. Sprinkle with mozzarella cheese and any remaining butter mixture. Return to oven approximately 5 minutes, or until cheese is melted and bread is lightly browned.\n"+
                            "Enjoy!!!!!"
            },{
            "Fried Rice",
            "Restaurant",
            "Recipe yields 8 servings\n"+
                    "2 cups enriched white rice\n"+
                    "4 cups water\n"+
                    "⅔ cup chopped baby carrots\n"+
                    "½ cup frozen green peas\n"+
                    "2 tablespoons vegetable oil\n"+
                    "soy sauce to taste\n"+
                    "2 tablespoons sesame oil, to taste",

            "Step 1 - In a saucepan, combine rice and water. Bring to a boil. Reduce heat, cover, and simmer for 20 minutes.\n"+
                    "Step 2 - In a small saucepan, boil carrots in water about 3 to 5 minutes. Drop peas into boiling water, and drain.\n"+
                    "Step 3 - Heat wok over high heat. Pour in oil, then stir in carrots and peas; cook about 30 seconds. Stir in cooked rice. Shake in soy sauce, and toss rice to coat. Drizzle with sesame oil, and toss again.\n"+
                    "Enjoy!!!!!"
    },{
            "Nachos",
            "Restaurant",
            "CHEESE DIP\n"+
                    "1 teaspoon canola oil\n"+
                    "1 pound ground beef\n"+
                    "1 pkg. processed cheese (such as Velveeta), cut into cubes\n"+
                    "1 can diced tomatoes with green chiles (such as Rotel)\n\n"+
                    "NACHOS\n"+
                    "1 bag tortilla chips (such as Santitas)\n"+
                    "½ cup sour cream\n"+
                    "½ cup prepared guacamole\n"+
                    "1 cup chopped plum tomatoes (from 2 medium tomatoes)\n"+
                    "3 tablespoons chopped fresh cilantro\n"+
                    "2 tablespoons sliced pickled jalapeño chiles\n"+
                    "1 medium lime, cut into wedges",

            "Step 1 - Prepare the Cheese Dip: Heat oil in a large skillet over medium-high. Add beef, and cook, stirring to crumble, until browned and cooked through, about 10 minutes.\n"+

                    "Step 2 - Combine cheese and tomatoes in a medium-size microwaveable bowl. Microwave on HIGH until melted, about 3 minutes, stirring every 1 minute. Stir cooked beef into cheese mixture.\n"+

                    "Step 3 - Assemble the Nachos: Arrange half of chips on an aluminum foil-lined rimmed baking sheet. Spoon 2 cups of Cheese Dip evenly over chips. Top evenly with remaining chips, and spoon remaining Cheese Dip evenly over mixture. Dollop evenly with sour cream and guacamole. Sprinkle with tomatoes, cilantro, and jalapeños. Garnish with lime wedges." +
                    "Enjoy!!!!!"
    },{

            "Red Velvet Cake",
            "Cake",
            "FOR THE CAKE\n\n"+
                    "Cooking spray\n"+
                    "1 c. (2 sticks) butter, softened\n"+
                    "1 c. granulated sugar\n"+
                    "2 large eggs\n"+
                    "1 tsp. pure vanilla extract\n"+
                    "2 1/2 c. all-purpose flour\n"+
                    "1/4 c. Dutch-processed cocoa powder\n"+
                    "1 tsp. baking soda\n"+
                    "1 tsp. kosher salt\n"+
                    "1 c. buttermilk\n"+
                    "1 tbsp. distilled white vinegar\n"+
                    "2 tbsp. red food coloring\n\n"+
                    "FOR CREAM CHEESE FROSTING\n\n"+
                    "2 (8-oz.) blocks cream cheese, softened\n"+
                    "1/2 c. (1 stick) butter, softened \n"+
                    "4 c. powdered sugar\n"+
                    "1 tsp. pure vanilla extract\n"+
                    "1/4 tsp. Pinch kosher salt",

            "Step 1 - Preheat oven to 350°. Line two 8 round cake pans with parchment paper and grease with cooking spray. In a large bowl using a hand mixer (or in the bowl of a stand mixer), beat butter and sugar until light and fluffy. Add eggs one at a time, beating well after each addition then add vanilla.\n"+
                    "Step 2 - In another large bowl, whisk together flour, cocoa, baking soda, and salt. Add half the dry ingredients to wet ingredients, beating until just combined. Add buttermilk, vinegar, and red food coloring, beating to combine. Add remaining dry ingredients.\n"+
                    "Step 3 - Divide batter between prepared cake pans and bake until a toothpick inserted into the middle comes out clean, 25 to 30 minutes. Let cool 15 minutes, then invert onto a cooling rack to cool completely.\n"+
                    "Step 4 - Meanwhile, make frosting: In a large bowl using a hand mixer (or in the bowl of a stand mixer), beat cream cheese and butter until smooth. Add powdered sugar and beat until light and fluffy. Add vanilla and salt and mix until combined. Add more powdered sugar, 1/4 cup at a time, if necessary, until frosting is thick and a nice spreadable consistency.\n"+
                    "Step 5 - Assemble cake: Using a serrated knife, level tops of cakes, reserving the scraps for decorating. Place one layer on cake stand or serving platter, then top with a thick layer of frosting and second cake layer. Frost top and sides of cake. Crumble reserved cake pieces and press onto sides of cake.\n"+
                    "Enjoy!!!!!"
    },{
            "Strawberry ShortCake",
            "Cakes",
            "Strawberries Whipped Cream: 6–7 cups quartered strawberries\n"+
                    "1/4 cup \n 2 Tablespoons (75g) granulated sugar divided\n" +
                    "1 teaspoon pure vanilla extract \n"+
                    "1 cup (240ml) heavy cream Biscuits: 3 cups (375g) all purpose flour \n" +
                    "plus extra for hands and work surface \n"+
                    "1/4 cup (50g) granulated sugar\n"+ "2 Tablespoons aluminum free baking powder (yes, Tablespoons)\n"+
                    "1 teaspoon salt,3/4 cup (180g) unsalted butter, cold and cubed \n 1 cup (240ml) cold buttermilk\n"+
                    "2 Tablespoons (30ml) heavy cream or buttermilk \n coarse sugar, for sprinkling\n",

            "Step 1: Start with the strawberries: Stir the strawberries and 1/4 cup (50g) granulated sugar together in a large bowl. Cover and set in the refrigerator until ready to use. This time allows the strawberries to release their delicious juices,Make the biscuits: Preheat oven to 425°F (218°C). Mix the flour, granulated sugar, baking powder, and salt together in a large bowl or in a large food processor. Whisk or pulse until combined. \n"+
                    "Step 2: Add the cubed butter and cut into the dry ingredients with a pastry cutter or by pulsing several times in the processor. Pulse until coarse crumbs form. If you used a food processor, pour the ,mixture into a large bowl.,Pour buttermilk on top. Fold everything together with a large spoon or rubber spatula until it begins to come together. Do not overwork the dough. The dough will be shaggy and crumbly with ,some wet spots. Pour the dough and any dough crumbles onto a floured work surface and gently bring together with generously floured hands. Using floured hands or a floured rolling pin,flatten into a 1/2 inch thick rectangle as best you can. Cut into 2.75 or 3-inch circles with a biscuit cutter. (Tip: Do not twist the biscuit cutter when pressing down into the dough– this seals off the,edges of the biscuit which prevents them from fully rising.) Re-roll any scraps until you have 10-12 biscuits. Note that I skipped re-rolling when photographing these steps, so you only see 9 in,the picture above.\n"+
                    "Step 3: Arrange in a 10-inch cast iron skillet (see note) or close together on a parchment paper or silicone baking mat lined baking sheet. Make sure the biscuits are touching.\n"+
                    "Step 4: Brush the tops with 2 Tablespoons heavy cream or buttermilk and sprinkle with coarse sugar. Bake for 15-18 minutes or until biscuits are golden brown on top. Remove from the oven and allow,to cool for 10 minutes before assembling.\n"+
                    "Step 5: Make the whipped cream: Using a hand mixer or a stand mixer fitted with a whisk attachment, beat the heavy cream, 2 Tablespoons granulated sugar, and vanilla on medium-high speed until,soft-medium peaks form, about 3 minutes.\n"+
                    "Step 6: Slice the biscuits in half and layer with strawberries and whipped cream. Serve immediately.\n"


    },{
            "Waffles",
            " Restaurant",
            "2 eggs \n"+ "2 cups all-purpose flour \n 1 ¾ cups milk \n"+
                    "½ cup vegetable oil \n 1 tablespoon white sugar \n"+
                    "4 teaspoons baking powder \n"+ "¼ teaspoon salt\n ½ teaspoon vanilla extract\n",

            "Step 1: Preheat waffle iron. Beat eggs in large bowl with hand beater until fluffy. Beat in flour, milk, vegetable oil, sugar, baking powder, salt and vanilla, just until smooth.\n"+
                    "Step 2: Spray preheated waffle iron with non-stick cooking spray. Pour mix onto hot waffle iron. Cook until golden brown. Serve hot.\n"
    }};

    public static String getName() {
        return name;
    }

    public static void setName(String name){
        Data.name=name;
    }
}