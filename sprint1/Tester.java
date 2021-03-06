package sprint1;

import java.time.LocalDateTime;

public class Tester {

	
	
	public static void main(String [] args) {
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime date2 = LocalDateTime.now();
		LocalDateTime date3 = LocalDateTime.now();
		//Creating Members
		Member m = new Member("Kianna", "Thompson","kiathompson","kiathompson@valdosta.edu",date);
		Member m2 = new Member("Jordan", "Thompson","jorthompson","jorthompson@valdosta.edu",date2);
		Member m3 = new Member("Payton", "Thompson", "paythompson", "paythompson@valdosta.edu", date3);
		
		//Creating Groups
		Group g = new Group("Yoga", "Stretching", date);
		Group g2 = new Group("Soul Cycle", "fast pace", date2);
		Group g3 = new Group("Kick Boxing", "Intermediate", date3);
		
		//Joining Members to Groups
		m.joinGroup(g, date);
		m.joinGroup(g2, date);
		
		m2.joinGroup(g, date2);
		
		m3.joinGroup(g, date3);
		m3.joinGroup(g2, date3);
		m3.joinGroup(g3, date3);
		
		//Visual Representaion of getNumMembers and getNumGroup
		System.out.println("# of Members in Yoga: " + g.getNumMembers());
		System.out.println("# of Members in Soul Cycle: " + g2.getNumMembers());
		System.out.println("# of Members in Kick Boxing: " + g3.getNumMembers());
		
		System.out.println();
		System.out.println("# of Groups Member1 is in: " +m.getNumGroups());
		System.out.println("# of Groups Member2 is in: " +m2.getNumGroups());
		System.out.println("# of Groups Member3 is in: " +m3.getNumGroups());
	}
}
