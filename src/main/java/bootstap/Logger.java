
package bootstap;

public final class Logger {
	
	private String name;

	public static   Logger create(String name) {
		return new Logger(name);
	}
	
	private Logger(String name) {
		this.name=name;
	}
	
	public void log(String log) {
		System.out.println(name + " : "+log);
	}

}
