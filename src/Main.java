import vut.fekt.ukol2.MapClass;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        MapClass map = new MapClass();

        map.store(4,"Rada");
        map.store(0,"Jirka");
        map.store(1,"Naty");
        map.store(2,"Moni");
        map.store(3,"Kaja");
        map.store(8,"XXX");

        //map.store(4,"Rada");
        //map.getValue(5);
        //map.deleteKey(5);

        map.deleteKey(4);

        map.print();
        System.out.println(map.getSize());
    }
}
