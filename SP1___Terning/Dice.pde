class Die {

  //Variable
  color eyeColor;
  color dieColor;
  int eyes = (int)random(1, 7);


  //Constructor
  public Die (color eyeColor, color dieColor) {
    this.eyeColor = eyeColor;
    this.dieColor = dieColor;
  }
  
  void roll(){
  eyes = (int)random(1,7);
  }

  // Draw Die
  void drawDie(int x, int y) {
    int size = 100;
    int eyeSize = size/5;
    int eyeDist = size/4;

    rectMode(CENTER);
    ellipseMode(CENTER);

    //global die 
    fill(dieColor);

    //draw die
    rect(x, y, size, size, 25);

    //global eyes
    fill(eyeColor);

    //Cases for each outcome
    switch(eyes) {
    case 1: //DieONE
      ellipse(x, y, eyeSize, eyeSize);
      break;
    case 2: //DieTWO
      ellipse(x-eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y+eyeDist, eyeSize, eyeSize);
      break;
    case 3: //DieThree
      ellipse(x-eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y+eyeDist, eyeSize, eyeSize);
      ellipse(x, y, eyeSize, eyeSize);
      break;
    case 4: //DieFour
      ellipse(x-eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y+eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x-eyeDist, y+eyeDist, eyeSize, eyeSize);
      break;
    case 5: //DieFew
      ellipse(x, y, eyeSize, eyeSize);
      ellipse(x-eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y+eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x-eyeDist, y+eyeDist, eyeSize, eyeSize);
      break;
    case 6: //DieSix
      ellipse(x-eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y+eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y-eyeDist, eyeSize, eyeSize);
      ellipse(x-eyeDist, y+eyeDist, eyeSize, eyeSize);
      ellipse(x+eyeDist, y, eyeSize, eyeSize);
      ellipse(x-eyeDist, y, eyeSize, eyeSize);
      break;
    }
  }
}

/*class DiceCup {

  //Constructor
  public Dicecup(){
}

void addDie (Die die){

}

void Shake (){
  
  
}
}*/
