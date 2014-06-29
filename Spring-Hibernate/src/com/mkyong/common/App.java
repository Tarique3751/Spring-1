package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
    	
    	/** insert **/
    	Stock stock = new Stock();
    	stock.setStockCode("7668");
    	stock.setStockName("HAIO");
    	stockBo.save(stock);
    	System.out.println(stock);
    	
    	/** update **/
    	stock.setStockName("HAIO-1");
    	System.out.println(stock);
    	stockBo.update(stock);
    	
    	/** delete **/
    	stockBo.delete(stock);
    	
    	System.out.println("Done");
    }
}
