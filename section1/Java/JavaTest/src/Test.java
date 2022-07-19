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
      List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
      List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
      List<String> output = findPeople(male, female, "김");
      System.out.println(output);
  }
}