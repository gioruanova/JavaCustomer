package customerTest;

import customer.AddressCustomer;
import customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {

		Customer cliente1 = new Customer();
		AddressCustomer a1 = new AddressCustomer();

		cliente1.setCustomerId("1234");
		cliente1.setName("Jorge");
		cliente1.setPhoneNumber(1234555);
		cliente1.setTotalPurchases(250.30);
		cliente1.setStatus('a');
		cliente1.setAdd(a1);

		a1.setCalle("Cordoba");
		a1.setNumero(2255);
		a1.setCiudad("Caba");
		a1.setCodigoPostal("1234");
		System.out.println(cliente1);
		
		
		System.out.println("\n--------------\n");
		
		Customer cliente2 = new Customer();
		AddressCustomer a2 = new AddressCustomer();

		cliente2.setCustomerId("5577");
		cliente2.setName("Luis");
		cliente2.setPhoneNumber(4455664);
		cliente2.setTotalPurchases(290.30);
		cliente2.setStatus('c');
		cliente2.setAdd(a2);

		a2.setCalle("Santa Fe");
		a2.setNumero(4455);
		a2.setCiudad("Caba");
		a2.setCodigoPostal("7788");
		System.out.println(cliente2);

	}

}
