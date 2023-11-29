import java.util.Date;

public class MedicalCare extends CareService {

	private String careId;
	private String typeOfCare;
	private int availableSpace;
	private String location;

	/**
	 * 
	 * @param patientID
	 * @param treatmentType
	 */
	public void provideCare(String patientID, String treatmentType) {
		// TODO - implement MedicalCare.provideCare
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param patientID
	 * @param timeSlot
	 */
	public Date scheduleCare(String patientID, Date timeSlot) {
		// TODO - implement MedicalCare.scheduleCare
		throw new UnsupportedOperationException();
	}

	public boolean checkAvailability() {
		// TODO - implement MedicalCare.checkAvailability
		throw new UnsupportedOperationException();
	}

}