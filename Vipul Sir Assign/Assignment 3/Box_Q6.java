import java.util.Scanner;

class Box_Q6
 {
    int height;
    int width;
    int breadth;

    Box_Q6()
    {
        height =0;
        width = 0;
        breadth = 0;
    }
	
    Box_Q6(int h, int w, int b) 
	{
        height = h;
        width = w;
        breadth = b;
    }

    int getVolume(int height, int width, int breadth) 
	{
        return height * width * breadth;
	}

    int getArea(int height, int width, int breadth)
	{
        return (2 * height) + (2 * width) + (2 * breadth);
    }

    public static void main(String[] args) 
	{
        int volume,Area =0;
        Box_Q6 box1 = new Box_Q6();
        volume = box1.getVolume(100, 200, 300);
        Area = box1.getArea(100, 200, 300);
        System.out.println("the volume of the box is:"+volume + " " +"the area of the box is "+Area);
        Box_Q6 box2 = new Box_Q6(50, 60, 70);

        volume = box2.getVolume(45, 56, 78);
        Area = box2.getArea(67, 78, 98);
        System.out.println("the volume of the box is:"+volume + " " +"the area of the box is "+Area);
    }
}