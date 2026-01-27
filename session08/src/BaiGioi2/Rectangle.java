package BaiGioi2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
       return width*height;

    }
    public double primeter(){
     return (width+height)*2;
    }

    public void getWidthh(){
        System.out.println("width:"+width);
    }
    public void getHeighth(){
        System.out.println("height:"+height);
    }
    public void tostring (){
        System.out.println("area:"+getArea());
        System.out.println("chu vi"+primeter());
        System.out.println("width:"+getWidth()+",height:"+getHeight());
    }

    }


