  # Comprehensive Java Project README: Book Database System

This document serves as a comprehensive guide to a Java project developed for managing a book database. The project consists of several Java classes that work together to create a system for storing, retrieving, and searching for books based on various attributes such as author, year, and genre.

## Table of Contents

1. [Project Overview](#project-overview)
2. [Class Descriptions](#class-descriptions)
   - [Author Class](#author-class)
   - [Book Class](#book-class)
   - [BookDatabase Class](#bookdatabase-class)
   - [Client Class](#client-class)
3. [Usage](#usage)
4. [Example Usage](#example-usage)
5. [Conclusion](#conclusion)

## Project Overview

This Java project is designed to manage a collection of books, allowing users to add books to a database and search through them based on different criteria. The system is implemented using Java with classes representing different components of the book management system.

## Class Descriptions

### Author Class

- **Purpose**: Represents an author with a first name and a last name.
- **Key Methods**:
  - `setFirstName(String firstName)`: Sets the author's first name.
  - `setLastName(String lastName)`: Sets the author's last name.
  - `toString()`: Returns a string representation of the author.

### Book Class

- **Purpose**: Represents a book with details such as title, author, year of publication, genre, publisher, rating, and price.
- **Key Methods**:
  - `setAuthor(Author author)`: Sets the book's author.
  - `setTitle(String title)`: Sets the book's title.
  - `setYear(int year)`: Sets the year of publication.
  - `setGenre(String genre)`: Sets the book's genre.
  - `setRating(double rating)`: Sets the book's rating.
  - `setPrice(double price)`: Sets the book's price.
  - `toString()`: Returns a string representation of the book.

### BookDatabase Class

- **Purpose**: Manages a collection of books, allowing books to be added, removed, and searched.
- **Key Methods**:
  - `addBook(Book book)`: Adds a book to the database.
  - `removeBook(Book book)`: Removes a book from the database.
  - `search(Author author)`: Returns a list of books by the specified author.
  - `search(int startYear, int endYear)`: Returns a list of books published within the specified year range.
  - `search(String genre)`: Returns a list of books within the specified genre.

### Client Class

- **Purpose**: Provides a user interface for interacting with the book database.
- **Key Features**:
  - Allows users to add books to the database from a CSV file.
  - Provides options to search for books by author, year, or genre.
  - Displays search results to the user.

## Usage

To use this system:
1. Compile all Java classes.
2. Run the `Client` class.
3. Follow the on-screen prompts to interact with the book database.

## Example Usage

```java
Author author = new Author("John", "Doe");
Book book = new Book(author, "Java Programming", 2021, "Tech Press", "Education", 9.0, 29.99);
BookDatabase db = new BookDatabase();
db.addBook(book);
ArrayList<Book> results = db.search("Education");
for (Book b : results) {
    System.out.println(b);
}
```
