package abstractclass;

abstract  class Athelete {
	public void eat() {
		System.out.println("I eat healthy food");
	}

	public void sleep() {
		System.out.println("I sleep 8hours a day");
		System.out.println();
	}

	abstract void event();

	abstract void accomplishment();
}
