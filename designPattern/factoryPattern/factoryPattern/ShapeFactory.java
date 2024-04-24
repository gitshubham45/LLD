
public class ShapeFactory {
    
    Shape shape ;

    Shape getShape(String in){

        String input= in.toUpperCase();
        System.out.println(input);
        switch (input){
            case  "CIRCLE":
                return new Circle();
            case  "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default: 
                return null;

        }

    }
}
