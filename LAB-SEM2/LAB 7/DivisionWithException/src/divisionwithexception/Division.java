/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionwithexception;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class Division {
    private int dividend;
    private int divisor;
    private int quotient;

    public Division(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getQuotient() {
        int Quotient = getDividend() / getDivisor();
        return Quotient;
    }

    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }
    
    
    
}
