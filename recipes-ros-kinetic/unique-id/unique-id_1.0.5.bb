# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Python and C++ interfaces for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp rospy uuid-msgs"
SRC_URI = "https://github.com/ros-geographic-info/unique_identifier-release/archive/release/kinetic/unique_id/1.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6eb2910d9e3cdc63e58f526f9f29cef9"
SRC_URI[sha256sum] = "48e23c6379268830a23651a257f525a1bfe7a2ba85d798415612447a65fe9779"
S = "${WORKDIR}/unique_identifier-release-release-kinetic-unique_id-1.0.5-0"

inherit catkin
