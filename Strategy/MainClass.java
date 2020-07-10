package Strategy;

public class MainClass 
{
    public static void main(String[] args) 
    {
        double totalBelanja = 100000.00;
        Membership silverMember = new SilverMembership();
        Membership goldMember = new GoldMembership();
        Membership platinumMember = new PlatinumMembership();

        silverMember.display();
        System.out.println("Total after discount: " + silverMember.applyDiscount(totalBelanja));
        System.out.println("Get point: " + silverMember.getPoint(totalBelanja));
        System.out.println();
    
        goldMember.display();
        System.out.println("Total after discount: " + goldMember.applyDiscount(totalBelanja));
        System.out.println("Get point: " + goldMember.getPoint(totalBelanja));
        System.out.println();

        platinumMember.display();
        System.out.println("Total after discount: " + platinumMember.applyDiscount(totalBelanja));
        System.out.println("Get point: " + platinumMember.getPoint(totalBelanja));
        System.out.println();
    }  
}