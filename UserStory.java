import java.util.Scanner;

public class UserStory {

  //Array to store all cardata in cardata objects
private CarData[] data;

  //constructor that initalizes the UserStory with car data from the correct files
  public UserStory(String brandFile, String kmFile, String fuelFile, String ownerFile, String priceFile) {
    //Calls createData to load car data from the files into the array
    data = createData(brandFile, kmFile, fuelFile, ownerFile, priceFile);
  }

  //Method to create an array of CarData objects using data from the text files
public CarData[] createData(String brandFile, String kmFile, String fuelFile, String ownerFile, String priceFile) {
  //reads the files into the arrays
  String[] brand = FileReader.toStringArray(brandFile);
  int[] km = FileReader.toIntArray(kmFile);
  String[] fuel = FileReader.toStringArray(fuelFile);
  String[] owners = FileReader.toStringArray(ownerFile);
  int[] price = FileReader.toIntArray(priceFile);
  //creates a temporary array to store cardata object
  CarData[] tempData = new CarData[brand.length];

  //Cardata array with dta from file
  for (int i = 0; i< tempData.length; i++) {
    tempData[i] = new CarData(brand[i], km[i], fuel[i], owners[i], price[i]);
  }
  return tempData;
}

//finds and prints most expensive car
public void findMostExpensiveCar() {
    // Initialize variable to store the most expensive car
    CarData mostExpensive = data[0];  // Assume the first car is the most expensive

    // Traverse the data to find the most expensive car
    for (CarData car : data) {
        if (car.getPrice() > mostExpensive.getPrice()) {
            mostExpensive = car;  // Update if the current car is more expensive
        }
    }

    // Print out the most expensive car
    System.out.println("Most Expensive Car: " + mostExpensive);
}
//finds and prints least expensive car
public void findLeastExpensiveCar() {
    // Initialize variable to store the least expensive car
    CarData leastExpensive = data[0];  // Assume the first car is the least expensive

    // Traverse the data to find the least expensive car
    for (CarData car : data) {
        if (car.getPrice() < leastExpensive.getPrice()) {
            leastExpensive = car;  // Update if the current car is cheaper
        }
    }

    // Print out the least expensive car
    System.out.println("\nLeast Expensive Car: " + leastExpensive);
}


  // returns a string representation of all car data

public String toString() {
  String result = "";
//loops through each car data object and add its string representation to the result
  for (CarData cd : data) {
    result += cd + "\n";
  }
  return result;
}

  
}