package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
	
	private CustomerCheckService customerCheckService;
	

	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("-----Eklenen M��teri-----");
			System.out.println(customer.getFirstName() + " M��terisi Eklendi.");
		} else {
			System.out.println(customer.getNationalityId() + " Mernis do�rulamas� ba�ar�s�z.M��teri eklenemedi.");
			System.exit(0);
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " M��terisi G�ncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " M��terisi Silindi.");
		
	}

}
