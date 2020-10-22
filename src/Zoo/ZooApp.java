package Zoo;

public class ZooApp {
    public static void main(String[] args) {
        Zoo.numZoos = 0;
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo("Raleigh Park", 13);
        zoo1.printInfo();
        zoo2.printInfo();
        System.out.print("Number of Zoos: " + Zoo.numZoos);
    }
}
