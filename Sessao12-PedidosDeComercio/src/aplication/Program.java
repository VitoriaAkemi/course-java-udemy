package aplication;


import java.util.Date;
import entites.Order;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		
		System.out.println(order);
	}

}
