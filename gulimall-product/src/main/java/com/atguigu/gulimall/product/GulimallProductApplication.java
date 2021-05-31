package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  1. 整合MyBatis-plus
 *      1> 导入依赖
 *          <dependency>
 *            <groupId>com.baomidou</groupId>
 *            <artifactId>mybatis-plus-boot-starter</artifactId>
 *            <version>3.3.1</version>
 *           </dependency>
 *       2> 配置
 *          1、配置数据源
 *              1. 数据库驱动
 *              2. application.yml 中配置数据源
 *          2、配置mybatis-plus 相关信息
 *              1. 使用@MapperScan("com.atguigu.gulimall.product.dao")
 *              2. 告诉mybatis-plus mapper映射文件的位置
 *
 */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
