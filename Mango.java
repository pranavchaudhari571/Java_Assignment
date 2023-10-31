package sample;

class Mango extends Fruit{
    Mango(String Color,double Weight){
        super("Mango",Color,Weight);
    }

    @Override
    public String taste(){
        return "Sweet";
    }

    public void pulp(){
        System.out.println("Name: "+super.getName()+"Color: "+super.getColor()+"Is creating pulp");
    }



}
