# android-arrow-drawable-sample


Thanks to a Jovie Brett Bardoles concept [1] I dug into the appcompat support library to find out how the NavigationDrawer uses the _ActionBarToggle to show a pretty animation changing the drawer menu icon to an arrow. [2]

From the developer perspective, I thought that actually can't be achieved without any third-party library or modifying the support library source, that last is what I have done.

That effect is actually provided by the DrawerArrowDrawableToggle, included in the new appcompat support library. That Drawable (I don't know why) hasn't a public modifier [3] so you can't instantiate it directly. 

The project of the support libraries is uploaded to GitHub [4], if you download the project and include the appcompat as a library dependency into your project and modify the DrawerArrowDrawableToggle constructor to public, you can use the DrawerArrowDrawableToggle with a few lines, away from a NavigationDrawer in a separate view.

The material specification says that the drawer has to overlay the Toolbar [6], so if you want to use that effect, the actual implementation from the android SDK is useless, If I'm wrong someone correct me please !

The source of this sample is on GitHub [6] so fell free to take a look :)

![](https://lh6.googleusercontent.com/-vvDL7l5Yxog/VLKlerM29gI/AAAAAAAA1BM/Vl8fwvipO30/w764-h1376-no/arrow.gif)


[1] https://plus.google.com/u/0/+JovieBrettBardoles/posts/XFfpXu7Rj2A

[2] http://goo.gl/NLuo50

[3] https://github.com/android/platform_frameworks_support/blob/master/v7/appcompat/src/android/support/v7/app/ActionBarDrawerToggle.java - line 463

[4] https://github.com/android/platform_frameworks_support

[5] http://www.google.com/design/spec/patterns/navigation-drawer.html﻿

[6] https://github.com/saulmm/android-arrow-drawable-sample﻿
