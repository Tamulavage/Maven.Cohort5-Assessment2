package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {

    String addressLine1 = "";
    String addressLine2 = "";
    String city = "";
    String state = "";
    String zipCode = "";

    public Address() {
     /*   this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipCode = "";*/
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipCode;
    }

    public void setZipcode(String zipcode) {
        this.zipCode = zipcode;
    }

    @Override
    public boolean equals(Object o){
        if(o == this) {
            return true;
        }
        Address a = (Address) o;

        return addressLine1.equals(a.addressLine1) &&  addressLine2.equals(a.addressLine2)
                &&  city.equals(a.city) &&  state.equals(a.state)
                &&  zipCode.equals(a.zipCode);
    }

    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         sb.append("Address{");
         sb.append("addressLine1='");
         sb.append(this.addressLine1);
         sb.append("', addressLine2='");
         sb.append(this.addressLine2);
         sb.append("', city='");
         sb.append(this.city);
         sb.append("', state='");
         sb.append(this.state);
         sb.append("', zipcode='");
         sb.append(this.zipCode);
         sb.append("'}");

        return sb.toString();
    }
}
