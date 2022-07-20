class CafeApp {
public static void main(String []ags){
    Item item1 = new Item();
    Item item2 = new Item();
    Item item3 = new Item();
    Item item4 = new Item();
    
    item1.name="mocha";
    item1.price=5.5;
    item2.name="latte";
    item2.price=4.0;
    item3.name="drip coffee";
    item3.price=9.8;
    item4.name="capuccino";
    item4.price=7.5;


    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    Order order4 = new Order();

    order1.name = "Cindhuri";
    order1.ready= true;
    order2.name = "Jimmy";
    order2.ready= true;
    order3.name = "Noah";
    order4.name = "Sam";
    
    order2.items.add(item1);
    order2.total+=item1.price;
    System.out.println(item1.name+": | The total: "+order2.total+" $");

    order3.items.add(item4);
    order3.total+=item4.price+order2.total;
    System.out.println(item4.name+": | The total: "+order3.total+" $");
    
    order4.items.add(item2);
    order4.total+=item2.price+order3.total;
    System.out.println(item2.name+": | The total: "+order4.total+" $");
   

    if(order1.ready= true){
        System.out.println("yor order is ready sir!");
    }
    
    order4.items.add(item2);
    order4.total+=item2.price+item2.price+order4.total;
    System.out.println(item2.name+": | The total: "+order4.total+" $");
    if(order2.ready= true){
        System.out.println("yor order is ready sir!");
        
    }

  
    
    
    
   
}


}