package sample;

public class Fruit {
    private String Name;
    private String Color;
    private double Weight;
    private boolean fresh;

    Fruit(String Name, String Color, double Weight){
        this.Name=Name;
        this.Color=Color;
        this.Weight=Weight;
        this.fresh=true;
    }

    public String getColor() {
        return Color;
    }

    public String getName() {
        return Name;
    }

    public void setstale(boolean b){
        this.fresh= b;

    }

    public double getWeight() {
        return Weight;
    }
    public String taste(){
        return "No specific taste";

    }

    public boolean isFresh() {
        return fresh;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "Name='" + Name + '\'' +
                ", color='" + Color + '\'' +
                ", Weight=" + Weight +
                ", fresh=" + fresh +
                '}';
    }
}





