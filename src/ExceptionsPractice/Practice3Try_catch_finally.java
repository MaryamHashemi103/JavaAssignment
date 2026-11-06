package ExceptionsPractice;

public class Practice3Try_catch_finally {
    static void main() {
        boolean uploadSuccess = true;

        try{
            System.out.println("Uploading");
            if(uploadSuccess == false){
                throw new RuntimeException("Error in uploading");
        }
            System.out.println("Uploading was successful");
        }catch (Exception e){
            System.out.println("Uploading was interrupted");
        }
        finally {
            System.out.println("Program finished");
        }
    }
}
