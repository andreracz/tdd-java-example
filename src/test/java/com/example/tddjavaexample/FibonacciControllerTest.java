package com.example.tddjavaexample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciControllerTest {

	@Autowired
	FibonacciController controller;
	
	@Test(timeout=1000)
	public void test_fibonacci_0() {
		genericTest(0, 0);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_1() {
		genericTest(1, 1);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_2() {
		genericTest(2, 1);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_3() {
		genericTest(3, 2);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_4() {
		genericTest(4, 3);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_5() {
		genericTest(5, 5);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_10() {
		genericTest(10, 55);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_30() {
		genericTest(30, 832040);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_45() {
		genericTest(45, 1134903170);
	}
	
	
	private void genericTest(int n, int expected) {
		int result = controller.fibonacci(n);
		assertEquals("Resultado de F(" + n +") deveria ser = " + expected, expected, result);
	}
}
