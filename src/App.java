public class App {
    public static void main(String[] args) {
    Author dostojewski = new Author("Фёдор", "Достоевский");
    Author tolstoi = new Author("Лев", "Толстой");

        Book theIdiot = new Book("Идиот", dostojewski, 1868);
        Book warAndPeace = new Book ("Война и мир", tolstoi, 1865);
        warAndPeace.setPublishedYear(1869);

        System.out.println(tolstoi);
        System.out.println(warAndPeace);
        System.out.println(dostojewski.equals(tolstoi));
        System.out.println(theIdiot.equals(warAndPeace));

    }
}
