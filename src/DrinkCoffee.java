public class DrinkCoffee {
    void drinkCoffee(Coffee c) throws ConcentrationException, TemperatureException {

        //if for temp
        if(c.getTemp() > 65) {
                throw new TemperatureException("Coffe is not!", c.getTemp());
        }

        //if for conc
        if(c.getConc() > 55) {
           throw new ConcentrationException("Coffe concentration is too high!", c.getConc());
        }
    }
}
