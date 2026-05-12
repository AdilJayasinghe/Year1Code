public class Person {
    //Attributes
    private String name;
    private int age;
    private double height;

 
    //constructors Creates objects inside memory
    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    //getter returns values if created
    public String getName(){
        return this.name; //this represents attributes in the class/list
    }
    public int getAge(){
        return this.age; //this represents attributes in the class/list
    }
    public double getHeight(){
        return this.height; //this represents attributes in the class/list
    }

    //setters update or modify existing values if created
    public void setName(String newName){
        this.name=newName; //this represents attributes in the class/list
    }
    public void setAge(int newAge){
        this.age=newAge; //this represents attributes in the class/list
    }
    public void setHeight(double newHeight){
        this.height=newHeight; //this represents attributes in the class/list
    }
    //Default
    public Person(){
        this.name="Doe";
        this.age=20;
        this.height=5.5d;
    }
}