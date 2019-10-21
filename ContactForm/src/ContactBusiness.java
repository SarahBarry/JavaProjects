
// Description:  ContactBusiness child class
//added toFile method
public class ContactBusiness extends Contact
{
    //private fields
    private String company;
    
    //Constructor. Parameters for all fields
    public ContactBusiness(String name, String eMail, String phone,
            String street, String city, String state, String zip,
            ContactType type, String company) throws ContactException
    
            {
            // call the super class constructor.
                super(name, eMail, phone, street, city, state, zip, type);
                
            // assign the fields
            this.company = company;
            }


    
    //toString method
    @Override
      public String toString()
        {
           return super.toString() + ", " + (company);

        }
   
    //toFile method
    @Override
      public String toFile()
        {
           return super.toFile() + "," + (company);

        }
      
      
}
    


