package pem.demo;

import java.util.Scanner;
import java.util.Arrays;

public class demofirst {
    public static void main(String args[]) {

        //面向对象的定义方式
        int[] arr_3 = new int[6];//这是不赋值的情况
        int[] arr_4 = new int[]{1, 2, 3, 4, 5, 6};//这是赋值的情况

        int[] arr_5 = Arrays.copyOf(arr_4,arr_4.length);
        System.out.printf("arr_4原始数组:\n");
        for (int i = 0; i < arr_4.length; i++) {
            System.out.printf("arr_4[i]=%d \n", arr_4[i]);
        }
        arr_5[0] = 520;
        System.out.printf("修改后的arr_4数组:\n");
        for (int i = 0; i < arr_4.length; i++) {
            System.out.printf("arr_4[i]=%d \n", arr_4[i]);
        }
    }
}

//    //暂时不用的，看到输入输出的时候可以用一波
//    Scanner scanner_in = new Scanner(System.in);
//    int number = (int) (Math.random()*100);
//    int guess;
//
//        do {
//                System.out.printf("猜数字（0~9）：%d",number);
//                guess = scanner_in.nextInt();
//                }while (number!=guess);
//
//                System.out.printf("Right");




//-----------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------//
//        //面向对象的定义方式
//        int[] arr_4 = new int[]{1, 2, 3, 4, 5, 6};//这是赋值的情况
//
//        int[] arr_5 = arr_4;
////        for (int i = 0; i < arr_4.length; i++) {
////            arr_5[i] = arr_4[i];
////        }
//        System.out.printf("arr_4原始数组:\n");
//        for (int i = 0; i < arr_4.length; i++) {
//            System.out.printf("arr_4[i]=%d \n", arr_4[i]);
//        }
//        arr_5[0] = 520;
//        System.out.printf("修改后的arr_4数组:\n");
//        for (int i = 0; i < arr_4.length; i++) {
//            System.out.printf("arr_4[i]=%d \n", arr_4[i]);
//        }
//-----------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------//
//class Season {
//    String color;
//    char abbreviation;
//
//    //添加构造函数后，就无需在Main函数里面实例化再赋值，可以直接调用构造函数完成【一键实例+赋值】
//    Season(String color,char abbreviation)
//    {
//        this.color=color;
//        this.abbreviation=abbreviation;
//    }
//}
//
//public class demofirst {
//    public static void main(String args[]) {
//
//        //比上面省略很多，所以一定要用构造函数
//        Season sun=new Season("red",'R');
//        Season spring=new Season("green",'G');
//
//        //输出测试
//        System.out.printf("Sun(%s,%c)\n",sun.color,sun.abbreviation);
//        System.out.printf("Spring(%s,%c)",spring.color,spring.abbreviation);
//
//    }
//}
//-----------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------//
//        //这两句话主要是为了实例化上面已经定义好的Clothes类
//        Season sun = new Season();
//        Season spring = new Season();
//
//        //对实例化后的变量的属性赋值
//        sun.color = "red";
//        sun.abbreviation = 'R';
//        spring.color="green";
//        spring.abbreviation='G';
//
//        //输出测试
//        System.out.printf("Sun(%s,%c)\n",sun.color,sun.abbreviation);
//        System.out.printf("Spring(%s,%c)",spring.color,spring.abbreviation);
//-----------------------------------------------------------------------------------//
//-----------------------------------------------------------------------------------//


//        System.out.println("请输入三个数：");
//
//        //【空格或换行】输入数组
//        Scanner in = new Scanner(System.in);
//        int[] b=new int[3];
//        for(int i=0;i<b.length;i++)
//            b[i]=in.nextInt();
//
//        for(int i=0;i<b.length;i++)
//            System.out.println(b[i]);

//    }
// }

