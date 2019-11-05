package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Arraylist
 *  ��������� �˼� �ִ�.
 * ó���ӵ��� ������.
 *
 */
public class ArrayLIst_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("������", 49);
		Person p2 = new Person("���켺", 15);
		Person p3 = new Person("���ϴ�", 25);
		Person p4 = new Person("�����", 34);
		Person p5 = p4;
		
		List<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println("ArrayList Size = " + list.size());
		
		for (int i=0 ; i<list.size() ; i++) {
			Person person = list.get(i);
			System.out.println(person.getName() + ", " + person.getAge());
		}
		
		System.out.println();
		
		list.remove(1);
		
		for (int i=0 ; i<list.size() ; i++) {
			Person person = list.get(i);
			System.out.println(person.getName() + ", " + person.getAge());
		}
		
		System.out.println();
		list.set(1, p2);
		for (int i=0 ; i<list.size() ; i++) {
			Person person = list.get(i);
			System.out.println(person.getName() + ", " + person.getAge());
		}
	}
		
}
