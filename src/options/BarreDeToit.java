package options;

public class BarreDeToit  implements Option {
    public Double getPrix(){
        return 29.9;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" + getPrix() + ")";
    }

}
