package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("������", 49);
		Person p2 = new Person("���켺", 15);
		Person p3 = new Person("���ϴ�", 25);
		Person p4 = new Person("�����", 34);
		Person p5 = p4;
		
        Map<Integer, Person> map = new HashMap<>();
        
        map.put(1, p1);
        map.put(2, p2);
        map.put(3, p3);
        map.put(4, p4);
        map.put(5, p5);
        
        System.out.println("HashMap �Ǽ� : " + map.size());
        
        Set <Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
        	Integer key = iter.next();
        	Person person = map.get(key);
        	System.out.println(person.getName() + ", " + person.getAge());
        }
        
        System.out.println();
        
        map.remove(2); //key 2�� ���켺 ����
        map.replace(1, p3); // key 1�� ������ -> ���ϴ÷� ����
        
        Set <Integer> set2 = map.keySet();
        Iterator<Integer> iter2 = set2.iterator();
        while(iter2.hasNext()) {
        	Integer key = iter2.next();
        	Person person = map.get(key);
        	System.out.println(person.getName() + ", " + person.getAge());
        }        
        

	}

}
