rect(x,y,w,h);
ellipse(x,y,w,h);
line(x1,y1,x2,y2);
triangle(x1,y1,x2,y2,x3,y3);

beginShape();
vertex(x1,y1);
vertex(x2,y2);
vertex(x3,y3);
vertex(x4,y4);
// etc;
endShape();

class MyWackyShape {
  // Some variables

  // A constructor

  // Some functions

  // Display the shape!
  void display() {
    rect(x,y,w,h);
    ellipse(x,y,w,h);
    beginShape();
    vertex(x1,y1);
    vertex(x2,y2);
    vertex(x3,y3);
    vertex(x4,y4);
    // etc;
    endShape();
  }
}

display()

void draw() {
  background(51);
  stroke(255);
  fill(127);
  rect(mouseX,mouseY,100,50);
}

darw()