public class Tester {

    // Author class
    static class Author {

        private String name;
        private String emailId;
        private char gender;

        public Author(String name, String emailId, char gender) {
            this.name = name;
            this.emailId = emailId;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmailId() {
            return emailId;
        }

        public char getGender() {
            return gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }
    }

    // Book class
    static class Book {

        private String name;
        private Author author;
        private double price;
        private int quantity;

        public Book(String name, Author author, double price, int quantity) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.quantity = quantity;
        }

        public void displayAuthorDetails() {
            System.out.println("Displaying author details");
            System.out.println("Author name: " + author.getName());
            System.out.println("Author email: " + author.getEmailId());
            System.out.println("Author gender: " + author.getGender());
        }

        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Author author1 = new Author("Joshua Bloch", "joshua@email.com", 'M');
        Book book1 = new Book("Effective Java", author1, 45, 15);

        book1.displayAuthorDetails();
    }
}
