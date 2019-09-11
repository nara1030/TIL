package ex_01.client;

import java.time.Duration;
import java.time.LocalDateTime;

import ex_01.server.Call;
import ex_01.server.Money;
import ex_01.server.Phone;

public class Consumer {
	public static void main(String[] args) {
		Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));
		phone.call(new Call(LocalDateTime.of(2018, 1, 1, 12, 10, 0), LocalDateTime.of(2018, 1, 1, 12, 11, 0)));
		phone.call(new Call(LocalDateTime.of(2018, 1, 2, 12, 10, 0), LocalDateTime.of(2018, 1, 2, 12, 11, 0)));

		phone.calculateFee();
	}
}
