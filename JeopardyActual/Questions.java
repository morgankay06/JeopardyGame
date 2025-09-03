
/**
 * Code for creating question objects and accessor methods
 *
 * Morgan Kay & Caroline Phillips
 * 5/5/23
 */
public class Questions
{
    private String question;
    private String answer;
    private int worth;
    public Questions(String q, String a, int w){
        question = q;
        answer = a;
        worth = w;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public int getWorth(){
        return worth;
    }

}
