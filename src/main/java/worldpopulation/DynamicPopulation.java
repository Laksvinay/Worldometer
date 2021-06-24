package worldpopulation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicPopulation {
	
	public void currenttime()
	{
		Calendar cal1 =new GregorianCalendar();
		//Calendar.getInstance();
		SimpleDateFormat date_format = new SimpleDateFormat("HH:mm:ss");
		System.out.println(java.time.LocalDate.now());  
		System.out.println(date_format.format(cal1.getTime()));
	
	}

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.worldometers.info/world-population/");
		//driver.manage().timeouts().(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> tb=new ArrayList<String>();
		ArrayList<String> dt=new ArrayList<String>();
		ArrayList<String> pg=new ArrayList<String>();
		ArrayList<String> yb=new ArrayList<String>();
		ArrayList<String> yd=new ArrayList<String>();
		ArrayList<String> yp=new ArrayList<String>();
		
		int countdown=200;
		DynamicPopulation dp=new DynamicPopulation();
		dp.currenttime();
		
		while((countdown--)>0)
		{
			al.add(driver.findElement(By.xpath("//*[@id=\"maincounter-wrap\"]/div/span")).getText());
		}
		
		
		
		System.out.println("===========Current World Population=====================");
		
		for(int i=1;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		
		System.out.println("==============================================================================");
		System.out.println("Duplicate entries removed");
		System.out.println("=============================================================================");
		
		
		Set<String> norepeatset = new LinkedHashSet(al);
        ArrayList<String> al2 = new ArrayList(norepeatset);
        for(int i=0;i<al2.size();i++)
        {
		System.out.println(al2.get(i));
        }
        
        
        
     //==========================For Today's birth=============================================================
        System.out.println("===================================================");

        countdown=200;
        dp.currenttime();
       		while((countdown--)>0)
		{
        	tb.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/span")).getText());
		}
		
             
        for(int i=1;i<tb.size();i++)
		{
			System.out.println(tb.get(i));
		}
	
		//===============================For Today's deaths===================================================
        
        System.out.println("==============================================================");
        countdown=200;
        dp.currenttime();
        while((countdown--)>0)
		{

			dt.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[1]/div/div[3]/div[2]/span")).getText());
        	//dt.add(driver.findElement(By.cssSelector("body > div.container > div:nth-child(2) > div.col-md-6 > div > div:nth-child(4) > div:nth-child(1) > div > div:nth-child(3) > div.sec-counter > span")).getText());
		}
       
        for(int i=1;i<dt.size();i++)
		{
			System.out.println(dt.get(i));
		}
		//===============================For Today's Population growth=========================================
        System.out.println("==============================================================");
        countdown=200;
        dp.currenttime();
        while((countdown--)>0)
		{
			pg.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[1]/div/div[4]/div[2]/span")).getText());
		}
        System.out.println("===============Todays Population growth================");
        for(int i=1;i<pg.size();i++)
		{
			System.out.println(pg.get(i));
		}
        System.out.println("==============================================================");
		//=================================Foe this year's birth==================================================
        countdown=200;
        dp.currenttime();
        while((countdown--)>0)
		{
		yb.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/span")).getText());
		}
        System.out.println("===============This year's births================");
        for(int i=1;i<yb.size();i++)
		{
			System.out.println(yb.get(i));
		}
		
		//=================================For this year's deaths===================================
        System.out.println("==============================================================");
        countdown=200;
        dp.currenttime();
        while((countdown--)>0)
		{
		yd.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[2]/div/div[3]/div[2]/span")).getText());
		}
       
        for(int i=1;i<yd.size();i++)
		{
			System.out.println(yd.get(i));
		}
		//===================================For this year's Population growth==============================
        System.out.println("==============================================================");

        countdown=200;
        dp.currenttime();
        while((countdown--)>0)
		{
		yp.add(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[3]/div[2]/div/div[4]/div[2]/span")).getText());
		}
        System.out.println("==========================For this Year's Population growth====================================");
        for(int i=1;i<yp.size();i++)
		{
			System.out.println(yp.get(i));
		}
		
        
        
        driver.close();
		driver.quit();
		
		
		

	}

}
