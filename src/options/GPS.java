package options;

public class GPS implements Option {
    public Double getPrix() {
        return 113.5;
    }

    public String toString(){
        return getClass().getSimpleName() + " (" + getPrix() + ")";
    }

}
