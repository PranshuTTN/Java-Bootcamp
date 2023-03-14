public class Question1 {
    public static void main(String[] args) {
//        double n = prices.Villa.price ;
//        System.out.println(n);
        for(Prices p: Prices.values()){
            System.out.println(p+" "+p.getPrice()+" "+p.getLocation());
            System.out.println(p.price) ;

        }
    }
}
enum Prices {
    Villa(2000000,"Delhi"),HillSide(3000000,"Kheerganga"),Apartment(1000000,"Mumbai");
    public double price;
    public String location;
    Prices(double price, String location){
        this.price=price;
        this.location=location;
    }
    public double getPrice(){
        return price;
    }
    public String getLocation(){
        return location;
    }
}

