public class Product {

    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;
    private int date;


    //NO Arg Constructor
    public Product(){

        this.name = "No Name";
        this.description = "No Description";
        this.price = 0.0f;
        this.quantity = 0;
        this.discount = 0;
    }

    // Parameterized Constructor
    public Product(String n,String d,float p,int qu,float df){

        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = qu;
        this.discount = df;
    }


    public Product(String n,String d,float p){

        this.name = n;
        this.description = d;
        this.price = p;
    }

    public Product(String n,String d,float p,int qu,float df,String c){

        this.name = n;
        this.description = d;
        this.price = p;
        this.quantity = qu;
        this.discount = df;
        this.color = c;
    }

    public Product(String n,String d,float p,int qu,float df,String c,int da){
        this   (n,d,p,qu,df,c);
        this.date = da;
    }


    //Copy Constructor
    public Product(Product p1){
        this.name = p1.name;
        this.description = p1.description;
        this.price = p1.price;
        this.quantity = p1.quantity;
        this.discount = p1.discount;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println(this.price);
        System.out.println(this.quantity);
        System.out.println(this.discount);
        System.out.println(this.color);
        System.out.println(this.date);
    }

}

