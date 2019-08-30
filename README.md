# springboot-h2-test-demo
springboot使用h2内存数据库单元测试范例

#背景
单元测试的DAO层测试有两种常见的方案

- 基于H2这种内存数据库的单元测试。
- 是基于测试数据库配置自动回滚。

但是很多人第一次用内存数据库参考各种配置比较麻烦，在此给出一个简单的范例，大家可以轻松移植到自己的项目中。

#测试
用法参考 h2demo.mapper.UserInfoMapperTest
本项目中本地测试时设置项目环境为： test

环境变量 spring.profiles.active=test