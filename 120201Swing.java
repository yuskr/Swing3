import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane=new JLabel();
    int CELL=64;
    //构造方法
    public App() {

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                
                if (e.getKeyCode() == e.VK_UP){

                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CELL,CELL,CELL);
                }
            }
        });

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == e.VK_DOWN){

                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CELL,CELL,CELL);
                }
            }
        });
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == e.VK_LEFT){

                    label_plane.setBounds(label_plane.getX()-CELL,label_plane.getY(),CELL,CELL);
                }
            }
        });

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == e.VK_RIGHT){

                    label_plane.setBounds(label_plane.getX()+CELL,label_plane.getY(),CELL,CELL);
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        java.net.URL imgUrl = App.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgUrl));
        myPanel.add(label_txt);

        label_plane.setBounds(50,50,64,64);

        myPanel.add(label_plane);

        myPanel.setLayout(null);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
        JFrame frame = new JFrame("打飞机");
        frame.setContentPane(myPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
