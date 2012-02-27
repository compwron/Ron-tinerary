public class MoneyOwedForMysore {
	

	public static void main(String[] args) {
		int oneWayInKM = 150;
		int[] roundTrip = {oneWayInKM, oneWayInKM};
		int worstCaseScenarioForDrivingInCity = 50; //km
		int rpsPerKM = 15;
		int flatDriverHireRate = 400; //rps
		int numberOfPeopleGoingToMysoreWhoAreAwesome = 4;

		int totalForYou=0;
		int totalForTrip = flatDriverHireRate;

		for ( int journey : roundTrip ) {
		     totalForTrip += journey*rpsPerKM;
		}

		totalForTrip += worstCaseScenarioForDrivingInCity*rpsPerKM;
		totalForYou = totalForTrip / numberOfPeopleGoingToMysoreWhoAreAwesome;
		System.out.println("Group Pays " + totalForTrip + "\nYou Pay: " + totalForYou + "\n Have a nice day!");
	}
}
