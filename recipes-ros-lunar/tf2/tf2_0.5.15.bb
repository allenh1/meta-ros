# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs libconsole-bridge-dev rostime tf2_msgs"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "612bb346244178480f6d2f0d15c44431"
SRC_URI[sha256sum] = "b3cd7e7bd1887d545657a4c449ea84e8b78b00349d78a41d17b999e994a2f9fb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
