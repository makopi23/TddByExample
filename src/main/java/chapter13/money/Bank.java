package chapter13.money;

class Bank {
	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}
}
