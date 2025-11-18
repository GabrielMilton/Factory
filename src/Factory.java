import com.sun.corba.se.impl.legacy.connection.SocketFactoryContactInfoImpl;

public class Factory {
    public int yearFounded2005;
      public boolean Isopen;
      public double earnings;
      public String products;
    public static void main(String[] args) {
        System.out.println("Welcome to Gabriel");
        new Factory();




    }

    //constructor
    public Factory(){
        System.out.println("We make Houses!");

        Isopen = false;
        earnings = 1.1;
        yearFounded2005 = 2026;
        FactoryInfo();
        Isopen = true;
        earnings = 5.4;
        yearFounded2005 = 1037;
        FactoryInfo();
        // change the year founded and is open
        // call facotory info again
        products = "Houses";

        //type(house) varilbeName = value
        // object of type house
        House H1 = new House();
        System.out.println();
        H1.owner = "Mr kim";
        System.out.println("the owner is" + H1.owner);
        //todo give all the house intstance varibles value
        H1.address = "400 center street, Gerogetwon, Candaa";
        H1.isOccupied = true;
        H1.size = 50.33333333;
        H1.walls =69;
        System.out.println(H1.size);
        House MyHouse = new House();
         MyHouse.PrintInfo();
         House customhouse = new House(200.24,8,"Ren");
         customhouse.PrintInfo();


    }
    public void FactoryInfo(){
        System.out.println("The factory info:");
        System.out.println(yearFounded2005);




    }

}
// constructor - a special methods u can tell becasue it does not have "void" and the namce of the consturcotr machtes the name of the class
// instance varible = we know because its at the top of the class, it has public in front of them, and can be used inside facotry expect for psvm; can use instance varibles in every method
// psvm's can only have construcor methods
// A double - its a decmial number;any number with number
// A string - has to havew a captial S; anything that can be put into quotes. Any letter, word, or sotry
//null - havent set in the defention or value
//todo make a method called facotory info
