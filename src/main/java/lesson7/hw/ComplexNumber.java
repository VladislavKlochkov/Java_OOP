package lesson7.hw;

public class ComplexNumber {
    // Комплексным числом называется выражение вида z = a + bi,
    // где a, b - любые действительные числа, i - мнимая единица, удовлетворяющая условию i^2 = -1.
    // a = Re z - действительная часть комплексного числа, bi = Im z - мнимая часть комплексного числа.
    float re;  // Действительная часть комплексного числа
    float im; // Мнимая часть комплексного числа

    public ComplexNumber(float re, float im) {
        setRe(re);
        setIm(im);
    }

    public ComplexNumber(float reValue) {
        this(reValue, 0);
    }

    public ComplexNumber() {
        this(0);
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        if (this.re != 0) {
            stringBuilder.append(this.re);
        } else stringBuilder.append("0");
        if (this.im != 0) {
            if (this.im < 0) {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(" + ");
            }
            stringBuilder
                    .append(this.im)
                    .append("i");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
