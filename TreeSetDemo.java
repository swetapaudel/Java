import java.util.*;
class TreeSetDemo{
public static void main(String args[]){
TreeSet<Integer> s = new TreeSet<Integer>();
s.add(1);
s.add(0);
s.add(5);
s.add(20);
s.add(8);
System.out.println(s);

System.out.println(s.first());

System.out.println(s.last());

System.out.println(s.floor(9));//used to return the greatest element in the set <= the given element

System.out.println(s.lower(25));//used to return the greatest element in the set which is strictly less than the given element

System.out.println(s.ceiling(50));//used to return the least element in the set >= the given element

System.out.println(s.higher(3));//used to return the least element in the set which is strictly greater the given element

System.out.println(s.pollFirst());// used to retrieve and remove the first(Lowest) element

System.out.println(s);

System.out.println(s.pollLast());// used to retrieve and remove the last(Highest) element

System.out.println(s);
}
}


