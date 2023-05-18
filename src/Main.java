public class Main {

    public static void main(String[] args) {

        int TicketPrise = 13676;
        // Стоимость билета
        int BonusPerPrise = 20;
        // Бонус начисляется за каждые 20 рублей потраченные на билет
        int FinalBonus = TicketPrise / BonusPerPrise;
        // Расчет бонуса от стоимости билета

        System.out.println("Количество бонусов киента: " + FinalBonus);
    }
}