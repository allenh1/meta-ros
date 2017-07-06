# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin tf2 tf2_msgs tf2_ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_tools/0.5.15-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e47893e5915ebef84281b2aed028b63a"
SRC_URI[sha256sum] = "6cd2b3dccf833470daa056df01a9ae5e46e87e291e9e5ee6bd0c852c1ca08cbd"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
