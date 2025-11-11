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
        yearFounded2005 = 2025;
        FactoryInfo();
        FactoryInfo();
        // change the year founded and is open
        // call facotory info again
        products = "Houses";


    }
    public void FactoryInfo(){
        System.out.println("The factory info:");
        System.out.println(yearFounded2005);
        System.out.println("the year" + yearFounded2005);




    }

}
// contstoctor - special types of methods u can tell becasue it does not have "void" and the namce of the consturcotr machtes the name of the class
// instance varible = we know because its at the top of the class, it has public in front of them, and can be used inside facotry expect for psvm; can use instance varibles in every method
// psvm's can only have construcor methods
// A double - its a decmial number;any number with number
// A string - has to havew a captial S; anything that can be put into quotes. Any letter, word, or sotry
//todo make a method called facotory info