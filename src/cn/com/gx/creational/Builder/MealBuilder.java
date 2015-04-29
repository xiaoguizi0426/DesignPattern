package cn.com.gx.creational.Builder;

import cn.com.gx.creational.Builder.Item.ChickenBurger;
import cn.com.gx.creational.Builder.Item.Coke;
import cn.com.gx.creational.Builder.Item.Pepsi;
import cn.com.gx.creational.Builder.Item.VegBurger;

public class MealBuilder
{
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
