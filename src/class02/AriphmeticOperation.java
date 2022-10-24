package class02;

import GroupProject2.A;

public class AriphmeticOperation {





			public int i;

			private int j;

		}

		class B extends AriphmeticOperation {

			void display(){

				super.j = super.i + 1;

				System.out.println(super.i + " " + super.j);

			}

		}

		class Inheritance {

			public static void main(String args[]){

				B obj = new B();

				obj.i=1;

				obj.j=2;

				obj.display();

			}

		}