import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, totalSteps;
 private int totalDays, actDays;

 public StepTracker(int goal){
  minSteps = goal;
  totalSteps = 0;
  totalDays = 0;
  actDays = 0;
 }
 public void addDailySteps(int steps){
  totalSteps+= steps;
  totalDays+= 1;
  if(steps>minSteps){
   actDays+= 1;
  }
 }
 public int activeDays(){
  return actDays;
 }
 public double averageSteps(){
  if(totalDays == 0){
   return 0.0;
  }
  return (double) totalSteps/totalDays;
 }
} 
