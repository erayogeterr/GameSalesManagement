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
			System.out.println("-----Eklenen Müþteri-----");
			System.out.println(customer.getFirstName() + " Müþterisi Eklendi.");
		} else {
			System.out.println(customer.getNationalityId() + " Mernis doðrulamasý baþarýsýz.Müþteri eklenemedi.");
			System.exit(0);
		}
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " Müþterisi Güncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " Müþterisi Silindi.");
		
	}

}
