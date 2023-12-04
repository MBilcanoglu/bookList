package bookList;

public class Book {

	private String title;

	private int pageNumber;

	private String author;

	private int releaseDate;

	public Book(String title, String author, int pageNumber, int releaseDate) {
		super();
		this.title = title;
		this.pageNumber = pageNumber;
		this.author = author;
		this.releaseDate = releaseDate;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

}
