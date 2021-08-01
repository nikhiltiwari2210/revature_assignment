package train_details_using_encapsulation;

public class TrainDetails {
	
	private int TrainN;
	private String TrainCode;
	private String Station;
	private String Arrival;
	private String Departure;
	
	public TrainDetails(int trainN, String trainCode, String station, String arrival, String departure) {
		this.TrainN = trainN;
		this.TrainCode = trainCode;
		this.Station = station;
		Arrival = arrival;
		Departure = departure;
	}

	public void printStatement() {
		
		System.out.printf("%d %4s %17s %8s %8s\n", TrainN,TrainCode,Station,Arrival,Departure);

	}

	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)");
		System.out.println("-----------------------------------------------");
		System.out.println("# code    Station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		
		TrainDetails tr[] = {
				new TrainDetails(1,"YPR","Yasvantpur Jn","","23:40"),
				new TrainDetails(2,"GTL","Guntakal Jn","03:45","03:50"),
				new TrainDetails(3,"SC","Secundrabad Jn","08:55","09:10"),
				new TrainDetails(4,"BPQ","Balharshah Jn","13:30","13:35"),
				new TrainDetails(5,"HBJ","Habibganj Jn","21:20","21:25"),
				new TrainDetails(6,"JHS","Jhansi Jn","01:15","01:20"),
				new TrainDetails(7,"DEE","Delhi S Rohilla","07:00","")
		};
		
		for (TrainDetails t : tr) {
			t.printStatement();
		}
		System.out.println("-----------------------------------------------");
		}
}