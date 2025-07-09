
import pygame

pygame.init()

width=100
height=100

screen=pygame.display.set_mode((width, height))

bg_img=pygame.image.load("images/background.png")

aim_pointer=pygame.image.load("images/aim_pointer.png")

while True:

    for event in pygame.event.get():
        pass

    posX, posY=pygame.mouse.get_pos()

    screen.blit(bg_img, (0, 0))
    screen.blit(aim_pointer, (posX-50, posY-50))

    pygame.display.update()