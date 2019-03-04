package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    Long id;
    String name;
    Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public boolean equals(Object o) {
        Person p = (Person) o;
        Boolean retVal = false;
        Boolean addressGood = false;
        Boolean idGood = false;
        Boolean nameGood = false;

// hack - should refactor

        // address
        if(this.address != null && p.address!=null)
        {
            if(this.address.equals(p.address))
            {
                addressGood = true;
            }
        }
        else if (this.address == null && p.address==null) {
            addressGood = true;
        }

        // id
        if(this.id != null && p.id != null){
            if (this.id.equals(p.id))
            {
                idGood = true;
            }
        }else if (this.id == null && p.id==null) {
            idGood = true;
        }

        // name
        if(this.name !=null && p.name !=null){
            if(this.name.equals(p.name)){
                nameGood = true;
            }
        } else if (this.name == null && p.name==null) {
            nameGood = true;
        }


        if(addressGood && idGood && nameGood){
            retVal = true;
        }

        return retVal;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', address=");
        sb.append(this.address);
        sb.append("}");
        return sb.toString();
    }
}