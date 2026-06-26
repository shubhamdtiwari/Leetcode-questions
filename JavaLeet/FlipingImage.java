package JavaLeet;

public class FlipingImage {
    public static void main(String[] args) {
        int[][] image = {
                        {1,1,0},
                        {1,0,1},
                        {0,0,0}
                            };

        int[][] FlipingImage = flipAndInvertImage(image);

       for (int i = 0; i < FlipingImage.length; i++) {
        for (int j = 0; j < FlipingImage.length; j++) {
            System.out.println(FlipingImage[i][j]);
        }
       }
        
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] fAndIimage = new int[image.length][image.length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image.length; j++){
               
                // for flipping
                fAndIimage[i][j] = image[i][image.length - j - 1];

                 // for inverting
                if(fAndIimage[i][j] == 1){
                    fAndIimage[i][j] = 0;
                } else {
                    fAndIimage[i][j] = 1;
                }
            }
        }
        return fAndIimage;
}
}
