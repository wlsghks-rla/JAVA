package chap07;

public class HttpServiceExam {

	public static void main(String[] args) {
		method(new LoginService());
		method(new FileDownloadService());		
	}
	
	public static void method(HttpService service) {
		service.service();
	}

}
