package behavioural.templatemethod;

public class Bolognese extends Pizza {
    @Override
    public void PrepareCrust() {
        System.out.println("Use white flour and two eggs");
    }

    @Override
    public void PrepareMainFilling() {
        System.out.println("Put tomatoes, cheese and ground meat");
    }

    @Override
    public void PrepareTopping() {
        System.out.println("Put some olives and mushrooms on top");
    }

    @Override
    public void Bake() {
        System.out.println("Bake at 300 degrees for an 15 minutes");
    }
}
