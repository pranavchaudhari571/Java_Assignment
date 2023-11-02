package Tester;

import java.util.HashMap;
import java.util.Map;

import Basic_functionality.Cricketer;

public class Util {
public static Map<String, Cricketer> Populate() {
	Map<String, Cricketer> crick = new HashMap<>();
	crick.put("sachin",new Cricketer("Sachin", 45, "sachin.tendulcar@gmail.com", "9860117534", 10));
	crick.put("virat.kohli", new Cricketer("virat kohli", 34, "virat.kohli@gmail.com", "9810117534", 9));
	crick.put("kane.williamson", new Cricketer("kane williamson", 32, "kane.williamson@gmail.com", "9820117534", 8));
	crick.put("joe.root", new Cricketer("joe root", 31, "joe.root@gmail.com", "9830117534", 7));
	crick.put("marnus.labuschagne", new Cricketer("marnus labuschagne", 27, "marnus.labuschagne@gmail.com", "9840117534", 6));
	crick.put("steve.smith", new Cricketer("steve smith", 33, "steve.smith@gmail.com", "9850117534", 5));
	crick.put("babar.azam", new Cricketer("babar azam", 28, "babar.azam@gmail.com", "9860117534", 4));
	crick.put("davids.warner", new Cricketer("davids warner", 36, "davids.warner@gmail.com", "9870117534", 3));
	crick.put("roscoe.tcherter", new Cricketer("roscoe tcherter", 26, "roscoe.tcherter@gmail.com", "9880117534", 2));
	crick.put("fletcher.dreshfield", new Cricketer("fletcher dreshfield", 23, "fletcher.dreshfield@gmail.com", "9890117534", 1));
	crick.put("ravi.ashwin", new Cricketer("ravi ashwin", 36, "ravi.ashwin@gmail.com", "9900117534", 10));
	return crick;
}
}
