##常用依赖
```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.1.10.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>
```


##bean配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>
```
##注解支持 bean配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">


<!--    注解的支持-->
    <context:annotation-config/>
</beans>
```
##注解说明
- @Autowired{

@Autowired是按类型自动转配的，不支持id匹配。

需要导入 spring-aop的包！

@Autowired(required=false)  说明：false，对象可以为null；true，对象必须存对象，不能为null。


//如果允许对象为null，设置required = false,默认为true
@Autowired(required = false)
private Cat cat；
 

@Qualifier

@Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配

@Qualifier不能单独使用。
}

- @Nullable：字段标记了这个注解，说明这个字段可以为null；
- @Resource：自动装配通过名字，类型
- @Component：组件，放在类上，说明这个类被Spring管理了，就是bean！
