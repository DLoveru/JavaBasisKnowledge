package com.dl.javabasis.generics;

/**
 * @author Jalen.Deng
 * @description 使用泛型方法打印不同字符串的元素：
 * @date 2020/11/29 15:46
 **/
public class GenericMethodTest
{
    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main( String args[] )
    {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
    }
}
/**
 * 整型数组元素为:
 * 1 2 3 4 5
 *
 * 双精度型数组元素为:
 * 1.1 2.2 3.3 4.4
 *
 * 字符型数组元素为:
 * H E L L O
 *
 * Process finished with exit code 0
 */
