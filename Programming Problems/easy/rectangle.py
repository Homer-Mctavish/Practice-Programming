

{
    "top_left": (1, 4),
    "dimensions": (3, 3)  # width, height
},
{
    "top_left": (-1, 3),
    "dimensions": (2, 1)
},
{
    "top_left": (0, 5),
    "dimensions": (4, 3)
}

##if every single coordinate of a rectangle has positive distance compared to another rectange and one
##of the rectangles has a larger area than the other they overlap
def coordinate(x, y):
        dx = x-x2;
        dy = y-y2;
        dfnameist = sqrt(dx**2+dy**2);
        if (dx >0 and dy >0):
            if (dist>=0):
                return -1;
            else:
                return 1;
