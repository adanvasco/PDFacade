package com.adan.api;

public class flight {
	
	public void searchFlight(String dateGone, String returnDate, String origin, String destiny){
		System.out.println("RESULTADOS PARA LA BUSQUEDA");
		System.out.println("********************************************************");
		System.out.println("Vuelos encontrados para");
		System.out.println(destiny + " desde " + origin);
		System.out.println("Fecha de salidad: " + dateGone);
		System.out.println("Fecha de Resgreso: " + returnDate);
		System.out.println("********************************************************");
	}
}
