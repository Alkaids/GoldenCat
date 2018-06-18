## GC后端开发指南
### 所需环境
* jdk1.8
* lombok插件
* ide推荐使用idea
* redis
### 项目搭建
```
git clone https://github.com/Alkaids/GoldenCat.git
```
1. 然后在MySQL数据库，执行`resources`下的`gc.sql`初始化相关脚本。
2. 启动redis 客户端，默认是6379端口，或者按你自己的配置。
3. 然后启动项目，run!
### 接口部分
接口使用restful开发规范开发，目前的已经写好的接口放在[RAP][1]里面。
如果没有权限的话，联系[我][2]。
### 接口认证
目前我使用的`OAuth2`+`Spring Security`的方式。
### 异常处理
```
 if(model!=null){
            throw new ServiceException("该邮箱已被注册！");
        }
```
随便throw ServiceException，都可以，系统会自动捕捉你的异常，然后抛出json格式的返回值。
### TODO
1. 我现在把token存数据库的，这样不好，应该放到redis里面
tokenStorge要改下

2. 还有就是clent_id,我为了测试，是直接放到配置文件的
按理说，这个客户端id,应该前端发其请求来获取，然后根据客户端id，和用户名密码，再次获取token
3. 业务逻辑我觉得简单，先不写
### 其他
其他的话，大家看代码吧，有问题直接Q我~~

  [1]: http://rap2.taobao.org/repository/editor?id=16664
  [2]: https://github.com/LeonGravel
