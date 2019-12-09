package com.yuan.service.impl;

import com.yuan.dao.AccountDao;
import com.yuan.dao.impl.AccountDaoImpl;
import com.yuan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 账户的业务层实现类
 * 曾经XML的配置：
 * <bean id="accountService" class="com.yuan.service.impl.AccountServiceImpl"
 *       scope=""  init-method="" destroy-method="" >
 *       <property name="" value=""/ref=""></property>
 * </bean>
 *
 * 注解：
 * 用于创建对象的
 *      和在xml文件中编写一个<bean>标签实现的功能是一样的
 *      Component:
 *          作用：用于把当前类对象存入spring容器中
 *          属性：value：用于指定bean的id，当我们不写时，它的默认值是当前类名，且首字母小写
 *          （注解只有一个属性时属性名可省略）
 *      Controller：一般用在表现层
 *      Service：一般用在业务层
 *      Repository：一般用在持久层
 *      以上三个注解作用和属性和Component一模一样
 *      它们是spring框架为我们提供的明确的三层使用的注解，使我们的三层对象更加清晰
 *
 *
 * 用于注入数据的
 *      和在xml文件中的bean标签中写一个property标签的作用是一样的
 *      AutoWired：
 *          作用：自动按照类型注入，只要容器中有唯一的一个bean对象类型和要注入的变量类型相匹配，就可以注入成功
 *          出现位置：可以是变量上，也可以是方法上
 *          细节：在使用注解注入时，set方法就不是必须的了
 *      Qualifier:
 *          作用：在按照类中注入的基础上再按照名称注入，他在给类成员注入时不能单独使用，但是在给方法参数注入时可以
 *          属性：
 *              value用于指定注入bean的id
 *      Resource：
 *          作用：直接按照bean的id注入，可以独立使用
 *          属性：
 *              name用于指定bean的id
 *      以上三个注解都只能注入其他bean类型的数据，而不能注入基本类型和String类型
 *      另外，集合类型的注入只能通过xml来实现
 *
 *      Value
 *          作用：用于注入基本类型和String类型的数据
 *          属性：
 *              value：用于指定数据的值，它可以使用spring中的SpEL（也就是spring中的el表达式）
 *                   SpEL的写法：${表达式}
 *
 *
 * 用于改变作用范围的
 *      和在xml文件中的bean标签中使用scope属性的作用是一样的
 *      scope：
 *          作用：用于指定bean的作用范围
 *          属性：
 *              value：指定范围的取值，常用取值：singleton和prototype（单例和多例）
 *
 * 和生命周期相关的
 *      和在xml文件中的bean标签中使用init-method属性和destroy-method的作用是一样的
 *      PreDestroy：
 *          用于指定销毁方法
 *      PostConstruct：
 *          用于指定初始化方法
 */
@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao ad=null;

    public void saveAccount() {
        ad.saveAccount();
    }
}
