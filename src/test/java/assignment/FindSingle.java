package assignment;

import java.util.Scanner;

public class FindSingle {
    static int[] array = new int[7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Values");
        for(int i=0;i<array.length;i++) {array[i] = sc.nextInt();}
        findSingle();}
    public static void findSingle() {
    int cnt=1;
    for(int i=0;i< array.length;i++) {
        cnt=1;
        for(int j=i+1;j< array.length;j++) {
            if((array[i]==array[j]) &&(array[j]!=-234567)) {
                cnt++;
                array[j] = -234567;
                break;}}
        if((cnt==1) &&(array[i]!=-234567)) {
            System.out.println();
            System.out.println(array[i] + " is mentioned only once");
            break;}}}}
