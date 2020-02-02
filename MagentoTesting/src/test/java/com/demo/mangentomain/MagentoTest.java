package com.demo.mangentomain;


//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.demo.magentoobjet.Login;
import com.demo.magentoobjet.Welcome;

public class MagentoTest {

	
	
		
//		Scanner s=new Scanner(System.in);
//		System.out.println("ENTER SOME THINK:");
//		String browser=s.nextLine();
//		
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//		ChromeDriver c=new ChromeDriver();
//		c.manage().window().maximize();
//		test(c);
//		}else
//		{
//		EdgeDriver e=new EdgeDriver();
//		e.manage().window().maximize();
//		test(e);
//		}}
		
		
@Test	
public  void test()	
   {
   WebDriver driver=new ChromeDriver();
	driver.get("https://magento.com");
//**One Task 	
	Welcome w=new Welcome(driver);
	        w.clickMy();
	        
//** 2nd task
	Login l=new Login(driver);
	      l.login();
	      l.typeMail("aravond@gmail.com");
	      l.typePass("*********");
	            
	      driver.quit();
	      
    }

//public static  void test(EdgeDriver driver)	
//{
//driver.get("https://magento.com");
////**One Task 	
//Welcome w=new Welcome(driver);
//        w.clickMy();
//        
////** 2nd task
//Login l=new Login(driver);
//      l.login();
//      l.typeMail("aravond@gmail.com");
//      l.typePass("*********");
//            
//      driver.quit();
//      
//}




	}


