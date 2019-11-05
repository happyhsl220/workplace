package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * 
 * @author LG
 * HashSet은 순서가 없다.
 * HashSet은 중복데이터를 허용하지 않는다. 
 */

public class HashSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("이정재", 49);
		Person p2 = new Person("정우성", 15);
		Person p3 = new Person("강하늘", 25);
		Person p4 = new Person("민재식", 34);
		Person p5 = p4;
		
		Set<Person> set = new HashSet<>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		System.out.println("HashSet Size = " + set.size());
		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext()) {
			Person person = iter.next();
			System.out.println(person.getName()+ ", " + person.getAge());
		}
		
		System.out.println();
		
		// 특정개체 삭제
		set.remove(p2);
		
		Iterator<Person> iter2 = set.iterator();
		
		while(iter2.hasNext()) {
			Person person2 = iter2.next();
			System.out.println(person2.getName()+ ", " + person2.getAge());
		}
	}

}
