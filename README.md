# swingdemo
java报表的开发

菜单说明：
swingdemo——test1：

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

