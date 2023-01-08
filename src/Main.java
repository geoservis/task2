public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int add = 1100;

        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }
        int finalAccount = initialAccount + add + bonus;

        System.out.println("Итоговый счет:" + finalAccount);
        System.out.println("Бонус:" + bonus);
    }
}
