/**
 * Copyright 2005-2015 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.obsidiantoaster.generator.ui;

import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import io.vertx.forge.project.VertxProjectType;
import org.jboss.forge.addon.projects.ProjectType;
import org.jboss.forge.addon.springboot.project.SpringBootProjectType;
import org.jboss.forge.addon.swarm.project.WildFlySwarmProjectType;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public class ObsidianInitializer
{
   @Produces
   @ApplicationScoped
   public List<ProjectType> getSupportedProjectTypes(
            SpringBootProjectType springBoot,
            WildFlySwarmProjectType wildFlySwarm,
            VertxProjectType vertx)
   {
      return Arrays.asList(springBoot, wildFlySwarm, vertx);
   }
}
