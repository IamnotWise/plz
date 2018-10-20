package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Member {
	
	private String firstName;
	private String lastName;
	private String screenName;
	private String emailAddress;
	private LocalDateTime dateCreated;
	HashMap <Membership, Group> memberships = new HashMap<>();
	ArrayList <Member> members = new ArrayList<>();
	
	public Member(String firstName, String lastName, String screenName, String emailAddress, LocalDateTime dateCreated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.dateCreated = dateCreated;		
	}
	public String getEmailAddress() {return emailAddress;}
	
	public LocalDateTime getDateCreated() {return dateCreated;}
	
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String getScreenName() {return screenName;}
	
	public void joinGroup(Group group, LocalDateTime datejoined) {
		Membership memShip = new Membership(group, this, datejoined);
		memShip.addToGroup();
		memberships.put(memShip, group);
		
	}
	public int getNumGroups() {return memberships.size();}
	
	/*public Group getGroup(String groupID) {
	
	}*/	
	

}
