package swingdemo.plugin;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * @Description 下拉框
 * @Author yumi
 * @Date 2020/8/27 20:31
 */
public class ListDemo {
    private JLabel jLabel;

    public void createUI() {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("列表示例程序");

        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建组件并添加事件监听器
        DefaultListModel defaultListModel = new DefaultListModel();
        defaultListModel.addElement("选项一");
        defaultListModel.addElement("选项二");
        defaultListModel.addElement("选项三");

        JList jList = new JList(defaultListModel);
        jList.addListSelectionListener(new ListAction());

        jLabel = new JLabel();
        jFrame.getContentPane().add(jList, BorderLayout.NORTH);
        jFrame.getContentPane().add(jLabel, BorderLayout.SOUTH);

        //4.设置窗体的大小
        jFrame.setBounds(200, 200, 250, 120);

        //5.显示窗体框架界面
        jFrame.setVisible(true);
    }

    /**
     * 事件处理内部类
     */
    class ListAction implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            JList list = (JList) e.getSource();
            jLabel.setText(list.getSelectedValue().toString() + "被选择");
        }
    }

    //ListDemo主函数
    public static void main(String[] args) {
        //创建ListDemo类的对象
        ListDemo listDemo = new ListDemo();
        listDemo.createUI();
    }
}
