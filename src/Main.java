public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 500;
        int depositBonus = 100;
        int chek;
        if (refill >= 1000) {
            chek = refill + balance + (refill / depositBonus);
        } else {
            chek = balance + refill;
        }
        ;
        System.out.println(chek);
    }
}
