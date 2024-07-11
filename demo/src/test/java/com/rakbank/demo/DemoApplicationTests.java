package com.rakbank.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		
	}
	public void doSomething() {
  		doSomething();
	}

	public void notImplemented() {
  		throw new UnsupportedOperationException("notImplemented() cannot be performed because ...");
	}

	@Override
	public void emptyOnPurpose() {
  		// comment explaining why the method is empty
	}

}
