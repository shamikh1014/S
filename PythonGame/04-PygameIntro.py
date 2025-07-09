
import pygame

pygame.init()

width=600
height=500

white=(255,255,255)
red=(255,0,0)

screen=pygame.display.set_mode((width, height))

while True:

    for event in pygame.event.get():
        pass
        # print(event)

    screen.fill(white)

    pygame.draw.rect(screen, red, [10, 0, 50, 70])
    pygame.draw.circle(screen, red, [100, 100], 80)

    pygame.display.update()

