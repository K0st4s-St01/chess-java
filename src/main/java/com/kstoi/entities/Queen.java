package com.kstoi.entities;

import java.awt.*;
import java.util.List;

public final class Bishop extends Piece {
    public Bishop(Position position, int color) {
        super(position, "bishop" , color);
    }

    @Override
    public List<Position> availableMoves(Board board) {
        return null;
    }

    @Override
    public void render(Graphics2D g) {

    }
}
