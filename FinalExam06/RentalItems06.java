package FinalExam06;

public class RentalItems06 {
    String TNKBNumber;
    String vehicleName;
    String vehicleType;
    int year;
    int rentalFee;

    public RentalItems06(String TNKBNumber, String vehicleName, String vehicleType, int year, int rentalFee) {
        this.TNKBNumber = TNKBNumber;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.year = year;
        this.rentalFee = rentalFee;
    }

    public String display() {
        return "TNKBNumber: " + TNKBNumber + ", Vehicle Name: " + vehicleName + ", Vehicle Type: " + vehicleType + 
               ", Year: " + year + ", Rental Fee: " + rentalFee;
    }
}
