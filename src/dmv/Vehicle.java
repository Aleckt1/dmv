//
// Aleck Thompson
// 6-28-2013
// Final Project
// Vehicle Application
//

import java.util.ArrayList; //program uses class ArrayList

public class Vehicle {

    private String licensePlate;
    private String ownerName;
    private String phoneNum;
    private String report;
    private String vehicleId;
    
    //constructor to initialize license, owner and phone
    public Vehicle( String license,String owner,String phone )
    {
        ownerName = owner;
        licensePlate = license;
        phoneNum = phone;

    }//end Vehicle constructor

				// set license
		public void setLicense(String license)
		{
		licensePlate = license; //should validate
		}
		//end method setLicense
		
    public String getLicense()
	 {
    return licensePlate;
		}//end getLicense
		
		//set owner name
		public void setOwnerName (String owner)
		{
		ownerName = owner; //should validate
		}//end method setOwnerName
		
		//return last name
		public String getOwnerName()
		{
		return ownerName;
		}//end method Owner Name
		
		//set social security number
		public void setPhoneNumber(String phone)
		{
		phoneNum = phone; //should validate
		}//end method setPhoneNumber
		
		//return phone number
		public String getPhoneNumber()
		{
		return phoneNum;
		} //end method getPhoneNumber
				
		//return String representation of vehicle object
		public String toString()
		{
		return String.format("%s (%s, %s)", getLicense(), getOwnerName(), getPhoneNumber() );
		} //end method toString

} // end class