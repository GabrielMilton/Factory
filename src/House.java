public class House {
    //instance varible
    //1. at the top of the class
    // 2. they can be used anywhere execpt psvm
    // 3. public goes before
    // without void the method become a constructor
 public int walls;
 public double size;
 public String owner;
 public String address;
 public boolean isOccupied;

 //defult construnctor - no paramters or instutors; Java makes it
 public House (){
     walls = 4;
     size = 3200.7;
     owner = "Boby";
     address = "362 center st";
     isOccupied = true;




 }



    public void PrintInfo(){
        System.out.println(walls);// not a readable way
        System.out.println(size);
        System.out.println("name of owner:"+owner);//this readable
        System.out.println("address:"+ address);
        System.out.println(isOccupied);
    }

    // todo add two more parameters to the House constructor one for isoccupied and one for addresed

    public House(double psize,int pwalls, String ponwer){
        size = psize;
        walls = pwalls;
        owner = ponwer;




        }
        //to make a diffrent contrucotr use a diffrent parmeater
}
