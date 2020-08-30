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

第二章：Swing容器

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

单选按钮盒按钮组

单选按钮是比较常见的，当用户输入的内容比较固定时，就可以采用单选的按钮

列表框

列表框可以把一系列的条目组织起来，供用户选择/
列表框的展示形式时多样的，它可以把所有的条目都放在同一列展示，也可以分为多列展示这些条目，而且列表框还可以响应用户的选择
事件。

组合框

组合框用下拉列表的形式展示的，而且在组合框中还提供了多选，编辑等特殊的功能
（加强版的列表框）

表格组件

表格（JTable)组件是Swing中最复杂，功能最强大的组件之一。
使用表格组件不仅可以创建最基本的表格，而且可以创建各种特殊样式和功能的
复杂表格。

第三章
Java2D图形设计基础
在报表开发中，图形报表的开发占据着非常重要的作用，一般情况下可以采用第三方形式报表插件进行开发

LineDemo.java  绘制2D线条示例程序
RectangleDemo.java 绘制矩形示例程序
EllipseDemo.java   圆形示例程序
ColorDemo.java    颜色填充示例程序
BorderDemo.java   设置图形边框示例程序
LocalFonts.java   获取本地系统自带字体列表
FontDemo.java     定值文本风格示例程序

jdk的开发目的是为了支持多平台，所以只开发了最原始的公共功能，从而保证java程序在各个操作系统平台之间都
可以运行

Java2D API是Java2平台的核心组件，它的出现增强了java图形开发的能力

JFC和Java2D
Java基础类（jfc）是一组API，在1.1中作为单独的库引入，在Java2平台中则为核心

AWT是提供给Java程序员用于构建GUI应用程序的原始方法

JFC库包含的模块
Swing组件集
可访问性API
拖放API
Java2DAPI

Java2D提供的功能
对渲染质量的控制
裁剪、合成和透明度
绘制和填充简单及复杂的形状
图像处理和变换
高级字体处理和字符串格式化

Graphics类
是AWT中的一个抽象类，也是图形绘制的一个基类

主要特性
Color
Font
Clip
ClipBounds
FontMetrics
PaintMode

Graphics2D类
不仅提供了基类中所有的功能，还提供了2D中独有的特性
Background
RenderingHints
Paint
Stroke
Transform
Composite

Java2D文本字体支持
1.物理字体
物理字体就是操作系统中实际存在的字体，在Java中可以自由调用操作系统中已经存在的各种字体。
物理字体可以使用字体名称，如Helvetica，Palatino，HonMincho或任意数量的其他字体名称

2.逻辑字体
为了保证Java程序的跨平台运行，在Java的AWT中，定义了5种逻辑字体：Serif，SansSerif，Monospaced，Dialog和DialogInput
这些逻辑字体不是实际的字体库，而是由Java运行环境将逻辑字体名称映射到物理字体，
映射关系与实际和通常语言环境相关，因此，他们提供的外观和规格个不相同




