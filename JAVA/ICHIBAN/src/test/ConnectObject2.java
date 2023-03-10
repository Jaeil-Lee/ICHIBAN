package test;

// 참조를 이용할 객체 
class ObjectA {
  private ObjectB objectB;   // 반드시 ObjectB 객체를 만들어야 이렇게 사용 가능하다!!! 

  public void setObjectB(ObjectB objectB) {
    this.objectB = objectB;
  }

  public ObjectB getObjectB() {
    return objectB;
  }

  public void accessObjectB() {
    int value = objectB.getSomeValue(); // ObjectB의 멤버 변수에 접근
    
  }
}

// 참조될 객체
class ObjectB {
  private int someValue;

  public int getSomeValue() {

    someValue = 7;
    System.out.println(someValue);

    return someValue ;
  }

  public void setSomeValue(int someValue) {
    this.someValue = someValue;
  }
}

public class ConnectObject2 {
  public static void main(String[] args) {

    
    ObjectA a = new ObjectA(); 
    ObjectB b = new ObjectB();

    a.setObjectB(b); // 참조 변수 b를 대입 => 그러면 a에서 b(ObjectB)를 사용할 수 있다! 
    System.out.println(b);  // b가 참조 변수인지 확인용

    a.accessObjectB(); // ObjectA에서 ObjectB의 멤버 변수에 접근

  }
}
