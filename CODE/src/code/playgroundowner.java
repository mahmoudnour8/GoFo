package code;
import java.util.ArrayList;
public class playgroundowner extends person
{
 playground p;
ArrayList<playground> Alist;
    public playgroundowner(String name, int id, String password, String email, String phone, String defaultlocation)
            
    {
        super(name, id, password, email, phone, defaultlocation);
         Alist = new ArrayList<playground>();
    }
        public void Add_Playground(playground p)
    {
        Alist.add(p);
    }
    public void display()
    {
          for (int i = 0; i < Alist.size(); i++) {
            System.out.println(
            Alist.get(i).toString());
        }
    }
}
        