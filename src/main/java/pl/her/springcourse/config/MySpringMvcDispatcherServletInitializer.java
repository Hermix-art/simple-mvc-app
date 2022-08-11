package pl.her.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends
    AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;//don't use this method
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{SpringConfig.class}; // tell where configuration is
  }

  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"}; //all requests go to dispatcher servlet
  }
}
