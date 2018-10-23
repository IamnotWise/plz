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


	List<Question> getQuestions() { return questions;}
	List<Answer> getAnswers() { return answers;}

	public Group getGroup() {return group;}
	public Member getMember() {return member;}	

	public String toString() {
	for(int i=0;i<questions.size();i++)
		for(int j=0;i<answers.size();j++)

		return "Questions: " + questions.get(i) + "Answers: " + answers.get(j) + "." ;


	}
}
