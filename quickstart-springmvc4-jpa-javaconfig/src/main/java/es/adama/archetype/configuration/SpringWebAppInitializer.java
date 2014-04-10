package es.adama.archetype.configuration;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;


import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;




import javax.servlet.ServletRegistration;

import org.h2.server.web.WebServlet;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



/**
 * 
 * @author David Palomar
 * www.adamaconsulting.es
 * Customization example of Spring {@link DispatcherServlet}
 *  <p>
 * We add the {@link Order} annotation so that this is initialized before other
 * {@link WebApplicationInitializer} instances. This ensures the ordering of
 * Spring Security's Filter vs Filters registered in
 * {@link #getServletFilters()} is correct.
 * 
 * 
 *
 */
@Order(1)
public class SpringWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class<?>[] { ApplicationConfig.class,DataBaseConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class<?>[] { WebMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings()
	{
		
		return new String[] { "/" };
	}
	/**
	 * securityFilterChain allows use spring-security framework
	 *  {@link HiddenHttpMethodFilter} allows to use PUT and DELETE methods with standard POST method in a hidden form field
	 */
	 @Override
	    protected Filter[] getServletFilters() {
	        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
	        characterEncodingFilter.setEncoding("UTF-8");
	        characterEncodingFilter.setForceEncoding(true);
	        //for spring-security
	       // DelegatingFilterProxy securityFilterChain = new DelegatingFilterProxy("springSecurityFilterChain");
	        //Instead we could use and external class SecurityWebApplicationInitializer

	        return new Filter[] {characterEncodingFilter, new HiddenHttpMethodFilter()};
	    }

	    @Override
	    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
	        registration.setInitParameter("defaultHtmlEscape", "true");
	        //registration.setInitParameter("spring.profiles.active", "default");
	    }



}
