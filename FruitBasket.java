package sample;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FruitBasket {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of fruit you want to enter in FruitBasket");
        Fruit[] Basket = new Fruit[sc.nextInt()];
        boolean exit = true;
        int count = 0;

        while (exit) {
            System.out.println("Enter the things 1 to add Mango \n2 to add Apple \n3to add Orange" +
                    " \n4 To diplay basket \n5 To display fresh in basket \n6 to make it stale \n7 to  sour stale" +
                    "8/to pulp jam and and all \n9 to exit");
            System.out.println("Select choice");
            switch (sc.nextInt()) {
                case 1:
                    if (count < Basket.length) {
                        System.out.println("Add mango in your list");
                        System.out.println("Enter the  \t weight");
                        Basket[count++] = new Mango("Yellow", sc.nextDouble());
                        System.out.println("Mango is added ");

                    } else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 2:
                    if (count < Basket.length) {
                        System.out.println("Add Apple in your list");
                        System.out.println("Enter the \t weight");
                        Basket[count++] = new Apple("Red", sc.nextDouble());
                        System.out.println("Apple is added ");

                    } else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 3:
                    if (count < Basket.length) {
                        System.out.println("Add Orange in your list");
                        System.out.println("Enter the \t weight");
                        Basket[count++] = new Orange("Orange", sc.nextDouble());
                        System.out.println("Orange is added ");

                    } else {
                        System.out.println("Basket is full");
                    }
                    break;
                case 4:
                    for (Fruit b : Basket
                    ){
                    if(b!=null)
                    {
                        System.out.println(b);
                        System.out.println("Taste of above fruit is "+b.taste());

                    }}
                    break;
                case 5:
                    System.out.println("Enter the Index that u want to check is fresh or not");
                    for (Fruit f:Basket
                         ) {if(f!=null){
                        System.out.println("Your fruit is \n"+f.isFresh());
                    }

                    }
//                    int index = sc.nextInt();
//                    if (index < Basket.length) {
//                        if (Basket[index].isFresh()) {
//                            System.out.println("Your fruit is fresh");
//                        } else {
//                            System.out.println("Your fruit is stale");
//                        }
//
//                    } else {
//                        System.out.println("You enterd out of bound fruit");
//                    }
                    break;
                case 6:
                    System.out.println("Making stale to perticular index");
                    int ip= sc.nextInt();

                 if(ip< Basket.length){
                     if(Basket[ip]!=null) {
                         Basket[ip].setstale(false);
                     }
                 }


                        break;
                case 7:
                    System.out.println("Making all sour stale");
                    for (Fruit p:Basket
                         ) {
                        if(p!=null) {
                            if (p.taste().equals("sour")) {
                                p.setstale(false);
                            }
                        }
                    }

                    break;
                case 8:
                    System.out.println("Invoke fruit specific functionality (pulp / juice / jam) : index");

                    for (Fruit s:Basket){
                        if(s!=null) {


                            if (s instanceof Apple) {
                                ((Apple) s).jam();
                            } else if (s instanceof Mango) {

                                ((Mango) s).pulp();
                            } else if (s instanceof Orange) {
                                ((Orange) s).juice();
                            }
                        }
                }break;
                case 9:
                    System.exit(0);
                case 10:



            }
        }
    }

}
