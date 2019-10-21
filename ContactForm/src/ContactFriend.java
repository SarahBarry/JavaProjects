
// Description:  ContactFriend child class
//added toFile method
public class ContactFriend extends Contact
{
       //private fields
    private int yearMet;
    
    //Constructor. Parameters for all fields
    public ContactFriend(String name, String eMail, String phone,
            String street, String city, String state, String zip,
            ContactType type, int yearMet) throws ContactException
    
            {
            // call the super class constructor.
                super(name, eMail, phone, street, city, state, zip, type);
                
            // assign the fields
            this.yearMet = yearMet;
            }

    
    //toString method
    @Override
      public String toString()
        {
            return super.toString() + ", " + (yearMet);
                    
        }
    //toFile method
    @Override
      public String toFile()
        {
            return super.toFile() + "," + (yearMet);
                    
        }
    
}
