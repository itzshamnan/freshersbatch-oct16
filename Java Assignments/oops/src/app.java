import java.util.Scanner;

public class app {
    public static void displayItems(){
        System.out.println("1.Candy");
        System.out.println("2.Cookie");
        System.out.println("3.Ice cream");
    }
    public static void makeOrder(DessertItem[] item,int count){

        if(count<=0)
            System.out.println("No more items left");
        else{
            Scanner in=new Scanner(System.in);
            System.out.println("Available items");
            for(int i=0;i<count;i++)
                item[i].display();
            String choice;
            System.out.println("Choose the item you would like to buy");
            choice=in.next();
            for(int i=0;i<=count;i++)
                if(choice.equals(item[i].itemname)){
                    System.out.println("Order Placed");
                    System.out.println("Total Cost Rs"+item[i].getCost());
                    break;
                }
            else{
                    System.out.println("Invalid Choice");
                    break;
                }

        }

    }
    public static void addItem(DessertItem[] item,int count){
        Scanner in=new Scanner(System.in);
        String name;
        int cost;
        System.out.println("Enter the name of item");
        name=in.next();
        System.out.println("Enter the cost");
        cost=in.nextInt();
        item[count]=new Candy(name,cost);

    }



    public static void main(String[] args) {
        DessertItem[] candy = new Candy[20];
        DessertItem[] icecream = new IceCream[20];
        DessertItem[] cookie = new Cookie[20];
        int userch;
        int cookiecount = 0;
        int candycount = 0;
        int icecreamcount = 0;
        Scanner in = new Scanner(System.in);
        char flag = 't';
        while (flag == 't') {
            System.out.println("Choose User");
            System.out.println("1.Customer");
            System.out.println("2.Owner");
            System.out.println("Enter your choice");
            userch=in.nextInt();
            switch (userch){
                case 1:
                    int cch;
                    System.out.println("What would you like to buy?");
                    displayItems();
                    System.out.println("Enter your choice");
                    cch= in.nextInt();
                    switch (cch)
                    {
                        case 1:
                            makeOrder(candy,candycount);
                            break;
                        case 2:
                            makeOrder(cookie,cookiecount);
                            break;
                        case 3:
                            makeOrder(icecream,icecreamcount);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                    }
                    break;
                case 2:
                    int och;
                    System.out.println("What would you like to add ?");
                    displayItems();
                    System.out.println("Enter your choice");
                    och=in.nextInt();
                    String name;
                    switch (och){
                        case 1:addItem(candy,candycount);
                        candycount++;
                    }





            }

        }
    }

}
