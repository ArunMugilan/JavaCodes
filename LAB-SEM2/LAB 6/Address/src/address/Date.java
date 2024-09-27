/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Shalini
 */
public class Date {
  private int Month;
    private int Day;
    private int Year;
    Date setDate;
    
    public Date getDate()
    {
        Date temp = new Date();
        temp.Month=Month;
        temp.Day=Day;
        temp.Year=Year;
        return temp;
    }
    
    public void print()
    {
        System.out.println("Date of Birth : " + Day + "-" + Month +
                "-" + Year + " ");
    }
    
    public Date()
    {
        Month = 1;
        Day = 1;
        Year = 1900;
    }
    
    public Date(int mon, int da, int yr)
    {
        setDate(mon, da, yr);
    }
    
    public void setDate(int mon, int da, int yr)
    {
        if (yr >= 1)
            Year = yr;
        else
            Year = 1900;
        if (1 <= mon && mon <= 12)
            Month = mon;
        else
            Month = 1;
        
        switch (Month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                
                if (1 <= da && da <= 31)
                    Day = da;
                else
                    Day = 1;
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                
                if (1 <= da && da <= 30)
                    Day = da;
                else
                    Day = 1;
                break;
                
            case 2:
                if (isLeapYear())
                {
                    if (1 <= da && da <= 29)
                        Day = da;
                    else
                        Day = 1;
                }
                else
                {
                    if (1 <= da && da <=28)
                        Day = da;
                    else
                        Day = 1;
                }
        }
    }
    
    public int getMonth()
    {
        return Month;
    }
    
    public int getDay()
    {
        return Day;
    }
    
    public int getYear()
    {
        return Year;
    }
    
    public String toString()
    {
        return (Month + "/" + Day + "/" + Year);
    }
    
    public boolean isLeapYear()
    {
        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0))
            return true;
        else
            return false;
    }
}
