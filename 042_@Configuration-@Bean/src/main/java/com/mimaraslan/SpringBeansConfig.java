package com.mimaraslan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration														
public class SpringBeansConfig {

	@Bean
    public Sehir getSehir() {
		Sehir sehir= new Sehir();
		sehir.setSehirAdi("Malatya");
		sehir.setPlakaNo(44);
        return sehir;
    }
	
/*	
	<bean id="sehir" class="com.mimaraslan.Sehir">
	   <property name="sehirAdi" value="Malatya"/>
	   <property name="plakaNo" value="44"/>
	</bean>
*/

	@Bean													
	public Ogrenci getStudent(){
		Ogrenci ogrenci=new Ogrenci();
		ogrenci.setSehir(getSehir());
		return ogrenci;
	}
	
/*
	<bean id="ogrenci" class="com.mimaraslan.Ogrenci">
		<property name="sehir">
			  <ref bean=" sehir" />
		</property>
	</bean>
*/
}












