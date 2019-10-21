
// Description:  Modification of lab11
//               added toFile to both classes


public abstract class Contact implements Comparable<Contact>
{
    // private instance fields. 
    // Each object gets its own copy of the fields

    private String name;
    private Address address;
    private String eMail;
    private String phone;
    private ContactType type;

    // private class fields.
    private static int count = 0;
    
      // Lab 11: add finalize method
    public static void decrementCount()
    {
        --count;
    }

    //public constructors
    public Contact(String name, String eMail, String phone,
            String street, String city, String state, String zip, ContactType type) throws ContactException
    {
        this.name = name;
        this.address = address;
        this.eMail = eMail;
        this.phone = phone;

        // create the inner Address object
        this.address = new Address(street, city, state, zip);
        this.type = type;

        // code to increment the static contact counter
        ++count;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the address
     */
    public Address getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address)
    {
        this.address = address;
    }

    /**
     * @return the eMail
     */
    public String geteMail()
    {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail)
    {
        this.eMail = eMail;
    }

    /**
     * @return the phone
     */
    public String getPhone()
    {
        return phone;
    }

    public static int getCount()
    {
        return count;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    // added a toString method to display all fields
    public String toString()
    {
        return name + ", " + eMail + ", " + phone + ", " + address +  ", " + type;
    }
    
    //Lab12
    public String toFile()
    {
        return name + "," + eMail + "," + phone + "," + address.toFile() + "," + type;
    }
    
      // InterfaceSortEx: The sort method will call this method to compare Contact objects.
    @Override
    public int compareTo(Contact contactObj)
    {
        return this.name.compareTo(contactObj.getName());
    }

    private class Address
    {
        // private instance fields. 

        private String street;
        private String city;
        private String state;
        private String zip;

        // public constructor
        public Address(String initStreet, String initCity, String initState,
                String initZip) throws ContactException
        {
            city = initCity;
            street = initStreet;
            state = initState;
            zip = initZip;
            
            validateStreet();
            validateCity();
            validateState();
            validateZip();    
        }
        
         // Added a validateStreet method
        public void validateStreet()
        {
            if (street.length() > 10)
            {
                street = street.substring(0, 10);
            }
        }
        //Added a validateCity method
        public void validateCity()
        {
            String first = city.substring(0, 1).toUpperCase();
            String rest = city.substring(1);
            city = first + rest;
        }

        public void validateState() throws ContactException
        {
           //throws contactException for State
            state = state.length() == 2? state.toUpperCase() : "Error:";
            if (state.length() != 2)
            {
                throw new ContactException("State: Not 2 Characters");
            }
            state = state.toUpperCase();
        }

        public void validateZip() throws ContactException
        {
            //throws ContactException for Zip
            if (!zip.matches("^\\d{5}$"))
            {
                throw new ContactException("Zip: Incorrect Format");
            } 
        }


        /**
         * @return the street
         */
        public String getStreet()
        {
            return street;
        }

        /**
         * @param street the street to set
         */
        public void setStreet(String street) 
        {
            this.street = street;
            validateStreet();
        }

        /**
         * @return the city
         */
        public String getCity()
        {
            return city;
        }

        /**
         * @param city the city to set
         */
        public void setCity(String city)
        {
            this.city = city;
            validateCity();
        }

        /**
         * @return the state
         */
        public String getState()
        {
            return state;
           
        }

        /**
         * @param state the state to set
         */
        public void setState(String state) throws ContactException
        {
            this.state = state;
            validateState();
        }

        /**
         * @return the zip
         */
        public String getZip()
        {
            return zip;
        }

        /**
         * @param zip the zip to set
         */
        public void setZip(String zip) throws ContactException
        {
            this.zip = zip;
            validateZip();
        }
          // Added a toString method to display the fields in the class
        public String toString()
        {
            return street + ", " + city + ", " + state + ", " + zip;
        }
         // used to generate String for writing to file
        public String toFile()
        {
            return street + "," + city + "," + state + "," + zip;
        }
    }

    public static enum ContactType
    {
        BUSINESS, FAMILY, FRIEND
    }
}
