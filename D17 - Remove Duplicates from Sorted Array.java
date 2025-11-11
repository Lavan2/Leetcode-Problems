class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> uni= new HashSet<>();
        for(int i:nums){
            uni.add(i);
        }
        Integer ans = uni.size();
        int temp[]=new int[ans];
        int j=0;
        for(int i:uni){
            temp[j]=i;
            j++;
        }
        Arrays.sort(temp);
        for(int i=0;i<ans;i++){
            nums[i]=temp[i];
        }
        return ans;
    }
}
