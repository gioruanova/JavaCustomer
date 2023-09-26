package customer;

public class AddressCustomer {
	private String calle;
	private int numero;
	private String codigoPostal;
	private String ciudad;

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "\n" + "Calle: " + calle + "\nNumero: " + numero + "\nCiudad: " + ciudad + " - CP: " + codigoPostal;
	}

}
