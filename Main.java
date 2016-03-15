//Andriy Zasypkin
//2016-03-15
//Practice 2011 - 01: Geometric Inflation

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    //create an input reader object
    BufferedReader input
            = new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      String[] in = input.readLine().split("\\s+");
      if(in.length == 1)
        break;

      List<Double> adMonths = new ArrayList<Double>();
      int    nMonths  = Integer.valueOf(in[3]);

      for(int i=0; i<3; i++) {
        adMonths.add(Double.valueOf(in[i]));
      }
      while(nMonths > adMonths.size()) {
        adMonths.add(adMonths.get(adMonths.size()-3)*
                     adMonths.get(adMonths.size()-2)/
                     adMonths.get(adMonths.size()-1));
      }
      System.out.printf("Month %d cost: $%.2f\n",
                         nMonths, adMonths.get(nMonths-1));
    }

    //close stream
    input.close();
    System.exit(0);
  }
}
