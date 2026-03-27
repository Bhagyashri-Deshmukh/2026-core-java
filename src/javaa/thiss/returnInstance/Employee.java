package javaa.thiss.returnInstance;


class Employee {
    int a;
    int b;

    // Default constructor
    Employee()
    {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    Employee get() { 
        return this; 
    }

    // Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
    	Employee object = new Employee();
        object.get().display();
    }
}