package com.adan;

import com.adan.facade.CheckFacade;

public class App {

	public static void main(String[] args) {
			CheckFacade user1 = new CheckFacade();
			user1.search("30/10/2021", "08/11/2021", "Manizales", "San Andres prueba");

			CheckFacade user2 = new CheckFacade();
			user2.search("15/11/2021", "30/11/2021", "Manizales", "Santamarta");			
		} 
}

