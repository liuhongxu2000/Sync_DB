注解方式设置定时任务
在启动类上添加注解 @EnableScheduling
在需要定时执行的方法上添加注解 @Scheduled(cron ="*/6 * * * * ?")

若依框架主从库数据源配置
主库位置：com/ruoyi/common/datasource/annotation/Master.java
从库位置：com/ruoyi/common/datasource/annotation/Slave.java

在从库的类上添加注解
@DS("slave")

mybatis-plus 依赖
<!--        Mybatis-plus-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.3</version>
        </dependency>

