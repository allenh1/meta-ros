# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=cd1a22ceb914b60db1fb991e52fe3fcc"

DEPENDS = "catkin cmake glut libusb-1.0-dev libxi-dev libxmu-dev"
SRC_URI = "https://github.com/ros-drivers-gbp/libfreenect-ros-release/archive/release/lunar/libfreenect/0.5.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "be711f22897070ad071c9aa71193cd20"
SRC_URI[sha256sum] = "17c4ff968d8fae448ad1611859ea8663d63d6213c575720be5d307447fab6288"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
