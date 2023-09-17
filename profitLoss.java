package CoreToWeb.IfElse;

public class profitLoss {
    public static void main(String[] args) {
        int selling_price=1200;
        int cost_price=1000;

        if(selling_price>cost_price){
            System.out.println("Profit of" + (selling_price-cost_price));
        }else if(cost_price>selling_price){
            System.out.println("Loss of "+ (cost_price-selling_price));
        }else{
            System.out.println("No loss no profit");
        }
    }
}
