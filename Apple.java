package sample;

class Apple extends Fruit{
    Apple(String Color,double Weight){
        super("Apple",Color,Weight);
    }

    @Override
    public String taste(){
        return "sweet and sour";
    }
    public void jam(){
        System.out.println("Name: "+super.getName()+"Is making Jam");
    }



}
