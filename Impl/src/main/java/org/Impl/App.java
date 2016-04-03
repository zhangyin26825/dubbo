package org.Impl;

import java.io.IOException;
import java.util.List;

import org.publicModule.Address;
import org.publicModule.PublicInterface;
import org.publicModule.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App implements PublicInterface
{
    public static void main( String[] args ) throws IOException
    {
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:provider.xml");
	     context.start();
	     System.out.println("服务提供者启动");
	     System.in.read(); // 按任意键退出
    }

	public List<Address> getAddress(User u) {
		 Address a=new Address();
		 a.setAddress("增加的地址");
		 u.getAddresses().add(a);
		return u.getAddresses();
	}
}
