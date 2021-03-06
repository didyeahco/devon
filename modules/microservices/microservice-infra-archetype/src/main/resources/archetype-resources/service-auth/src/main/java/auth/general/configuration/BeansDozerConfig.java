/*******************************************************************************
 * Copyright 2015-2018 Capgemini SE.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.auth.general.configuration;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Java bean configuration for Dozer
 *
 */
@Configuration
@ComponentScan(basePackages = { "io.oasp.module.beanmapping" })
public class BeansDozerConfig {

  private static final String DOZER_MAPPING_XML = "config/app/common/dozer-mapping.xml";

  /**
   * @return the {@link DozerBeanMapper}.
   */
  @Bean
  public Mapper getDozer() {

    List<String> beanMappings = new ArrayList<>();
    beanMappings.add(DOZER_MAPPING_XML);
    return new DozerBeanMapper(beanMappings);

  }

}
