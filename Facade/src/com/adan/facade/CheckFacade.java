package com.adan.facade;

import com.adan.api.flight;
import com.adan.api.hoteles;

public class CheckFacade {
	
	private flight Flight;
	private hoteles Hoteles;
	
	public CheckFacade() {
		Flight = new flight();
		Hoteles = new hoteles();		
	}
	
	public void search(String dateGone, String returnDate, String origin, String destiny) {
		Flight.searchFlight(dateGone, returnDate, origin, destiny);
		Hoteles.searchHoteles(dateGone, returnDate, origin, destiny);
	}
}
