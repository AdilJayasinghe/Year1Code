class Module {
    private String moduleCode;
    private double ICT;
    private double CW;

    public Module(String moduleCode, double ICT, double CW){
        this.moduleCode = moduleCode;
        this.ICT = ICT;
        this.CW = CW;
    }
    private double getFinalMark(){
        double finalMark= (ICT+CW)/2;
        return finalMark;
    }

    public boolean pass(){
        if(getFinalMark()>=40) {
            return true;
        }
        else{
            return false;
        }
    }

    public String getmoduleCode(){

        return moduleCode;
    }
}

