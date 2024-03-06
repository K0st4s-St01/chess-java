package com.kstoi.entities;

import java.awt.*;
import java.util.List;

public final class Pawn extends Piece {
    public Pawn(Position position, int color) {
        super(position, "pawn" , color);
    }

    @Override
    public List<Position> availableMoves(Board board) {
        return null;
    }

    @Override
    public void render(Graphics2D g) {

    }
}
