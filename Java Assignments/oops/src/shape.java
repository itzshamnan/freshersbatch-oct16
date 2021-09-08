public abstract class shape {
    abstract void draw();
}
class line extends shape{
    @Override
    void draw() {
        System.out.println("Line");
    }
}
class rectangle extends shape{
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}

class circle extends shape{
    @Override
    void draw() {
        System.out.println("Circle");
    }
}

