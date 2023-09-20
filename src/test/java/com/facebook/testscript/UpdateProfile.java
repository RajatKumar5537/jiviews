package com.facebook.testscript;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.facebook.generic.BaseClass;
@Listeners(com.facebook.generic.ListenerImplimentation.class)
public class UpdateProfile extends  BaseClass{

	@Test
	public void loginNewUser() {
		
	}

}
