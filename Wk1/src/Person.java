public class Person {

    //attributes
    private String firstName;
    private String lastName;

    //constructor
    Person(String inputFirstName, String inputLastName){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}


