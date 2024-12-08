package wrapper;


import interface_ex.B;

public class Wrapper02 {

    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("kadir");
        Boolean b3 = Boolean.valueOf("tRue");
        Boolean b4 = Boolean.valueOf("TrUe");
        Boolean b5 = Boolean.valueOf("FalsE");
        System.out.println("----Boolean----");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        //Byte byte1 = new Byte((byte)5); //deprecated
        Byte byte1 = Byte.valueOf((byte) 5);
        Byte byte2 = Byte.valueOf("50");
        System.out.println("----Byte----");
        System.out.println(byte1);
        System.out.println(byte2);

        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = Integer.valueOf("16");
        Integer integer3 = integer1 + integer2;
        int int1 = integer1 + integer2;
        System.out.println("----Integer----");
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println(int1);

        Float float1 = Float.valueOf(4.4F);
        Float float2 = Float.valueOf("12.5");
        Float float3 = Float.valueOf(3);
        Float float4 = float3 + float2;
        float float5 = float3 + float2;
        System.out.println("----Float----");
        System.out.println(float1);
        System.out.println(float2);
        System.out.println(float3);
        System.out.println(float4);
        System.out.println(float5);

        Double double1 = Double.valueOf(3.5);
        Double double2 = Double.valueOf("4");
        Double double3 = Double.valueOf("10.1");
        Double double4 = double2 + double3;
        double double5 = double1 + double3;
        System.out.println("----Double----");
        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(double5);

        Character character1 = Character.valueOf((char) 65);
        Character character2 = Character.valueOf('D');
        System.out.println("---Character---");
        System.out.println(character1);
        System.out.println(character2);
    }
}
