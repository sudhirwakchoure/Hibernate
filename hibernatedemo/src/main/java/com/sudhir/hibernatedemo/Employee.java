package com.sudhir.hibernatedemo;

/*import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;*/

/*@Entity
@Table(name="Employee")*/
public class Employee {
	
	/* @Id */
		private int id;  
		private String firstName,lastName;  
		  
		public int getId() {  
		    return id;  
		}  
		public void setId(int id) {  
		    this.id = id;  
		}  
		public String getFirstName() {  
		    return firstName;  
		}  
		public void setFirstName(String firstName) {  
		    this.firstName = firstName;  
		}  
		public String getLastName() {  
		    return lastName;  
		}  
		public void setLastName(String lastName) {  
		    this.lastName = lastName;  
		}
		 

}
