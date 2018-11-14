
package modelo;

import java.util.Calendar;

/**
 * @author isaias sanchez
 */
public class Reloj 
{
    public static long ahora()
    {
     return Calendar.getInstance().getTimeInMillis();
    }
}
