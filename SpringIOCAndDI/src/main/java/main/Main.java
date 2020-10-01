package main;

import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.DaoFactory;
import dao.ItemDao;
import domain.CollectionBean;
import domain.Item;
import service.UserService;

public class Main {
	public static void main(String[] args) {
		//ItemDao dao = DaoFactory.create();
	
//		AnnotationConfigApplicationContext context = 
//			new AnnotationConfigApplicationContext(DaoFactory.class);
//		ItemDao dao = context.getBean("create", ItemDao.class);
		
		/*
		GenericXmlApplicationContext context = 
				new 			GenericXmlApplicationContext("classpath:applicationContext.xml");
		ItemDao dao = context.getBean("itemDao", ItemDao.class);
		
		Item item = dao.get();
		System.out.println(item);
		
		context.close();
		*/
		
		/*
		try(GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");) {
			Item Item = context.getBean(Item.class);
			System.out.println(Item);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext(
				"classpath:applicationContext.xml");) {
			CollectionBean bean = context.getBean("collectionBean", CollectionBean.class);
			System.out.println("=========List============");
			for (String str : bean.getList()) {
				System.out.println(str);
			}
			System.out.println("=========Set============");
			for (String str : bean.getSet()) {
				System.out.println(str);
			}
			System.out.println("=========Map============");
			Set<String> keySet = bean.getMap().keySet();
			for (String key : keySet) {
				System.out.println(key + ":" + bean.getMap().get(key));
			}System.out.println("=========Properties============");
			Set<Object> propSet = bean.getProperties().keySet();
			for (Object key : propSet) {
				System.out.println(key + ":" + bean.getProperties().get(key));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");) {
			UserService service = context.getBean(UserService.class);
			System.out.println(service.getUser());
		} catch (Exception e) {
			e.printStackTrace();
		}	


	}
}
