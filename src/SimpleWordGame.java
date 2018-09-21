
public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) {
    	  int k = 0;
    	  String b = String.join(" ",player);
    	  for (String x:dictionary) {
          	if (b.contains(x))
          		k += x.length()*x.length();
          		b = b.replaceFirst(x, "");
          }
          return k;
       }
                
  }
