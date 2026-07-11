public class FinancialForecasting {
     public static double predictPrice(double amount,double growthRate,int years){
         if(years==0) return amount;
         return predictPrice(amount*(1+growthRate),growthRate,years-1);
     }
}
