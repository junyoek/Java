package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요:");
        int num = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] order = new ProductOrder[num];

        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            order[i] = createOrder(productName, price, quantity);
        }
        printOrder(order);

        int total_price = totalPrice(order);
        System.out.println("총 결제 금액: " + total_price);


    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = name;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
        }
    }

    static int totalPrice(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += (order.price * order.quantity);
        }
        return sum;
    }
}
