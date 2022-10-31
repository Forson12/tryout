package ac.uk;

public class Laptop {

    // public void someMethod(){
    //     System.out.println("This is the metho in the Laptop Class");
    // }
    
    public static class laptopScreen{
        private int size; 
        public int getSize() {
            return size;
        }

        private String resolution; 
        // private <something> materialType

        public String getResolution() {
            return resolution;
        }

        public laptopScreen(int size, String resolution){
            this.size = size; 
            this.resolution = resolution; 
        }





        // Anonymous class 
        // laptop anonymous = new laptop(){
        //     @Override
        //     public void someMethod(){
        //         System.out.println("This is anonymous");
        //     }
        // };

        // public void testMethod(){
        //     this.anonymous.someMethod();
        // }
    }

    

   

}
