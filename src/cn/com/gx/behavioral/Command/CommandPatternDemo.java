package cn.com.gx.behavioral.Command;

import cn.com.gx.behavioral.Command.Order.BuyStock;
import cn.com.gx.behavioral.Command.Order.SellStock;

public class CommandPatternDemo
{
 
	public static void main(String[] args)
	{
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}

}
