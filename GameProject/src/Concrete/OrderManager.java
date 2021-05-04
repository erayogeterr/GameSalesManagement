package Concrete;

import Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + " ID'li Sipari�iniz Eklendi.");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getId() + " ID'li Sipari�iz G�ncellendi.");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getId() + " ID'li Sipari�iniz Silindi.");
		
	}

}
