package customer;

public class Customer {
	private String customerId;
	private String name;
	private int phoneNumber;
	private char status;
	private double totalPurchases;
	private AddressCustomer add;
	
	

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public double getTotalPurchases() {
		return totalPurchases;
	}

	public void setTotalPurchases(double totalPurchases) {
		this.totalPurchases = totalPurchases;
	}



	public AddressCustomer getAdd() {
		return add;
	}

	public void setAdd(AddressCustomer add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "customerId=" + customerId + "\nname=" + name + "\nphoneNumber=" + phoneNumber + "\nstatus=" + status
				+ "\ntotalPurchases=" + totalPurchases + "\nDireccion: " + add;
	}

}
