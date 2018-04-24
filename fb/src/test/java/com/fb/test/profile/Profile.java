package com.fb.test.profile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.annotations.Test;

import com.fb.test.generatedClasses.*;
import com.fb.test.generatedClasses.PageData.Configuration; 

public class Profile {
  @Test
  public void f() throws JAXBException, FileNotFoundException {
	  JAXBContext context = JAXBContext.newInstance("com.fb.test.generatedClasses");
	  Unmarshaller unmarshler = context.createUnmarshaller();
	  PageData data = (PageData) unmarshler.unmarshal(new FileInputStream("data/EnvironmentOne/PageData.xml"));
	  for(Configuration conf: data.getConfiguration()){
		  System.out.println(conf.getUsername());
		  System.out.println(conf.getPassword());
	  }
  }
}
