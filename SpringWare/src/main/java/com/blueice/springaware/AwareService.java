package com.blueice.springaware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/31.
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;
    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+ beanName);
        Resource resource = this.loader.getResource("classpath:test.txt");
        try {
            System.out.println("Resource加载的内容是:"+ IOUtils.toString(resource.getInputStream()));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
