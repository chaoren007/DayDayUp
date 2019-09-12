# Springboot解决了哪些问题
- 快速构建
- 内嵌Servlet容器，不需要打成war包
- starter自动依赖与版本控制
- 不需要配置web.xml
- 约定大于配置，去繁就简

SpringBoot 将各种不同的场景抽取出来，做成不同starter(启动器)。当在相应的场景使用时，
只需要依赖对应的starter。比如使用开发web，只需要应用spring-boot-starter-web，
即可开箱即用。由Spring-boot-starter-parent统一做版本管理。

refresh是Spring初始化方法而不是Spring Boot的。
Spring Boot做的一些事情就是把创建一个Spring的容器，
然后把各种“Boot”的BeanDefination（比如Tomcat等）
注册到Spring容器里面，然后再调用refresh方法把Spring
里面的Bean初始化。

# 内置tomcat发布 和 外置tomcat发布的区别
- 内置的tomcat不需要引用其他依赖在starter-web中包含

配置参数:

server.tomcat.max-threads=1000

server.tomcat.uri-encoding=UTF-8

- 外置tomcat部署需要继承SpringBootServletInitializer，
实现configure方法
 
