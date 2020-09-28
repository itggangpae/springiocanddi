package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.DaoFactory;
import dao.ItemDao;
import domain.Item;

public class Main {
	public static void main(String[] args) {
		//ItemDao dao = DaoFactory.create();
	
//		AnnotationConfigApplicationContext context = 
//			new AnnotationConfigApplicationContext(DaoFactory.class);
//		ItemDao dao = context.getBean("create", ItemDao.class);
		
		GenericXmlApplicationContext context = 
				new 			GenericXmlApplicationContext("classpath:applicationContext.xml");
		ItemDao dao = context.getBean("itemDao", ItemDao.class);
		
		Item item = dao.get();
		System.out.println(item);
		
		context.close();
	}
}
