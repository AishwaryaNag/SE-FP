import java.util.List;

public class Doctor extends Actor {

	private String doctorID;
	private String specialty;
	private boolean availability;
	private List<String> assignedPatients;

	/**
	 * 
	 * @param patientID
	 */
	public String diagnose(String patientID) {
		// TODO - implement Doctor.diagnose
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param patientID
	 * @param treatment
	 */
	public void prescribeTreatment(String patientID, String treatment) {
		// TODO - implement Doctor.prescribeTreatment
		throw new UnsupportedOperationException();
	}

	public void performSurgery() {
		// TODO - implement Doctor.performSurgery
		throw new UnsupportedOperationException();
	}

}