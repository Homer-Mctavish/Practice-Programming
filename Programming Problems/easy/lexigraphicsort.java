import java.io.*;
import java.util.*;

class lexigraphicsort {
  public static void main(String args[]) {
    String in = args[0];
    String two = args[1];
    int g = Integer.parseInt(two);
    char[] split = in.toCharArray();
    Deque<Character> string = new ArrayDeque<Character>();
    String lexigraphicshortest = "";
    long r = 1;
    for (long i = 1; i <= in.length(); i++) {
      r *= i;
    }
    for (char k : split) {
      string.add(k);
    }
    for (int h = 0; h < r; h++) {
      String f = stringfor(shuffle(string, g));
      if (in.compareTo(f) < 0 || in.compareTo(f) == 0) {
        lexigraphicshortest = in;
      }
      lexigraphicshortest = f;
    }
    System.out.print(lexigraphicshortest);
  }

  static Deque<Character> shuffle(Deque<Character> shufflee, int g) {
    for (int i = 0; i < g; i++) {
      char first = shufflee.pop();
      shufflee.addLast(first);
    }
    return shufflee;
  }

  static String stringfor(Deque<Character> shuffel) {
    String ret = "";
    for (char g : shuffel) {
      ret = ret + g;
    }
    return ret;
  }
}
