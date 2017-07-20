# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib-msgs catkin geometry-msgs message-generation"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/lunar/tf2_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4ed375f244b450842d65942a90bd4e6"
SRC_URI[sha256sum] = "9f5cfb2833709422f2b28a689e0edc2653697b4d307ce88bdda326a0db51aef0"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
