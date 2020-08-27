# java开发报表基础（基于Swing开发）
菜单说明：
swingdemo——test1：Swing开发基础

基础的技能get：

一：创建createUI方法

createUI（）{

/**1.创建窗体框架JFrame*/

JFrame jFrame = new JFrame("HelloWorld示例程序");

/**2.设置窗体关闭时的操作*/

jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

/**3.创建并添加标签组件；后面可以添加事务*/

JLabel jLabel = new JLabel("HelloWorldDemo");

jFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

/**4.自动选择合适的大小*/

jFrame.pack();

/**5.显示窗体的框架*/

jFrame.setVisible(true);

}

二：监听事务

三：提高程序事件的响应速度

可以在Swing程序开发中采取多线程的操作方法，每响应一个事件都启动一个新的线程。这样，即使其中某一个操作被阻塞，
也不影响其他部分的响应，从而充分利用系统的资源，提高了事件的响应速度

对于主类的主程序，也应该用一个单独的线程来运行。

四：Swing容器

在Swing容器中提供了丰富的容器组件，顶级容器JFrame的内容窗格可以放置任何其他的组件

JPanel同样也是一个比较好用的容器，可以把组件放在JPanel中，然后把JPanel添加到JFrame的内容窗格上，
采用这种组织方式比较容易管理界面上的各种组件元素。

Swing的框架结构
作为Swing的容器组件之一，JFrame的结构比较复杂，它是由很多层窗格组成的
由外而内：GlassPane ContentPane Layered Pane RootPane JFrame

RootPane: Swing的每一个顶层容器都包含RootPane，Root负责管理ContentPane，菜单栏和其他各层的信息。
RootPane在界面上不可见，一般，如果不涉及较底层操作的时候，都不需要关心RootPane的内容。

LayeredPane：Swing的普通容器。
例如JPanel时没有垂直坐标的，而LayeredPane是一个特殊的容器，提供了Z轴的垂直坐标，从而可以很容易地控
垂直的位置

ContentPane：每个顶层容器中都有一个ContentPane，负责容纳其他组件，从而构成课件的SwingGUI程序界面

GlassPane：这是一个透明的层，通过特殊的操作可以辅助实现RootPane相关的底层功能，但是一般情况下不考虑这层内容

其他容器组件：
在Swing中，除了JFrame顶级容器之外，还有JApplet和JDialog两个顶级容器，这两个顶级容器的使用方法和JFrame
的基本类似

五：版本布局管理器（Layout Manangers）

版本布局管理器的种类：
常用的：Borderlayout，FlowLayout，BoxLayout，CardLayout，GridBagLayout，GridLayout，GroupLayout
和SpringLayout等。

BorderLayout和Flowlayout是比较简单常用的布局管理器，基本上可以满足大部分常规的界面布局管理；

BoxLayout，CardLayout，Gridlayout，GridBagLayout，GroupLayout和SpringLayout等是稍微复杂的局部管理器，综合利用这些
布局管理器，可以实现各种复杂界面的布局管理




