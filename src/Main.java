public class Main {

    public static void main(String[] args) {

        int ticketPrise = 13676;
        // Стоимость билета
        int bonusPerPrise = 20;
        // Бонус начисляется за каждые 20 рублей потраченные на билет
        int finalBonus = ticketPrise / bonusPerPrise;
        // Расчет бонуса от стоимости билета

        System.out.println("Количество бонусов киента: " + finalBonus);
    }
}
