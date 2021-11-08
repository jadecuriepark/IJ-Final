class Products {

   // attributes
   private String name;
   private double price;
   private int inventory; 
   
   
   // default constructor
   public Products() {
      price = 0;
      name = "";
      inventory = 0;
   }
   
   // parameterized constructor
   public Products(String name, double price, int inventory) {
      this.name = name;
      this.price = price;
      this.inventory = inventory;
   }
   
   // getter and setter methods for the attributes
   
   
   public String getName() {
		return name;
	}
   
   public double getPrice() {
		return price;
	}
   
   public int getInventory() {
      return inventory;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setPrice(double price) {
      this.price = price;
   }
   
   public void setInventory(int inventory) {
      this.inventory = inventory;
   }

}