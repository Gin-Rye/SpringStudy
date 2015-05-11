package org.xucong.spring.practise.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(testName = "waiterTest")
@ContextConfiguration("classpath:aop/waiter.xml")
public class WaiterTest extends AbstractTestNGSpringContextTests {
	
	private Waiter waiter;
	private Advice advice;
	private ProxyFactory pf;
	
	@BeforeTest
	public void beforeTest() {
		waiter = new NaiveWaiter();
		advice = new GreetingBeforeAdvice();
		pf = new ProxyFactory();
		pf.setTarget(waiter);
		pf.addAdvice(advice);
	}
	
	@Test
	public void testAdvice() {
		String name = "John";
		Waiter adviceWaiter = (Waiter) pf.getProxy();
		adviceWaiter.greetTo(name);
		adviceWaiter.serveTo(name);
	}
}
