package options;

public class VitreElectrique implements Option {
    public Double getPrix(){
        return 212.35;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" + getPrix() + ")";
    }
}
