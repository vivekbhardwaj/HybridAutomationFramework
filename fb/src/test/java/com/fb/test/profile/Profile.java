package com.fb.test.profile;

import org.testng.annotations.Test;

import com.fb.test.genereated.pagedata.ObjectFactory;
import com.fb.test.genereated.pagedata.PageData.Configuration;

public class Profile {
  @Test
  public void f() {
	  Configuration conf = new ObjectFactory().createPageDataConfiguration();
	  System.out.println("name ->"+conf.getId());
  }
}
