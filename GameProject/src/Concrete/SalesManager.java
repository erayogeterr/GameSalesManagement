package Concrete;

import Abstract.OrderService;
import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class SalesManager  implements SalesService{
	
	private OrderService orderService;
	

	public SalesManager(OrderService orderService) {
		super();
		this.orderService = orderService;
	}


	@Override
	public void buy(Order order, Customer customer, Game[] games, Campaign campaign) {
		Double totalPrice = 0.0;
		
		System.out.println("Merhaba " + customer.getFirstName() + " " + customer.getLastName());
		for (Game game : games) {
			System.out.println("Game ID: " + game.getId() + " -> " + game.getName() + " Oyun Fiyatý: " + game.getPrice() + " TL");
			totalPrice += game.getPrice();
		}
		System.out.println("Toplam sepet tutarý : " + totalPrice + " TL");
		
		if (campaign != null) {
			calculate(campaign, totalPrice);
		} else {
		orderService.add(order);
		}
		
	}
	
	private void calculate(Campaign campaign,Double totalPrice) {
		System.out.println(campaign.getName() + " Kampanyasýndan %" + campaign.getDiscount() + " Ýndirim Sayesinde " + totalPrice + " TL Fiyatýndan Güncel Sepet Tutarýnýz : --> " + (totalPrice * ( 100 - campaign.getDiscount()) /100) + " TL <--");
	}

}
