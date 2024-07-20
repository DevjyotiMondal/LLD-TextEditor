import observers.TextConsoleObserver;
import observers.TextEditorObserver;


public class TextEditor {
    public static void main(String[] args) {
        //Need to create the Text Editor
        TextEditor textEditor=new TextEditor();
        //Text Editor Observers
        TextEditorObserver observer =new TextConsoleObserver();
        //Register all the observers with the test Editor
        textEditor.registerObserver(observer);

        textEditor.setCurrentText("Hello friends");

        //Formatters

        //Command to create the text
    }
}
