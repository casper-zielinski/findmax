package at.fhj.msd;

public class Rectangle {
      private final double height;
      private final double width;

      public Rectangle(double w, double h)
      {
            this.height = h;
            this.width = w;
      }

      public double calcArea()
      {
            return this.width * this.height;
      }

}
