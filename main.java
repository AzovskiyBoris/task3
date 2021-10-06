public class main
{
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0]=5;
        nums[1]=10;
        nums[2]=30;
        nums[3]=45;
        nums[4]=60;
        int[] nums2 =new int[5];
        nums2[0]= nums[4];
        nums2[1]=10;
        nums2[2]=30;
        nums2[3]=45;
        nums2[4]= nums [0];
        System.out.println(nums2[nums2.length - 5] + nums2[nums2.length - 3]);
    }
}
