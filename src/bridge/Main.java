package bridge;/** * @Author:zhenyuan * @Date:Created in 21:12 2019/1/4 */public class Main {    public static void main(String[] args){        StringDisplayImpl stringDisplay = new StringDisplayImpl("yuanzhen");        Display display = new Display(stringDisplay);        display.play();        CountDisplay countDisplay = new CountDisplay(stringDisplay);        countDisplay.mulDisplay(3        );    }}