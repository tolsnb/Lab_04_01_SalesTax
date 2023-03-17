public class Main
{
    public static void main(String[] args)
    {
        double salePrice = 89.0;
        double salesTax = 0;
        double total = 0;

        salesTax = 0.05 * salePrice;
        total = salesTax + salePrice;

        System.out.println("The sales tax for a sale of the price $" + salePrice + " is $" + salesTax + " making the total $" + total);
    }
}