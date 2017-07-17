# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=f50e44f850cbb6862fbcddfbe0bc2b2c"

DEPENDS = "actionlib_msgs catkin geometry_msgs message_generation"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4ed375f244b450842d65942a90bd4e6"
SRC_URI[sha256sum] = "9f5cfb2833709422f2b28a689e0edc2653697b4d307ce88bdda326a0db51aef0"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
