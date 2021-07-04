package testConnection;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
class SpringJobBeanFactory implements ApplicationContextAware {


    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringJobBeanFactory.applicationContext=applicationContext;

    }
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) throws BeansException {
        if (applicationContext == null){
            return null;
        }
        return (T)applicationContext.getBean(name);
    }

    public static <T> T getBean(Class<T>  name) throws BeansException {
        if (applicationContext == null){
            return null;
        }
        return applicationContext.getBean(name);
    }
}

 class Test {

    private static Logger _log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        _log.info(">>>>> isp-service-ipran 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:spring/spring-mybatis.xml");
        _log.info(">>>>> isp-serwenvice-ipran 启动完成 <<<<<");
        //获取全部bean组件
        String[] beanDefinitionNames = SpringJobBeanFactory.getApplicationContext().getBeanDefinitionNames();

        for(String bean:beanDefinitionNames){
            System.out.println(bean);
        }
    }
}
