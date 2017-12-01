# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generalized client side source for rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbash rospy rosserial-msgs std-msgs tf"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_client/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5edf848f51240fd190344e7545f312f0"
SRC_URI[sha256sum] = "98ff710d9e5d56e023cc7d8849d403f2125c2d74b06b6fc2a54d1d364b22a49e"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_client-0.7.7-0"

inherit catkin
