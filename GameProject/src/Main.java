
import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		SalesManager salesManager = new SalesManager(orderManager);
		GameManager gameManager = new GameManager();
		
		Customer customer1 = new Customer(1,"ÝSÝM", "SOYÝSÝM", "TCNO", 2000);
		customerManager.add(customer1);
		System.out.println("-----Eklenen Oyun Listesi-----");
		Game game1 = new Game(1,"CS-GO",80.0);
		gameManager.add(game1);
		Game game2 = new Game(2,"Predator Hunting Grounds",250.0);
		gameManager.add(game2);
		
		System.out.println("-----Eklenen Kampanya-----");
		Campaign campaign1 = new Campaign(1,"Büyük Yaz Ýndirimi !",30,true);
		campaignManager.add(campaign1);
		Campaign campaign2 = new Campaign(2,"Karne Günü Ýndirimi !",25,true);
		campaignManager.add(campaign2);
		
		System.out.println("");
		
		Order order1 = new Order(1,1,1,1,LocalDate.now());
		
		Game[] games = {game1,game2};
		System.out.println("-------------Kampanya Uygulanmýþ Sepet-----------------");
		salesManager.buy(null, customer1, games, campaign1);
		System.out.println("");
		System.out.println("------------Kampanya Uygulanmamýþ Sepet----------------");
		salesManager.buy(order1, customer1, games,null);
		
		
		
		

	}

}
