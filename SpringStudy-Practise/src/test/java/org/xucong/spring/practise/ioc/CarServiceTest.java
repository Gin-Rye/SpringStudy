package org.xucong.spring.practise.ioc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(testName = "carServiceTest")
@ContextConfiguration("classpath:ioc/carService.xml")
public class CarServiceTest extends AbstractTestNGSpringContextTests {
	
	@Autowired
	private CarService carService;
	
	@Test
	public void testGetCars() {
		List<Car> cars = carService.getCars();
		Assert.assertTrue(cars.size() == 2);
	}
}
