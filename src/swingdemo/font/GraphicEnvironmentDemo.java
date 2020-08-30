package swingdemo.font;

import java.awt.*;

/**
 * @Description 通过GraphicsEnvironment类查询并打印粗系统中存在的所有字体的名称
 * @Author ***
 * @Date 2020/8/30 12:01
 */
public class GraphicEnvironmentDemo {
    public static void main(String[] args) {
        GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fonts = localGraphicsEnvironment.getAvailableFontFamilyNames();
        for (int i = 0; i < fonts.length; i++) {
            System.out.println("字体"+fonts[i]);
        }
    }
}
