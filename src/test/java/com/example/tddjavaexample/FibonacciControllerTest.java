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
	
	@Test
	public void test_fibonacci_0() {
		int result = controller.fibonacci(0);
		assertEquals("Resultado de F(0) deveria ser = 0",0, result);
	}
	
	@Test
	public void test_fibonacci_1() {
		int result = controller.fibonacci(1);
		assertEquals("Resultado de F(1) deveria ser = 1", 1, result);
	}
	
	@Test
	public void test_fibonacci_2() {
		int result = controller.fibonacci(2);
		assertEquals("Resultado de F(2) deveria ser = 1", 1, result);
	}
}
