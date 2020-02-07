package com.example.tddjavaexample;

import org.springframework.stereotype.Controller;

@Controller
public class FibonacciController {

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
