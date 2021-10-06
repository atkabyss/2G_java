public class Exam13_6 {
    public static void main(String[] args){
        Book book = new Book("",0);

        book.setName("book");
        book.setPrice(500);

        String a = book.getName();
        int b = book.getPrice();

        System.out.println(a);
        System.out.println(b);
    }
}
