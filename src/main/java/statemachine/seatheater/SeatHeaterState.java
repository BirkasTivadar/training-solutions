package statemachine.seatheater;

public enum SeatHeaterState {
    ONE {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    },
    TWO {
        @Override
        SeatHeaterState next() {
            return ONE;
        }
    },
    THREE {
        @Override
        SeatHeaterState next() {
            return TWO;
        }
    },
    OFF {
        @Override
        SeatHeaterState next() {
            return THREE;
        }
    };

    abstract SeatHeaterState next();
}
