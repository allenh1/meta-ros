# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-qt5-bindings python-rospkg python_qt_binding qt5-qmake tango-icon-theme"
SRC_URI = "https://github.com/ros-gbp/qt_gui_core-release/archive/release/lunar/qt_gui/0.3.4-2.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "85f0bd8ac39f3a29d23c35dcb2156917"
SRC_URI[sha256sum] = "3b1948c3198652b03f4f9532d76a21790eecad90c6f8b5126378d1961d158da8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
