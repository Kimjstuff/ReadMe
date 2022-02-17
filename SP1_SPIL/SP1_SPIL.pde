PImage img;

int background = 0;
int playerPosX = 45;
int playerPosY = 45;
int playerSize = 50;
int tempShotX = playerPosX;
int score = 0;
int[] Shots = new int[30];

Shots fire;

void setup() {
  size(1400,700);
  img = loadImage("background3.jpg");
  fire = new Shots(); 
}

void draw() {
  image(img, background, 0);
  --background; //Moving background left  
  
  
  fill(0, 100, 150);
  text("Score: "+score, 100, 50);
  textSize(25);
 
  drawPlayer(); //Player
  keyPressed(); //ovement
  fire.shot();  //Shoot
}



void drawPlayer(){
 fill(255);
 ellipse(playerPosX, playerPosY, playerSize, playerSize);
}




void keyPressed(){ //Player movement
  if (playerPosY >= 10 + (playerSize/2) && keyCode == UP){
    playerPosY = playerPosY - 5;
  }
  if (playerPosY <= 550 && keyCode == DOWN){ 
    playerPosY = playerPosY + 5;
  }
  if (width > playerPosX && keyCode == RIGHT){
    playerPosX = playerPosX + 5;
  }
  if (playerPosX >= 10 + (playerSize/2) && keyCode == LEFT){
    playerPosX = playerPosX - 5;
  }
}
