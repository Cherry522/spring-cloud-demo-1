## 参考链接
http://www.ityouknow.com/springcloud/2017/05/10/springcloud-eureka.html


### 依赖工具


#### RabbitMQ
##### 启动命令
```
docker run --rm -d \
--hostname rabbit \
--name rabbit \
-p 15672:15672 \
-p 5672:5672 \
-e RABBITMQ_DEFAULT_USER=admin \
-e RABBITMQ_DEFAULT_PASS=123456 \
rabbitmq:3.6-management
```

##### 页面访问：
http://localhost:15672/


curl -X POST http://localhost:9000/bus/refresh
curl -X POST http://localhost:8999/bus/refresh

curl -X POST http://localhost:8888/bus/refresh


### 服务启动顺序
1.eureka-service
2.config-service
3.rabbitmq/kafka
4.eureka-product
5.eureka-cunsumer
5.
