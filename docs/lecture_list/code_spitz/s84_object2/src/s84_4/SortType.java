package codespitz_s84_4;

public enum SortType {
	TITLE_DESC {
		@Override
		int compare(Task a, Task b) {
			return a.getTitle().compareTo(b.getTitle());
		}
	},
	TITLE_ASC {
		@Override
		int compare(Task a, Task b) {
			return b.getTitle().compareTo(a.getTitle());
		}
	},
	DATE_DESC {
		@Override
		int compare(Task a, Task b) {
			return a.getDate().compareTo(b.getDate());
		}
	},
	DATE_ASC {
		@Override
		int compare(Task a, Task b) {
			return b.getDate().compareTo(a.getDate());
		}
	};
	
	abstract int compare(Task a, Task b);
}
