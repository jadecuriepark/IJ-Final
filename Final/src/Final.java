// This program will act as a menu system consisted of many methods for my company, Starr (Jade Park - 8/9/2021)

import java.util.Scanner;

public class Final { 
   
   // declaring objects that represent the available products
   static Products item1 = new Products("Unlimited Review Access", 30, 10);
   static Products item2 = new Products("No Ads", 15, 10);
   static Products item3 = new Products("Profile and Layout Customization", 10, 10);
   
   // "shopping cart" array that holds the objects/products the user selects
   static Products cart[] = new Products[50];
   
   // the flag variable that'll determine whether the do-while loop runs again or not
   public static boolean flag = true;
      
   // start of main method
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      do { 
         // displaying options to the user
         System.out.println("\nWelcome to Starr! Here are your options:");
         System.out.println("1 - Inventory Actions");
         System.out.println("2 - Sales Actions");
         System.out.println("3 - Exit");
         System.out.print("Please enter the number that corresponds to where you want to go today: ");
         int selection = input.nextInt();
         
         // if-else statement that determines whether to loop or exit to a different method
         if (selection == 1) {
            flag = false;
            inventoryActions();
         } else if (selection == 2) {
            flag = false;
            salesActions();
         } else if (selection == 3) {
            flag = false;
            exit();
         } else {
            System.out.println("\nINVALID INPUT. Please try again!");
            flag = true;
         }
      
      } while (flag == true);
   } // end of main method
   
   public static void inventoryActions() {
      Scanner input = new Scanner(System.in);
      
      // printing out options in Inventory Actions
      System.out.println("\nYou are now in Inventory Actions. Here are your options:");
      System.out.println("1 - Adding a Product");
      System.out.println("2 - Viewing Inventory");
      System.out.println("3 - Modifying a Product's Properties or Available Inventory");
      System.out.println("4 - Go Back to the Main Menu");
      System.out.print("Please enter the number that corresponds to where you want to go today: ");
      int selection = input.nextInt();
      
      // redirecting the user to the sub-method of their choice
      if (selection == 1) {
         addAProduct();
      } else if (selection == 2) {
         viewingInventory();
      } else if (selection == 3) {
         modifyingProperties();
      } else if (selection == 4) {
         flag = true;
      } else {
         System.out.println("\nINVALID INPUT. Please try again!");
         inventoryActions();
      }


   }
   
   public static void salesActions() {
      Scanner input = new Scanner(System.in);
         
      // printing out options in Sales Actions
      System.out.println("\nYou are now in Sales Actions. Here are your options:");
      System.out.println("1 - Viewing Products");
      System.out.println("2 - Puchasing Products");
      System.out.println("3 - Returning an Amount of a Product");
      System.out.println("4 - Go Back to the Main Menu");
      System.out.print("Please enter the number that corresponds to where you want to go today: ");
      int selection = input.nextInt();
      
      // redirecting the user to the sub-method of their choice
      if (selection == 1) {
         viewingProducts();
      } else if (selection == 2) {
         purchasingProducts();
      } else if (selection == 3) {
         returningProducts();
      } else if (selection == 4) {
         flag = true;
      } else {
         System.out.println("\nINVALID INPUT. Please try again!");
         salesActions();
      }
   }
   
   // exit method that lets the user know they sucessfully quit the program
   public static void exit() {
      System.out.println("\nYou have successfully exited the program."); 
   }

   // sub-methods
   
   public static void addAProduct() {
      Scanner input = new Scanner(System.in);
      
      System.out.println("\nWhat's the name of the product you want to add?");
      input.nextLine();
      String name = input.nextLine();
      
      System.out.println("What's the price of the product you want to add?");
      double price = input.nextDouble();
      
      System.out.println("What's the inventory of the product you want to add?");
      int inventory = input.nextInt();
      
      // creates a new object
      Products item4 = new Products(name, price, inventory);
      
      System.out.println("Congrats! Your product " + item4.getName() + " has been created.");
   }
   
   public static void viewingInventory() {
      Scanner input = new Scanner(System.in);

      System.out.println("\n1 - " + item1.getName());
      System.out.println("2 - " + item2.getName());
      System.out.println("3 - " + item3.getName());
      System.out.print("Which of the products above would you like to check the inventory of? ");
      int choice = input.nextInt();
      
      // prints out the product's attributes
      if (choice == 1) {
         System.out.println("The current inventory for item " + item1.getName() + " is " + item1.getInventory());
      } else if (choice == 2) {
         System.out.println("The current inventory for item " + item2.getName() + " is " + item2.getInventory());
      } else if (choice == 3) {
         System.out.println("The current inventory for item " + item3.getName() + " is " + item3.getInventory());
      }
   }
   
   public static void modifyingProperties() {
      Scanner input = new Scanner(System.in);
      System.out.println("\n1 - " + item1.getName());
      System.out.println("2 - " + item2.getName());
      System.out.println("3 - " + item3.getName());
      System.out.print("Which of the products above would you like to modify? ");
      int choice = input.nextInt();
      
      System.out.print("\nWould you like to modify the product's name, price, or inventory? ");
      System.out.println("\n1 - Name");
      System.out.println("2 - Price");
      System.out.println("3 - Inventory");
      int choice2 = input.nextInt();
      
      if (choice == 1) {
         if (choice2 == 1) {
            System.out.print("What would you like to set the product name to be?");
            input.nextLine();
            String choice3 = input.nextLine();
            item1.setName(choice3);
            System.out.println("This product's name is now " + item1.getName());
            
         } else if (choice2 == 2) {
            System.out.print("What would you like to set the price to be? ");
            double choice3 = input.nextDouble();
            item1.setPrice(choice3);
            System.out.println("This product's price is now " + item1.getPrice());
            
         } else if (choice2 == 3) {
            System.out.print("What would you like to set the inventory to be?");
            int choice3 = input.nextInt();
            item1.setInventory(choice3);
            System.out.println("This product's inventory is now " + item1.getInventory());
         }
      } else if (choice == 2) {
         if (choice2 == 1) {
            System.out.print("What would you like to set the product name to be?");
            input.nextLine();
            String choice3 = input.nextLine();
            item2.setName(choice3);
            System.out.println("This product's name is now " + item2.getName());
            
         } else if (choice2 == 2) {
            System.out.print("What would you like to set the price to be?");
            double choice3 = input.nextDouble();
            item2.setPrice(choice3);
            System.out.println("This product's price is now " + item1.getPrice());
            
         } else if (choice2 == 3) {
            System.out.print("What would you like to set the inventory to be?");
            int choice3 = input.nextInt();
            item2.setInventory(choice3);
            System.out.println("This product's inventory is now " + item2.getInventory());
         }
      } else if (choice == 3) {
         if (choice2 == 1) {
            System.out.print("What would you like to set the product name to be?");
            input.nextLine();
            String choice3 = input.nextLine();
            item3.setName(choice3);
            System.out.println("This product's name is now " + item3.getName());
            
         } else if (choice2 == 2) {
            System.out.print("What would you like to set the price to be?");
            double choice3 = input.nextDouble();
            item3.setPrice(choice3);
            System.out.println("This product's price is now " + item1.getPrice());
            
         } else if (choice2 == 3) {
            System.out.print("What would you like to set the inventory to be?");
            int choice3 = input.nextInt();
            item3.setInventory(choice3);
            System.out.println("This product's inventory is now " + item3.getInventory());
         }
      } else {
         System.out.println("INVALID INPUT! Please enter a number 1-3.");
         modifyingProperties();
      }
   }
   
   public static void viewingProducts() {
      Scanner input = new Scanner(System.in);
      System.out.println("\nProduct 1: " + item1.getName() + " costs $" + item1.getPrice() + " and has a quantity of " + item1.getInventory() + " available.");
      System.out.println("Product 2: " + item2.getName() + " costs $" + item2.getPrice() + " and has a quantity of " + item2.getInventory() + " available.");
      System.out.println("Product 3: " + item3.getName() + " costs $" + item3.getPrice() + " and has a quantity of " + item3.getInventory() + " available.");
   }
   
   public static void purchasingProducts() {
      Scanner input = new Scanner(System.in);
      
      System.out.print("\nHow many " + item1.getName() + " packages would you like to purchase? ");
      int requestedAmount1 = input.nextInt();
      int price1 = requestedAmount1 * (int) item1.getPrice();
      
      for (int i = 0; i < requestedAmount1; i++) {
         // array that represents the shopping cart, adds objects
         cart[i] = new Products("Unlimited Review Access", 30, 10);
      }
      
      
      System.out.print("How many " + item2.getName() + " packages would you like to purchase? ");
      int requestedAmount2 = input.nextInt();
      int price2 = requestedAmount2 * (int) item2.getPrice();
      
      for (int i = 0; i < requestedAmount2; i++) {
         cart[i] = new Products("No Ads", 15, 10);
      }
      
      
      System.out.print("How many " + item3.getName() + " packages would you like to purchase? ");
      int requestedAmount3 = input.nextInt();
      int price3 = requestedAmount3 * (int) item3.getPrice();

      for (int i = 0; i < requestedAmount3; i++) {
         cart[i] = new Products("Profile and Layout Customization", 10, 10);
      }
      
      // calculates total prices and products added
      int total = price1 + price2 + price3;
      int products = requestedAmount1 + requestedAmount2 + requestedAmount3;
     
      
      System.out.print("\nYour total is $" + total + ". Would you like to finalize this purchase? 1 - Yes, 2 - No, Start Over: ");
      int choice = input.nextInt();
      
      if (choice == 1) {
         System.out.println("Your order of " + requestedAmount1 + " " + item1.getName() + " packages and " + requestedAmount2 + " " + item2.getName() + " packages and " + requestedAmount3 + " " + item3.getName() + " packages has been recieved. Thank you!");
      } else if (choice == 2) {
         purchasingProducts();
      } else {
         System.out.println("INVALID INPUT! Please try again.");
         purchasingProducts();
      }
   }
   
   public static void returningProducts() {
      Scanner input = new Scanner(System.in);
      System.out.println("\n1 - " + item1.getName());
      System.out.println("2 - " + item2.getName());
      System.out.println("3 - " + item3.getName());
      System.out.print("Which of the products above would you like to return? ");
      int choice = input.nextInt();
      
      System.out.println("How many would you like to return? ");
      int amount = input.nextInt();
      
      
      if (choice == 1) {
         // nested loop removes objects that the user requested
         for (int i = 0; i < amount; i++) {
            if (cart[i].getName() == item1.getName()) {
               // this loop ensures it doesn't go out of the array boundaries
               for (int j = 0; j < (cart.length - 1); j++) {
                  cart[i] = cart[i + 1];
               }
            }
         }
      } else if (choice == 2) {
         for (int i = 0; i < amount; i++) {
            if (cart[i].getName() == item2.getName()) {
               for (int j = 0; j < (cart.length - 1); j++) {
                  cart[i] = cart[i + 1];
               }
            }
         }
      } else if (choice == 3) {
         for (int i = 0; i < amount; i++) {
            if (cart[i].getName() == item3.getName()) {
               for (int j = 0; j < (cart.length - 1); j++) {
                  cart[i] = cart[i + 1];
               }
            }
         }
      } else {
         System.out.println("INVALID INPUT! Please try again.");
         returningProducts();
      }
           
      System.out.println("Press 1 to finish your return, or 2 to start over: ");
      int selection = input.nextInt();
      
      if (selection == 1) {
         if (choice == 1) {
            System.out.println("We recieved your return of " + amount + " " + item1.getName() + " packages. Thank you!");
         } else if (choice == 2) {
            System.out.println("We recieved your return of " + amount + " " + item2.getName() + " packages. Thank you!");
         } else if (choice == 3) {
            System.out.println("We recieved your return of " + amount + " " + item3.getName() + " packages. Thank you!");
         }
      } else if (selection == 2) {
         returningProducts();
      } else {
         System.out.println("INVALID INPUT! Please try again.");
         returningProducts();
      }
   
   }
   
} // end of class

