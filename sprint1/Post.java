package sprint1;
import java.time.LocalDateTime;

public abstract class Post {	

protected String text;
protected LocalDateTime date;

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
	
	}


}
