
package code;
class CODE
{
    public static void main(String[] args)
    {
        playgroundowner playgroundowner1 = new playgroundowner("mostafa",120,"tefa","mostafa@yahoo.com","0115577489","Cario");
        playground playground1 = new playground("maadi playground","50 *20 m","maadi","10pm to 12am", 150,"3 hours");
        player player1 = new player("zeyad",44,"zoz","zeyad@yahoo.com","01144799638","giza");
        playgroundowner1.Add_Playground(playground1);
        playgroundowner1.display();
        Booking b1 = new Booking (player1,playground1,16,20);
        b1.display();
    }
    
}
