package options;

public class Climatisation  implements Option{
    public Double getPrix(){
        return 347.3;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" + getPrix() + ")";
    }
}
