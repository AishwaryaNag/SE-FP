import java.util.List;

public class ServiceDispacher {

	private String dispatcherId;
	private String requestedServices;
	private String status;
	private String callerNumber;
	private String callerName;

	/**
	 * 
	 * @param serviceType
	 * @param urgencyLevel
	 * @param location
	 */
	public void dispatchService(String serviceType, String urgencyLevel, String location) {
		// TODO - implement ServiceDispacher.dispatchService
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param serviceId
	 */
	public String trackService(String serviceId) {
		// TODO - implement ServiceDispacher.trackService
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param serviceId
	 * @param resources
	 */
	public void allocateResources(String serviceId, List<Resource> resources) {
		// TODO - implement ServiceDispacher.allocateResources
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param urgencyLevel
	 * @param serviceType
	 * @param location
	 */
	public void createIncidentReport(String urgencyLevel, String serviceType, String location) {
		// TODO - implement ServiceDispacher.createIncidentReport
		throw new UnsupportedOperationException();
	}

}