
public class Main {

	public static void main(String[] args) {
		Client c = new Client();
		// Log l = new DefaultLog();
		Log l = new PrettyLog();
		c.setLog(l);
		c.biz();

	}

}
