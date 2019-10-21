
// Description:  ContactFamily child class
//added toFile method
public class ContactFamily extends Contact
{
       //private fields
    private String relationship;
    
    //Constructor. Parameters for all fields
    public ContactFamily(String name, String eMail, String phone,
            String street, String city, String state, String zip,
            ContactType type, String relationship) throws ContactException
    
            {
            // call the super class constructor.
                super(name, eMail, phone, street, city, state, zip, type);
                
            // assign the fields
            this.relationship = relationship;
            }

    
    //toString method
    @Override
      public String toString()
        {
            return super.toString() + ", " + (relationship);
        }
      //toFile method
    @Override
      public String toFile()
        {
            return super.toFile() + "," + (relationship);
        }
}
