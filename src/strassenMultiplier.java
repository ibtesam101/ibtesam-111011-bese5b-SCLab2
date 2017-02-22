import java.util.ArrayList;
import java.util.List;


public class strassenMultiplier {
	public List<List<Integer>> multiply(List<List<Integer>> a, List<List<Integer>> b){
		List<List<Integer>> product= new ArrayList<List<Integer>>();
		
		if(a==null || b == null)
			return null;
		
		if(a.size()!= b.get(0).size())
			return null;
		
		if(a.size()!=2 && b.size()!=2)
			return null;
		
		int i = a.get(0).get(0)*(b.get(0).get(1)-b.get(1).get(1));
		int j = b.get(1).get(1)*(a.get(0).get(0)+a.get(0).get(1));
		int k = b.get(0).get(0)*(a.get(1).get(0)+a.get(1).get(1));
		int l = a.get(1).get(1)*(b.get(1).get(0)-b.get(0).get(0));
		int m = (a.get(0).get(0)+a.get(1).get(1))*(b.get(0).get(0)+b.get(1).get(1));
		int n = (a.get(0).get(1)-a.get(1).get(1))*(b.get(1).get(0)+b.get(1).get(1));
		int o = (a.get(0).get(0)-a.get(1).get(0))*(b.get(0).get(0)+b.get(0).get(1));
		
		int c1 =  l+m+n-j;
		int c2 = i+j;
		int c3 = k+l;
		int c4 = i+m-k-o;
		
		return product;
	}
}
