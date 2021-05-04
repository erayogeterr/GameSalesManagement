package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiniz Eklendi.");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiz Güncellendi.");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " ID'li Siparişiniz Silindi.");
		
	}

}
