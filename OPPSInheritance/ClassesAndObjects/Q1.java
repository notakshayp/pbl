import java.util.Scanner;

class Box {
	private int height;
	private int length;
	private int width;

	Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	int volume() {
		return length * width * height;
	}
}

public class Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int w=sc.nextInt();
	int h=sc.nextInt();
	Box b1=new Box(l,w,h);
	System.out.print(b1.volume());~
}
}
