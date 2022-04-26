import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Examples {
	public static void main(String[] args) {
		String str = "selenium";

		char[] rev = str.toCharArray();

		for (int i = rev.length - 1; i >=0; i--) {
			System.out.print(rev[i]);
		}

	}
}
