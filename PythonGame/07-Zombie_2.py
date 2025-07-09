
import pygame
import random

pygame.init()

width=100
height=100

screen=pygame.display.set_mode((width, height))

bg_img=pygame.image.load("images/background.png")
aim_pointer=pygame.image.load("images/aim_pointer.png")
zombie_1=pygame.image.load("images/zombie_1.gif")

zombie_x=random.randint(0, width-150)
zombie_y=random.randint(0, height-200)

shotSound=pygame.mixer.Sound("sounds/shot_sound.wav")
bgMusic=pygame.mixer.Sound("sounds/background.wav")

bgMusic.play()

while True:

    for event in pygame.event.get():
        
        if event.type==pygame.MOUSEBUTTONDOWN:
            shotSound.play()

    posX, posY=pygame.mouse.get_pos()

    screen.blit(bg_img, (0, 0))
    screen.blit(zombie_1, (zombie_x, zombie_y))
    screen.blit(aim_pointer, (posX-50, posY-50))
    

    pygame.display.update()