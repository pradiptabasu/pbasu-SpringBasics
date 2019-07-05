package com.pbasu.simple.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pbasu.simple.car.FamilyCar;
import com.pbasu.simple.car.FourCylinderEngine;
import com.pbasu.simple.car.SixCylinderEngine;
import com.pbasu.simple.car.WeekendCar;

@Configuration
@ComponentScan({"com.pbasu.simple.car"})
public class AppConfig {

	/*
	 * Commented as using ComponentScan i.e. Component Scanner for implicit Bean registration
	 * Have setup FourCylinderEngine & SixCylinderEngine to use @Component annotation
	 * 
	 * @Bean(name="fourCyl") public FourCylinderEngine getFourCyl() { return new
	 * FourCylinderEngine(); }
	 * 
	 * @Bean(name="sixCyl") public SixCylinderEngine getSixCyl() { return new
	 * SixCylinderEngine(); }
	 */
	
	/*
	 * Commented as using ComponentScan i.e. Component Scanner for implicit Bean registration
	 * So the setter injection mehtods are not available. Instead in next section we are using 
	 * AutoWired with Qualifier 
	 * and
	 * AutoWired with Setter Injection 
	 * to create the beans using default constructor
	 * 
	 * // setter injection
	 * 
	 * @Bean(name = "altFamilyCar") public FamilyCar getFamilyCar() { FamilyCar
	 * familyCar = new FamilyCar(); familyCar.setEngineType(getFourCyl()); return
	 * familyCar; }
	 * 
	 * // constructor injection
	 * 
	 * @Bean(name = "altWeekendCar") public WeekendCar getWeekendCar() { WeekendCar
	 * weekendCar = new WeekendCar(getSixCyl()); return weekendCar; }
	 */
	
	@Bean(name="altAutoWiredFamilyCar")
	public FamilyCar altAutoWiredFamilyCar()
	{
		FamilyCar familyCar = new FamilyCar();
		return familyCar;
	}
	
	@Bean(name="altWeekendCarAutoWired")
	public WeekendCar altWeekendCarAutoWired()
	{
		WeekendCar weekendCar = new WeekendCar();
		return weekendCar;
	}
}
