package com.cml.sewij.cpu;

public class Registers {

	/*java doesn't have unsigned primitive "data types"
	We don't really need to care as long as the number of 
	bits in preserved. In this case, we're using the 8bit signed byte
	for the 8bit main and alternate (where A' is APrime) registers, and
	a 16 bit short for the 16 bit registers IX,IY, SP
	
	*/
	
	
	private short PC;
	//program counter
	
	
	private short SP;
	//stack pointer
	
	private short IX, IY;
	
	private byte I,R;
	
	private byte A,B,C,D,E,F,H,L;
	private byte APrime, BPrime, CPrime, DPrime, EPrime,FPrime, HPrime, LPrime;
	
	
	//todo create functions to handle accessing the paired 8bit registers
	//as 16 bit ones
}
