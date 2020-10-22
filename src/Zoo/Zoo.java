package Zoo;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int numCompounds;
    static int numZoos;
    int flag = 0;
    private ArrayList <Compound> compounds;


    public Zoo(){
        this("Unknow");
        numCompounds = 30;
        if(flag==0){
            numZoos ++;
        }
    }

    public Zoo(String location) {
        this.setLocation(location);
        flag = 0;
    }

    public Zoo(String location, int numCompounds) {
        this.setLocation(location);
        this.numCompounds = numCompounds;
        compounds = new ArrayList<Compound>();
        numZoos++;
        for(int i=0; i<numCompounds; i++){
            addCompound(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    public  String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void buildNewCompound () {
        numCompounds ++ ;
    }

    public void printInfo() {
        System.out.println("Location:  " + location );
        System.out.println("Compounds: " + numCompounds );
        System.out.print("\n");
    }
}
