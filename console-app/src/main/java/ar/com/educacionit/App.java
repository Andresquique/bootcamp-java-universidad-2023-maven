package ar.com.educacionit;

import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import ar.com.educacionit.entities.AdressBook;
import ar.com.educacionit.repository.parse.imp.AddressBookFileParser;
import ar.com.educacionit.repository.search.ISearch;
import ar.com.educacionit.repository.search.imp.FirstAndLastNameSearch;

public class App {
	
    public static void main( String[] args ) {
        
    	// 1 cargar el archivo csv
    	
    	AddressBookFileParser parse = new AddressBookFileParser();
    	List<AdressBook> listado = parse.parse();
    	
    	//mostrar menu al usuario
    	Scanner teclado = new Scanner(System.in);
    	
    	Integer op = null;
    	
    	do {
			Menu.mostrarMenu();
			op = Menu.getOp(teclado);
		} while (op < 0 || op > 4);
    	
    	//evaluo que opcion ejecuto
    	ISearch search = null;
    	
    	switch (op) {
		case 1: {
			System.out.println("nombre");
			String nombre = teclado.next();
			
			System.out.println("apellido");
			String apellido = teclado.next();
			
			search = new  FirstAndLastNameSearch();
			((FirstAndLastNameSearch)search).setFirstName(nombre);
			((FirstAndLastNameSearch)search).setLastName(apellido);

		}
		
		var filteredList = search.execute(listado);
		
		}
    }
}
