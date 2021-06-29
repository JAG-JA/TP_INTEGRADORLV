package frgp.utn.edu.ar.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer{

	  //Hago referencia al archivo 
	 @Override
	   protected Class<?>[] getRootConfigClasses() {
	      return new Class[] { HibernateConf.class };
	   }

	 //Configuro referencia de uso de Servlets
	   @Override
	   protected Class<?>[] getServletConfigClasses() {
	      return new Class[] { WebMvcConfig.class };
	   }

	   @Override
	   protected String[] getServletMappings() {
	      return new String[] { "/" };
	   }

}
