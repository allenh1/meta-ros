# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen eigen_conversions roscpp roslint"
SRC_URI = "https://github.com/davetcoleman/rosparam_shortcuts-release/archive/release/lunar/rosparam_shortcuts/0.2.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de9b018e57f0e62a8475b8de0e1c210"
SRC_URI[sha256sum] = "9b66633dac39ecb2cf90ed53d3872170ef45e8f51c96591f8f4d5ff2338f601c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
