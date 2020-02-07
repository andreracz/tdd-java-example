package com.example.tddjavaexample;

import java.math.BigInteger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class FibonacciController {

	@GetMapping("/fibonacci/{n}")
	public BigInteger fibonacci(@PathVariable(value="n") BigInteger n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		if (n.equals(BigInteger.ZERO)) {
			return a;
		}
		for (BigInteger i = new BigInteger("2"); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
			c = a.add(b);
			a = b; 
			b = c;
		}
		return b;
	}
	
}
