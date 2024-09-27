/*
 * Name: Omar Ismail Alomory
 * Matric No: S63955
 * Date: 13/5/2022
 */
package FinalPhase;
public class Address {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNo;
    

    public Address() {
    }

    public Address(String streetAddress, String city, String state, String zipCode) {
        setStreetAddress(streetAddress);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
    }

    public Address(String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNo) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        setZipCode(zipCode);
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public void copyAddress(Address otherAddress) {
        streetAddress = otherAddress.streetAddress;
        city = otherAddress.city;
        state = otherAddress.state;
        zipCode = otherAddress.zipCode;
    }

    @Override
    public String toString() {
        return (getFirstName()+" "+getLastName()+"\n"+getStreetAddress() + "\n" + getCity() + ", " + getState() + " - " + getZipCode()
                +"\nPhone No: "+getPhoneNo());
    }
}
