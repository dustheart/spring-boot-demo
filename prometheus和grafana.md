# prometheus

安装prometheus：
brew install prometheus

默认安装路径：
/usr/local/Cellar/prometheus/2.18.1

默认配置文件：
/usr/local/etc/prometheus.yml

修改配置文件：
```yaml
scrape_configs:
  - job_name: "spring-boot-demo"
    metrics_path: "/actuator/prometheus"
    scrape_interval: 5s
    static_configs:
    - targets: ["localhost:8080"]
```
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/prometheus01.png)

启动：
prometheus --config.file=/usr/local/etc/prometheus.yml
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/prometheus02.png)

访问：
http://localhost:9090/graph
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/prometheus03.png)

# grafana
