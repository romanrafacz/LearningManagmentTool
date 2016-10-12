package com.lms.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
//@EnableJpaRepositories
@EnableTransactionManagement
public class DataSourceConfiguration {
	
	@Bean
	public DataSource dataSource(){
		HikariConfig hikariConfig = new HikariConfig();
		//Turned this off, then started working
		hikariConfig.setDriverClassName("org.postgresql.Driver");
		hikariConfig.setJdbcUrl("jdbc:postgresql://192.168.100.128:5432/avnet2");
		hikariConfig.setUsername("roman");
		hikariConfig.setPassword("snickers");
		
		hikariConfig.setMaximumPoolSize(5);
		hikariConfig.setConnectionTestQuery("SELECT 1");
		hikariConfig.setPoolName("springHikariCP");
		    

		hikariConfig.addDataSourceProperty("dataSource.cachePrepStmts", "true");
		hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSize", "250");
		hikariConfig.addDataSourceProperty("dataSource.prepStmtCacheSqlLimit", "2048");
		hikariConfig.addDataSourceProperty("dataSource.useServerPrepStmts", "true");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		return dataSource;
	}
	
//	@Bean
//	public EntityManagerFactory entityManagerFactory() {
//
//	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//	    vendorAdapter.setGenerateDdl(true);
//
//	    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//	    factory.setJpaVendorAdapter(vendorAdapter);
//	    factory.setPackagesToScan("com.lms.domain");
//	    factory.setDataSource(dataSource());
//	    factory.afterPropertiesSet();
//
//	    return factory.getObject();
//	  }
//
//	  @Bean
//	  public PlatformTransactionManager transactionManager() {
//
//	    JpaTransactionManager txManager = new JpaTransactionManager();
//	    txManager.setEntityManagerFactory(entityManagerFactory());
//	    return txManager;
//	  }

}
