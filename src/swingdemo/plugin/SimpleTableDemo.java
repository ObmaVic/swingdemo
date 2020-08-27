package swingdemo.plugin;

import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

/**
 * @Description 表格组件demo
 * @Author yumi
 * @Date 2020/8/27 22:03
 */
public class SimpleTableDemo {
    public static void main(String[] args) {
        //1.创建窗体框架
        JFrame jFrame = new JFrame("SimpleTable||表格组件示例程序");

        //2.设置窗体框架关闭的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3.创建并添加表格组件
        String[] columnNames = {"编号", "姓名", "登记日期", "专业", "是否应届"};
        Object[][] data = {
                {new Integer(1), "黎明", new GregorianCalendar(2008, 2, 3).getTime(), "计算机专业", new Boolean(false)},
                {new Integer(2), "张乐", new GregorianCalendar(2008, 5, 1).getTime(), "自动化专业", new Boolean(true)},
                {new Integer(3), "于硕硕", new GregorianCalendar(2008, 9, 21).getTime(), "计算机专业", new Boolean(true)},
                {new Integer(4), "田玉珍", new GregorianCalendar(2008, 1, 8).getTime(), "金融专业", new Boolean(true)}
        };
        final JTable jTable = new JTable(data, columnNames);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.getContentPane().add(jScrollPane, BorderLayout.CENTER);

        //4.设置窗体大小
        jFrame.setBounds(200, 200, 400, 120);

        //5.显示窗体框架界面
        jFrame.setVisible(true);
    }
}
