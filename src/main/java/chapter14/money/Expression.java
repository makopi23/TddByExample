package chapter14.money;

interface Expression {
	Money reduce(Bank bank, String to);
}
