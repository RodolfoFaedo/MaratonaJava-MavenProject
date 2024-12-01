package cf.rodolfo.JavaCore.K_Enum;

public class Client {
	

	private String name;
	private ClientType clientType;
	private PaymentType paymentType;

	public Client(String name, ClientType clientType, PaymentType paymentType) {
		super();
		this.name = name;
		this.clientType = clientType;
		this.paymentType = paymentType;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" +
				"Client Type: " + clientType.reportName + "\n" +
				"Client Type Index: " + clientType.VALUE + "\n" +
				"Payment Type: " + paymentType + "\n";
	}
	
	
}