## SPI机制
Service provider interface
满足以下条件
- 需要在classpath目录下创建一个 META-INF/services
- 在该目录下创建一个 扩展点的全路径名
    - 文件中填写这个扩展点的实现
    - 文件编码格式UTF-8
- ServiceLoader去进行加载
```java
ServiceLoader<DataBaseDriver> serviceLoader = ServiceLoader.load(DataBaseDriver.class);
for (DataBaseDriver dbd : serviceLoader){
    System.out.println(dbd.buildConnect("test"));
}
```

spi机制代码示例

![image](https://github.com/dustheart/spring-boot-demo/blob/main/images/spi/spi-01.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/main/images/spi/spi-02.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/main/images/spi/spi-03.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/main/images/spi/spi-04.png)