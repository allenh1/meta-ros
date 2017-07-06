# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding qt_gui qt_gui_py_common rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_shell-release/archive/release/lunar/rqt_shell/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b6bfb3fd7d97ae61f3c10bbc33a196b"
SRC_URI[sha256sum] = "bc6a1761519871a4f5f45b79a8b7eccc18133a123b77154f983d230b05e39cc3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
