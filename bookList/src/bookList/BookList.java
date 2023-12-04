package bookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookList {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<Book>();

		bookList.add(new Book("1984", "George Orwell", 328, 1949));
		bookList.add(new Book("Harry Potter ve Felsefe Taşı", "J.K. Rowling", 336, 1997));
		bookList.add(new Book("Sapiens: İnsan Türünün Kısa Bir Tarihi", "Yuval Noah Harari", 464, 2011));
		bookList.add(new Book("Yüzyıllık Yalnızlık", "Gabriel Garcia Marquez", 448, 1967));
		bookList.add(new Book("Beyaz Diş", "Jack London", 256, 1906));
		bookList.add(new Book("Jane Eyre", "harlotte Brontë", 532, 1847));
		bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 1925));
		bookList.add(new Book("Bilinmeyen Bir Kadının Mektubu", "Stefan Zweig", 64, 1922));
		bookList.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 244, 1968));
		bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 281, 1960));

		Map<String, String> nameAuthorMap = bookList.stream()
				.collect(Collectors.toMap(Book::gettitle, Book::getAuthor));

		nameAuthorMap.forEach(
				(title, author) -> System.out.println("Kitap Adı: " + title + "\nYazar Adı: " + author + "\n"));

		System.out.println("Sayfa Sayısı 100 den fazla olan Kitaplar: "
				+ bookList.stream().filter(book -> book.getPageNumber() > 100).count());
		bookList.stream().filter(book -> book.getPageNumber() > 100).forEach(
				book -> System.out.println("Kitap Adı: " + book.getPageNumber() + " Yazar Adı: " + book.getAuthor()
						+ " Sayfa Sayısı: " + book.getPageNumber() + " Yayın Tarihi: " + book.getReleaseDate()));
	}

}
