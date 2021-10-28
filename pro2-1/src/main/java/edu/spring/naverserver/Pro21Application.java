package edu.spring.naverserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import mybatis.EmpDAO;
import mybatis.EmpMybatisController;

@SpringBootApplication
@ComponentScan
@ComponentScan(basePackageClasses = EmpMybatisController.class)
@MapperScan(basePackageClasses = EmpDAO.class)
public class Pro21Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro21Application.class, args);
		System.out.println("9003 port start");
	}

}
