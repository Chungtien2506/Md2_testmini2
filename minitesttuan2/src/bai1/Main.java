package bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new ProgrammingBook(1, "a", 10, "Hung", "Anh", "Vien tuong 1"));
        books.add(new ProgrammingBook(2, "b", 2000, "Thi", "Viet", "abc"));
        books.add(new ProgrammingBook(3, "c", 3000, "Nam", "Trung", "abc"));
        books.add(new ProgrammingBook(4, "d", 4000, "Son", "Phap", "abc"));
        books.add(new ProgrammingBook(5, "e", 50, "Tuan", "Nhat", "Vien Tuong 1"));
        books.add(new ProgrammingBook(6, "f", 6000, "Cong", "My", "abc"));
        books.add(new ProgrammingBook(7, "g", 7000, "Chung", "Bo Dao Nha", "abc"));
        books.add(new ProgrammingBook(8, "h", 8000, "Hieu", "Tay Ban Nha", "abc"));
        books.add(new ProgrammingBook(9, "i", 90, "Hai", "Uc", "abc"));
        books.add(new ProgrammingBook(10, "k", 10000, "Dung", "Y", "abc"));
        double totalCost = 0;
        int countFiction1 = 0;
        int countPriceUnder100 = 0;

        for (Book book : books) {
            totalCost += book.getPrice();
            if (book instanceof FictionBook fictionBook) {
                if (fictionBook.getCategory().equals("Viễn tưởng 1")) {
                    countFiction1++;
                }
            }
            if (book.getPrice() < 100) {
                countPriceUnder100++;
            }
        }

        System.out.println("Tổng tiền của 10 cuốn sách: " + totalCost);
        System.out.println("Số sách Fiction có category là \"Viễn tưởng 1\": " + countFiction1);
        System.out.println("Số sách có giá < 100: " + countPriceUnder100);

        books.add(new FictionBook());
        System.out.println(books.get(books.size() - 1).getClass().getSimpleName());
        System.out.println(( (FictionBook)books.get(10)).getCategory());



    }
}
