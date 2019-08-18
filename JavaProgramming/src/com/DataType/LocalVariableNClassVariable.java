package com.DataType;

public class LocalVariableNClassVariable {

	// Global (or) Class Variable initialization is optional. If it is not initialized it gives as Default value
	static byte class_byte_var;
	static short class_short_var;
	static int class_int_var;
	static long class_long_var;
	static float class_float_var;
	static double class_dob_var;
	static char class_char_var;
	static boolean class_bool_var;
	static String class_str_var;
	
	public static void main(String[] args) {
		// Local Variable have to initialize before print
		byte local_byte_var = 2;
		short local_short_var = 7;
		int local_int_var = 10;
		long local_long_var = 23456799;
		float local_float_var = 2.3f;
		double local_double_var = 2345555.9875566;
		boolean local_bool_var = true;
		char local_char_var = 'a';
		String local_Str_Var = "Mrutyunjay";
		
		System.out.println(local_byte_var);
		System.out.println(local_short_var);
		System.out.println(local_int_var);
		System.out.println(local_long_var);
		System.out.println(local_float_var);
		System.out.println(local_double_var);
		System.out.println(local_bool_var);
		System.out.println(local_char_var);
		System.out.println(local_Str_Var);
		
		System.out.println("===============================================================================");
		
		// Global (or) Class Vaariable
		System.out.println(class_byte_var);
		System.out.println(class_short_var);
		System.out.println(class_int_var);
		System.out.println(class_long_var);
		System.out.println(class_float_var);
		System.out.println(class_dob_var);
		System.out.println(class_char_var);
		System.out.println(class_bool_var);
		System.out.println(class_str_var);
	}

}
