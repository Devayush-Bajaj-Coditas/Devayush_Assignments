package com.devayush.JunitPractice;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JunitPracticeApplicationTests {

	private Calculator calculator = new Calculator();

//------------------Junit in CORE JAVA-----------------------//

	@Test
	@Disabled  //---> used to disable the test
	void testAddition() {

		int expectedResult = 13;

		 int actualResult = calculator.addition(12,1);
		 assertThat(actualResult).isEqualTo(expectedResult);

	}

	@Test
	void testProduct(){
			int expectedResult = 250;
		int actualResult = calculator.product(10,20);
		assertThat(actualResult).isCloseTo(expectedResult, Percentage.withPercentage(20));
	}


	@Test
	void testCompare(){
		boolean actualResult =  calculator.compare(12,2);
		assertThat(actualResult).isTrue();
	}



	@AfterEach  // --> this will execute after each test case executes
	void tearDown(){
		System.out.println("tearing down ");

	}
	@BeforeEach		//--> it will execute before execution of testCase
	void setUp(){
		System.out.println("Setting up");
	}

//------------------Junit in CORE JAVA-----------------------//

}
