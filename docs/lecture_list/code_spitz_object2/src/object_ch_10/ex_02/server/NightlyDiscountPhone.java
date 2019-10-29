package ex_02.server;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NightlyDiscountPhone {
	private static final int LATE_NIGHT_HOUR = 22;

	private Money nightlyAmount;
	private Money regularAmount;
	private Duration seconds;
	private List<Call> calls = new ArrayList<>();

	public NightlyDiscountPhone(Money nightlyAmount, Money regularAmount, Duration seconds) {
		this.nightlyAmount = nightlyAmount;
		this.regularAmount = regularAmount;
		this.seconds = seconds;
	}

	public Money calculateFee() {
		Money result = Money.ZERO;

		for (Call call : calls) {
			result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
		}

		return result;
	}
}
