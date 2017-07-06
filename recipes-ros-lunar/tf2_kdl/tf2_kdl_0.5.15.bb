# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen orocos_kdl tf2 tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_kdl/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8cd01dda5beb051d56ee9320704ea8b"
SRC_URI[sha256sum] = "6259449d9ddc4ea7f685cebb32cecc3c278c9d168d2e55b147087aad6476b617"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
