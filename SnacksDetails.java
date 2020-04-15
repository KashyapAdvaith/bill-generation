import java.util.*;
public class SnacksDetails{
    public static void main(String[] args){
        int pizza,puff,drinks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        pizza=sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        puff=sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        drinks=sc.nextInt();
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+drinks);
        System.out.println("Total price="+(pizza*100+puff*20+drinks*10));
        System.out.println("ENJOY THE SHOW!!!");
        
    }
}