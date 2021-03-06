

/*
 * aFlux: JVM based IoT Mashup Tool
 * Copyright 2019 Tanmaya Mahapatra
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.tum.in.aflux.component.control;


import de.tum.in.aflux.component.control.actor.RunNTimesToolActor;
import de.tum.in.aflux.tools.core.AbstractMainExecutor;
import de.tum.in.aflux.tools.core.NodeLaunchType;
import de.tum.in.aflux.tools.core.PropertyInputType;
import de.tum.in.aflux.tools.core.ToolProperty;

public class RunNTimesTool extends AbstractMainExecutor {
	public static final String NAME="Run n times";
	static public ToolProperty[] configurationProperties={
				new ToolProperty(ControlToolConstants.TIMES,"1",PropertyInputType.TEXT,null,"Number of times that will run the following nodes, 0 means forever","",false),
				new ToolProperty(ControlToolConstants.DELAY,"1000",PropertyInputType.TEXT,null,"Time between each call in milliseconds","",false),
				new ToolProperty(ControlToolConstants.DATA,"INDEX",PropertyInputType.TEXT,null,"Data to be sent: Could be INDEX (id of the repetition as String object) / INPUT (resends the received data)","",false),
				};

	public RunNTimesTool() {
		super(NAME, 
				RunNTimesToolActor.class.getCanonicalName(), 
				RunNTimesTool.class.getName(), 
				1, 1, NodeLaunchType.LAUNCHED_BY_SIGNAL,
				true, 
				configurationProperties);
		setColor("#EF9A9A");
	}
}







