package com.blulife.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	public Readconfig(){
	    File src=new File("./config/configuration.properties");
	            try {
	                FileInputStream fis=new FileInputStream(src);
	                pro=new Properties();
	                    pro.load(fis);
	            } catch (IOException e) {
	                System.out.println("exception is:"+e.getMessage());
	                e.printStackTrace();
	            }
	}            
	    public String getapplicationurl() {
	    String url=pro.getProperty("url");
	    return url;
	    }
	    public String getusername() {
	        String username=pro.getProperty("username");
	        return username;
	    }
	    public String getpassword() {
	        String password=pro.getProperty("pwd");
	        return password;

	    }
}
