package options;

public class SiegeChauffant implements Option {
    public Double getPrix(){
        return 562.9;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" + getPrix() + ")";
    }
}
