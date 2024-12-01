package cf.rodolfo.JavaCore.K_Enum;

public enum ClientType {
	NATURAL_PERSON(1, "Natural Person"), LEGAL_PERSON(2, "Legal Person");

	public final int VALUE;
	public String reportName;

	ClientType(int value, String reportName) {
		this.VALUE = value;
		this.reportName = reportName;
	}

	public static ClientType reportNameClientType(String nameReport) {
		for (ClientType typeClient : values()) {
			if (typeClient.reportName.equals(nameReport)) {
				return typeClient;
			}
		}
		return null;
	}
}
