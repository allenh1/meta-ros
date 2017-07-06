# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-rospkg python_qt_binding qt_gui_py_common roslib rosmsg rqt_gui rqt_gui_py rqt_py_common"
SRC_URI = "https://github.com/ros-gbp/rqt_publisher-release/archive/release/lunar/rqt_publisher/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6ad24a290ee61a8973c3fbd891c2e21f"
SRC_URI[sha256sum] = "5480126bf9a7b6265002ea38cb17541679dea830dcb94823ce6dbfb1725a39b8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
