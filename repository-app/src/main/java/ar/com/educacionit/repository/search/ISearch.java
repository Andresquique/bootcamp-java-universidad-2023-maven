package ar.com.educacionit.repository.search;

import java.util.List;

import ar.com.educacionit.entities.AdressBook;

public interface ISearch {

	public List<AdressBook> execute(List<AdressBook> sourceList);
	
}
