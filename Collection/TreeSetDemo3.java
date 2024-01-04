package Collection;

import java.util.*;

class TreeSetDemo3 {

    public static void main(String[] args) {

        TreeSet<String> t = new TreeSet<String>(new MyComparator());
        t.add("Roja");
        t.add("Saima");
        t.add("Sufiya");
        t.add("Gazal");
        t.add("Rehab");
        System.out.println(t);
    }
}
class MyComparator implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) {
       String s1 = obj1.toString();
        String s2 = (String) obj2;
        return s2.compareTo(s1);
       //return -s1.compareTo(s2);
    }
}
