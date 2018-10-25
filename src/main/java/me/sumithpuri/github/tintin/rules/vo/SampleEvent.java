package me.sumithpuri.github.tintin.rules.vo;

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
public class SampleEvent {
	
	private int eventId;
	private String eventType;
	private String eventDescription;
	private String eventSourceIp;
	private String eventDestinationIp;
	private String eventSourcePort;
	private String eventDestinationPort;
	private String eventSourceCountry;
	private String eventDestinationCountry;
	private String eventSourceUsername;
	private String eventDestinationUsername;
	private String eventRemarks;
	private long eventSourceTime;
	private long eventDestinationTimestamp;
	
	public int getEventId() {
		return eventId;
	}
	
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public String getEventType() {
		return eventType;
	}
	
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public String getEventDescription() {
		return eventDescription;
	}
	
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public String getEventSourceIp() {
		return eventSourceIp;
	}
	
	public void setEventSourceIp(String eventSourceIp) {
		this.eventSourceIp = eventSourceIp;
	}
	
	public String getEventDestinationIp() {
		return eventDestinationIp;
	}
	
	public void setEventDestinationIp(String eventDestinationIp) {
		this.eventDestinationIp = eventDestinationIp;
	}
	
	public String getEventSourcePort() {
		return eventSourcePort;
	}
	
	public void setEventSourcePort(String eventSourcePort) {
		this.eventSourcePort = eventSourcePort;
	}
	
	public String getEventDestinationPort() {
		return eventDestinationPort;
	}
	
	public void setEventDestinationPort(String eventDestinationPort) {
		this.eventDestinationPort = eventDestinationPort;
	}
	
	public String getEventSourceCountry() {
		return eventSourceCountry;
	}
	
	public void setEventSourceCountry(String eventSourceCountry) {
		this.eventSourceCountry = eventSourceCountry;
	}
	
	public String getEventDestinationCountry() {
		return eventDestinationCountry;
	}
	
	public void setEventDestinationCountry(String eventDestinationCountry) {
		this.eventDestinationCountry = eventDestinationCountry;
	}
	
	public String getEventSourceUsername() {
		return eventSourceUsername;
	}
	
	public void setEventSourceUsername(String eventSourceUsername) {
		this.eventSourceUsername = eventSourceUsername;
	}
	
	public String getEventDestinationUsername() {
		return eventDestinationUsername;
	}
	
	public void setEventDestinationUsername(String eventDestinationUsername) {
		this.eventDestinationUsername = eventDestinationUsername;
	}
	
	public String getEventRemarks() {
		return eventRemarks;
	}
	
	public void setEventRemarks(String eventRemarks) {
		this.eventRemarks = eventRemarks;
	}
	
	public long getEventSourceTime() {
		return eventSourceTime;
	}
	
	public void setEventSourceTime(long eventSourceTime) {
		this.eventSourceTime = eventSourceTime;
	}
	
	public long getEventDestinationTimestamp() {
		return eventDestinationTimestamp;
	}

	public void setEventDestinationTimestamp(long eventDestinationTimestamp) {
		this.eventDestinationTimestamp = eventDestinationTimestamp;
	}
}
