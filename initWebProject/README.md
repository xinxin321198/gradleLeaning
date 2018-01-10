# 使用gradle构建一个基本的Java web工程
1. gradle init --type java-application 生成基本Java项目结构
2. build.gradle中添加eclipse插件、java插件、war插件，删除application插件以及运行主类的配置
3. 创建相关目录
java的源码目录：src/main/java

java的测试代码目录：src/test/java

资源文件目录：src/main/resources

测试的资源目录：src/test/resources

WEB项目的目录：src/main/webapp

web.xml文件存放目录：src/main/webapp/WEB-INF/web.xml

4. 执行gradle eclipse 生成eclipse工程文件

*ps:jdk1.7需要tomcat7或8，否则不能编译jsp*