package com.core;

public class DataType {
	public static void main(String[] args) {

        byte A = 124;
        // 1 Byte ... stores from -128 to 127

        short B = 3452;
        // 2 bytes ... stores from -32,768 to 32767

        int C = 2456;
        // 4 Bytes ... stores from -2,147,483,648 to 2,147,483,647

        long D = 164815756L;
        // 8 Bytes ... stores from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float E = 7.99f;
        // 4 Bytes ... Sufficient for storing 6 to 7 decimal digits

        double F = 12.495;
        // 8 Bytes ... Sufficient for storing 15 to 16 decimal digits

        char G = 'A';
        // 2 Bytes ... Stores a single character/letter or ASCII values

        boolean H = true;
        // 1 bit ... 	Stores true or false values

        System.out.println("Data Types :");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(H);

    }

}
