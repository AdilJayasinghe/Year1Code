class Student{
    private String name;
    private String ID;
    private Module[] modules;

    public Student(String name,String ID){
        this.name = name;
        this.ID = ID;
        modules = new Module[6];
    }

    public String getname(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public void setname(String newname){
        this.name = newname;
    }
    public void setID(String newID){
        this.ID = newID;
    }
    public void addModule(Module module) {
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {   // found empty space
                modules[i] = module;    // insert module
                return;                 // stop after adding
            }
        }
        System.out.println("No space to add more modules");
    }

    public void showPass() {
        for (Module m : modules) {
            if (m != null) {
                System.out.println(m.getmoduleCode() + ": " + (m.pass() ? "Pass" : "Fail"));
            }
        }
    }
}
