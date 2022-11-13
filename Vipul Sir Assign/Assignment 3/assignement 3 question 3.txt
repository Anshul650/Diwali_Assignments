class Demo {
    int real;
    int imaginary;


    Demo() {
        real = 0;
        imaginary = 0;
    }

    Demo(int real) {
        this.real = real;
        imaginary = 0;
    }

    Demo(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    static void add(int real, int imaginary) {

        System.out.println("sum of two complex numbers is ");
        System.out.println(real + " + " + "i" + imaginary);


    }

    static void multipy(int real, int imag) {

        System.out.println("Multipication  of two complex numbers is ");
        System.out.println(real + " + " + "i" + imag);

    }

    public static void main(String[] args) {
        Demo obj = new Demo(10, 20);
        Demo obj1 = new Demo(10, 20);
        int real = obj.real + obj1.real;
        int imag = obj.imaginary + obj1.imaginary;
        int real_1 = obj.real * obj1.real;
        int imag_1 = obj.imaginary * obj1.imaginary;
        add(real,imag);
        multipy(real_1, imag_1);


    }

}