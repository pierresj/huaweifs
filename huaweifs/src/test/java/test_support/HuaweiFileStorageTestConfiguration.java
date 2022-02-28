package test_support;

import io.github.pierresj.huaweifs.HuaweiFileStorageConfiguration;
import io.jmix.core.annotation.JmixModule;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/test_support/test-app.properties")
@PropertySource(value = "classpath:/test_support/test-secrets.properties",ignoreResourceNotFound = true)
@JmixModule(dependsOn = HuaweiFileStorageConfiguration.class)
public class HuaweiFileStorageTestConfiguration {
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager();
    }
}
