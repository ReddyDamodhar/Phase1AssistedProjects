publis class expSearch1{
		if(arr[0]==value){
            return 0;
            }
        int i=1;
        while(i<length && arr[i]<=value){

            i=i*2;
        }
        return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
        }


	
	}
	


