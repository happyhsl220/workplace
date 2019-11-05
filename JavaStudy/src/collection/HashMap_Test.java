package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("이정재", 49);
		Person p2 = new Person("정우성", 15);
		Person p3 = new Person("강하늘", 25);
		Person p4 = new Person("민재식", 34);
		Person p5 = p4;
		
        Map<Integer, Person> map = new HashMap<>();
        
        map.put(1, p1);
        map.put(2, p2);
        map.put(3, p3);
        map.put(4, p4);
        map.put(5, p5);
        
        System.out.println("HashMap 건수 : " + map.size());
        
        Set <Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
        	Integer key = iter.next();
        	Person person = map.get(key);
        	System.out.println(person.getName() + ", " + person.getAge());
        }
        
        System.out.println();
        
        map.remove(2); //key 2번 정우성 삭제
        map.replace(1, p3); // key 1번 이정재 -> 강하늘로 변경
        
        Set <Integer> set2 = map.keySet();
        Iterator<Integer> iter2 = set2.iterator();
        while(iter2.hasNext()) {
        	Integer key = iter2.next();
        	Person person = map.get(key);
        	System.out.println(person.getName() + ", " + person.getAge());
        }        
        

	}

}
