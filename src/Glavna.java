import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		List<String> iminja;
		iminja = new ArrayList<String>();
		iminja.add("ani");
		iminja.add("kiko");
		iminja.add("vesna");
		iminja.add("milan");
		iminja.stream()
			.filter( x -> x.length()<=5 )
			.forEach(x -> System.out.println(x));
	}

}
