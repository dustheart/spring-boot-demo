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

启动和关闭：
// start
prometheus --config.file=/usr/local/etc/prometheus.yml
// stop
control + c

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/prometheus02.png)

访问：
http://localhost:9090/graph
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/prometheus03.png)

# grafana
安装grafana：
brew install grafana

默认安装路径：
/usr/local/Cellar/grafana/7.0.0

启动和关闭：
// start
grafana-server --config=/usr/local/etc/grafana/grafana.ini --homepath /usr/local/share/grafana cfg:default.paths.logs=/usr/local/var/log/grafana cfg:default.paths.data=/usr/local/var/lib/grafana cfg:default.paths.plugins=/usr/local/var/lib/grafana/plugins
// stop
control + c

// start
brew services start grafana
// stop
brew services stop grafana

配置数据源：
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana01.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana02.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana03.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana04.png)

自定义dashboard：
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana05.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana06.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana07.png)


导入dashboard：
https://grafana.com/grafana/dashboards
![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana08.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana09.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana10.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana11.png)

![image](https://github.com/dustheart/spring-boot-demo/blob/redisson-spring-boot-starter/images/grafana12.png)
