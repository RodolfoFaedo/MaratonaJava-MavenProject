package cf.rodolfo.JavaCore.Y_Colections;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumer {
	private Long id;
	private String name;

	public Consumer(String name) {
		super();
		this.id = ThreadLocalRandom.current().nextLong(0,1000);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Consumer [id= " + id + ", name= " + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		Consumer other = (Consumer) obj;
		return Objects.equals(id, other.id);
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

}
