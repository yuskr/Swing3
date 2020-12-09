import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_List = new ArrayList<>();

    //构造方法
    public App() {

        label_List.add(new JLabel());
        label_List.add(new JLabel());
        label_List.add(new JLabel());

        java.net.URL imgURL = App.class.getResource("img/ball.png");
        label_List.get(0).setIcon(new ImageIcon(imgURL));
        label_List.get(1).setIcon(new ImageIcon(imgURL));
        label_List.get(2).setIcon(new ImageIcon(imgURL));

        label_List.get(0).setBounds(300,100,64,64);
        label_List.get(1).setBounds(100,100,64,64);
        label_List.get(2).setBounds(200,100,64,64);
        myPanel.add(label_List.get(0));
        myPanel.add(label_List.get(1));
        myPanel.add(label_List.get(2));



    }
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
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
