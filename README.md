Nathan Lambert HW2 -  Text Entry Device via Row Tap
=====================================

![Alt text](/Images/IMG_6327.jpg?raw=true "Optional Title")

A video demonstration of this project with basic commentary can be found here: https://www.youtube.com/watch?v=7OT4umnwGv4&feature=youtu.be

Pre-requisites
--------------

- Android Things compatible board
- Android Studio 2.2+
- Circuit materials

File Notes:
-----------

- Basic PicoPro App Files
- hw2_natolambert_rowapp: extends PicoProApp to create functionality for this project.
- Schematic_TextEntry.png: Circuit diagram with Raspberry Pi substituted for PicoPro, so the GPIO pins do not match up. See the code for which pins do what, but it is completely configurable and the functionality does not depend on intrices between digital in/out pins.
- Illustrator_TextEntry.ai: Adobe Illustrator file for laser cutting keyboard mount.

Introduction:
-------------
This was our first assignment on the PicoPro board, to create a funcitoning keyboard with 10 switches and respective pull-up resistors, or less. I decided to take a simple approach of encoding characters as different states in a nearly full sized keyboard.

Implementation:
---------------
![Alt text](/Images/Schematic_TextEntry.png?raw=true "Optional Title")

Construction:
-------------


Reflection:
-----------

I anticipated this project to be more challenging than it turned out to be. 

Other Photos:
-------------
![Alt text](/Images/IMG_6324.jpg?raw=true "Optional Title")
Laser cut key guide.
![Alt text](/Images/IMG_6325.jpg?raw=true "Optional Title")
Underlying circuit
![Alt text](/Images/IMG_6326.jpg?raw=true "Optional Title")
Full system.


License - Copy from Class Materials
-------

Copyright 2016 The Android Open Source Project, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
