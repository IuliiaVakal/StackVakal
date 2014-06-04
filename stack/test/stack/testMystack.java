package stack;

import static org.junit.Assert.*;
import java.util.Random;
import stack.MyStack;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.EmptyStackException;
public class testMystack {

	
	@Test //push(x) – добавить x в стек ( Помещает элемент в вершину стека)
	
	public void testPushCorrect() {
		
		MyStack stack=new MyStack(1);	

		stack.push(1);
		stack.pop();	
		
			assertTrue(stack.empty());		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)

		public void testPushException() {
			
			MyStack stack=new MyStack(3);	
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4); // стек расчитан на 3 элемента
		}

	@Test 
	//Peek -  Возвращает верхний элемент, не удаляя его из стека. 
		
		public void testPeekCorrect() {
	
			MyStack stack=new MyStack(2);	
			stack.push(1);
			stack.push(2);
			
			int el=	stack.peek();
			
				assertEquals("Correct_Peek", 2, el);	
	}

	@Test(expected = EmptyStackException.class)
	//Peek  
	
		public void testPeekExcep() {
	
			MyStack stack=new MyStack();
			stack.peek();		
	}
		
	@Test 
	//pop() –  Извлекает верхний элемент удаляя его из стека. 
	
		public void testPopCorrect() {
		
			MyStack stack=new MyStack(2);	 	
			stack.push(1);
			stack.push(2);
			
			int elempeek=stack.peek();
			int elempop=stack.pop();
			
			 	assertEquals(elempop, elempeek);
	}
	
	@Test (expected = EmptyStackException.class)
	//pop()
	
	public void testPopExcep() {
		
		MyStack stack=new MyStack();
		stack.pop();		    	
	}
	
	@Test
	//empty
	
		public void testEmptyTrue() {
	
		MyStack stack=new MyStack();	
			assertTrue( "True", stack.empty());	
	}

	@Test
	//empty
	
		public void testEmptyFalse() {
	
		MyStack stack=new MyStack(4);	
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
			assertFalse( "False", stack.empty());			
	}
	
}

