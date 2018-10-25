package me.sumithpuri.github.tintin.rules.data.loader;

import java.util.Date;

import me.sumithpuri.github.tintin.rules.engine.SampleRulesEngine;
import me.sumithpuri.github.tintin.rules.vo.SampleEvent;

import static me.sumithpuri.github.tintin.rules.data.SampleDataforDataLoader.*;

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
public class SampleDataLoaderThread extends Thread {

	private int usecase;

	public SampleDataLoaderThread() {

	}

	public SampleDataLoaderThread(int usecase) {
		this.usecase = usecase;
	}

	public static synchronized SampleEvent generateDataforUseCases(SampleEvent DataM) {
		int rand = 0;

		// 1.Setting event_ID -> unique,integer
		DataM.setEventId(++event_id);
		DataM.setEventSourceTime(new java.util.Date().getTime());
		DataM.setEventDestinationTimestamp(new Date().getTime());

		// 3.setting eventDesc
		rand = 0 + (int) (Math.random() * (eventDesc.length - 1));
		DataM.setEventDescription(eventDesc[rand]);

		if (event_id % 25 == 0) {

			injectPositiveCase(DataM);
		}

		else {

			// 2.Setting eventType ->from a list random events
			rand = 0 + (int) (Math.random() * (eventTypes.length - 1));
			DataM.setEventType(eventTypes[rand]);

			// 4.Setting eventSrcIP
			rand = 0 + (int) (Math.random() * (eventSrcIP.length - 1));
			DataM.setEventSourceIp(eventSrcIP[rand]);

			// 5.Setting eventDestIP
			rand = 0 + (int) (Math.random() * (eventDestIP.length - 1));
			DataM.setEventDestinationIp(eventDestIP[rand]);

			// 6.setting eventSrcPort
			rand = 0 + (int) (Math.random() * (eventSrcPort.length - 1));
			DataM.setEventSourcePort(eventSrcPort[rand]);

			// 7.setting eventDstnPort
			rand = 0 + (int) (Math.random() * (eventDstnPort.length - 1));
			DataM.setEventDestinationPort(eventDstnPort[rand]);
		}

		setCommonDataFields(DataM);
		return DataM;
	}

	private static void injectPositiveCase(SampleEvent DataM) {
		// use-case 01
		DataM.setEventSourceIp("216.39.58.18");
		DataM.setEventDestinationIp("192.22.23.121");
		DataM.setEventSourcePort("8080");
		DataM.setEventDestinationPort("8080");
		DataM.setEventType(eventTypes[2]);
	}

	private static void setCommonDataFields(SampleEvent DataM) {
		int rand;
		// 8.setting countries
		rand = 0 + (int) (Math.random() * (countries.length - 1));
		DataM.setEventSourceCountry(countries[rand]);

		// 9.setting countries
		rand = 0 + (int) (Math.random() * (countries.length - 1));
		DataM.setEventDestinationCountry(countries[rand]);

		// 10.SettingEventSourceuserName
		rand = 0 + (int) (Math.random() * (userName.length - 1));
		DataM.setEventSourceUsername(userName[rand]);

		// 11.Setting EventDestinationUsername
		rand = 0 + (int) (Math.random() * (userName.length - 1));
		DataM.setEventDestinationUsername(userName[rand]);

		// 12.Setting Source and Destn timeStamp
		java.util.Date date = new java.util.Date();
		DataM.setEventSourceTime(date.getTime());
		DataM.setEventDestinationTimestamp(date.getTime());

		// 13.Setting remarks
		DataM.setEventRemarks("Victory to ISIS");
	}

	public void run() {

		while (true) {
			try {

				// ~1200 records per minute
				for (int i = 0; i <= 100; i++) {
					SampleEvent DataM1 = new SampleEvent();
					DataM1 = generateDataforUseCases(DataM1);
					SampleRulesEngine sampleRE = SampleRulesEngine.getInstance();
					sampleRE.execute(DataM1);

				}
				System.out.println("Data Loader is Pausing for 5 Seconds...");
				Thread.sleep(5000);
			} catch (Exception e) {

			}
		}
	}
}
