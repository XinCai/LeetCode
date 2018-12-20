package node;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map .put("AaaA",1);
        map .put("BBBB",2);
        map .put("AaBB",3);
        map .put("BBAa",4);
        map .put("five",5);
        map .put("six",6);
        map .put("seven",7);

        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        Map<MutableString, String> brokenMap = new HashMap<>();

        String value = "abc";

        MutableString key = new MutableString(value);

        brokenMap.put(key,value);

        System.out.println(brokenMap.get(key));
        System.out.println(String.valueOf(brokenMap));

        key.setValue("def"); // key changed here , pass as a reference, key shouldn't be changed

        System.out.println(brokenMap.get(key));
        System.out.println(String.valueOf(brokenMap));

    }
}
