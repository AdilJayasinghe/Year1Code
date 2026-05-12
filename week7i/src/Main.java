import java.lang.invoke.VarHandle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create object
        Person p1 = new Person("John",20,6.2d);
        Person p2 = new Person("Anne",19,5.0d);
        Person p3 = new Person("Paul",20,5.5d);
        Person p4 = new Person();//calls the default

        Vehicle v1 = new Vehicle("Maruti",2222);
        Vehicle v2 = new Vehicle("Suzuki",2223);
        Vehicle v3 = new Vehicle("Nissan",2222);

        //dISPLAY P1 name
        System.out.println(p1.getName());
        //Display p3 age
        System.out.println(p3.getAge());
        //Update p1 into Brian and display p1s updated name
        p1.setName("Brian");
        System.out.println(p1.getName());

        System.out.println(v1.getVehicleModel());
        System.out.println(v3.getVehicleNo());
        v1.setVehicleModel("Ferrari");
        System.out.println(v1.getVehicleModel());
    }
}