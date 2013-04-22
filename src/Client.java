
public class Client {

	private Log log;
	
	public void setLog(Log l) {
		this.log = l;
	}
	
	public void biz() {
		log.write("aaa");
	}
}
