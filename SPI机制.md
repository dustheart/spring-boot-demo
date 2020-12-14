## SPI机制
Service provider interface
满足以下条件
- 需要在classpath目录下创建一个 META-INF/services
- 在该目录下创建一个 扩展点的全路径名
    - 文件中填写这个扩展点的实现
    - 文件编码格式UTF-8
- ServiceLoader去进行加载