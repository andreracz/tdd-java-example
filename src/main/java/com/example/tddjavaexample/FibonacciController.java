package com.example.tddjavaexample;

import org.springframework.stereotype.Controller;

@Controller
public class FibonacciController {

	public long fibonacci(long n) {
		long a = 0;
		long b = 1;
		long c = 0;
		if (n == 0) {
			return a;
		}
		for (long i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
}
