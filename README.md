# dubbo-demo

# 启动命令
java [options: -Dxxx ] -jar xxx.jar [options: --server.port=8060]

# 执行命令参数

-Ddubbo.registry.address=zookeeper://10.20.11.116:2181 

-Ddubbo.protocol.port=27880

--server.port=8060

# 属性说明

dubbo.registry.address: 注册中心地址

dubbo.protocol.port: 提供者服务端口，启动时，不设置该参数，默认端口为27880

server.port:spring boot应用端口

# jar包说明
interface模块：此模块是依赖模块，不需要执行启动命令，consumer-xml-application-v2_7 、provider-xml-application-v2_7 、consumer-xml-application-v2_6 和 provider-xml-application-v2_6服务都需要依赖此jar包

## dubbo 2.7版本服务
provider-xml-application-v2_7模块：此模块是提供者服务模块，提供服务，需要执行启动命令

provider-xml-sleep5s-application-v2_7模块：此模块是提供者服务模块，提供服务，需要执行启动命令(此模块先不用不上)

consumer-xml-application-v2_7模块：此模块是消费者服务模块，消费服务，需要执行启动命令

## dubbo 2.6版本服务
provider-xml-application-v2_6模块：此模块是提供者服务模块，提供服务，需要执行启动命令

consumer-xml-application-v2_6模块：此模块是消费者服务模块，消费服务，需要执行启动命令

# dubbo v2.6 应用说明
## provider-xml-application-v2_6
    提供者应用提供了两个服务：DemoService 和 UserService 服务
    DemoService服务中有一个方法：sayHello
    UserService服务中有两个方法：getUser 和 saveUser
    提供者服务端口：应用中默认为26880，如果应用服务启动时，动态设置了端口，动态设置的端口值优先级较高

## consumer-xml-application-v2_6
    消费者应用向外暴露端口：8065，该值为固定值，不需要因环境的变动而变动，暂时未设置动态覆盖值
    请求DemoService服务中的sayhello方法操作接口：GET  http://ip:8075/demo?name=xxx  
    请求UserService服务中的getUser方法操作接口：GET  http://ip:8075/user?name=xxx   
    请求UserService服务中的saveUser方法操作接口：GET  http://ip:8075/user/save?name=xxx   
    
# dubbo v2.7 应用说明
## provider-xml-application-v2_7
    提供者应用提供了两个服务：DemoService 和 UserService 服务
    DemoService服务中有一个方法：sayHello
    UserService服务中有两个方法：getUser 和 saveUser
    提供者服务端口：应用中默认为27880，如果应用服务启动时，动态设置了端口，动态设置的端口值优先级较高

## consumer-xml-application-v2_7
    消费者应用向外暴露端口：8075，该值为固定值，不需要因环境的变动而变动，暂时未设置动态覆盖值
    请求DemoService服务中的sayhello方法操作接口：GET  http://ip:8075/demo?name=xxx&tag=yyy(tag属性可不为空，该属性用于测试标签路由)
    请求UserService服务中的getUser方法操作接口：GET  http://ip:8075/user?name=xxx   
    请求UserService服务中的saveUser方法操作接口：GET  http://ip:8075/user/save?name=xxx   
