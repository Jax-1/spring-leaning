package com.spring.leaning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 自定义Spring Security
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws  Exception{
        auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password("123456").roles("USER");
        auth.inMemoryAuthentication().withUser("dba").password("123456").roles("DBA");

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//                .antMatchers("/admin/**").access("hasAnyRole('ADMIN')")
//                .antMatchers("/dba/**").access("hasAnyRole('ROLE_ADMIN') or hasAnyRole('ROLE_DBA')")
//                .and()
//                .formLogin().loginPage("/index?module=User&action=login")
//                .defaultSuccessUrl("/index?module=home&action=index").failureUrl("/index?module=User&action=login&error=1")
//                .usernameParameter("user-name").passwordParameter("pass-word")
//                .and()
//                .logout().logoutSuccessUrl("/index?module=User&action=loginOut")
//                .and()
//                .csrf();
        http.authorizeRequests()
                .antMatchers("/admin/**").access("hasAnyRole('ADMIN')")
                .antMatchers("/dba/**").access("hasAnyRole('ROLE_ADMIN') or hasAnyRole('ROLE_DBA')")
                .and()
                .formLogin().loginPage("/User/login")
                .defaultSuccessUrl("/index").failureUrl("/User/login?error=1")
                .usernameParameter("user-name").passwordParameter("pass-word")
                .and()
                .logout().logoutSuccessUrl("/loginOut")
                .and()
                .csrf();
    }
}
