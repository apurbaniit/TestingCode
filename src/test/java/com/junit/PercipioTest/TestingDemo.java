package com.junit.PercipioTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all the test case");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all the test case");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each test cases");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each test cases");
	}

	@Test
	void test() {
		
		System.out.println("Test method");
		Demo d=new Demo();
		int rel=d.add(12, 15);
		Assertions.assertEquals(24, rel);
		
	}

}
