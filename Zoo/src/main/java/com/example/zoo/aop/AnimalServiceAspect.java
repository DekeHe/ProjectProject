package com.example.zoo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnimalServiceAspect
{
    //member variable
    private Logger logger= LoggerFactory.getLogger("AnimalServiceAspect");
    @Pointcut(value="execution(* com.example.zoo.service.AnimalService.*(..))") public void p(){}

    @Before(value="p()") public void a(){logger.info("a");}
    @After(value="p()")public void b(){logger.info("b");}
}