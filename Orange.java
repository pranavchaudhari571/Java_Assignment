package sample;

class Orange extends Fruit{
    Orange(String Color,double Weight){
        super("Mango",Color,Weight);
    }

    @Override
    public String taste(){
        return "sour";
    }
    public void juice(){
        System.out.println("Name: "+super.getName()+"Color: "+super.getWeight()+" Kg"+"Extracting Juice");
    }



}