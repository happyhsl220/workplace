package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 * 
 * @author LG
 * HashSet�� ������ ����.
 * HashSet�� �ߺ������͸� ������� �ʴ´�. 
 */

public class HashSet_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("������", 49);
		Person p2 = new Person("���켺", 15);
		Person p3 = new Person("���ϴ�", 25);
		Person p4 = new Person("�����", 34);
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
		
		// Ư����ü ����
		set.remove(p2);
		
		Iterator<Person> iter2 = set.iterator();
		
		while(iter2.hasNext()) {
			Person person2 = iter2.next();
			System.out.println(person2.getName()+ ", " + person2.getAge());
		}
	}

}
