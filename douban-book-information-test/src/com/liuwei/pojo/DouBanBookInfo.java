package com.liuwei.pojo;


	import java.io.Serializable;

	public class DouBanBookInfo implements Serializable {

		private static final long serialVersionUID = 2179631010054135058L;

		public static final String Constants = null;

		private String tags;//书本标签

		private String isbn10;//10位ISBN
		
		private String isbn13;

		private String title;

		private String pages;

		private String author;

		private String price;

		private String binding;

		private String publisher;

		private String pubdate;

		private String summary;

		private String imagePath;

	
		public String getImagePath() {
			return imagePath;
		}

		public void setImagePath(String imagePath) {
			this.imagePath = imagePath;
		}

		public DouBanBookInfo() {
		}

		
		public String getTags() {
			return tags;
		}

		
		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getIsbn10() {
			return isbn10;
		}

		public void setIsbn10(String isbn10) {
			this.isbn10 = isbn10;
		}

		public String getIsbn13() {
			return isbn13;
		}

		
		public void setIsbn13(String isbn13) {
			this.isbn13 = isbn13;
		}

		
		public String getTitle() {
			return title;
		}

		
		public void setTitle(String title) {
			this.title = title;
		}

		public String getPages() {
			return pages;
		}

		public void setPages(String pages) {
			this.pages = pages;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPrice() {
			return price;
		}

	
		public void setPrice(String price) {
			this.price = price;
		}

		
		public String getBinding() {
			return binding;
		}

		public void setBinding(String binding) {
			this.binding = binding;
		}

		public String getPublisher() {
			return publisher;
		}

		
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public String getPubdate() {
			return pubdate;
		}

		
		public void setPubdate(String pubdate) {
			this.pubdate = pubdate;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		

	}

