package CodeMonk;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class CoderLand 
{

	int checkpoints=3;
	int[] petrolQuantity= {1,2,3};
	int[] petrolCostPerLiter={5,1,7};
	int costIncurred;
	int sumAtFirstCheckPoint;
	int total;
	public static void main(String[] args) 
	{
		
		CoderLand cl=new CoderLand();
		cl.costIncurred();
	}
	
	public void costIncurred()
	{
		sumAtFirstCheckPoint=petrolQuantity[0]*petrolCostPerLiter[0];
		System.out.println(sumAtFirstCheckPoint);
		for(int i=1;i<checkpoints;i++)
		{
			if(petrolCostPerLiter[i]>petrolCostPerLiter[i-1])
			{
				costIncurred=costIncurred+(petrolCostPerLiter[i-1]*petrolQuantity[i]);
				System.out.println( costIncurred);
			}
			else
			{
				costIncurred=costIncurred+(petrolCostPerLiter[i]*petrolQuantity[i]);
				System.out.println( costIncurred);
			}
		}
		total=sumAtFirstCheckPoint+costIncurred;
		System.out.println(total);
	}

}
