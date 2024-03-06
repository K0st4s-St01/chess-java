package com.kstoi.entities;

import java.awt.*;
import java.util.List;

public final class Knight extends Piece {
    public Knight(Position position, int color) {
        super(position, "knight" , color);
    }

    @Override
    public List<Position> availableMoves(Board board) {
        return null;
    }

    @Override
    public void render(Graphics2D g) {

    }
}
