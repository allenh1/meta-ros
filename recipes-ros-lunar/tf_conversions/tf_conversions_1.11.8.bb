# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=19;endline=19;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cmake_modules eigen geometry_msgs kdl_conversions orocos_kdl python_orocos_kdl tf"
SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/lunar/tf_conversions/1.11.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "658bd28c5839e7eaae780560931e373f"
SRC_URI[sha256sum] = "6c1f89060d662457cbce9a4f8f1a029addf1b97c5d20308de2d4993dd088b25d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
