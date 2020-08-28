package swingdemo.test;

import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

/**
 * @Description
 * 测试所有的相关组件，算是一个考核和测试
 * @Author yumi
 * @Date 2020/8/27 23:01
 */
public class TestAllPugins {
    /**默认配置*/
    //
    private JLabel jLabel;
    //文本区域
    private JTextField jTextField;
    //文本区域
    private JTextArea jTextArea;

    public void createdUI(){
        //1.创建框架
        JFrame jFrame = new JFrame("测试说明");
        //2.设置关闭框架时的状态
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3.创建和处理相关组件

        //3.1 创建并添加表格组件
        String[] columnNames={"编号","姓名","毕业院校","毕业时间","是否应届"};
        Object[][] data={
                {new Integer(1),"张三丰","太极学院",new GregorianCalendar(1677,8,10).getTime(),new Boolean(false)},
                {new Integer(2),"张无忌","光明顶",new GregorianCalendar(1768,10,23).getTime(),new Boolean(false)},
                {new Integer(3),"田玉珍","南京大学",new GregorianCalendar(1991,03,29).getTime(),new Boolean(true)},
                {new Integer(4),"狗不理","社会大学",new GregorianCalendar(2020,04,13).getTime(),new Boolean(false)},
        };
        final JTable jTable = new JTable(data, columnNames);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jFrame.getContentPane().add(jScrollPane, BorderLayout.CENTER);

        //4.设置窗体大小
        jFrame.setBounds(200,200,450,120);

        //5.设置窗体框架是否可见
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        TestAllPugins testAllPugins = new TestAllPugins();
        testAllPugins.createdUI();
    }

}
