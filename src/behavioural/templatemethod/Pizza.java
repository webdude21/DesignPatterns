package behavioural.templatemethod;

public abstract class Pizza {

    public abstract void PrepareCrust();

    public abstract void PrepareMainFilling();

    public abstract void PrepareTopping();

    public void Bake(){
        System.out.println("Bake at 250 degrees for an 12 minutes");
    }

    public Pizza prepare(){
        PrepareCrust();
        PrepareMainFilling();
        PrepareTopping();
        Bake();

        return this;
    }
}
