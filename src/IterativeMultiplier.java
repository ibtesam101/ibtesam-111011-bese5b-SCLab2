//import java.util.List;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class IterativeMultiplier {
	public List<List<Integer>> multiply(List<List<Integer>> a, List<List<Integer>> b){
		List<List<Integer>> product= new ArrayList<List<Integer>>();
		
		for(int i=0; i<a.size(); i++){
			product.add(new ArrayList<Integer>());
			for(int j=0; j<b.get(0).size(); j++){
				int x=0;
				for(int k=0; k<a.get(i).size(); i++){
					x+= (a.get(i).get(k)*b.get(k).get(j));
				}
				product.get(i).add(x);
			}
		}
		
		return product;
	}
	
}
