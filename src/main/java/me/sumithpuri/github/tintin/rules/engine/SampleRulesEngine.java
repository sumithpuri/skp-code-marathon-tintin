package me.sumithpuri.github.tintin.rules.engine;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.internal.KnowledgeBaseFactory;

import me.sumithpuri.github.tintin.rules.vo.SampleEvent;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/09/introduction-to-rules-engine-using.html
 * Blog Short URL		https://goo.gl/ebAzZr
 * Package Prefix 		me.sumithpuri.github.tintin
 * Project Codename		tintin
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class SampleRulesEngine {
	
	private static SampleRulesEngine reService = null;
	
	// Drools Expert Runtime Configuration
	private KieServices ks;
	private KieContainer kContainer;
	private KieSession kSession;

	
	public static SampleRulesEngine getInstance() {
		
		if(reService==null) {
			reService = new SampleRulesEngine();
			reService.init();
		}
		return reService;
	}
	
	public void init() {
		try {
	
			System.out.println("Initializing KIE Runtime for Drools Expert...");
			ks = KieServices.Factory.get();
			kContainer = ks.getKieClasspathContainer();
			KieSessionConfiguration sessionConfiguration = KnowledgeBaseFactory.newKnowledgeSessionConfiguration();
			kSession = kContainer.newKieSession("ksession-rules", sessionConfiguration);
			System.out.println("Initialized the KIE Runtime for Drools Expert...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static long prevTime=0, currTime=0;

	public void execute(SampleEvent event) {
	
			System.out.println("Received a Sample Event / Firing the Rules Engine Service...");
			kSession.insert(event);
			kSession.fireAllRules();
			System.out.println("Finished Running through all the the Rules in the Engine...");
	}
}
