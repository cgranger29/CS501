class ItemToPurchase{
    private String itemDescription;
    public String itemName;
    public int price;
    public int quantity;
    
    public ItemToPurchase(){
        price = 0;
        quantity = 0;
    }
    public ItemToPurchase(String itemName, String itemDescription, int price, int quantity){
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName(){
        return this.itemName;
    }

    public int getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.itemDescription = description;

    }

    public String getDescription(){
        return this.itemDescription;
    }

    public void printItemCost(){
        int totalCost = (this.quantity * this.price);
        System.out.println(this.itemName + " " + this.quantity + " @ $" + this.price + " = $" + totalCost);
    }

    public void printItemDescription(){
        System.out.println(this.itemName + ": " + this.itemDescription);
    }


}