package task8;
import java.util.List;

public class BagApp {
	 public double calcTotalCapacity(List<Bag> bagList)  {                     
		 if(bagList == null || bagList.size() == 0)
				return 0;
			
			List<Bag> sub = bagList.subList(1,  bagList.size());
			double capacity = bagList.get(0).getCapacity();
			return capacity + calcTotalCapacity(sub); 
	 }
}