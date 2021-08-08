

import java.util.ArrayList;
import java.util.List;

public class maxim {

	public static void main(String[] args) {
		List<Bus> busList = new ArrayList<>();
		busList.add(new Bus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new Bus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new Bus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new Bus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new Bus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new Bus(111, "Xyz Travels", 1400.22, 4.3f));
		
		Double totalAbcTravels = busList.stream()
				.filter(e -> e.getProviderName().equals("Abc Travels"))
				.map(e -> e.getCost())
				.reduce(0.0,);
		float totalAbcTravelsCount = busList.stream()
				.filter(e -> e.getProviderName().equals("Abc Travels"))
				.count();
		System.out.println("\nAverage Rating for Abc Travels: " 
				+ totalAbcTravels / totalAbcTravelsCount);
		
		System.out.println("\nOriginal list");
		busList.forEach(System.out::println);
	}
}

//Task 1 - Find the minimum price in 'Xyz Travels'