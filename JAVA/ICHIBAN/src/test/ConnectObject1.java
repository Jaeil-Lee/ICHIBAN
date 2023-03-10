package test;

 
class Person {
  private String name;
  private int age;
  private Address address;

  // 생성자
  public Person(String name, int age, Address address) { // Address => 참조형 매개변수로 !
    this.name = name;
    this.age = age;
    this.address = address;
  }

}


class Address {
  private String street;
  private String city;
  private String state;
  private String zip;

  // 생성자
  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

}

public class ConnectObject1 {
  public static void main(String[] args) {

    // 객체를 생성하는 순서를 잘 보자 1.Address 2.Person
    // => Address를 먼저 생성해야 Person의 생성자 매개변수로 address를 넣을 수 있지 않겠나~
    Address address = new Address("123 Main St", "Anytown", "CA", "12345");
    Person person = new Person("John Doe", 30, address);
   
  }
}
