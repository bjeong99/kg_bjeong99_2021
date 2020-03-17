import java.util.*;

class Main {
  public static boolean mapping(String s1, String s2) {
    HashMap<Character, Character> hm = new HashMap<>();

    int a = s1.length();
    int b = s2.length();

    if (a != b)
      return false;
    for (int i = 0; i < a; i++) {
      if (hm.containsKey(s1.charAt(i))) {
        if (hm.get(s1.charAt(i)) != s2.charAt(i))
          return false;
      } else {
        hm.put(s1.charAt(i), s2.charAt(i));
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(mapping("foo", "bar"));
    System.out.println(mapping("bar", "foo"));
    System.out.println(mapping("abc", "bcd"));
  }
}