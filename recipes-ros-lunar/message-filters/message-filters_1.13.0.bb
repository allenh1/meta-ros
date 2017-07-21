# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of message filters which take in messages and may output those messages at"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin rosconsole roscpp rostest rosunit xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/message_filters/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7739e9d879b00e061c94411adcbad36d"
SRC_URI[sha256sum] = "1169f02cff4bce94e57f18a057a05125c5b9f0143c1161164c948edbc8c45cc1"
S = "${WORKDIR}/ros_comm-release-release-lunar-message_filters-1.13.0-0"

inherit catkin
