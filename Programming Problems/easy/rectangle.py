

import Math


class rectangle():
    def __init__(self, width, height, x, y):
        self.width = width
        self.height = height
        self.x = x
        self.y = y

def coordinate(rectangle, comparing):
    x = rectangle.x
    y = rectangle.y
    x2 = comparing.x
    y2 = comparing.y
    dx = x-rectangle.width
    dy = y-rectangle.height
    dx2 = dx-rectangle.height
    dy2 = dy-rectangle.width
    dx = x-comparing.width
    dy = y-comparing.height
    dx2 = dx-comparing.height
    dy2 = dy-comparing.width
    dist = Math.sqrt(dx**2+dy**2)
    if (dx > 0 and dy > 0 and dx2 > 0 and dy2 > 0):
        if (dist >= 0):
            return True
        else:
            return False


def main():
    rect1 = rectangle(3, 3, 1, 4)
    return coordinate(rect1)
