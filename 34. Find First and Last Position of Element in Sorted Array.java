// 34. Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class Solution {
    public int[] searchRange(int[] arr, int target) {
         int []ans={-1,-1};
        ans[0]=firstPostion(arr,target);
        ans[1]=lastPostion(arr,target);
        return  ans;
    }
    static int firstPostion(int []arr, int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans =mid;
                end =mid-1;

            }
            else if(arr[mid]>target){
                end=mid-1;

            }
            else {
                start =mid+1;
            }
        }
        return  ans;
    }
    static int lastPostion(int []arr, int target){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                ans =mid;
//                end =mid-1;
                start =mid+1;

            }
            else if(arr[mid]>target){
                end=mid-1;

            }
            else {
                start =mid+1;
            }
        }
        return  ans;
    }
}