
import pygame

pygame.init()

width=600
height=500

white=(255,255,255)
red=(255,0,0)

screen=pygame.display.set_mode((width, height))

x=0
y=0

move_x=0
move_y=0

while True:

    for event in pygame.event.get():
        
        if event.type==pygame.KEYDOWN:
            if event.key==pygame.K_RIGHT:
                print("Key pressed")
                move_x+=0.5
            elif event.key==pygame.K_DOWN:
                move_y+=0.5

    screen.fill(white)

    pygame.draw.rect(screen, red, [x, y, 50, 70])

    x+=move_x
    y+=move_y

    pygame.display.update()

