How to Run the Code in IntelliJ IDEA and Push to GitHub
Step 1: Setup IntelliJ IDEA
Open IntelliJ IDEA.

Create a New Project:

Click on File > New > Project.

Select Java and click Next.

Set your project name and location, then click Finish.

Step 2: Add JSON.simple Library
Download JSON.simple Library:

Download json-simple-1.1.1.jar

Add to Project:

Right-click on your project in the Project Explorer.

Select Open Module Settings.

Go to Modules, select the Dependencies tab, click the + icon and select JARs or directories.

Add the json-simple-1.1.1.jar.

Step 3: Create a New Java Class
Create Class:

Right-click on the src directory, choose New > Java Class, and name it Solution.

Step 4: Copy the Code
Paste the Code:

Copy and paste the provided Java code into the Solution class.

Step 5: Create Input JSON File
Create Directory:

Right-click on your project root, select New > Directory, and name it resources.

Create JSON File:

Right-click on the resources directory, select New > File, and name it input.json.

Paste the following JSON content into input.json:

json
{
    "keys": {
        "n": 4,
        "k": 3
    },
    "1": {
        "base": "10",
        "value": "4"
    },
    "2": {
        "base": "2",
        "value": "111"
    },
    "3": {
        "base": "10",
        "value": "12"
    },
    "6": {
        "base": "4",
        "value": "213"
    }
}

Step 6: Update File Path in Code
Update File Path:

Ensure the file path in the code points to the correct location:

java

Copy
String filePath = "resources/input.json";

Step 7: Run the Code
Run the Code:

Right-click on the Solution class in the Project Explorer and select Run ‘Solution.main()’.

The output will appear in the Run window at the bottom of IntelliJ.
