package com.enation.framework.web.mvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>  {


	@Override
	public Date convert(String source) {
		  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
		    dateFormat.setLenient(false);    
		    try {    
		    	if(source.equals("")){return null;}
		        return dateFormat.parse(source);    
		    } catch (ParseException e) {    
		        e.printStackTrace();    
		    }           
		    return null;  
	}

}
