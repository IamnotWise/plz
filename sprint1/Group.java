package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private LocalDateTime dateCreated;
	private String title;
	private String description;
	List<Member> members = new ArrayList<>();
	
	public Group(String title, String description, LocalDateTime dateCreated) {
		this.title = title;
		this.description = description;
		this.dateCreated = dateCreated;
	}
	
	public LocalDateTime getDateCreated() {return dateCreated;}
	
	public String getTitle() {return title;}
	
	public String getDescription() {return description;}
	
	public int getNumMembers() {return members.size();}

	public Member getMember(String emailAddress) {
	Member m=null;

	for(int i=0;i<members.size();i++) {
		if(emailAddress.equals(members.get(i).getEmailAddress())
			m=members.get(i);
		else
			System.out.println("Member not found");
			}
		return m;
	}
	
	
	//void addMember
}
