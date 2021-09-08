public class singleton {
    private static  singleton obj=new singleton();
    public String string;
    private singleton() {
        string="Welcome to Singleton Class";
    }
    public static singleton getInstance(){
        return obj;
    }

    public static void main(String[] args) {
        singleton text=singleton.getInstance();
        System.out.println("Original String:");
        System.out.println(text.string);
        //text in upper case
        System.out.println("String in Upper Case:");
        text.string = (text.string).toUpperCase();
        System.out.println(text.string);
    }
}
