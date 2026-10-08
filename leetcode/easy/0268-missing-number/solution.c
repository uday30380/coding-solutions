int missingNumber(int* nums, int numsSize) {
    int sum=0;
    int totalsum=0;
    for(int i=0;i<numsSize;i++){
        sum=sum+nums[i];
    }
    for(int i=0;i<=numsSize;i++){
        totalsum=totalsum+i;
    }
    int result=totalsum-sum;
    return result;
}