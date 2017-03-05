# LouisDoubanLoadingView
Douban Loading View 豆瓣 支付宝 Loading 加载中

![image](https://raw.githubusercontent.com/louisgeek/LouisDoubanLoadingView/master/screenshots/douban_loading1.gif)

![image](https://raw.githubusercontent.com/louisgeek/LouisDoubanLoadingView/master/screenshots/douban_loading2.gif)


**Step 1. Add the JitPack repository to your build file**

*Add it in your root build.gradle at the end of repositories:*

        allprojects {
	        	repositories {
		        	...
		      	maven { url "https://jitpack.io" }
	      	}
	      }



**Step 2. Add the dependency**  

        dependencies {  

	        compile 'com.github.louisgeek:LouisDoubanLoadingView:v1.0.0'  
          
	     } 
       
	   


attrs


		app:smileColor="#ff669900"    
		app:smileCircleFrameHeight="6dp"  
		app:smileCircleRadius="22dp"	
		//auto start
		app:smileAutomatic="true"     
    	//hold loading state ratate count   
  		app:smileHoldRotateCount="2"   

		

code


 		 mSmileLoading.startLoad();
         mSmileLoading.stopLoading();
 
  
    
  
          

   
  
  

