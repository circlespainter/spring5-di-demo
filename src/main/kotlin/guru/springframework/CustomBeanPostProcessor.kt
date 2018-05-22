package guru.springframework

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Component

@Component
class CustomBeanPostProcessor : BeanPostProcessor {
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any? {
        (bean as? LifeCycleDemoBean)?.beforeInit()

        return bean
    }

    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any? {
        (bean as? LifeCycleDemoBean)?.afterInit()

        return bean
    }
}
