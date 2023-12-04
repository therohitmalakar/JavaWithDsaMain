public class TrappedRainWater {

    public static int trappedRainWater(int[] height){
        int n = height.length;
        //Calculate leftmax boundary
         int[] leftMax = new int[n];
         leftMax[0] = height[0];
         for(int i=1; i<n; i++){
             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
         }

         //Calculate RightMax Boundary
        int[] rightMax = new int[n];
         rightMax[n-1] = height[n-1];
         for(int i=n-2; i>=0; i--){
             rightMax[i] = Math.max(height[i] , rightMax[i+1]);
         }

         //loop
        int TrappedWater = 0;
        for(int i=0; i<n; i++){
            //Calculate water level
            int WaterLevel = Math.min(leftMax[i] , rightMax[i]);
            // Calculate trapped rain water
            TrappedWater +=  WaterLevel - height[i];
        }
        return TrappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        System.out.println(trappedRainWater(height));
    }
}
