import java.util.Scanner;

public abstract class DessertItem {
    String itemname;
    double cost;

    public DessertItem(String itemname,double cost) {
        this.cost=cost;
        this.itemname=itemname;
    }
    public void display(){
        System.out.println(this.itemname+" "+this.getCost());
    }

     abstract double getCost();
}
class Candy extends DessertItem{

    public Candy(String itemname,int cost) {
        super(itemname,cost);
    }

    @Override
    double getCost() {
        return (this.cost*60);

    }
}
class Cookie extends DessertItem{
    public Cookie(String itemname,int cost) {
        super(itemname,cost);
    }

    @Override
    double getCost() {
        return (this.cost*70);
    }
}
class IceCream extends DessertItem{
    public IceCream(String itemname,int cost) {
        super(itemname,cost);
    }

    @Override
    double getCost() {
        return (this.cost);
    }
}
