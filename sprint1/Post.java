package sprint1;
import java.time.LocalDateTime;

public abstract class Post {	

protected String text;
protected LocalDateTime date;
protected Membership membership;

//records text for question or answer & records date it was provided
public Post(String text, LocalDateTime date) {
	this.text=text;
	this.date=date;
	}

//sets text for either the question or the answer
public void setText(String text) {
	this.text=text;
	}

//returns member that posted this question or answer
public Member getAuthor() {
	membership.getMember();	
	}
//return group that this question or answers was posted in. 
public Group getGroup(){
	membership.getGroup();
        }

public void setMembership(Membership membership){
	this.membership=membership;
        } 

public Membership getMembership() {
	return membership;	
        }


}
