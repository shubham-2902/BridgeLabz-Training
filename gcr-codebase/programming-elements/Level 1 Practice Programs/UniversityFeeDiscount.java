public class UniversityFeeDiscount
 {
    public static void main(String[] args)
    {

        double fee = 125000;
        double discountPercent = 10;

        double discount = (fee * discountPercent) / 100;
	// calculated the final discounted fee
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee
        );
    }
 }
