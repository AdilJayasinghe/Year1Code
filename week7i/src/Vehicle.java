public class Vehicle {
    private String vehicleModel;
    private int vehicleNo;

    // constuctors
    public Vehicle(String vehicleModel, int vehicleNo) {
        this.vehicleModel = vehicleModel;
        this.vehicleNo = vehicleNo;
    }

    //Setter
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    //getters
    public String getVehicleModel() {
        return this.vehicleModel;
    }
    public int getVehicleNo() {
        return this.vehicleNo;
    }

}
