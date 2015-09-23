package da9;

abstract class StackADT{
	abstract void displayTheStack();
	abstract void push(String s);
	abstract void peek();
	abstract void PushMany(String s);
	abstract boolean isEmpty();
	abstract void popAll();
	abstract void pop();
}