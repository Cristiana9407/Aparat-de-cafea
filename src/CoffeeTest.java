public class CoffeeTest {
    public static void main(String[] args) {

        CoffeeMaker mk    = new CoffeeMaker();
        DrinkCoffee drink = new DrinkCoffee();

        for (int i = 0; i < 5; i++) {
            Coffee coffe = mk.makeCoffee();
            System.out.println("Cafeaua numarul: " + i + " ");

            try {
                drink.drinkCoffee(coffe);
            } catch (TemperatureException e) {
                System.out.println("Exception: " + e.getMessage() + "\ntemp" + e.getTemp());

            } catch (ConcentrationException e) {
                System.out.println("Exception: " + e.getMessage() + "\ncong" + e.getConc());
            }
            finally {
                System.out.println("Poftim cafeaua!");
                System.out.println();
            }
        }
    }
}
