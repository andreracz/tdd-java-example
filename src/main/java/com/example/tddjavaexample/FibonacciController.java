package com.example.tddjavaexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

	@GetMapping("/fibonacci/{n}")
	public long fibonacci(@PathVariable(value="n") long n) {
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
