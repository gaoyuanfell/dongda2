# tomcat 加大缓存 默认10M
    context.xml 增加 <Resources cachingAllowed="true" cachMaxSize="100000"/>
# 目录介绍
0. properties 配置目录
0. resources spring配置目录
0. src 
    0. mapping mybatis sql映射目录
    0. moka 源码
        0. basic 基础模块 包含公告方法 拦截器 log4j 统一异常处理
        0. * 模块
0. web 

# 模块目录介绍
0. bo 实体目录（与数据库字段保持一致）
0. ctrl 视图控制层
0. dao 数据库接口（映射mybatis）
0. service 服务层（主要处理业务逻辑）
0. to 视图数据展示层（数据库获取的数据将以此层返回给视图）
0. vo 视图数据接收层（视图层的数据将以此层接收）

# 配合方式
负责自己模块，尽量不要动其他的模块，事先最好先沟通好后再去修改，避免代码冲突。

# 测试数据库

2017-7-10 任务
开发工具最好用idea，避免代码风格不一致，并且很好用。
按照我的方式将其他需要的模块创建起来
moka下面的是对应的模块
mapping 是mybatis对应的sql映射文件
保证每个模块都能新增一条数据、和分页查询数据。
例子你看company模块

项目工具下载地址

[redis](https://github.com/MicrosoftArchive/redis/releases/download/win-3.2.100/Redis-x64-3.2.100.msi)

云主机
120.77.83.117
Administrator
tingqiao@123

# 资源共享

权限模块（菜单）



