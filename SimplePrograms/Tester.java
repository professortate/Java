class Demo {
	public int var1 = 20;
	public int var2 = 40;

	Demo(int v1, int v2) {
		var1 = v1;
		var2 = v2;
	}
}

class Tester {
	public static void main(String args[]) {
		Demo demo = new Demo();
		System.out.println(demo.var1);
		System.out.println(demo.var2);
	}
}