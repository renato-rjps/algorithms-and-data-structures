package br.com.algorithms.caelum.ed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VetorTest{

	@Test
	public void testEmptyVector() {
		Vector list = new Vector();
		assertEquals("Should be equal","[]", list.toString());
	}
	
	@Test
	public void testAddAtTheEnd() {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);

		assertEquals("Should be equal","[Renato, Santos]", list.toString());
	}

	@Test
	public void testAddByPosition() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");
		student3.setName("Jose");

		Vector list = new Vector();

		list.add(student1);
		list.add(0, student2);
		list.add(2, student3);

		assertEquals("[Santos, Renato, Jose]", list.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddByIllegalPosition(){
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");
		student3.setName("Jose");

		Vector list = new Vector();

		list.add(student1);
		list.add(0, student2);
		list.add(5, student3);
	}
	
	@Test
	public void testGetStudentById() {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		
		assertEquals("Renato", list.getObject(0).toString());
		assertEquals("Santos", list.getObject(1).toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetStudentByInvalidPosition() {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		
		list.getObject(-4);
	}
	
	@Test
	public void testRemoveStudentByPosition() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");
		student3.setName("Jose");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		list.remove(0);

		assertEquals("[Santos, Jose]", list.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRemoveStudentByIllegalPosition() {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		
		list.remove(6);		
	}
	
	@Test
	public void testContensStudent() {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		
		assertTrue(list.contens(student1));
		assertTrue(list.contens(student2));
		
		Student student3 = new Student();
		student3.setName("Jose");
		assertFalse(list.contens(student3));
	}
	
	@Test
	public void testVectorSize() {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.setName("Renato");
		student2.setName("Santos");
		student3.setName("Jose");

		Vector list = new Vector();

		list.add(student1);
		list.add(student2);
		assertEquals(2, list.size());
		
		list.add(student3);
		assertEquals(3, list.size());
		
//		list.remove(0);
//		list.remove(1);
//		assertEquals(1, list.size());
	}
	
	

}
