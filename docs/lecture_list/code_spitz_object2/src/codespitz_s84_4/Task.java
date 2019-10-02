package codespitz_s84_4;

import java.time.LocalDateTime;

public class Task {
	private String title;
	private LocalDateTime date;
	private boolean isComplete = false;

	Task(String title, LocalDateTime date) {
		this.title = title;
		this.date = date;
	}

	public void toggle() {
		isComplete = !isComplete;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
