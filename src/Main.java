public class Main {
    public static void main(String[] args) {

        int clientAccount = 500; // начальный счет клиента
        int refill = 1200; // сумма пополнения счета
        int bonus = 100; // бонусные 1 рубль за каждые 100 рублей
        int refillAccount = 1000; // условие пополнения счета для начисления бонуса

        if (refill > refillAccount) {
            int totalBonus = clientAccount + (refill / bonus + refillAccount);
            System.out.println("Сумма счета клиента с бонусом: " + totalBonus);

        } else {
            int totalNoBonus = clientAccount + refill;
            System.out.println("Сумма счета клиента без бонуса: " + totalNoBonus);
        }
    }
}