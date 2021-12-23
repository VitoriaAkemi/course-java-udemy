package aplication;


import java.util.Date;
import entites.Order;
import entites.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		// convertendo valor string para enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
