import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println(totalScore.size() + " students took the exam");

    int total = 0;
    for(int score : totalScore){
      total+= score;
    }

    double average = (double)total/totalScore.size();

    System.out.println("average: " + average);

    int min = Integer.MAX_VALUE;
    for(int pointMin: totalScore){
      if(min > pointMin){
        min = pointMin;
      }
    }

    System.out.println("The minimum score is " + min);

    int max = Integer.MIN_VALUE;
    for(int pointMax: totalScore){
      if(max < pointMax){
        max = pointMax;
      }
    }

    System.out.println("The minimum score is " + max);   
  }

}
