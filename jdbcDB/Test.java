package jdbcDB;

public class Test {
	// table column과 일치시키는게 좋음
	private int bno;
	private String title;
	private String content;
	private String writer;
	
	// constructor
	public Test(int bno, String title, String content, String writer) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	// getter, setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	};

	@Override
	public String toString() {
		return String.format("%3d\t%-10s\t%-30s\t%-100s\t", bno, writer, title, content);
	}
}
