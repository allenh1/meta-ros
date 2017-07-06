# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen geometry_msgs tf2"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_eigen/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e69871e21c37d4a93a96c55ab2f4e53"
SRC_URI[sha256sum] = "ff86c6d6752c86a2ada471dec61ff86084c3fa0e54fd30e9e989075f80ce4737"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
