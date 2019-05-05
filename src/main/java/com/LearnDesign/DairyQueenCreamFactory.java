package com.LearnDesign;

import com.LearnDesign.icecreams.ChocolateIceCream;
import com.LearnDesign.icecreams.IceCream;
import com.LearnDesign.icecreams.StrawberryIceCream;
import com.LearnDesign.milkshake.ChocolateMilkShake;
import com.LearnDesign.milkshake.MilkShake;
import com.LearnDesign.milkshake.StrawberryMilkShake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

/**
 * This factory creates all daily products of Dairy Queen Brand
 */
public class DairyQueenCreamFactory extends AbstractIceCreamFactory{

    @Override
    public IceCream createIceCream(String iceCreamChoice){
        IceCream iceCream = null;

        if (iceCreamChoice.equalsIgnoreCase("Strawberry")){
            iceCream = new StrawberryIceCream("Dairy Queen",2,120);

        }else if (iceCreamChoice.equalsIgnoreCase("Chocolate")){
            iceCream = new ChocolateIceCream("Dairy Queen",2,250);
        }

        return iceCream;
    }

    @Override
    MilkShake createMilkShake (String choice) {
        MilkShake milkShake = null;

        if (choice.equalsIgnoreCase("Strawberry")){
            milkShake = new StrawberryMilkShake("Dairy Queen",2);

        }else if (choice.equalsIgnoreCase("Chocolate")){
            milkShake = new ChocolateMilkShake("Dairy Queen",2);
        }
        return milkShake;
    }
}
