import java.util.Date;

public class MedicalSupply extends Resource {

	private String supplyID;
	private Date expirationDate;
	private Date maintenanceSchedule;
	private String model;

	/**
	 * 
	 * @param quantity
	 * @param supplierID
	 */
	public String orderSupplies(int quantity, String supplierID) {
		// TODO - implement MedicalSupply.orderSupplies
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantityUsed
	 * @param userID
	 */
	public void recordUsage(int quantityUsed, String userID) {
		// TODO - implement MedicalSupply.recordUsage
		throw new UnsupportedOperationException();
	}

}