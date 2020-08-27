package swingdemo.plugin;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description 组合框示例
 * @Author yumi
 * @Date 2020/8/27 21:38
 */
public class ComboBoxDemo {
    private JLabel jLabel;

    public void createUI() {
        //1.创建框架
        JFrame jFrame = new JFrame("ComboBox||组合框示例程序");

        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"选项一", "选项二", "选项三"};
        JComboBox jComboBox = new JComboBox(items);
        jComboBox.addActionListener(new ComboBoxAction());

        jLabel = new JLabel();
        jFrame.getContentPane().add(jComboBox, BorderLayout.NORTH);
        jFrame.getContentPane().add(jLabel, BorderLayout.SOUTH);

        //3.设置窗体大小
        jFrame.setBounds(200, 200, 250, 120);

        //4.显示窗体框架界面
        jFrame.setVisible(true);
    }

    /**
     * 事件处理内部类
     */
    class ComboBoxAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox comboBox = (JComboBox) e.getSource();
            jLabel.setText(comboBox.getSelectedItem().toString() + "被选择");
        }
    }

    //主函数
    public static void main(String[] args) {
        ComboBoxDemo comboBoxDemo = new ComboBoxDemo();
        comboBoxDemo.createUI();
    }
}
