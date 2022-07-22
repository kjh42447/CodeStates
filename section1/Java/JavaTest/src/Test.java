import java.util.*;
import java.util.stream.*;

public class Test {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        //TODO..
        Stream<String> s = Stream.concat(male.stream(), female.stream());
        return s.distinct().sorted().filter(x->x.startsWith(lastName)).collect(Collectors.toList());
    }

	// 아래 코드는 변경하지 마세요.
  
  public void main(String[] args) {
      Object s = true;
      System.out.println(s.toString());
  }
}