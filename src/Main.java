import practice.JavaGenerics;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JavaGenerics<Float> gn = new JavaGenerics<>();
        gn.setValue(53.0f);
        double d = gn.getDouble();
        System.out.println(d);
    }
}