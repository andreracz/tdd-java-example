package com.example.tddjavaexample;

import static org.junit.Assert.*;

import java.math.BigInteger;

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
	
	@Test(timeout=1000)
	public void test_fibonacci_50() {
		genericTest(50, 12586269025l);
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_100() {
		genericTest(new BigInteger("100"),  new BigInteger("354224848179261915075"));
	}
	
	@Test(timeout=1000)
	public void test_fibonacci_300() {
		genericTest(new BigInteger("300"),  new BigInteger("222232244629420445529739893461909967206666939096499764990979600"));
	}

	@Test(timeout=1000)
	public void test_fibonacci_500() {
		genericTest(new BigInteger("500"),  new BigInteger("139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125"));
	}
	private void genericTest(long n, long expected) {
		genericTest(new BigInteger("" + n), new BigInteger("" + expected));
	}
	
	private void genericTest(BigInteger n, BigInteger expected) {
		BigInteger result = controller.fibonacci(n);
		assertEquals("Resultado de F(" + n +") deveria ser = " + expected, expected, result);
	}
}
