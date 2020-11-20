import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Playmouse{
    private JPanel my_jpane=new JPanel();
    private JLabel my_img=new JLabel();
    private JLabel bjt_img=new JLabel();
    private JLabel fenshu= new JLabel();

    int a =0;

    public Playmouse() {
        my_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                my_img.setBounds((int)(Math.random()*10%10*25),(int)(Math.random()*10%10*25),74,74);
                a++;
                fenshu.setText("分数："+String.valueOf(a));
            }
        });
    }

    void dichu(){
        my_jpane.setLayout(null);

        java.net.URL imgURL1 = Playmouse.class.getResource("static/f.gif");
        java.net.URL imgURL2 = Playmouse.class.getResource("static/bjt.jpg");
        my_img.setIcon(new ImageIcon(imgURL1));
        bjt_img.setIcon(new ImageIcon(imgURL2));
        my_img.setBounds(10,10,74,74);
        bjt_img.setBounds(0,0,400,325);
        fenshu.setBounds(150,2,100,50);
        fenshu.setFont(new Font("微软雅黑",Font.BOLD,20));
        fenshu.setForeground(Color.white);
        my_jpane.add(fenshu);
        my_jpane.add(my_img);
        my_jpane.add(bjt_img);
        JFrame frame = new JFrame("海绵打地鼠");
        frame.setBounds(700,200,400,360);
        frame.setContentPane(my_jpane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Playmouse().dichu();
    }
}
