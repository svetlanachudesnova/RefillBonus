public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 5000;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }
        int finalBalance = balance + refill + bonus;
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Balance: " + finalBalance);
    }
}