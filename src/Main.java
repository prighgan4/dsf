public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 1000;
        int rubForMiles = 20;
        int bonusMiles = price / rubForMiles;
        int miles = service.calculate(bonusMiles);
        System.out.println(miles);
    }
}