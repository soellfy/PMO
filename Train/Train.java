package Train;

public class Train {

	private int	nTotSeats;
	private int nFirstClassSeats;
	private int nSecondClassSeats;
	private int nFirstClassReservedSeats;
	private int nSecondClassReservedSeats;
	
	public Train(int tot, int first, int second, int resFirst, int resSecond)	{
		
		this.nTotSeats = tot;
		this.nFirstClassSeats = first;
		this.nSecondClassSeats = second;
		this.nFirstClassReservedSeats = resFirst;
		this.nSecondClassReservedSeats = resSecond;
		
	}

	public void reserveFirstClassSeats(int n)	{
		
		if(this.nFirstClassSeats >= (this.nFirstClassReservedSeats + n))	{
			this.nFirstClassReservedSeats += n;
		}
		else	{
			System.out.println("The first class is full, you can reserve other "+(this.nFirstClassSeats - this.nFirstClassReservedSeats)+" seats");
		}
	}
	
	public void reserveSecondClassSeats(int n)	{
		
		if(this.nSecondClassSeats >= (this.nSecondClassReservedSeats + n))	{
			this.nSecondClassReservedSeats += n;
		}
		else	{
			System.out.println("The second class is full, you can reserve other "+(this.nSecondClassSeats - this.nSecondClassReservedSeats)+" seats");
		}
	}
	
	public double getTotOccupancyRatio()	{
				
		return (int)((this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100 / this.nTotSeats );
	}
	
	public double getFirstClassOccupancyRatio()	{
		
		return ((int)this.nFirstClassReservedSeats * 100 / this.nFirstClassSeats );
	}
	
	public double getSecondClassOccupancyRatio()	{
		
		return ((int)(this.nSecondClassReservedSeats * 100 / this.nSecondClassSeats ));
	}
	
	public void deleteAllReservations()	{
		
		this.nFirstClassReservedSeats = 0;
		this.nSecondClassReservedSeats = 0;
	}
}