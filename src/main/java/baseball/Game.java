package baseball;

public enum Game {
	min(1),
	max(9),
	strike(1),
	ball(2),
	root(0);
	private final int def;
	Game(int def) {
		this.def = def;
	}
	public int getDef() {
		return def;
	}
}
