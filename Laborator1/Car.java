package Laborator1;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed,double regularPrice,String color)
    {
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
    

    public double getSalePrice()
    {
        return regularPrice;
    }
    
    public class Truck extends Car
    {private int weight;

        public Truck(int speed,double regularPrice,String color,int weight)
        {
            super(speed, regularPrice, color);
            this.weight=weight;
        }

    
    
    public double getSalePrice()
    {if(weight>2000)
        {
            return super.getSalePrice()*0.9;
        }
        else
        {
            return super.getSalePrice()*0.8;
        }
    }

    }

    public class Ford extends Car{
        private int year;
        private int manufacturerDiscount;

        public Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
        {
            super(speed,regularPrice,color);
            this.year=year;
            this.manufacturerDiscount=manufacturerDiscount;
        }

        public double getSalePrice()
        {
            return super.getSalePrice()*(100-manufacturerDiscount);
        }
    }
    public class Sedan extends Car{
        private int length;

        public Sedan(int speed,double regularPrice,String color,int length)
        {
            super(speed,regularPrice,color);
            this.length=length;
        }
        public double getSalePrice()
        {
            if(length>20)
            {
                return super.getSalePrice()*0.95;
            }
            else
            {
                return super.getSalePrice()*0.9;
            }
        }
    }

     class MyOwnAutoShop
    {
        public static void main(String[] args) {
            Car car=new Car(150, 10000,"Black");
            
            Sedan sedan=new Sedan(200,150,"blue",21);

            Ford ford=new Ford(250,50000,"Red",2018,10);

            //Car car=new Car(150, 10000,"Black");
        
            System.out.println("Pret Sedan: "+sedan.getSalePrice());
            System.out.println("Pret Ford: "+ford.getSalePrice());

        }
    }
}

