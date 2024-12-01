package cf.rodolfo.JavaCore.Y_Colections;

import java.util.Objects;

public class Mediciness implements Comparable<Mediciness> {
	private Long id;
	private String name;
	private double price;
	private int quantity;

	public Mediciness(Long id, String name, double price) {
		Objects.requireNonNull(id, "id cannot be null");
		Objects.requireNonNull(name, "name cannot be null");
		Objects.requireNonNull(price, "price cannot be null");
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Mediciness(Long id, String name, double price, int quantity) {
		this(id, name, price);
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Mediciness other = (Mediciness) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Mediciness [id= " + id + ", name= " + name + ", price= " + price + ", quantity= " + quantity + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Mediciness anotherMed) {
		// negativo: se o "this" < "anotherMed"
		// zero: se o "this" == "anotherMed"
		// positivo: se o "this" > "anotherMed"
//		if(this.id < anotherMed.getId()) {
//			return -1;
//		}else if(this.id.equals(anotherMed.getId())) {
//			return 0;
//		}else {
//			return 1;
//		}
		// return this.id.compareTo(anotherMed.getId());
		// return Double.compare(price, anotherMed.getPrice());
		return this.name.compareTo(anotherMed.getName());
	}

}
