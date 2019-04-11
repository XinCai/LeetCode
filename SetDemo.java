package datastructers;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        for (int i = 1; i < 6; i ++) {
//            set.add(i + "");
//        }
//
//
//        set.add("1"); //不会重复写入数据
//        set.add(null);//可以写入空数据
//
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//
//        Set<String> set1 = new TreeSet<>();
//        for (int i = 1; i < 6; i ++) {
//            set1.add(i + "");
//        }
//        set1.add("1"); //不会重复写入数据
//        set1.add("7");
//        set1.add("6");
//
//
//        //set1.add(null);//不可以写入空数据
//        Iterator<String> iter = set1.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");//数据有序
//        }// 输出(有序)为 1 2 3 4 5



        Map<String, String> map = new TreeMap<>();
        for (int i = 5; i > 0; i --) {
            map.put(i + "", i + "");
        }
        map.put("1","12");//key无重复
        map.put("11","1");//value可以重复
        //map.put(null, null);//不可以为空
        for (Iterator i = map.keySet().iterator(); i.hasNext(); ) {
            String key = (String)i.next();
            String value = map.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }



    }
}
