package da_3;

abstract class StackADT{
	abstract void displayTheStack();
	abstract void push(int s);
	abstract int peek();
	//abstract void PushMany(int s);
	abstract boolean isEmpty();
	abstract void popAll();
	abstract void pop();
}