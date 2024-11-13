package com.kitm;

import java.util.Arrays;

public class Main {

    public static int maxSpan(int[] nums) {

        int max = 0;

        int sk = 0;

        for (int i = 0; i < nums.length; i++)
        {

            sk = 1;

            for (int j = nums.length-1; j > i; j--)
            {
                if (nums[i] == nums[j])
                {

                    sk = j - i + 1;

                    if (max < sk)
                    {
                        max = sk;
                    }
                }
            }

            if (max < sk)
            {
                max = sk;
            }
        }

        return max;
    }

    public static int[] fix34(int[] nums) {

        int keit;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 3)
            {

                for (int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == 4 && nums[j-1] != 3)
                    {
                        keit = nums[i+1];
                        nums[i+1] = nums[j];
                        nums[j] = keit;

                    }
                }
            }
        }

        return nums;
    }

    public static int[] fix45(int[] nums) {


        int keit;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 4)
            {

                for (int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == 5)
                    {
                        if (j-1 >= 0)
                        {
                            if (nums[j-1] != 4)
                            {
                                keit = nums[i+1];
                                nums[i+1] = nums[j];
                                nums[j] = keit;
                            }
                        }
                        else
                        {
                            keit = nums[i+1];
                            nums[i+1] = nums[j];
                            nums[j] = keit;
                        }



                    }
                }
            }
        }

        return nums;


    }

    public static boolean canBalance(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++)
        {

            sum1 = 0;
            sum2 = 0;

            for (int j = i; j < nums.length; j++)
            {
                sum1 += nums[j];
            }

            for (int j = i-1; j >= 0; j--)
            {
                sum2 += nums[j];
            }

            if (sum1 == sum2)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {

        int[] a = new int[inner.length];

        if (inner.length == 0)
        {
            return true;
        }

        for (int i = 0; i < outer.length; i++)
        {

            if(outer[i] == inner[0])
            {

                if (i + inner.length - 1 < outer.length)
                {
                    for (int j = 0; j < inner.length; j++)
                    {
                        a[j] = outer[i+j];
                    }

                    if (Arrays.equals(inner, a))
                    {
                        return true;
                    }
                }


            }
        }

        return false;
    }

    public static int[] squareUp(int n) {
        int[] a = new int[n*n];

        int times = 0;

        int limit = n;

        int nextnumber = 1;

        for (int i = n*n-1; i >= 0; i--)
        {
            times++;

            if (nextnumber > limit)
            {
                a[i] = 0;
            }
            else
            {
                a[i] = nextnumber;

                nextnumber++;
            }



            if (times == n)
            {
                times = 0;
                limit -=1;

                nextnumber = 1;
            }

        }

        return a;
    }

    public static int[] seriesUp(int n) {

        int ilgis = 0;

        for (int i = 0; i < n; i++)
        {
            ilgis += (n-i);
        }

        int[] a = new int[ilgis];

        int start = n;

        int num = n;

        for (int i = ilgis-1; i >= 0; i--)
        {
            a[i] = num;

            if (num == 1)
            {
                start--;
                num = start;

                continue;
            }

            num--;
        }


        return a;
    }

    public static int maxMirror(int[] nums) {

        int max = 0;

        int mirrorilgis = 0;

        for (int i = 0; i < nums.length; i++)
        {
            mirrorilgis = 0;

            for (int j = nums.length - 1; i + mirrorilgis < nums.length && j >= 0; j--)
            {
                if (nums[i+mirrorilgis] == nums[j])
                {
                    mirrorilgis++;
                }
                else
                {
                    if(mirrorilgis > 0)
                    {
                        if(mirrorilgis > max)
                        {
                            max = mirrorilgis;
                        }

                        mirrorilgis = 0;

                    }
                }
            }

            if(mirrorilgis > max)
            {
                max = mirrorilgis;
            }
        }

        return max;
    }

    public static int countClumps(int[] nums) {

        if (nums.length == 0)
        {
            return 0;
        }

        int max = 0;

        int sk = nums[0];

        int clump = 0;

        int nr = 1;

        for (int i = 1; i < nums.length; i++)
        {

            if (sk == nums[i])
            {
                nr++;
            }
            else
            {
                sk = nums[i];

                if (nr > 1)
                {
                    clump++;
                }

                nr = 1;

            }



        }

        if (nr > 1)
        {
            clump++;
        }

        return clump;
    }

    public static void main(String[] args) {



    }
}