package hellotwo;


public class HelloWorld {
  public static void main(String[] args) {
    // currentTime = new LocalTime();
   // System.out.println("The current local time is: " + currentTime);
    
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
