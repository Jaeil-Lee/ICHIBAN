package test;

class Person {
  private String name;
  private int age;
  private Address address;

  public Person(String name, int age, Address address) {
      this.name = name;
      this.age = age;
      this.address = address;
  }

  // Getters and setters...
}

class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String street, String city, String state, String zip) {
      this.street = street;
      this.city = city;
      this.state = state;
      this.zip = zip;
  }

  // Getters and setters...
}


public class ConnectObject {
  public static void main(String[] args) {
    
    Address address = new Address("123 Main St", "Anytown", "CA", "12345");
    Person person = new Person("John Doe", 30, address);
    

  }
}
