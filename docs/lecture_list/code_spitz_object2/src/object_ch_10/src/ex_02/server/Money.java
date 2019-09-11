package ex_02.server;

import java.math.BigDecimal;
import java.time.Duration;

public class Money {
	public static final Money ZERO = Money.wons(0);

	private final BigDecimal amount;

	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}

	Money(BigDecimal amount) {
		this.amount = amount;
	}

	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}

	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}
}
