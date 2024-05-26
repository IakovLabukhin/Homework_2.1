public class Main {
    public static void main(String[] args) {
        int ticketCost = 14500;
        int bonusRubForMiles = 20;
        int bonusMiles = ticketCost / bonusRubForMiles;
        System.out.println("Количество начисленных миль за купленный билет: " + bonusMiles);
    }
}