public static void main(String[] args) {
    // Create Students
    Student s1 = new Student("Alex", "W001");
    Student s2 = new Student("Bob", "W002");

    // Create Modules for s1
    Module m1 = new Module("CS101", 50, 60); // pass
    Module m2 = new Module("CS102", 30, 20); // fail
    Module m3 = new Module("CS103", 80, 70); // pass

    // Add modules to s1
    s1.addModule(m1);
    s1.addModule(m2);
    s1.addModule(m3);

    // Create Modules for s2
    Module m4 = new Module("CS101", 40, 40); // pass
    Module m5 = new Module("CS102", 35, 30); // fail
    Module m6 = new Module("CS103", 60, 50); // pass

    // Add modules to s2
    s2.addModule(m4);
    s2.addModule(m5);
    s2.addModule(m6);

    System.out.println("Results for " + s1.getname());
    s1.showPass();

    System.out.println("\nResults for " + s2.getname());
    s2.showPass();
}