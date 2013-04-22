
public class PrettyLog implements Log {

	public void write(String log) {
		System.out.println("******************");
		System.out.println(log);
		System.out.println("******************");
	}

}
