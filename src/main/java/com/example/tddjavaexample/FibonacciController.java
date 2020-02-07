package com.example.tddjavaexample;

import org.springframework.stereotype.Controller;

@Controller
public class FibonacciController {

	public int fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		if (n == 0) {
			return a;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
}
