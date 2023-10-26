package ar.com.educacionit.repository.parse.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import ar.com.educacionit.entities.AdressBook;
import ar.com.educacionit.repository.parse.IParser;

public class AddressBookFileParser implements IParser<List<AdressBook>> {

	@Override
	public List<AdressBook> parse() {

		List<AdressBook> list= new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			UUID uuid = UUID.randomUUID();
			list.add(new AdressBook(uuid.toString(),"nombre-"+ Math.random(), Math.random()+"@mail.com"));
		}
		
		return list;
	}

}
