package main;

public class Contact {
	
	//variable declarations
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactId, String firstName, String lastName, 
		    String phone, String address){
		
		//validation for constructor
		
			if (contactId == null || contactId.length() > 10) {
				throw new IllegalArgumentException("Invalid ID");
			}
		
			if (firstName == null || firstName.length() > 10) {
				throw new IllegalArgumentException("Invalid First Name");
			}
		
			if (lastName == null || lastName.length() > 10) {
				throw new IllegalArgumentException("Invalid Last Name");
			}
		
			if (phone == null || phone.length() > 10) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}
		
			if (address == null || address.length() > 30) {
				throw new IllegalArgumentException("Invalid Address");
			}
			
		this.contactId = contactId;	
		this.firstName = firstName;	
		this.lastName = lastName;	
		this.phone = phone;	
		this.address = address;	
			
		}
	
	//getters and setters with validation
	
	public String getContactId(){
        return contactId;
    }
	
    public void setContactId(String contactId){
        if(contactId == null || contactId.length() <= 10)
            this.contactId = contactId;
        else
            throw new IllegalArgumentException("Invalid Contact ID");
    }
	
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
    	if(firstName == null || firstName.length() <= 10)
    		this.firstName = firstName;
        else
            throw new IllegalArgumentException("Invalid First Name");
    }
    
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        if(lastName == null || lastName.length() <= 10)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Invalid Last Name");
    }
    
    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone) {
    	if(phone == null || phone.length() <= 10)
    		this.phone = phone;
        else
            throw new IllegalArgumentException("Invalid Phone");
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address) {
    	if(address == null || address.length() <= 30)
    		this.address = address;
        else
            throw new IllegalArgumentException("Invalid Address");
    }
}