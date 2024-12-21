Struts2(v7.0) Spring JPA
===============
Projects based on [struts2-spring-jpa](https://github.com/xiaobin80/struts2-spring-jpa).    
  with JTA(Atomikos-Hibernat4) + JPA


## Hibernate
- [MySQL8Dialect/MySQL5Dialect](https://stackoverflow.com/a/77871219)
- [MySQL 5.7](https://github.com/spring-projects/spring-boot/issues/39959)

### hibernate 5.2
You can also put :
```java
@GeneratedValue(strategy = GenerationType.IDENTITY)
```
And let the DateBase manage the incrementation of the primary key:
```sql
AUTO_INCREMENT PRIMARY KEY
```

## Struts2
> v7.0

- StrutsParameter

### [StrutsParameter](https://developer.atlassian.com/server/confluence/struts-module/#defining-request-parameters)
```
private String name;

@StrutsParameter
public void setName(String name) {
    this.name = name;
}
```


# Deploy
War:    
```
mvn clean
```
```
mvn compile
```
```
mvn package -DskipTests
```

## Web
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/index    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/home    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/userSingle?userId={id}    
* [userList - struts6_tags](http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/userList)    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/userDel?userId={id}    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/userInsert    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/userUpdate?userName={value}&userId={id}    
* http://localhost:8080/struts7-spring-jpa-1.0.1-SNAPSHOT/trainList?month={number}&trainNum={number}    



# Ref
- [安装memcached](https://tdtc-hrb.github.io/csdn/post/ops_memcached_ubuntu/)
- [Jakarta Persistence](https://docs.jboss.org/hibernate/orm/6.0/migration-guide/migration-guide.html#_jakarta_persistence)
- [Jetty Setup](https://happycoding.io/tutorials/java-server/jetty-setup)
- [why is dependency to javax.persistence-api removed in hibernate-core 6.0.2](https://stackoverflow.com/questions/72475572/why-is-dependency-to-javax-persistence-api-removed-in-hibernate-core-6-0-2)
- [Table 'test.hibernate_sequence' doesn't exist](https://stackoverflow.com/a/36086793)
