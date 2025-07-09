
import pygame
import random

pygame.init()

width=100
height=100

screen=pygame.display.set_mode((width, height))

red=(255,0,0)

bg_img=pygame.image.load("images/background.png")
aim_pointer=pygame.image.load("images/aim_pointer.png")

zombie_1=pygame.image.load("images/zombie_1.gif")
zombie_2=pygame.image.load("images/zombie_2.png")
zombie_3=pygame.image.load("images/zombie_3.png")

gunImage=pygame.image.load("images/gun_1.png")

shotSound=pygame.mixer.Sound("sounds/shot_sound.wav")
reloadSound=pygame.mixer.Sound("sounds/reload.ogg")

bgMusic=pygame.mixer.Sound("sounds/background.wav")
bgMusic.play()

def score(counter):
    font=pygame.font.SysFont(None, 60)
    text=font.render("Score: "+str(counter), True, red)
    screen.blit(text, (10, 10))

def game():

    zombie_x=random.randint(0, width-150)
    zombie_y=random.randint(0, height-200)

    zombieList=[zombie_1, zombie_2, zombie_3]
    zombieImage=random.choice(zombieList)

    counter=0

    shot=4

    while True:

        for event in pygame.event.get():
            
            if event.type==pygame.MOUSEBUTTONDOWN:
                shot-=1
                if shot>=0:

                    shotSound.play()

                    if rect_1.colliderect(rect_2):
                        print("Collision detection...")

                        zombieImage=random.choice(zombieList)
                        zombie_x=random.randint(0, width-150)
                        zombie_y=random.randint(0, height-200)
                        counter+=1

            if event.type==pygame.KEYDOWN:
                if event.key==pygame.K_r:
                    shot=4
                    reloadSound.play()


        posX, posY=pygame.mouse.get_pos()

        screen.blit(bg_img, (0, 0))
        screen.blit(zombieImage, (zombie_x, zombie_y))
        screen.blit(aim_pointer, (posX-50, posY-50))
        screen.blit(gunImage, (posX, height-250))

        rect_1=pygame.Rect(posX-50, posY-50, aim_pointer.get_width(), aim_pointer.get_height())
        rect_2=pygame.Rect(zombie_x, zombie_y, zombieImage.get_width(), zombieImage.get_height())

        score(counter)

        pygame.display.update()

        
game()