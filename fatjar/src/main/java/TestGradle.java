import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class TestGradle {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);
        System.out.println("------");
        Arrays.stream(args).forEach(s -> System.out.println(StringUtils.swapCase(s)));
    }
}
