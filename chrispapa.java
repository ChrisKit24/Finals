import java.util.Scanner;

public class chrispapa{

    public static void main(String[] args) {
        
        Scanner c = new Scanner(System.in);
        System.out.print("Annual Salary: ");
        Double i = c.nextDouble();

         while(i>= 0 && i < 250000){
            
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = 0.00;
            Double Monthly_Tax_Deduction = 0.00;
            Double Net_Pay = Monthly_Rate - 0.00;
            
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay)); 
            break;   
        }    
         while(i>= 250000 && i < 400000){
            Double tax_excess = i - 250000;
            Double tax_deduction = tax_excess * 0.20;
            
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = 0.00;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
            
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay)); 
            break;
            
        }
        while(i >= 400000 && i < 800000){
        
            Double tax_excess = i - 400000;
            Double tax_deduction =   30000 + (0.25 * tax_excess);
        
        
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = tax_deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay));
            break;
        }  
        while(i >= 800000 && i < 2000000){
            Double tax_excess = i - 800000;
            Double tax_deduction =  130000+(0.30 * tax_excess) ;
        
           
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay));
            break;
        }
        while(i >= 2000000 && i < 8000000){
            Double tax_excess = i - 2000000;
            Double tax_deduction = 490000+(0.32 * tax_excess);
        
           
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay));
            break;
        }    
        while(i >= 8000000){
            Double tax_excess = i - 8000000;
            Double tax_deduction = (0.35 * tax_excess) + 2410000;
        
           
            Double Monthly_Rate = i / 12;
            Double Daily_Rate = Monthly_Rate / 22;
            Double Hourly_Rate = Daily_Rate / 8;
            Double Annual_Tax_Deduction = tax_deduction;
            Double Monthly_Tax_Deduction = Annual_Tax_Deduction / 12;
            Double Net_Pay = Monthly_Rate - Monthly_Tax_Deduction;
        
            System.out.println("Your Monthly Rate: " + String.format("%.2f", Monthly_Rate));
            System.out.println("Your Daily Rate: " + String.format("%.2f", Daily_Rate));
            System.out.println("Your Hourly Rate: " + String.format("%.2f", Hourly_Rate));
            System.out.println("Annual Tax Deduction: " + String.format("%.2f", Annual_Tax_Deduction));
            System.out.println("Monthly Tax Deduction: " + String.format("%.2f", Monthly_Tax_Deduction));
            System.out.println("Your Net Pay: " + String.format("%.2f", Net_Pay));
        }
    }   
}     