package ar.com.educacionit.repository.search.imp;

import java.util.ArrayList;
import java.util.List;

import ar.com.educacionit.entities.AdressBook;
import ar.com.educacionit.repository.search.ISearch;

public class FirstAndLastNameSearch implements ISearch {

	private String firstName;
	private String lastName;

	
	@Override
	public List<AdressBook> execute(List<AdressBook> sourceList) {
		
		List<AdressBook> filteredList = new ArrayList<>();
		
		for (AdressBook adressBook : sourceList) {
			if (adressBook.getName().toLowerCase().contains(this.firstName.toLowerCase())
					&& adressBook.getName().toLowerCase().contains(this.lastName.toLowerCase())) {
			filteredList.add(adressBook);
		}
			
	}
 	return filteredList;
}
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("nombre nulo");
		}
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("apellido nulo");
		}
		this.lastName = lastName;
	}

	
	
}
