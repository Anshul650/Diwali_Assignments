import java.util.Scanner;

class Room
{
    String Name;
    int Marks_s1;
    int Marks_s2;
    int Marks_s3;
    Room(int s1,int s2,int s3,String name)
    {
        Marks_s1 = s1;
        Marks_s2 = s2;
        Marks_s3 = s3;
        this.Name = name;
        average(Marks_s1,Marks_s2,Marks_s3);


    }
    static void average(int s1,int s2,int s3)
    {

        int avg = (s1+s2+s3)/3;
        int total = s1+s2+s3;
        display(avg,total);


    }
   static void display(int avg,int total)
    {

        System.out.println("the average marks is : "+avg);
        System.out.println("the total marks is: "+total);



    }
    public static void main(String[] args) {

        System.out.println("enter the name of the student ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the marks obtained in subject 1:");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks obtained in subject 3");
        int s3 = sc.nextInt();
        Room obj = new Room(s1,s2,s3,name);



    }
}