package com.courses.spalah.method;

/**
 * @author Ievgen Tararaka
 */
public class Builder {
    public void putBrick(Brick brick) {
        brick.color = BrickColor.RED;
        brick = new Brick(BrickColor.RED);
        System.out.println("Кладу кирпич. Цвет кирпича:" + brick.color);
    }
}
