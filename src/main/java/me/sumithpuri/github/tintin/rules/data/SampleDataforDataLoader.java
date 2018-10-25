package me.sumithpuri.github.tintin.rules.data;

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
public class SampleDataforDataLoader {

	public static int event_id;
	public static int rand_x = 0;

	public static int rand_pt;

	public static String eventTypes[] = { "", "failed login attempt", "port and ip scan", "download log file",
			"attempt to access", "attempt to attack", "port access", "download log file2", "attempt to access2",
			"attempt to attack2", "", "failed login attempt", "port and ip scan", "download log file",
			"attempt to access", "attempt to attack", "port access", "download log file2", "attempt to access2",
			"attempt to attack2" };

	public static String eventDesc[] = { "eventDescription1", "eventDescription2", "eventDescription3",
			"eventDescription4", "eventDescription5", "eventDescription6", "eventDescription7", "eventDescription8",
			"eventDescription9", "eventDescription10", "eventDescription11", "eventDescription12", "eventDescription13",
			"eventDescription14", "eventDescription15", "eventDescription16", "eventDescription17",
			"eventDescription18", "eventDescription19", "eventDescription20" };

	public static String eventSrcIP[] = { "192.168.1.100", "192.168.1.101", "192.168.1.102", "192.168.1.103",
			"192.168.1.104", "192.168.1.105", "192.168.1.106", "192.168.1.107", "192.168.1.108", "192.168.1.109",
			"192.168.1.110", "192.168.1.111", "192.168.1.112", "192.168.1.113", "192.168.1.114", "192.168.1.115",
			"192.168.1.116", "192.168.1.117", "192.168.1.118", "192.168.1.119", "192.168.1.120" };

	public static String eventDestIP[] = { "192.168.1.201", "192.168.1.202", "192.168.1.203", "192.168.1.204",
			"192.168.1.205", "192.168.1.206", "192.168.1.207", "192.168.1.208", "192.168.1.209", "192.168.1.210",
			"192.168.1.211", "192.168.1.212", "192.168.1.213", "192.168.1.214", "192.168.1.215", "192.168.1.216",
			"192.168.1.217", "192.168.1.218", "192.168.1.219", "192.168.1.220", "192.168.1.221" };

	public static String eventSrcPort[] = { "4040", "4041", "4042", "4043", "4044", "4045", "4046", "4047", "4048",
			"4049", "4050", "4051", "4052", "4053", "4054", "4055", "4056", "4057", "4058", "4059", "4060" };

	public static String eventDstnPort[] = { "8041", "8042", "8043", "8044", "8045", "8046", "8047", "8048", "8049",
			"8050", "8051", "8052", "8053", "8054", "8055", "8056", "8057", "8058", "8059", "8060" };

	public static String countries[] = { "Afghanistan", "Armenia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan",
			"Brunei", "Cambodia", "China", "Georgia", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan",
			"Kazakhstan", "Kuwait", "Kyrgyzstan" };

	public static String userName[] = { "Mireya Duffy", "Amanda Pintor", "Nguyet Swallow", "Hattie Eckenrode",
			"Charis Grimshaw", "Alycia Luker", "Arnetta Ash", "Edna Kittredge", "Araceli Kyle", "Sylvester Vroman",
			"Geralyn Manger", "Dorene Pulaski", "Ginette Farrish", "France Flecha", "Paulene Edens", "Lashawna Kuss",
			"Vicente Robertson", "Paige Marrs", "Nicholas Pierson", "Zella Drapeau" };
}
