import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

//Creates a new UserStory object by passing the files name for each car data category
UserStory userStory = new UserStory("brand.txt", "km_driven.txt", "fuel.txt", "owner.txt", "selling_price.txt");

    //Prints the details of all cars in the UserStory object
    System.out.println(userStory);

    //Finds and prints the most expensive car in the dataset
    userStory.findMostExpensiveCar();

  //Finds and prints the least expensive car in the dataset
    userStory.findLeastExpensiveCar();


    


    
    
    
  }
}