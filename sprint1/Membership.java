package sprint1;

import java.time.LocalDateTime;
import java.util.*;

class Membership {
	Group group;
	Member member;
	private LocalDateTime dateJoined;
	private int points;
	List<Question> questions;
	List<Answer> answers;

	Membership(Group group, Member member, LocalDateTime ldt){
		this.group = group;
		this.member = member;
		this.dateJoined = ldt;
	}
	
	void addToGroup() {
		group.members.add(member);
	}
}
