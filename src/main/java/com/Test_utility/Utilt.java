package com.Test_utility;


import java.util.ArrayList;



public class Utilt 
{
private static Xls_Reader reader;

public static ArrayList<Object[]> testdatasetFromExcel( ) {
		
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			 reader = new Xls_Reader("/Users/madan mohan reddy/Music/PageObjectModel-master/Readfromexcel/testdata/testdataset.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}

		for(int rowNum = 2; rowNum<= reader.getRowCount("testdataset"); rowNum++ );
		
		String username = reader.getCellData("testdataset", "username", 2);
		System.out.println(username);
		String password = reader.getCellData("testdataset", "password", 2);
		System.out.println(password);
		

		String username1 = reader.getCellData("testdataset", "username", 3);
		System.out.println(username1);
		String password1 = reader.getCellData("testdataset", "password", 3);
		System.out.println(password1);
		
		String username2 = reader.getCellData("testdataset", "username", 4);
		System.out.println(username2);
		String password2 = reader.getCellData("testdataset", "password", 4);
		System.out.println(password2);
		
		
		Object ob [] = {username, password, username1, password1, username2, password2};
		myData.add(ob);
	
	
     return myData;		
}

}