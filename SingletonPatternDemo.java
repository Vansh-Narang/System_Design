public class SingletonPatternDemo {
    public static void main(String[] args) {

        /******************** Trying to access private constructor **********/
        // SingletonObject x= new SingletonObject();
        // Error as this is not visible due to its private property

        // accessing the reference from another class
        SingletonObject object = SingletonObject.getInstance();

        // If two objects will be called
        SingletonObject object1 = SingletonObject.getInstance();


        //printing
        System.out.println(object);
        System.out.println(object1);
        //Creating the same object again and again

        
        // calling the function
        object.showMessage();
        object1.showMessage();
    }
}