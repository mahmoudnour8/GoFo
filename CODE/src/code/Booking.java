
package code;
public class Booking
        
{
  playground a1;
  player p1;  
  int start_time;
  int end_time;

    public Booking(player p1, playground a1 ,int start_time, int end_time) {
        this.a1 = a1;
        this.p1 = p1;
        this.start_time = start_time;
        this.end_time = end_time;
    }
  public double calc_price()
          {
          int res = end_time-start_time;
          Double val =Double.valueOf(res);
          return a1.getPlayground_priceperhour() * val;
          }
    public void display()
    {
            System.out.println(toString());
    }
  @Override
    public String toString()
    {
    return "Booked Player: "+p1.name+"\nPlayground Name: "+a1.playground_name+"\nBooked Time: \n" + "From: "+start_time+"\nTO: "+end_time + "\nCalculated Price = " +calc_price();
    
    }
}
