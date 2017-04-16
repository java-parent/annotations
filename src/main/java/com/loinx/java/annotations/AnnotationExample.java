/**
 * 
 */
package com.loinx.java.annotations;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author loinx
 *
 */
public class AnnotationExample {
	public static void main(String[] args) {

	}

	@Override
	@MethodInfo(author = "LoiNX", comments = "Main method", date = "April 16 2017", revision = 1)
	public String toString() {
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method", date = "April 16 2017")
	public static void oldMethod() {
		System.out.println("old method, don't use it.");
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@MethodInfo(author = "LoiNX", comments = "Main method", date = "April 16 2017", revision = 10)
	public static void genericsTest() throws FileNotFoundException {
		List<String> l = new ArrayList<>();
		l.add("abc");
		oldMethod();
	}
}
