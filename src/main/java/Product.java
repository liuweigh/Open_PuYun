/**
 * @Author: liuwei
 * @Date: 2019/1/14 8:43
 * @Description:
 */

// {id:1,sku:"009",name:"iphone",num:"100",weight:"10"},
// {id:2,sku:"006",name:"Mi",num:"100",weight:"10"},
// {id:3,sku:"008",name:"HUAWEI",num:"100",weight:"10"}
// {id:4,sku:"009",name:"iphone",num:"100",weight:"10"},
// {id:5,sku:"006",name:"Mi",num:"100",weight:"10"},
// {id:6,sku:"008",name:"HUAWEI",num:"100",weight:"10"}
// {id:8,sku:"009",name:"iphone",num:"100",weight:"10"},
// {id:9,sku:"006",name:"Mi",num:"100",weight:"10"},
// {id:10,sku:"008",name:"HUAWEI",num:"100",weight:"10"},
public class Product {


    private String id;
    private String sku;
    private String name;
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Product(String id, String sku, String name, String num) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.num = num;
    }

    public Product(String id, String sku, String name) {
        this.id = id;
        this.sku = sku;
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
