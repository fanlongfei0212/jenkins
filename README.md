# jenkins

## Jenkins Test Project

**测试Jenkins的SpringBoot项目，两个接口除了访问路径，其他的都是一样的**

1.端口号为8080，如果出现端口号冲突，可在【application.properties】中进行修改或在启动Jar时使用命令指定

2.默认接口

* url：localhost:8080

* 类型：GET

* 参数：无

* 返回值：HelloWord:TestJenkins

3.Jenkins测试接口

* url：localhost:8080/jenkins/hello/word

* 类型：GET

* 参数：无

* 返回值：HelloWord:TestJenkins