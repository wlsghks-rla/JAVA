
public class HttpServletExam {

	public static void main(String[] args) {
		method(new LoginServelet());
		method(new FileDownloadServelet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
