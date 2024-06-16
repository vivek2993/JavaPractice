//import java.util.Scanner;
///**
// * An Interactive Flower Shop.  Use this with your FlowerShop code.
// * 
// * @author csc142 
// * @version 10/18/06
// */
//public class Flowers
//{
//    // constants
//    private static final int QUIT = 4;
//    private static final int ORDER = 1;
//    private static final int INVENTORY = 2;
//    private static final int SALES = 3;
//
//    // instance variables
//    private FlowerShop shop;
//    private Scanner in;
//
//    /**
//     * Construct a Flowers object; set up the new FlowerShop.
//     */
//    public Flowers( )
//    {
//        this.shop = new FlowerShop( );
//        this.in = new Scanner( System.in );
//    }
//
//    /**
//     * Operate the flower shop interactively with the user.
//     */
//    public void openShop( ) {
//        System.out.println( "The Flower Shop is open for business!" );
//        int choice;
//        do { // main menu loop
//            System.out.print( "\nOptions:\n  1: Place an order\n"
//              + "  2: Show inventory\n  3: Show total sales\n  4: Quit\n" );
//            System.out.print( "Enter the number for your choice: " );
//            choice = in.nextInt( );
//            System.out.println( );
//            switch ( choice ) {
//                case ORDER: 
//                    takeOrder( );
//                    break;
//                case INVENTORY:
//                    shop.printInventory( );
//                    break;
//                case SALES:
//                    double sales = shop.getTotalSales( );
//                    sales = Math.round( sales * 100.0 ) / 100.0;
//                    System.out.println( "Total sales: $" + sales );
//                    break;
//                case QUIT: // do nothing
//                    break;
//                default:
//                    System.out.println( "INVALID CHOICE -- please try again." );
//            }
//        } while ( choice != QUIT );
//        
//        System.out.println( "Thank you for visiting the Flower Shop!" );
//    }
//    
//    /**
//     * A private method to get the information required to place an order.
//     */
//    private void takeOrder( ) {
//        System.out.println( "Please enter your order:" );
//        System.out.print( "How many roses? " );
//        int roses = in.nextInt( );
//        System.out.print( "How many carnations? " );
//        int carnations = in.nextInt( );
//        System.out.print( "How many daisies? " );
//        int daisies = in.nextInt( );
//        System.out.print( "How many vases? " );
//        int vases = in.nextInt( );
//        Order o = new Order( vases, roses, carnations, daisies );
//        double cost = shop.processOrder( o );
//        cost = Math.round( cost * 100.0 ) / 100.0;
//        System.out.println( "Please pay $" + cost + " at the register." );
//    }
//    
//    /**
//     * Allows the program to be run as a stand-alone application.
//     */
//    public static void main( String[] args ) {
//        Flowers s = new Flowers( );
//        s.openShop( );
//    }
//    
//}