public class CarData {

  //Instance variables for each car's data
  private String brand;
  private int kmDriven;
  private String fuel;
  private String owners;
  private int sellingPrice;

  //Constructor to initalize CarData object with given car details
  public CarData(String brand, int kmDriven, String fuel, String owners, int sellingPrice) {
    this.brand = brand;
    this.kmDriven = kmDriven;
    this.fuel = fuel;
    this.owners = owners;
    this.sellingPrice = sellingPrice;
  }
  //getter method
  public int getPrice () {
    return sellingPrice;
  }
//returns a string representation of the car's data
  public String toString() {
    return "\nBrand: " + brand + "\nKm Driven: " + kmDriven + "\nType of Fuel: " + fuel + "\nAmmount of Owners: " + owners + "\nSelling Price: " + sellingPrice;
  }
}