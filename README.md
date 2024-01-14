## Factory Eureka Server

### Eureka 
- MSA 구축 시 사용되는 서비스 디스커버리(Service Discovery) 및 레지스트리 서버
- Service Discovery: Client 가 서비스를 호출할 때 필요한 서비스의 정보(IP, Port)들을 저장 및 관리하는 개념 

### How to run
```shell
1. git clone https://github.com/factory-msa/factory-eureka.git
2. ./gradlew build
3. http://localhost:8761/
```

### localhost:8761
![image](https://github.com/factory-msa/factory-eureka/assets/50076031/68b46e57-710e-4dba-8bd4-1c0461ca4749)

![image](https://github.com/JuHyun419/factory-eureka/assets/50076031/552dd86b-f6b9-429a-b06e-3b569a3ac11c)
- https://www.nginx.com/blog/service-discovery-in-a-microservices-architecture/

### Docs
- https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients
