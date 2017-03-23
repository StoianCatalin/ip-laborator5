public class Blue extends Vietati {

    Blue(int putere, int viteza) {
        this.putere = putere;
        this.viteza = viteza;
    }

    public int getPowerAttack() {
        return this.putere*this.viteza / 2;
    }

    public int usePower() {
        Blue b1 = new Blue(putere/3, viteza);
        Blue b2 = new Blue(putere/3, viteza/3);
        Blue b3 = new Blue(putere/3, viteza/3);
        return this.putere = b1.splitPower() + b2.splitPower() + b3.splitPower();
    }

    public int splitPower() {
        return this.putere*this.putere;
    }
}