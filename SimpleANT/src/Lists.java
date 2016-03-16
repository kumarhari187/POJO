import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Lists {

	public static void main(String[] args) {
	
	List<POJO> pojolist = new ArrayList<POJO>();
	 pojolist.add(new POJO(1,"name1"));
	 pojolist.add(new POJO(2,"name2"));
	 pojolist.add(new POJO(3,"name3")); 
	 pojolist.add(new POJO(4,"name4"));
	 pojolist.add(new POJO(5,"name5"));
	 
	 List<POJO> pojolist1 = new ArrayList<POJO>();
	  pojolist1.add(new POJO(11,"name11"));
	  pojolist1.add(new POJO(12,"name12"));
	  pojolist1.add(new POJO(13,"name13"));
	  pojolist1.add(new POJO(14,"name14"));
	  pojolist1.add(new POJO(15,"name15"));
	 
	  
	  Map<String,List<POJO>> map = new HashMap<String,List<POJO>>();
	  map.put("1",pojolist);
	  map.put("11", pojolist1);
	  Iterator<String> iterator = map.keySet().iterator();
	  while(iterator.hasNext()){
	    String key   = iterator.next().toString();
	     // value = map.get(key);
	  
     for(POJO i: map.get(key)){
    	 System.out.println("ID is :" +i.getId() );
    	 System.out.println("Name is :" + i.getName());
     }
	 
	  }
	
	}
	

}
