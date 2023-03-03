// 1095. Find in Mountain Array
// https://leetcode.com/problems/find-in-mountain-array/description/
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peek=findPeekIndex(mountainArr);
        if(mountainArr.get(peek)==target){
            return peek;
        }
        int ans=-1;
          ans=biSearhinc(mountainArr,0,peek-1,target);
          if(ans==-1){
              ans=biSearchdec(mountainArr,peek+1,mountainArr.length()-1,target);
          }
        return ans;
    }
  public int findPeekIndex(MountainArray mountainArr){
       
        int start=0;
        int end =mountainArr.length()-1;
        while (start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid) >mountainArr.get(mid+1))
            {
                end=mid;
            }
            else{
                start=mid+1;
            }

        }
        return start;
    }
public int biSearhinc(MountainArray mountainArr,int start ,int end,int target){
        
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else  if(mountainArr.get(mid)>target){
                    end =mid-1;
                }
                else {
                    start=mid+1;
                }


        }
        return  -1;

    }

 public int biSearchdec(MountainArray mountainArr,int start ,int end,int target){
        
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            } 
            else  if(mountainArr.get(mid)<target){
                    end =mid-1;
                }
                else {
                    start=mid+1;
                }


            


        }
        return  -1;

    }

}
