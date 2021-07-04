package testConnection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import yin.entity.Account;
import yin.service.AccountService;
import yin.service.impl.AccountServiceImpl;
import yin.service.impl.StationServiceImpl;

import javax.annotation.Resource;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class testConnection {



    @Test
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
        AccountServiceImpl service = ac.getBean(AccountServiceImpl.class);
        System.out.println("-----------------------");
        Account account = new Account();
        account.setUsername("test");
        account.setPassword("s");
        service.update(account);
        System.out.println(service.queryById("test"));
    }
}
