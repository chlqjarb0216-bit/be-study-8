package be_study.homework.homework02;

public class Book {
	String title;
	String writer;
	String publisher;
	String language;
	String genre;
	int price;
	int pages;
	boolean isNew;
	int[] bookMarks;
	int cntBookMark;

	Book() {
	}

	Book(String title, String writer, String language, int price) {
		this.title = title;
		this.writer = writer;
		this.language = language;
		this.price = price;
	}

	Book(String title, String writer, String publisher, String language, String genre, int price, int pages,
			boolean isNew, int[] bookMarks, int cntBookMark) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.language = language;
		this.genre = genre;
		this.price = price;
		this.pages = pages;
		this.bookMarks = bookMarks;
		this.cntBookMark = cntBookMark;
		this.isNew = isNew;
	}

	void unpacking() {
		if (this.isNew) {
			this.isNew = false;
		}
	}

	void openPage() {

	}

	void close() {

	}

	int[] bookMarking(int page) {
		this.bookMarks[this.cntBookMark] = page;
		return this.bookMarks;
	}

	int[] unbookMarking(int page) {
		for (int i = 0; i < this.cntBookMark; i++) {
			if (this.bookMarks[i] == page) {
				System.arraycopy(this.bookMarks, i + 1, this.bookMarks, i, this.cntBookMark - i - 1);
				return this.bookMarks;
			}
		}
		return null;
	}
}
