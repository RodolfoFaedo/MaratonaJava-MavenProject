package cf.rodolfo.JavaCore.Y_Colections;

import java.util.Objects;

public class Smartphone {
	private String serialNumber;
	private String brand;

	public Smartphone(String serialNumber, String brand) {
		super();
		this.serialNumber = serialNumber;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Smartphone [serialNumber=" + serialNumber + ", brand=" + brand + "]";
	}

	/*
	 * Reflexividade: x.equals(x) tem que ser true para tudo que for diferente de
	 * null; Simetria: para x e y diferentes de null, se x.euqals(y) == true, logo
	 * y.equals(x) == true; Transitividade: para x, y e z diferentes de null, se
	 * x.equals(y) == true, e x.equals(z) == true logo, y.quals(z) == true;
	 * Consistência: x.equals(x) sempre retorna true se x for diferente de null;
	 * Para x diferente de null, x.equals(null) tem que retornar false
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Smartphone other = (Smartphone) obj;
		return Objects.equals(serialNumber, other.serialNumber);
	}

	/*
	 * se x.equals(y) == true, logo y.hashCode() == x.hashCode(); se y.hashCode() ==
	 * x.hashCode(), não necessariamente o equals de y.equals(x) tem que ser true;
	 * x.equals(y) == false, o hashCode é diferente; y.hashCode() != x.hashCode(),
	 * logo x.equals(y) deverá ser false
	 */

	@Override
	public int hashCode() {
		return serialNumber == null ? 0 : this.serialNumber.hashCode();
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
