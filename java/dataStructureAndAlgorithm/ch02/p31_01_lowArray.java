// p31_01_LowArray.java
// demonstrates array class with low level interface
// 
//////////////////////////////////////////////////
class p31_01_LowArray {
	private long[] a; // ref to array a
//------------------------------------------------------------
	public p31_01_LowArray(int size) { // constructor
		a = new long[size]; // create array
	}
//------------------------------------------------------------
	public void setElem(int index, long value) { // set value
		a[index] = value;
	}
//------------------------------------------------------------
	public long getElem(int index) { // get value
		return a[index];
	}
//------------------------------------------------------------
} // end class p31_01_LowArray
//////////////////////////////////////////////////
class p31_01_LowArrayApp_Main {
	public static void main(String[] args) {
		p31_01_LowArray arr; // reference
		arr = new p31_01_LowArray(100); // create p31_01_LowArray object
		int nElems = 0; // number of items in array
		int j; // loop variable
//------------------------------------------------------------
		arr.setElem(0, 77); // insert 10 items
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10; // now 10 items in array
//------------------------------------------------------------
		for (j = 0; j < nElems; j++) // display items
			System.out.print(arr.getElem(j) + " ");
		System.out.println("");
//------------------------------------------------------------
		int searchKey = 26; // search for data item
		for (j = 0; j < nElems; j++) // for each element,
			if (arr.getElem(j) == searchKey) // found item?
				break; // yes, exit before end
		if (j == nElems) // 
			System.out.println("Can't find " + searchKey); 
		else 
			System.out.println("Found " + searchKey); //
//------------------------------------------------------------
		// delete item with key 55
		for (j = 0; j < nElems; j++) // look for it
			if (arr.getElem(j) == 55)
				break;
		for (int k = j; k < nElems; k++) // move higher ones down
			arr.setElem(k, arr.getElem(k + 1));
		nElems--; // decrement size
//------------------------------------------------------------
		for (j = 0; j < nElems; j++) // display items
			System.out.print(arr.getElem(j) + " ");
		System.out.print("");
	} // end main()
} // end class p28_01_array
