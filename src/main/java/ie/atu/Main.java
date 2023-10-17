package ie.atu;

public class Person(){

        String firstName = "";
        String lastName = "";
        int age = 0;

//Constructor
public Person(){
        this.firstName ="";
        this.lastName ="";
        this.age;
        }

 public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

  public void displayInfo(){
    System.out.println("Name: " + firstName + "" + lastName + ",Age: " +
            age);
  }

}





public class Main {
    public static void main(String[] args){
        Person johnDoe = new Person("John","Doe",20);
        Person Blank = new Person();


        johnDoe.displayInfo();
        Blank.displayInfo();
    }
}