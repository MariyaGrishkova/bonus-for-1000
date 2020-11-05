public class Main {
    public static void main (String[] args) {
        int balance = 100;
        int replenishment = 1800;
        int factor = 100;
        int bonus = replenishment / factor;
        int total = balance + replenishment + bonus;
        if (replenishment < 1000){;
                total = balance + replenishment;
        }
        System.out.println(total);



    }
}
