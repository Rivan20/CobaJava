/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolymorphicSorting;

/**
 *
 * @author rivan
 */
public class Salesperson implements Comparable<Salesperson>
{
	private String firstName, lastName;
	private int totalSales;

	//------------------------------------------------------
	// Constructor: Sets up the sales person object with
	// the given data.
	//------------------------------------------------------
	public Salesperson (String first, String last, int sales)
	{
		firstName = first;
		lastName = last;
		totalSales = sales;
	}

	//-------------------------------------------
	// Returns the sales person as a string.
	//-------------------------------------------
	public String toString()
	{
		return lastName + ", " + firstName + ": \t" + totalSales;
	}

	//-------------------------------------------
	// Returns true if the sales people have
	// the same name.
	//-------------------------------------------
	public boolean equals (Salesperson s)
	{
		return (lastName.equals(s.getLastName()) && firstName.equals(s.getFirstName()));
	}

	//--------------------------------------------------
	// Order is based on total sales with the name
	// (last, then first) breaking a tie.
	//--------------------------------------------------
	public int compareTo(Salesperson s)
	{
		int result=-200;

		if(s.totalSales == this.totalSales)
		{
			if(equals(s))
				result = 0;
			else
			{
				if(s.firstName != firstName)
				{
					result = (s.firstName).compareTo(firstName);
					if(result > 0)
						result=-1;
				}
				else
				{
					result = (s.lastName).compareTo(lastName);
					if(result > 0)
						result=-1;
				}
			}
		}
		else
			if(s.totalSales < this.totalSales)
				result = 1;
			else
				result = -1;

			return result;
	}

	//-------------------------
	// First name accessor.
	//-------------------------
	public String getFirstName()
	{
		return firstName;
	}

	//-------------------------
	// Last name accessor.
	//-------------------------
	public String getLastName()
	{
		return lastName;
	}

	//-------------------------
	// Total sales accessor.
	//-------------------------
	public int getSales()
	{
		return totalSales;
	}
}