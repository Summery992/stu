package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication 
//背后创建spring上下文ServiceContext(req,res)
//进行mapper接口扫描，并创建实现类
@MapperScan("cn.tedu.ssm.mapper")
public class RunAppSSM {
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppSSM.class, args);
	}
}
