package codespitz_s84_4;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class CompositeTask {
	private String title;
	private LocalDateTime date;
	private boolean isComplete = false;
	private final Set<CompositeTask> list = new HashSet<>();

	public CompositeTask(String title, LocalDateTime date) {
		setTitle(title);
		setDate(date);
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

	public boolean isComplete() {
		return isComplete;
	}

	public void addTask(String title, LocalDateTime date) {
		list.add(new CompositeTask(title, date));
	}

	public void removeTask(CompositeTask task) {
		list.remove(task);
	}
	
	public TaskReport getReport(CompositeSortType type) {
		
	}
}
