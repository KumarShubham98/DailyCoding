package Map;

import java.util.HashMap;

public class Map_01 {

    public static void main(String[] args) {

        //1. Creating HashMap with default initial capacity and load factor

        HashMap<String, Integer> map1 = new HashMap<String, Integer>();

        System.out.println(map1);

        //2. Creating HashMap with 30 as initial capacity

        HashMap<String, Integer> map2 = new HashMap<String, Integer>(30);
        System.out.println(map2);
        //3. Creating HashMap with 30 as initial capacity and 0.5 as load factor

        HashMap<String, Integer> map3 = new HashMap<String, Integer>(30, 0.5f);
        System.out.println(map3);
        //4. Creating HashMap by copying another HashMap

        HashMap<String, Integer> map4 = new HashMap<String, Integer>(map1);
        System.out.println(map4);
    }
}
