package org.xucong.spring.practise.ioc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
@ImportResource("classpath:ioc/cars.xml")
public class CarService {
	
	@Autowired
	private List<Car> cars;
	
	public List<Car> getCars() {
		return cars;
	}
}
