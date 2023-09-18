public class Main {
    public static void main(String[] args) {
        double summer = 900;
        double fall = 850;
        double winter = 1900;
        double spring = 650;
        double total = 0;

        System.out.println("Your home maintenance cost for summer is " + summer);
        System.out.println("Your home maintenance cost for fall is " + fall);
        System.out.println("Your home maintenance cost for winter is "+ winter);
        System.out.println("Your home maintenance cost for spring is " + spring);

        total = summer + fall + winter + spring;
        System.out.println("The yearly home maintenance is " + total);
    }
}