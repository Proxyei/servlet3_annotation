# **学习使用注解实现的servlet3.0**

以前做的，基本都是使用servlet web.xml配置，对全注解使用不是很系统。servlet容器三大组件：**servlet，filter，listener**，主要应用**异步消息，文件上传处理，组件可插性（也就是共享库与执行时插件）**

1. servlet

   ​		重定向与转发的区别：重定向redirect参数丢失，相当于客户端重新发一下请求，而转发forward不会丢失参数，是在服务器内转发的。

2. init-param

   在servlet里面可以通过getServletContext().getInitParameter("param")得到：

   ```java
   <context-param>   
              <param-name>param</param-name>   
              <param-value>avalible during application</param-value>   
   </context-param> 
   ```

   **servlet3.0以后的版本，如何实现注解context-param配置，待研究：编码设置在servletContext里面**

   在servlet的init()方法中只可以通过this.getInitParameter("param1")取得：

   ```java
   
   <servlet>   
       <servlet-name></servlet-name>   
       <servlet-class></servlet-class>   
       <init-param>   
          <param-name>param</param-name>   
          <param-value>a</param-value>   
       </init-param>   
       <load-on-startup>0</load-on-startup>   
   </servlet> 
   ```

   对应的注解实现是：
   
   ```java
   initParams = {@WebInitParam(name = "initialParameter", value = "云无相", description = "测试注解下使用servlet下的参数") }
   ```
   
   
