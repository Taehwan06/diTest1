package diTest;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.setField("b객체의 field");
		
		A a = new A();
		a.setField2(b); //  setter 주입
		a.setField1("a객체의 field1");
		
		System.out.println(a.getField2().getField());
		
		
		
		// ioc 컨테이너 사용 의존 자동 주입
		
		String path = "classpath:applicationContext.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		A beanA = ctx.getBean("a", A.class);
		
		System.out.println(beanA.getField1());
		System.out.println(beanA.getField2().getField());
		
		
		/*
		
			스프링 프레임 워크의 ioc 컨테이너를 이용한 setter 주입 실습
		
			1. 학생과 학교 각 객체 생성 정보를 xml에 추가한다.
			2. 이때 학교의 학생 정보는 xml에 등록된 객체 생성 정보를 참조한다.
			3. main 에서 학교객체를 ioc 컨테이너에서 가져와 학생 명과 나이 학교 명을 출력한다.
			
		
		*/
		
		/*
		 * School beanSchool = ctx.getBean("school", School.class);
		 * 
		 * System.out.println(beanSchool.getName());
		 * System.out.println(beanSchool.getStudent().getName());
		 * System.out.println(beanSchool.getStudent().getAge());
		 */
		
		School beanSchool = ctx.getBean("school", School.class);
		
		System.out.println(beanSchool.getStudent().length);
		
		
		Computer computer = ctx.getBean("computer", Computer.class);
		
		computer.getMainBoard().method1();
		computer.getRam().method1();
		
		
	}

}
