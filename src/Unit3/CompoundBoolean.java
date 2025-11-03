package Unit3;

public class CompoundBoolean {
    public static void main(String[] args) {
        int year = 2000;
        String color = "red";
        String model = "BMW";

        //if year > 2010 and model is Mercedes and color is black
        //register car

        if (year > 2010) {
            if(color.equals("black")) {
                if(model.equals("Mercedes")){
                    System.out.println("The car is registered");
                }
            }
        }
    }
}
