
/**
 * Contains information about each Jeopardy contestant
 *
 * Morgan Kay & Caroline Phillips
 * 5/5/23
 */
public class Person
{
    private String name;
    private double total;
    private static int unknowns=0;
    public Person(){
        name = "Unknown " + unknowns;
        unknowns++;
   }
    public Person(String n){
        name = n;
        total = 0;
    }
    
    public void setTotal(double t){
        total = t;
    }
    public double getTotal(){
        return total;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name +" has a total of $"+total;
    }

}
