# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A set of message filters which take in messages and may output those messages at"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=5574a62ff2dfb1a63764d9caf2ae4d83"

DEPENDS = "boost catkin rosconsole roscpp rostest rosunit xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/message_filters/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7739e9d879b00e061c94411adcbad36d"
SRC_URI[sha256sum] = "1169f02cff4bce94e57f18a057a05125c5b9f0143c1161164c948edbc8c45cc1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
