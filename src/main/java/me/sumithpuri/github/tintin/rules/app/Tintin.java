package me.sumithpuri.github.tintin.rules.app;

import java.util.Scanner;

import me.sumithpuri.github.tintin.rules.data.loader.SampleDataLoaderThread;


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
public class Tintin {

	public static void main(String[] args) {

		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Tintin");
		System.out.println("Project Description   Drools Expert (Rules Engine) Demo Code");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/ebAzZr");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		System.out.println();
		
		SampleDataLoaderThread dataLoader = new SampleDataLoaderThread();
		
		// in a real-world production environment, the rules engine will be constantly running
		// either standalone or in enteprise mode - data loader will mostly be run as a multi-
		// threaded application - we have modeled this demo in the same way,  but note that we
		// are not starting a thread below - for demo, we invoke run() directly to load data
		dataLoader.run();
	}
}