package Train;

public class UseTrain {
    public static void main(String[] args) {
        
    	Train t1 = new Train(50, 15, 35, 0, 0);
    	
    	t1.reserveFirstClassSeats(5);
    	System.out.println("The total occupation ratio is : "+t1.getTotOccupancyRatio()+"%");
    	System.out.println("The occupation ratio of the first class is : "+t1.getFirstClassOccupancyRatio()+"%");
    	
    	t1.reserveSecondClassSeats(16);
    	System.out.println("The total occupation ratio is : "+t1.getTotOccupancyRatio()+"%");
    	System.out.println("The occupation ratio of the second class is : "+t1.getSecondClassOccupancyRatio()+"%");
    	
    	t1.deleteAllReservations();
    	
    	t1.reserveFirstClassSeats(7);
    	System.out.println("The total occupation ratio is : "+t1.getTotOccupancyRatio()+"%");
    	System.out.println("The occupation ratio of the first class is : "+t1.getFirstClassOccupancyRatio()+"%");
    	
    	t1.reserveSecondClassSeats(24);
    	System.out.println("The total occupation ratio is : "+t1.getTotOccupancyRatio()+"%");
    	System.out.println("The occupation ratio of the second class is : "+t1.getSecondClassOccupancyRatio()+"%");
    }
}