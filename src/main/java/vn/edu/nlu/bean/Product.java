package vn.edu.nlu.bean;



import java.io.Serializable;

public class Product implements Serializable{
    private String id;
    private String name;
    private String img1;
    private String img2;
    private String img3;
    private long price;
    private long priceSale;
    private int quantity;
    private String sup;
    private  int active;

    public Product(String string, String rsString, String s, long aLong, long rsLong, long l){

    }

    public Product(String id, String name, String img1, long price, long priceSale, int quantity, String sup, int active) {
        this.id = id;
        this.name = name;
        this.img1 = img1;
        this.price = price;
        this.priceSale = priceSale;
        this.quantity = quantity;
        this.sup = sup;
        this.active = active;
    }

    public Product(String id, String name, String img, long price, long priceSale){
        this.id = id;
        this.name = name;
        this.img1 = img;
        this.price = price;
        this.priceSale = priceSale;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img1;
    }

    public void setImg(String img) {
        this.img1 = img;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(long priceSale) {
        this.priceSale = priceSale;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getSup() {
        return sup;
    }

    public void setSup(String sup) {
        this.sup = sup;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public  void add(){
        quantity++;
    }
    public  void remove(){
        quantity--;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img1 + '\'' +
                ", price=" + price +
                ", priceSale=" + priceSale +
                ", sup="+ sup+
                ", soluong="+quantity+
                ",active=" +active
                +
                '}';
    }

}




