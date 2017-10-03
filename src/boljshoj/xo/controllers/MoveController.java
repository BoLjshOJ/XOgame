package boljshoj.xo.controllers;

import boljshoj.xo.model.Field;
import boljshoj.xo.model.Figure;
import boljshoj.xo.model.exceptions.AlreadyOccupiedException;
import boljshoj.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field<Figure> field,
                            final Point point,
                            final Figure figure) throws InvalidPointException,
                                                        AlreadyOccupiedException{
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
