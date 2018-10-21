package sprint1;
import java.time.LocalDateTime;

public class Answer extends Post{


private Question question;
	
//records text for answer for input Questions, and records date
public Answer(Question q, String text, LocalDateTime date){
	question=q;
	super(text,date);
	}
	public Question getQuestion() { return question;}

	public String toString() {
	
	

	}

}
