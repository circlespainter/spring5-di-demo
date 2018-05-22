package guru.springframework

import org.springframework.beans.factory.*
import org.springframework.context.ApplicationContext
import org.springframework.context.ApplicationContextAware
import org.springframework.stereotype.Component

import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@Component
class LifeCycleDemoBean : InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    init {
        println("## I'm in the LifeCycleBean Constructor")
    }

    override fun destroy() {
        println("## The Lifecycle bean has been terminated")
    }

    override fun afterPropertiesSet() {
        println("## The LifeCycleBean has its properties set!")
    }

    override fun setBeanFactory(beanFactory: BeanFactory) {
        println("## Bean Factory has been set")
    }

    override fun setBeanName(name: String) {
        println("## My Bean Name is: $name")
    }

    override fun setApplicationContext(applicationContext: ApplicationContext) {
        println("## Application context has been set")
    }

    @PostConstruct
    fun postConstruct() {
        println("## The Post Construct annotated method has been called")
    }

    @PreDestroy
    fun preDestroy() {
        println("## The Predestroy annotated method has been called")
    }

    fun beforeInit() {
        println("## - Before Init - Called by Bean Post Processor")
    }

    fun afterInit() {
        println("## - After init called by Bean Post Processor")
    }
}
