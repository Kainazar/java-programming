package day47_constarctor;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";
    //constructor method- automatically called
    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Unknown";
        state = "Unknown";
        zipCode = "00000";
    }
    //second constructor, overloaded constructor -> provides shortcut to initialize variables
    //in same statement: ex: Address ad = new Address("123 java st", "Boston", "MA", "43213");
    public Address(String street, String city, String state, String zipCode) {
        setStreet(street);//reuse the code in the setter method
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
            //System.exit(0);
        } else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
