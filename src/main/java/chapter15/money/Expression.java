package chapter15.money;

interface Expression {
	Money reduce(Bank bank, String to);
}
