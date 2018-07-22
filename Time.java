import java.util.Scanner;
public class Time {
public static void main(String args []) {
int totalHours = hours1 + hours2;
int totalMinutes = minutes1 + minutes2;
int totalSeconds = seconds1 + seconds2;
if (totalSeconds >= 60) {
  totalMinutes ++;
  totalSeconds = totalSeconds % 60;
}
if (totalMinutes >= 60) {
  totalHours ++;
  totalMinutes = totalMinutes % 60;
}
}
}
