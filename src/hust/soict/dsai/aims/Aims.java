package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // 1. Tạo một giỏ hàng mới (Cart)
        Cart anOrder = new Cart();

        // 2. Tạo các đối tượng DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // 3. Kiểm tra tính năng thêm từng DVD (Mục 2)
        anOrder.addDigitalVideoDisc(dvd1);

        // 4. Kiểm tra nạp chồng: Thêm 2 DVD cùng lúc (Mục 2.2)
        anOrder.addDigitalVideoDisc(dvd2, dvd3);

        // 5. Kiểm tra nạp chồng: Thêm một danh sách DVD (Mảng) (Mục 2.1)
        DigitalVideoDisc[] dvdList = {
            new DigitalVideoDisc("Avatar", "Sci-Fi", "James Cameron", 162, 20.5f),
            new DigitalVideoDisc("Spider-Man", "Action", 15.0f)
        };
        anOrder.addDigitalVideoDisc(dvdList);

        // 6. Kiểm tra tính năng in danh sách giỏ hàng (Mục 6)
        // Phương thức print() này sẽ hiển thị ID tự động tăng (Mục 5)
        anOrder.print();

        // 7. Kiểm tra tính năng tìm kiếm (Mục 6)
        System.out.println("\n--- Testing Search Feature ---");
        // Tìm kiếm theo ID có tồn tại
        anOrder.searchById(1); 
        // Tìm kiếm theo ID không tồn tại
        anOrder.searchById(10); 
    }
}