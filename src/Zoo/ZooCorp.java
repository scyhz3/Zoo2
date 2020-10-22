package Zoo;

import Zoo.Zoo;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;

    public ZooCorp(Zoo zoo) {
        zoos.add(zoo);
    }

    public void addZoo(Zoo newZoo) {
        zoos.add(newZoo);
    }
}
