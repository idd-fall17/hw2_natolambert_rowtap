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
This was our first assignment on the PicoPro board, to create a funcitoning keyboard with 10 switches and respective pull-up resistors, or less. I decided to take a simple approach of encoding characters as different states in a nearly full sized keyboard. Other options included things like a game controller, custom switches, or chording character entry. A more advanced text entry device would add either novelty or improved words per minute.

Implementation:
---------------
My implementation was two break up the alphabet, with two extra characters, into 4 rows of 7. This left we 3 buttons left to shift rows and to shift for captical and lower case letters. An internal state machine tracked which row the user is in and if the system is in shift mode, which changes between capital and lowercase letters (and for the punctuation key, switches between period and comma). The button trigger event is called on all events for the GPIO pins, but all input pins are configured to be triggered on the transition low with additional pull up resistors. The debouncing method I used was a simple time deay of 60ms, which works sufficiently well during normal operation. 

The system begins in bottom row with lowercase letters. Frome there, the user can press one of the left seven buttons to output a key onto the screen, or row shift up or down to shift rows. Rows wrap around and a shifted by one per press. The laser cut cover guides the usability by letting the user mentally track row position while typing.
![Alt text](/Images/Schematic_TextEntry.png?raw=true "Optional Title")

Construction:
-------------
The construction was made as a guide so the user can disambiguate his keystrokes into logical text output. The laser cutted cover was design for rapid implementation and providing functionality. It hides the majority of the circuitry for asthetic and to prevent keytyping from disturbing the circuit.  The 10 switches fit very satisfyingly on the breadboard, so adding the cover to them leeds to clear construction. The cover is held down with double sided tape and pieces from the central cut out of the key cover.

Reflection:
-----------
I anticipated this project to be more challenging than it turned out to be. There are multiple areas that could have been easily improved, but I did not plan on implementing them as I expected a challenge. The two main opprotunites are a more robust debouncing scheme and implementing a simple LED structure for button and row feedback.

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
