import java.util.Date;

public class Resource {

	private String resourceID;
	private String type;
	private int availableQuantity;

	public boolean checkAvailability() {
		// TODO - implement Resource.checkAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param newQuantity
	 */
	public void updateResourceQuantity(int newQuantity) {
		// TODO - implement Resource.updateResourceQuantity
		throw new UnsupportedOperationException();
	}


	public class AllocationDetail {

		private String allocationID;
		private String resourceID;
		private Date allocationDate;

		/**
		 * 
		 * @param resourceID
		 * @param quantity
		 * @param receiverID
		 */
		public void allocateResource(String resourceID, int quantity, String receiverID) {
			// TODO - implement AllocationDetail.allocateResource
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param resourceID
		 * @param quantity
		 */
		public void releaseResource(String resourceID, int quantity) {
			// TODO - implement AllocationDetail.releaseResource
			throw new UnsupportedOperationException();
		}

		/**
		 * 
		 * @param allocationID
		 * @param newDetails
		 */
		public void updateAllocation(String allocationID, String newDetails) {
			// TODO - implement AllocationDetail.updateAllocation
			throw new UnsupportedOperationException();
		}

	}

}