package Factory;import Factory.framework.Factory;import Factory.framework.Product;import Factory.idcard.IDCardFactory;/** * @Author:zhenyuan * @Date:Created in 17:58 2018/12/29 */public class Main {    public static void main(String[] args){        Factory idFactory = new IDCardFactory();        Product p1 = idFactory.create("yz");        Product p2 = idFactory.create("zhy");        p1.use();        p2.use();    }}