import java.util.Date;

public class Donation extends Resource {

	private String donationID;
	private float amount;
	private String donorDetails;
	private Date dateReceived;

	/**
	 * 
	 * @param amount
	 * @param donorInfo
	 */
	public void acceptDonation(float amount, String donorInfo) {
		// TODO - implement Donation.acceptDonation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param to
	 * @param amount
	 */
	public void allocateFunds(String to, float amount) {
		// TODO - implement Donation.allocateFunds
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param donationDetails
	 */
	public void recordDonation(String donationDetails) {
		// TODO - implement Donation.recordDonation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param donationID
	 */
	public String refundDonation(String donationID) {
		// TODO - implement Donation.refundDonation
		throw new UnsupportedOperationException();
	}

}