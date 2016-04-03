package org.Consumer;

import java.util.ArrayList;
import java.util.List;

import org.publicModule.Address;
import org.publicModule.PublicInterface;
import org.publicModule.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:consumer.xml");
		 context.start();
		 PublicInterface publicinterface = (PublicInterface)context.getBean("demoService"); // 获取远程服务代理
		 List<Address> address=new ArrayList<Address>();
		 Address a=new Address();
		 a.setAddress("dfgsdfdsfg");
		 address.add(a);
		 
		 Address b=new Address();
		 b.setAddress("dfgsdfdsfg");
		 address.add(b);
		 
		 User u=new User();
	     u.setAddresses(address);
		 List<Address> address2 = publicinterface.getAddress(u);
		 System.out.println(address2.size());
		 address2.forEach(ty->System.out.println(ty.getAddress()));
		 System.out.println("消费者完成");
    }
}
