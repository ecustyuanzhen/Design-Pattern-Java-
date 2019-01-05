package bridge;/** * @Author:zhenyuan * @Date:Created in 21:00 2019/1/4 */public class Display {    private DisplayImpl display;    public Display(DisplayImpl display) {        this.display = display;    }    public void open(){        display.rawOpen();    }    public void print(){        display.rawPrint();    }    public void close(){        display.rawClose();    }    public void play(){        open();        print();        close();    }}