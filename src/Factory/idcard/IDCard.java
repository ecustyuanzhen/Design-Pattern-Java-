package Factory.idcard;import Factory.framework.Product;/** * @Author:zhenyuan * @Date:Created in 17:50 2018/12/29 */public class IDCard extends Product {    private String owner;    public IDCard(String owner) {        System.out.println("product " + owner + " 's idcard");        this.owner = owner;    }    @Override    public void use() {        System.out.println("use " + owner + " 's idcard");    }    public String getOwner() {        return owner;    }}