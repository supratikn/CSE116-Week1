package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

import org.junit.jupiter.api.Test;
import code.CollectionsAndSorting;

class CollectionsAndSortingTest {

	private code.CollectionsAndSorting cs;
	private java.util.Random rand;
	
	
	@Test
	void testMin() {
		cs = new code.CollectionsAndSorting();
		rand = new java.util.Random();
		
		PriorityQueue<Integer> q= new PriorityQueue() ;
		
		ArrayList<Integer> list= new ArrayList();
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-100000);
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-111);
		list.add(rand.nextInt(1000)-200);
		
		q.addAll(list);
		
		assertEquals(q.peek(),cs.minimum(list),0);
		
	}
	
	@Test
	void testMax() {
		
		
		cs = new code.CollectionsAndSorting();
		rand = new java.util.Random();
		
		
		
		ArrayList<Integer> list= new ArrayList();
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-100000);
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-111);
		list.add(rand.nextInt(1000)-200);
		
		
		Collections.sort(list);
		Collections.reverse(list);
		
		assertEquals(list.get(0),cs.maximum(list),0);
	}
	
	@Test
	void testSortAscending() {
		
		
		cs = new code.CollectionsAndSorting();
		rand = new java.util.Random();
		
		
		
		ArrayList<Integer> list= new ArrayList();
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-100000);
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-111);
		list.add(rand.nextInt(1000)-200);
		
		
		Collections.sort(list);
		
		
		for(int i=0; i<list.size();i++) {
			assertEquals(list.get(i),cs.sortAscending(list).get(i),0);
		}
	}
	
	@Test
	void testSortDescending() {
		
		
		cs = new code.CollectionsAndSorting();
		rand = new java.util.Random();
		
		
		
		ArrayList<Integer> list= new ArrayList();
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-100000);
		list.add(rand.nextInt(1000));
		list.add(rand.nextInt(1000)-111);
		list.add(rand.nextInt(1000)-200);
		
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i=0; i<list.size();i++) {
			assertEquals(list.get(i),cs.sortAscending(list).get(i),0);
		}
	}
	
	
	

}
