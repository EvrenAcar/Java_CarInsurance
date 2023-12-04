// Chapter 4 exercise (Pg 189 - 192)

public class CarInsurancePolicy {
// Instacne variables (data fields) for this class
	private int policyNumber;
	private int numPayments;
	private String residentCity;

// Various overloaded constructor methods for this class
	public CarInsurancePolicy( int num, int payments, String city) {
		policyNumber = num;
		numPayments = payments;
		residentCity = city;
	}

	public CarInsurancePolicy(int num, int payments) {
		
// Use the master constructor instead of repeating the assaignment statements
		this(num, payments, "Mayfield");
	}
	public CarInsurancePolicy(int num) {
		this(num, 2, "Mayfield");
	}
// Accessor method to show all the policy details
	public void display() {
		System.out.println("Policy #" + policyNumber + ". " + numPayments + " payments annualy.  Driver resides in " + residentCity + ".");
	}
}
