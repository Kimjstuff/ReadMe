class Shots {
int x;
int y;
int shotSize = 10;
int i = 1;

void shot(){
    if (keyCode == 'a' || keyCode == 'A'){
     stroke(0);
     fill(255);
     ellipse(playerPosX, playerPosY, shotSize, shotSize);  
     playerPosX = playerPosX+1; 
     
    }
  }
}
