package folder2;

import folder.Demo;

public class file1{

public static void main(String[] args) {
	
	Demo obj = new Demo();
	System.out.println(obj.marks); // accessing marks variable Demo class as it is public variable
    obj.show();
	
}
}