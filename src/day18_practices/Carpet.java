package day18_practices;

public class Carpet {

    public int width;
    public int length;
    public int unitPrice;
    public boolean isPersian;


    public void setInfo(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        if (isPersian){
         return (width*length) * unitPrice + 200;
        }else {
            return (width*length) * unitPrice;
        }
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", totalCost= $" + calcCost() +
                '}';
    }
}
