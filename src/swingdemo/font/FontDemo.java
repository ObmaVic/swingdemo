package swingdemo.font;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @Description 定制文本显示风格
 * 用系统字体定义文本显示风格
 * @Author ***
 * @Date 2020/8/30 12:45
 */
public class FontDemo {
    public static void main(String[] args) {
        //1.创建窗体架构
        JFrame jFrame = new JFrame("设置字体风格");
        //2.设置窗体框架关闭时的操作
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3.创建并添加组件
        FontPanel fontPanel = new FontPanel();
        jFrame.add(fontPanel);
        //4.设置窗体的大小和位置
        jFrame.setBounds(500,500,250,150);
        //5.设置窗体框架界面
        jFrame.setVisible(true);
    }
}
class FontPanel extends JPanel{
    @Override
    public void paintComponent (Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        //使用本地字体文件
        //1.需要对字体进行注册
        try {
            //获取本地图形环境，通过GraphicsEnvironment类的静态方法获取本地图形系统环境的对象
            GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            //创建字体并注册字体，指明使用的字体文件为A.ttf，字体文件的类型为TRUEYPE
            localGraphicsEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("黑体")));
            //完成字体注册后，就可以直接通过名称调用这个字体
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //使用默认字体绘制文本
        String text = "田玉珍你个大猪蹄子";
        String tat="The brown fox jumped over the lazy dog";
        graphics2D.drawString(text,0,20);
       graphics2D.drawString(tat, 10, 30);
        //使用指定颜色绘制文本
        graphics2D.setColor(Color.BLUE);
        graphics2D.drawString(text, 0, 40);
        graphics2D.drawString(tat, 10, 80);

        //使用指定字体和风格绘制文本
        /**
         * @param: name,字体名称。可以是字体外观名称或字体系列名称
         * 并可表示此GraphicsEnvironment中找到的逻辑字体或物理字体
         * 如果name为null，则将新font的逻辑字体名称设置为default即可
         * @parame：style：font样式常量。样式参数是整数位掩码
         * 可以为Plain或bold和italic的按位或（例如：ITALIC或BOLD｜ITALIC）
         * 如果样式参数不符合任何一个期望的整位数掩码，则将样式设置为PLAIN
         * @param:size:font 的点大小
         */
        Font font = new Font("黑体", Font.BOLD + Font.ITALIC, 14);
        graphics2D.setFont(font);
        graphics2D.drawString(text, 0, 60);
        graphics2D.drawString(tat, 10, 100);
    }
}