public class Farm {
    public String  name;
    public String  address;
    public double chickens;
    public int cows;
    public int gorllias;
    public double griaffas;
    public int polarBears;
    public int koalas;
    public int SnappingShrimp;
    public int vultures;
    public boolean doanimaleseavistors;
    public int daysSinceLastDeath;
    ;


    public boolean sellingProducts;

    public static void main(String[] args) {
        System.out.println(" Welocme My farm");
        new Farm();
    }

    public Farm (){
        name = "Ren's Rousy Ranch";
        address = "77°50′47″S 166°40′06″E";
        chickens = .5;
        cows = 1;
        gorllias = 20;
        griaffas = 50.25;
        polarBears = 5;
        koalas = 100;
        SnappingShrimp = 5;
        vultures = 20;
        doanimaleseavistors = true;
        daysSinceLastDeath = 2;


    }

    public Farm(String pname, String paddress){
        address = paddress;
        name = pname;


    }



    public void printInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(chickens);
        System.out.println(cows);
        System.out.println(gorllias);
        System.out.println(griaffas);
        System.out.println(polarBears);
        System.out.println(koalas);
        System.out.println(SnappingShrimp);
        System.out.println(vultures);
        System.out.println(doanimaleseavistors);
        System.out.println(daysSinceLastDeath);


    }
}
