# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin controller_manager rqt_gui"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/rqt_controller_manager/0.11.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1030e131b967179d6aaf36d863aca3e"
SRC_URI[sha256sum] = "948f948cc132b780b36aa4b339d2a8f7c6a58fc7daf6cc47ffd25154cecc5a23"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
