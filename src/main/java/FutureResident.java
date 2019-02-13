public class FutureResident {

    private String firstName;
    private String lastName;
    private int age;
    private String anyAdditionalInformation;

    public FutureResident(String firstName, String lastName, int age, String anyAdditionalInformation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.anyAdditionalInformation = anyAdditionalInformation;
    }

    public void printDetails(){
        System.out.println("The Future Resident name is" + firstName + lastName +
               " and they are " + age + " years old.");
        System.out.println("Here is some additional information about them." + anyAdditionalInformation );
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnyAdditionalInformation() {
        return anyAdditionalInformation;
    }

    public void setAnyAdditionalInformation(String anyAdditionalInformation) {
        this.anyAdditionalInformation = anyAdditionalInformation;
    }
}
