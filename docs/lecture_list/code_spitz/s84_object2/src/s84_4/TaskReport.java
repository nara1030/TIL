package codespitz_s84_4;

import java.util.ArrayList;
import java.util.List;

public class TaskReport {
	private final CompositeTask task;
	private final List<TaskReport> list = new ArrayList<>();

	public TaskReport(CompositeTask task) {
		this.task = task;
	}
	
	
}
