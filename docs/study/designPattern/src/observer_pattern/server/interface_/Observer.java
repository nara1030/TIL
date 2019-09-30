package observer_pattern.server.interface_;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
