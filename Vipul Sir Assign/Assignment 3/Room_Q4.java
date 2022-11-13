import java.util.Scanner;

public class Room_Q4 
{
    int height;
    int width;
    int breadth;

    Room_Q4()
	{
        height = 0;
        width = 0;
        breadth = 0;
    }

    Room_Q4(int height, int width, int breadth) 
	{
        this.height = height;
        this.width = width;
        this.breadth = breadth;
        System.out.println("the volume of the given Room_Q4 is :" + volume(height, width, breadth));
    }

    int volume(int height, int width, int breadth) 
	{
        int volume = height * width * breadth;
        return volume;
    }
}

class Room_Q4Demo 
{
    public static void main(String[] args) 
	{
        Room_Q4 obj = new Room_Q4();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Room_Q4s you want to check the volume of");
        int number = sc.nextInt();
        Room_Q4[] array = new Room_Q4[5];

        for (int i = 0; i < number; i++) 
		{
            System.out.println("enter height ");
            int height = sc.nextInt();
            System.out.println("enter width ");
            int width = sc.nextInt();
            System.out.println("enter breadth ");
            int breadth = sc.nextInt();
            array[i] = new Room_Q4(height, width, breadth);
        }
    }
}