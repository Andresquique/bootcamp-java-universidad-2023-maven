package ar.com.educacionit.entities;

import java.util.Objects;

public class AdressBook {

	private String id;
	private String name;
	private String email;
	
	public AdressBook(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "AdressBook [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdressBook other = (AdressBook) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id);
	}
	
	

	
}
