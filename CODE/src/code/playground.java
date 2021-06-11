
package code;
public class playground
{
   String playground_name;
   String playground_size;
   String playground_location;
   String available_time; 
   double playground_priceperhour;
   String playground_cancelperiod;

    public playground(String playground_name, String playground_size, String playground_location, String available_time, double playground_priceperhour, String playground_cancelperiod) {
        this.playground_name = playground_name;
        this.playground_size = playground_size;
        this.playground_location = playground_location;
        this.available_time = available_time;
        this.playground_priceperhour = playground_priceperhour;
        this.playground_cancelperiod = playground_cancelperiod;
    }

    public String getPlayground_name() {
        return playground_name;
    }

    public void setPlayground_name(String playground_name) {
        this.playground_name = playground_name;
    }

    public String getPlayground_size() {
        return playground_size;
    }

    public void setPlayground_size(String playground_size) {
        this.playground_size = playground_size;
    }

    public String getPlayground_location() {
        return playground_location;
    }

    public void setPlayground_location(String playground_location) {
        this.playground_location = playground_location;
    }

    public String getAvailable_time() {
        return available_time;
    }

    public void setAvailable_time(String available_time) {
        this.available_time = available_time;
    }

    public double getPlayground_priceperhour() {
        return playground_priceperhour;
    }

    public void setPlayground_priceperhour(double playground_priceperhour) {
        this.playground_priceperhour = playground_priceperhour;
    }

    public String getPlayground_cancelperiod() {
        return playground_cancelperiod;
    }

    public void setPlayground_cancelperiod(String playground_cancelperiod) {
        this.playground_cancelperiod = playground_cancelperiod;
    }


    @Override
    public String toString()
    {
    return "Playground name = " + getPlayground_name() + "\n" +"Location of playground = "+ getPlayground_location() + "\n"+ "Playgound Size = "+getPlayground_size()+ "\n"+ "Time Available for booking = " + 
           getAvailable_time() + "\n" + "Price per hour = " + getPlayground_priceperhour() + " LE" + "\nThe cancellation period = "+ getPlayground_cancelperiod();
    
    }

}
