package com.designpattern.smartuniversitylibrary;
class Book {
    private String title, author, edition, genre, publisher;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    public String getTitle(){ return title; }

    public static class BookBuilder {
        private String title;
        private String author;
        private String edition;
        private String genre;
        private String publisher;

        public BookBuilder(String title){ this.title=title; }
        public BookBuilder author(String a){ this.author=a; return this; }
        public BookBuilder edition(String e){ this.edition=e; return this; }
        public BookBuilder genre(String g){ this.genre=g; return this; }
        public BookBuilder publisher(String p){ this.publisher=p; return this; }
        public Book build(){ return new Book(this); }
    }
}
