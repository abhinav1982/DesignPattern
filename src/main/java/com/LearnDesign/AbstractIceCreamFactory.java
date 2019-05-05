package com.LearnDesign;

import com.LearnDesign.icecreams.IceCream;
import com.LearnDesign.milkshake.MilkShake;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public abstract class AbstractIceCreamFactory {
    abstract IceCream createIceCream(String choice);
    abstract MilkShake createMilkShake(String choice);

}
