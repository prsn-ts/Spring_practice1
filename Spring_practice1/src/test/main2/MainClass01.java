package test.main2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.auto.Bicycle;

public class MainClass01 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("test/main2/init.xml");
		//bean으로 부터 Bicycle 객체를 가져온다.
		Bicycle bic1 = context.getBean(Bicycle.class);
		//drive() 메소드 호출.
		bic1.drive();
	}
}
