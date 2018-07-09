总到来说，Feign的源码实现的过程如下：
首先通过@EnableFeignCleints注解开启FeignCleint
根据Feign的规则实现接口，并加@FeignCleint注解
程序启动后，会进行包扫描，扫描所有的@ FeignCleint的注解的类，并将这些信息注入到ioc容器中。
当接口的方法被调用，通过jdk的代理，来生成具体的RequesTemplate
RequesTemplate在生成Request
Request交给Client去处理，其中Client可以是HttpUrlConnection、HttpClient也可以是Okhttp
最后Client被封装到LoadBalanceClient类，这个类结合类Ribbon做到了负载均衡。


参考资料
https://github.com/OpenFeign/feign
https://blog.de-swaef.eu/the-netflix-stack-using-spring-boot-part-3-feign/

