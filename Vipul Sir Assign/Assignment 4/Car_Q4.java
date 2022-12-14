import javax.swing.text.TabableView;

class Automobile 
{
    String maker;
    String type;
    int max_speed;
    double price;
    double mileage;
    int registration_Number;

    Automobile() 
	{
    }

    void set(String maker, String type, int max_speed, double price, double mileage, int registration_Number) 
	{
        this.maker = maker;
        this.type = type;
        this.max_speed = max_speed;
        this.price = price;
        this.mileage = mileage;
        this.registration_Number = registration_Number;
    }

    void get() 
	{
        System.out.println("maker : " + maker);
        System.out.println("Type : " + type);
        System.out.println("Max speed : " + max_speed);
        System.out.println("price :" + price);
        System.out.println("Mileage : "+ mileage);
        System.out.println("registration_number : " + registration_Number);
        System.out.println();

    }
}

class Track extends Automobile
 {
    int capacity;
    String hoodType;
    int noOfWheels;

    Track() 
	{
    }

    Track(int capacity, String hoodType, int noOfWheels) 
	{
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }
	
    void print_Track_details()
	{
        System.out.println("no of doors :" + capacity);
        System.out.println("seating capacity :" + hoodType);
        System.out.println("No of wheels :"+noOfWheels);

    }
}

class Car_Q4 extends Automobile 
{
    int noOfDoors;
    int seating_Capacity;

    Car_Q4(int noOfDoors, int seating_Capacity)
	{
        this.noOfDoors = noOfDoors;
        this.seating_Capacity = seating_Capacity;
    }

    void print_Car_Q4_details()
	{
        System.out.println("no of doors :" + noOfDoors);
        System.out.println("seating capacity :" + seating_Capacity);
        
    }

    public static void main(String[] args)
	{
        Car_Q4 farrari = new Car_Q4(2, 2);
        farrari.set("farrari", "racing", 345, 2312312, 3, 897989);
        farrari.get();
        farrari.print_Car_Q4_details();

        Track abc = new Track(2,"big",18);
        abc.set("ace","truck",110,23232323,34,232423);
        abc.get();
        abc.print_Track_details();
    }
}